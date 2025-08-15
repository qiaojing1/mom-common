package com.lets.platform.model.psi.enums;

import cn.hutool.core.util.StrUtil;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 推荐来源[1主供应商,2系统自动推荐,3货源清单,4申请建议供应商]
 * @author DING WEI
 * @date 2024/3/11 15:51
 * @version 1.0
 */
public enum SupplierRecommendPlanEnum implements IEnum<Object> {

    MAIN(1, "主供应商"),
    SYS_AUTO(2, "系统自动推荐"),
    SOURCE_OF_GOODS(3, "货源清单"),
    APPLY_ADVISE(4, "申请建议供应商"),
    HIGHEST_RATING(5, "评分最高"),
    LOWEST_PRICE(6, "价格最低"),
    HIGHEST_DELIVERY_TIMELINESS_RATE(7, "到货及时率最高"),
    HIGHEST_QUALIFIED_RATE(8, "合格率最高"),
    ;

    private final Integer value;

    private final String name;

    SupplierRecommendPlanEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Integer getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (SupplierRecommendPlanEnum element : values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(Integer value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (SupplierRecommendPlanEnum element : values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static List<Integer> getValues() {
        List<Integer> values = new ArrayList<>();
        for (SupplierRecommendPlanEnum element : values()) {
            values.add(element.getValue());
        }
        return values;
    }

    public static SupplierRecommendPlanEnum getSelf(Integer value) {
        for (SupplierRecommendPlanEnum element : values()) {
            if (element.getValue().equals(value)) {
                return element;
            }
        }
        return null;
    }

    public static boolean containsValue(String value) {
        if (StrUtil.isEmpty(value)) {
            return false;
        }
        for (SupplierRecommendPlanEnum element : SupplierRecommendPlanEnum.values()) {
            if (value.equals(element.getValue())) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断是否包含采购询价相关的查询来源
     * @param value
     * @return
     */
    public static boolean containsInquiryValue(Integer value) {
        if (Objects.isNull(value)) {
            return false;
        }
        List<Integer> values = Arrays.asList(HIGHEST_RATING.value, LOWEST_PRICE.value, HIGHEST_DELIVERY_TIMELINESS_RATE.value, HIGHEST_QUALIFIED_RATE.value);
        for (SupplierRecommendPlanEnum element : SupplierRecommendPlanEnum.values()) {
            if (value.equals(element.getValue()) && (values.contains(value))) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsName(String name) {
        if (StrUtil.isEmpty(name)) {
            return false;
        }
        for (SupplierRecommendPlanEnum element : values()) {
            if (name.equals(element.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
