package com.lets.platform.model.mes.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.common.pojo.enums.OrderCategoryCodeEnum;
import com.lets.platform.common.pojo.exception.LetsException;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * @author zhangweiyan
 * @ClassName Menu2InspectTypeEnum
 * @Description 菜单和检验类型的关联关系
 * @Date 2024/7/23 10:41
 **/
@Getter
public enum Menu2InspectTypeEnum implements IEnum<String> {
    SUPPLIER_INSPECT("111019e9-6b93-4cd6-af27-ee625351b2f5", OrderCategoryCodeEnum.IQC.getCode(), "供应商物料质量统计报表", "IQC"),
    COMPLETION_INSPECTION("2c1ebe64-4017-406a-b598-a90b636b3001", OrderCategoryCodeEnum.FQC.getCode(), "完工检验质量统计报表", "FQC"),
    SALE_RETURN_INSPECTION("177f2f13-6c08-43d3-a088-4228304c34b4", OrderCategoryCodeEnum.RQC.getCode(), "销售退货质量统计报表", "RQC"),
    SALE_DELIVERY_INSPECTION("baec46a0-4e91-4717-b45a-d5d6872e3068", OrderCategoryCodeEnum.OQC.getCode(), "销售发货质量统计报表", "OQC"),
    PROCESS_INSPECTION("532db27a-323e-415c-a8ef-9f5b75f27d2c", OrderCategoryCodeEnum.IPQC.getCode(), "工序检验质量统计报表", "IPQC"),
    ;

    private final String menuCode;
    private final String cateGoryCode;
    private final String name;
    private final String businessCode;

    Menu2InspectTypeEnum(String value, String cateGoryCode, String name, String businessCode) {
        this.menuCode = value;
        this.cateGoryCode = cateGoryCode;
        this.name = name;
        this.businessCode = businessCode;
    }

    public static String getMenuCode(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (Menu2InspectTypeEnum element : Menu2InspectTypeEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getMenuCode();
            }
        }
        return null;
    }

    public static Menu2InspectTypeEnum getSelfMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            throw new LetsException("当前菜单暂不支持查询质量分析报表");
        }
        for (Menu2InspectTypeEnum element : Menu2InspectTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element;
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (Menu2InspectTypeEnum element : Menu2InspectTypeEnum.values()) {
            if (value.equals(element.getMenuCode())) {
                return element.getName();
            }
        }
        return null;
    }


    public static boolean containsMenu(String menuCode) {
        if (!StringUtils.isEmpty(menuCode)) {
            Menu2InspectTypeEnum[] var = values();
            for (Menu2InspectTypeEnum element : var) {
                if (menuCode.equals(element.getMenuCode())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String supplyGroupStr(String groupStr, Menu2InspectTypeEnum selfMenuCode) {
        switch (selfMenuCode) {
            case SUPPLIER_INSPECT:
                groupStr += ", d.supply_supplier_id";
                break;
            case COMPLETION_INSPECTION:
                groupStr += ", d.factory_mode_id";
                break;
            case PROCESS_INSPECTION:
                groupStr += ", d.factory_mode_id";
                groupStr += ", d.process_id";
                break;
            case SALE_RETURN_INSPECTION:
            case SALE_DELIVERY_INSPECTION:
                groupStr += ", d.customer_id";
                break;
        }
        return groupStr;
    }

    public boolean equals(String value) {
        return this.menuCode.equals(value);
    }

    @Override
    public String getValue() {
        return menuCode;
    }
}
