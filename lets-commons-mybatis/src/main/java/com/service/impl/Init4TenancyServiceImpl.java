package com.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.baomidou.mybatisplus.extension.toolkit.SqlRunner;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.model.uc.entity.InitTenancyConfigDto;
import com.lets.platform.model.uc.entity.InitTenancyConfigSubDto;
import com.service.Init4TenancyService;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * 预置租户初始化数据
 *
 * @author: DING WEI
 * @date: 2023/7/17 16:24
 */
@Service
public class Init4TenancyServiceImpl implements Init4TenancyService {

    @Override
    @GlobalTransactional
    public Boolean presetData(InitTenancyConfigDto configDto) {
        List<InitTenancyConfigSubDto> insert = configDto.getInsert();
        if (!CollectionUtils.isEmpty(insert)) {
            SqlRunner db = SqlRunner.db();
            InitTenancyConfigSubDto deleteConfig = configDto.getDelete();
            if (Objects.nonNull(deleteConfig)) {
                String execute = deleteConfig.getExecute();
                if (YesOrNo.YES.getValue().equals(execute)) {
                    String deleteSql = deleteConfig.getSql();
                    if (StringUtils.isNotBlank(deleteSql)) {
                        try {
                            db.delete(deleteSql);
                        } catch (Exception e) {
                            e.printStackTrace();
                            ServiceAssert.getThrow(0, "失败");
                        }
                    }
                }
            }
            // 需要忽略的数据
            Set<String> ignoreCodes = new HashSet<>();
            Set<String> ignoreNames = new HashSet<>();
            boolean haveBasicUnit = Boolean.FALSE;
            InitTenancyConfigSubDto select_repeat = configDto.getSelect_repeat();
            if (Objects.nonNull(select_repeat)) {
                String code = select_repeat.getCode();
                if (StringUtils.isNotBlank(code)) {
                    List<Object> objects = db.selectObjs(code);
                    if (CollUtil.isNotEmpty(objects)) {
                        for (Object object : objects) {
                            if (Objects.nonNull(object)) {
                                ignoreCodes.add(object.toString());
                            }
                        }
                    }
                }
                String name = select_repeat.getName();
                if (StringUtils.isNotBlank(name)) {
                    List<Object> objects = db.selectObjs(name);
                    if (CollUtil.isNotEmpty(objects)) {
                        for (Object object : objects) {
                            if (Objects.nonNull(object)) {
                                ignoreNames.add(object.toString());
                            }
                        }
                    }
                }
                String basicUnit = select_repeat.getBasic_unit();
                if (StringUtils.isNotBlank(basicUnit)) {
                    List<Object> existBasicUnit = db.selectObjs(basicUnit);
                    haveBasicUnit = CollUtil.isNotEmpty(existBasicUnit);
                }
            }
            // 插入数据
            for (InitTenancyConfigSubDto subDto : insert) {
                String code = subDto.getCode();
                String name = subDto.getName();
                String basicUnit = subDto.getBasic_unit();
                String sql = subDto.getSql();
                if (StringUtils.isNotBlank(basicUnit)) {
                    if (haveBasicUnit) {
                        sql = sql.replaceAll("%isBasicUnit", YesOrNo.NO.getValue());
                    } else {
                        sql = sql.replaceAll("%isBasicUnit", basicUnit);
                    }
                }
                if (!ignoreCodes.contains(code) && !ignoreNames.contains(name)) {
                    try {
                        db.insert(sql);
                    } catch (Exception e) {
                        e.printStackTrace();
                        ServiceAssert.getThrow(0, "失败");
                    }
                }
            }
        }
        return Boolean.TRUE;
    }
}
