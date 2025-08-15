package com.lets.platform.common.pojo.util;

import cn.hutool.core.util.HashUtil;
import com.alibaba.fastjson.JSONObject;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 扩展规格属性取Hash工具
 * @author: DING WEI
 * @date: 2025/3/7 8:51
 */
public class ExtFlHashUtils {

    public static int getHashCode(Map<String, Object> param) {
        StringBuilder extFlStr = new StringBuilder();
        for (int i = 1; i <= 32; i++) {
            String extFl = "extFl" + i;
            extFlStr.append(extFl).append(GlobalConstant.COLON_HALF_ANGLE);
            Object extFlValue = param.get(extFl);
            if (Objects.nonNull(extFlValue) && StringUtils.isNotBlank(extFlValue.toString())) {
                extFlStr.append(extFlValue);
            }
            extFlStr.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
        }
        for (int i = 1; i <= 2; i++) {
            String remark = "remark" + i;
            extFlStr.append(remark).append(GlobalConstant.COLON_HALF_ANGLE);
            Object remarkValue = param.get(remark);
            if (Objects.nonNull(remarkValue) && StringUtils.isNotBlank(remarkValue.toString())) {
                extFlStr.append(remarkValue);
            }
            extFlStr.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
        }
        return HashUtil.fnvHash(extFlStr.toString());
    }

    public static int getHashCode(JSONObject param) {
        StringBuilder extFlStr = new StringBuilder();
        for (int i = 1; i <= 32; i++) {
            String extFl = "extFl" + i;
            extFlStr.append(extFl).append(GlobalConstant.COLON_HALF_ANGLE);
            Object extFlValue = param.get(extFl);
            if (Objects.nonNull(extFlValue) && StringUtils.isNotBlank(extFlValue.toString())) {
                extFlStr.append(extFlValue);
            }
            extFlStr.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
        }
        for (int i = 1; i <= 2; i++) {
            String remark = "remark" + i;
            extFlStr.append(remark).append(GlobalConstant.COLON_HALF_ANGLE);
            Object remarkValue = param.get(remark);
            if (Objects.nonNull(remarkValue) && StringUtils.isNotBlank(remarkValue.toString())) {
                extFlStr.append(remarkValue);
            }
            extFlStr.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
        }
        return HashUtil.fnvHash(extFlStr.toString());
    }

    public static int getHashCodeByFl(Map<String, Object> param) {
        StringBuilder extFlStr = new StringBuilder();
        for (int i = 1; i <= 32; i++) {
            String fl = "FL" + i;
            extFlStr.append("extFl").append(i).append(GlobalConstant.COLON_HALF_ANGLE);
            Object flValue = param.get(fl);
            if (Objects.nonNull(flValue) && StringUtils.isNotBlank(flValue.toString())) {
                extFlStr.append(flValue);
            }
            extFlStr.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
        }
        for (int i = 1; i <= 2; i++) {
            String remark = "remark" + i;
            extFlStr.append(remark).append(GlobalConstant.COLON_HALF_ANGLE);
            Object remarkValue = param.get(remark);
            if (Objects.nonNull(remarkValue) && StringUtils.isNotBlank(remarkValue.toString())) {
                extFlStr.append(remarkValue);
            }
            extFlStr.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
        }
        return HashUtil.fnvHash(extFlStr.toString());
    }

    public static int getHashCodeFl(JSONObject param) {
        StringBuilder extFlStr = new StringBuilder();
        for (int i = 1; i <= 32; i++) {
            String fl = "FL" + i;
            extFlStr.append("extFl").append(i).append(GlobalConstant.COLON_HALF_ANGLE);
            Object flValue = param.get(fl);
            if (Objects.nonNull(flValue) && StringUtils.isNotBlank(flValue.toString())) {
                extFlStr.append(flValue);
            }
            extFlStr.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
        }
        for (int i = 1; i <= 2; i++) {
            String remark = "remark" + i;
            extFlStr.append(remark).append(GlobalConstant.COLON_HALF_ANGLE);
            Object remarkValue = param.get(remark);
            if (Objects.nonNull(remarkValue) && StringUtils.isNotBlank(remarkValue.toString())) {
                extFlStr.append(remarkValue);
            }
            extFlStr.append(GlobalConstant.SEMICOLON_HALF_ANGLE);
        }
        return HashUtil.fnvHash(extFlStr.toString());
    }

    public static Map<String, String> pickExtFl(Map<String, Object> materialMap) {
        Map<String, String> extFlMap = new HashMap<>();
        for (int i = 1; i <= 32; i++) {
            Object extFlValue = materialMap.get("extFl" + i);
            if (Objects.nonNull(extFlValue)) {
                extFlMap.put("FL" + i, extFlValue.toString());
            }
        }
        for (int i = 1; i <= 2; i++) {
            Object remarkValue = materialMap.get("remark" + i);
            if (Objects.nonNull(remarkValue)) {
                extFlMap.put("remark" + i, remarkValue.toString());
            }
        }
        return extFlMap;
    }

    public static void main(String[] args) {
        String str = "com.alibaba.nacos.naming.push.receiver] INFO  com.alibaba.nacos.client.naming - re";
        int i1 = HashUtil.fnvHash(str);
        int i2 = HashUtil.fnvHash(str);
        System.out.println(i1);
        System.out.println(i2);
    }
}
