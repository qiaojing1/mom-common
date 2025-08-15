/*
 * csy
 */

package com.lets.platform.model.mes.enums;

import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.lets.platform.common.pojo.enums.IEnum;
import com.lets.platform.model.mes.entity.MesOrderExtField;
import lombok.Getter;
import org.springframework.util.StringUtils;

/**
 * @ClassName OrderExtFuncEnmu
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2025/7/5
 */
public enum OrderExtFuncEnum implements IEnum<String> {

    orderDetailId("orderDetailId", MesOrderExtField::getOrderDetailId),
    orderId("orderId", MesOrderExtField::getOrderId),
    ;

    private String value;

    @Getter
    private SFunction<MesOrderExtField,String> function;

    OrderExtFuncEnum(String value, SFunction<MesOrderExtField,String> function) {
        this.value = value;
        this.function = function;
    }

    public static SFunction<MesOrderExtField,String> getFunction(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (OrderExtFuncEnum element : OrderExtFuncEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getFunction();
            }
        }
        return null;
    }


    @Override
    public String getValue() {
        return value;
    }


}
