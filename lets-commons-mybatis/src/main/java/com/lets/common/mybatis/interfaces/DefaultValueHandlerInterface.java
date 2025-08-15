package com.lets.common.mybatis.interfaces;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.psi.entity.PsiOrderCategoryDetailField;

import java.util.Map;
import java.util.Objects;

public interface DefaultValueHandlerInterface {

    void check(PsiOrderCategoryDetailField field);

    default void handleMessage(Map<String, Object> map, String checkResultStr) {
        JSONArray checkResultArray = JSONObject.parseArray(checkResultStr);
        StringBuilder errorMsg = new StringBuilder();
        for (int i = 0; i < checkResultArray.size(); i++) {
            JSONObject checkResult = checkResultArray.getJSONObject(i);
            String fieldName = checkResult.getString("field");
            Object value = checkResult.get("value");
            String message = checkResult.getString("message");
            Object o = map.get(fieldName);
            if (Objects.isNull(o) || !o.toString().equals(value.toString())) {
                errorMsg.append(I18nUtils.getKey(message));
                errorMsg.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
            }
        }
        if (errorMsg.length() > GlobalConstant.ZERO) {
            ServiceAssert.getThrow(0, errorMsg.toString());
        }
    }
}
