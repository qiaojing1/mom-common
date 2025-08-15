package com.lets.platform.model.common.domain;

import com.alibaba.fastjson.JSON;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 出库关联单据申请人校验
 * @author: DING WEI
 * @date: 3/3/22 1:58 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockOutApplyUserCheckJsonValue {

    private Integer index;
    private String stockOutType;
    private String stockOutTypeName;
    private String enable;

    public static String getDefaultJsonValue() {
        List<StockOutApplyUserCheckJsonValue> jsonValueList = new ArrayList<>();
        jsonValueList.add(new StockOutApplyUserCheckJsonValue(GlobalConstant.ONE, GlobalConstant.ONE_STR, "采购退货", YesOrNo.NO.getValue()));
        jsonValueList.add(new StockOutApplyUserCheckJsonValue(GlobalConstant.TWO, GlobalConstant.TWO_STR, "销售出库", YesOrNo.NO.getValue()));
        jsonValueList.add(new StockOutApplyUserCheckJsonValue(GlobalConstant.THREE, GlobalConstant.THREE_STR, "盘亏出库", YesOrNo.NO.getValue()));
        jsonValueList.add(new StockOutApplyUserCheckJsonValue(GlobalConstant.FOUR, GlobalConstant.FOUR_STR, "调拨出库", YesOrNo.NO.getValue()));
        jsonValueList.add(new StockOutApplyUserCheckJsonValue(GlobalConstant.FIVE, GlobalConstant.FIVE_STR, "领料出库", YesOrNo.NO.getValue()));
        return JSON.toJSONString(jsonValueList);
    }

}
