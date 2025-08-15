package com.lets.common.mybatis.interfaces.impl;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.collection.CollectionUtil;
import com.lets.common.mybatis.interfaces.ValidationPluginInterface;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.collection.entity.CollRegionalEnergySetting;
import com.lets.platform.model.common.entity.CommonDevice;
import com.lets.platform.model.common.entity.CommonDeviceFormula;
import com.lets.platform.model.common.entity.CommonUserDict;
import com.lets.platform.model.psi.entity.PsiCustomerFollowUp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static com.lets.common.mybatis.aspect.DeleteValidateAspect.getSingleQuotesIdStr;

/**
 * @author zhangweiyan
 * @ClassName DeviceValidationPlugin
 * @Description 仪表台账删除校验
 * @Date 2025/2/28 18:10
 **/
@Component
@Slf4j
public class DeviceValidationPlugin implements ValidationPluginInterface {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 仪表台账删除校验
     *
     * @param entities
     */
    @Override
    public void validate(List<BaseEntity> entities) {
        if (CollectionUtil.isNotEmpty(entities)) {
            if (entities.get(0) instanceof CommonDevice) {
                List<CommonDevice> devices = jdbcTemplate.query(getQuerySql3(getSingleQuotesIdStr(entities)), new BeanPropertyRowMapper<>(CommonDevice.class));
                devices = devices.stream().filter(e -> "3".equals(e.getType())).collect(Collectors.toList());
                if (CollUtil.isNotEmpty(devices)) {
                    String idStr = getWhereSql(devices);
                    // 查询仪表台账自己公式里是否有用到
                    List<CommonDeviceFormula> query = jdbcTemplate.query(getQuerySql(idStr), new BeanPropertyRowMapper<>(CommonDeviceFormula.class));
                    if (CollUtil.isNotEmpty(query)) {
                        throw new LetsException(0, "已被仪表台账中名称为[" + query.get(0).getDeviceName() + "]的仪表引用");
                    }
                    // 查询区域能源配置中是否有用到
                    List<CollRegionalEnergySetting> query1 = jdbcTemplate.query(getQuerySql2(idStr), new BeanPropertyRowMapper<>(CollRegionalEnergySetting.class));
                    if (CollUtil.isNotEmpty(query1)) {
                        throw new LetsException(0, "已被区域能源配置中名称为[" + query1.get(0).getName() + "]的配置引用");
                    }
                }
            }
        }
    }

    private String getWhereSql(List<? extends BaseEntity> entities) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < entities.size(); i++) {
            res.append("(t1.device_id_list like '%").append(entities.get(i).getId()).append("%')");
            if (i < entities.size() - 1) {
                res.append(" or ");
            }
        }
        return res.toString();
    }


    private static String getQuerySql(String idStr) {
        return "select t1.*, t2.name device_name from `lets-platform-common`.common_device_formula t1 left join `lets-platform-common`.common_device t2 " +
                "on t1.id = t2.id " +
                "where " + idStr + ";";

    }

    private static String getQuerySql2(String idStr) {
        return "select t1.* from `lets-platform-collection`.coll_regional_energy_setting t1 " +
                "where " + idStr + ";";
    }


    private static String getQuerySql3(String idStr) {
        return "select t1.* from `lets-platform-common`.common_device t1  " +
                "where t1.id in (" + idStr + ");";

    }
}
