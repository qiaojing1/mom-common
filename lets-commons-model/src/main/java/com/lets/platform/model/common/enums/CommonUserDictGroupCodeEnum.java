package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;


/**
 * 用户数据字典 分组编码
 *
 * @author DING WEI
 * @version 1.0
 * @date 2023/7/15 9:06
 */
public enum CommonUserDictGroupCodeEnum implements IEnum<Object> {

    MATERIAL_EXT_ATTR("MATERIAL_EXT_ATTR", "物料扩展规格属性"),
    MATERIAL_PRO_ATTR("MATERIAL_PRO_ATTR", "物料特征属性"),
    CUSTOMER("customer", "客户管理"),
    FINANCE("finance", "财务管理"),
    COST("cost", "费用管理"),
    PROJECT_MANAGE("projectManage", "项目管理"),
    DEVICE("device", "设备管理"),
    FIXTURE("fixture", "工装管理"),
    KB("KB", "知识库"),
    CGGL("CGGL", "采购管理"),
    JCZL("JCZL", "基础资料"),
    DDYQ("DDYQ", "订单要求"),
    ;

    private String value;

    @Getter
    private String name;

    CommonUserDictGroupCodeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (CommonUserDictGroupCodeEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (CommonUserDictGroupCodeEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<String> getAllCode() {
        List<String> allCode = new ArrayList<>();
        for (CommonUserDictGroupCodeEnum element : values()) {
            allCode.add(element.getValue());
        }
        return allCode;
    }
}
