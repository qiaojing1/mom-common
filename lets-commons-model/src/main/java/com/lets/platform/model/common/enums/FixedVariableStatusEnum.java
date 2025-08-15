package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 导出-模板 固定变量 枚举
 * @author DING WEI
 * @date 2022/9/20 17:33
 * @version 1.0
 */
public enum FixedVariableStatusEnum implements IEnum<Object> {

    BAR_CODE("barCode", "条形码"),
    QR_CODE("qrCode", "二维码"),
    NO("no", "序号"),
    TOTAL("total", "合计"),
    WORD_TABLE("l", "WORD表格"),

    LETS_TEMP_TOTAL("lets_temp_total", "合计临时名称"),
    LETS_SPACE("lets_space", "空格"),

    PRINT_ORDER_ID("lets_order_id", "打印单据主键"),
    DEFAULT_PRINT_TEMPLATE("lets_print_template", "默认打印模板"),
    PRINT_TIMES("lets_print_times", "最大打印次数[0不控制]"),
    IS_EXAMINE_PRINT("lets_is_examine_print", "是否审核后打印[N否Y是]"),
    ORDER_CATEGORY_ID("lets_order_category_id", "单据类别主键"),

    T_PAGE("tPage", "总页码"),
    I_PAGE("iPage", "总当前页"),
    T_ORDER("tOrder", "单据总页码"),
    I_ORDER("iOrder", "单据当前页"),

    ;

    private String value;

    private String name;

    FixedVariableStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    @Override
    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (FixedVariableStatusEnum element : FixedVariableStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue().toString();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (FixedVariableStatusEnum element : FixedVariableStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }
}
