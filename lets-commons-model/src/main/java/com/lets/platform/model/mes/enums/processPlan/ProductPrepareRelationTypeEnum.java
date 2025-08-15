package com.lets.platform.model.mes.enums.processPlan;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 生产准备 关联类型[1:工艺文档,2:产品工艺变更通知,3:设备运行参数]
 * @author DING WEI
 * @date 2023/12/26 15:36
 * @version 1.0
 */
public enum ProductPrepareRelationTypeEnum implements IEnum<Object> {

    PROCESS_DOCUMENTS("1", "工艺文档"),
    PRODUCT_PROCESS_CHANGE_NOTICE("2", "产品工艺变更通知"),
    EQUIPMENT_OPERATING_PARAMETERS("3", "设备运行参数"),
    ;

    private String value;

    private String name;

    ProductPrepareRelationTypeEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (ProductPrepareRelationTypeEnum element : ProductPrepareRelationTypeEnum.values()) {
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
        for (ProductPrepareRelationTypeEnum element : ProductPrepareRelationTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
