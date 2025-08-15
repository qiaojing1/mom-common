package com.lets.commons.redis.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lets.commons.redis.constant.RedisConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.model.uc.entity.SysParam;
import com.lets.platform.model.uc.enums.SysParamCodeEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.*;

/**
 * 获取系统参数
 *
 * @author: DING WEI
 * @date: 2024/4/10 16:34
 */
public class SysParamUtil {

    public static SysParam getParamValueEntity(RedisTemplate<String, Object> letsRedisTemplate, String tenancyId, SysParamCodeEnum paramCode) {
        if (Objects.nonNull(letsRedisTemplate)) {
            String sysParamKey = RedisConstant.LETS_SYS_PARAM + tenancyId;
            Object valueObj = letsRedisTemplate.opsForHash().get(sysParamKey, paramCode.getValue());
            if (Objects.nonNull(valueObj) && valueObj instanceof SysParam) {
                return (SysParam) valueObj;
            }
        }
        SysParam sysParam = new SysParam();
        sysParam.setCode(paramCode.getValue());
        sysParam.setName(paramCode.getName());
        sysParam.setMenuCode(paramCode.getMenuCode());
        sysParam.setValue(paramCode.getDefaultValue());
        sysParam.setRemark(paramCode.getDefaultRemark());
        sysParam.setGroupName(paramCode.getGroupName());
        return sysParam;
    }

    public static boolean getParamValue(RedisTemplate<String, Object> letsRedisTemplate, String tenancyId, SysParamCodeEnum paramCode) {
        boolean value = YesOrNo.YES.equals(paramCode.getDefaultValue());
        if (Objects.nonNull(letsRedisTemplate)) {
            String sysParamKey = RedisConstant.LETS_SYS_PARAM + tenancyId;
            Object valueObj = letsRedisTemplate.opsForHash().get(sysParamKey, paramCode.getValue());
            if (Objects.nonNull(valueObj) && valueObj instanceof SysParam) {
                value = YesOrNo.YES.equals(((SysParam) valueObj).getValue());
            }
        }
        return value;
    }

    public static String getParamStringValue(RedisTemplate<String, Object> letsRedisTemplate, String tenancyId, SysParamCodeEnum paramCode) {
        String value = Optional.ofNullable(paramCode.getDefaultValue()).orElse("");
        if (Objects.nonNull(letsRedisTemplate)) {
            String sysParamKey = RedisConstant.LETS_SYS_PARAM + tenancyId;
            Object valueObj = letsRedisTemplate.opsForHash().get(sysParamKey, paramCode.getValue());
            if (Objects.nonNull(valueObj) && valueObj instanceof SysParam) {
                value = ((SysParam) valueObj).getValue();
            }
        }
        return value;
    }

    public static List<Boolean> getValue(RedisTemplate<String, Object> letsRedisTemplate, String tenancyId, SysParamCodeEnum... codes) {
        List<Boolean> values = new ArrayList<>();
        if (Objects.nonNull(letsRedisTemplate) && Objects.nonNull(codes) && codes.length > 0) {
            String sysParamKey = RedisConstant.LETS_SYS_PARAM + tenancyId;
            for (SysParamCodeEnum code : codes) {
                Boolean value = YesOrNo.YES.getValue().equals(code.getDefaultValue());
                Object valueObj = letsRedisTemplate.opsForHash().get(sysParamKey, code.getValue());
                if (Objects.nonNull(valueObj) && valueObj instanceof SysParam) {
                    value = YesOrNo.YES.getValue().equals(((SysParam) valueObj).getValue());
                }
                values.add(value);
            }
        }
        return values;
    }

    public static List<String> getValue4Dict(RedisTemplate<String, Object> letsRedisTemplate, String tenancyId, SysParamCodeEnum... codes) {
        List<String> values = new ArrayList<>();
        if (Objects.nonNull(letsRedisTemplate) && Objects.nonNull(codes) && codes.length > 0) {
            String sysParamKey = RedisConstant.LETS_SYS_PARAM + tenancyId;
            for (SysParamCodeEnum code : codes) {
                Object valueObj = letsRedisTemplate.opsForHash().get(sysParamKey, code.getValue());
                if (Objects.nonNull(valueObj) && valueObj instanceof SysParam) {
                    values.add(((SysParam) valueObj).getValue());
                } else {
                    values.add(code.getDefaultValue());
                }
            }
        }
        return values;
    }

    public static List<List<String>> getValue4SelectList(RedisTemplate<String, Object> letsRedisTemplate, String tenancyId, SysParamCodeEnum... codes) {
        List<List<String>> result = new ArrayList<>();
        if (Objects.nonNull(letsRedisTemplate) && Objects.nonNull(codes) && codes.length > 0) {
            String sysParamKey = RedisConstant.LETS_SYS_PARAM + tenancyId;
            for (SysParamCodeEnum code : codes) {
                List<String> values = new ArrayList<>();
                Object valueObj = letsRedisTemplate.opsForHash().get(sysParamKey, code.getValue());
                if (Objects.nonNull(valueObj) && valueObj instanceof SysParam) {
                    String jsonValue = ((SysParam) valueObj).getJsonValue();
                    if (StringUtils.isNotBlank(jsonValue)) {
                        JSONArray array = JSONArray.parseArray(jsonValue);
                        for (Object o : array) {
                            values.add(o.toString());
                        }
                    }
                }
                result.add(values);
            }
        }
        return result;
    }

    public static List<Map<String, String>> getValue4SelectMap(RedisTemplate<String, Object> letsRedisTemplate, String tenancyId, SysParamCodeEnum... codes) {
        List<Map<String, String>> result = new ArrayList<>();
        if (Objects.nonNull(letsRedisTemplate) && Objects.nonNull(codes) && codes.length > 0) {
            String sysParamKey = RedisConstant.LETS_SYS_PARAM + tenancyId;
            for (SysParamCodeEnum code : codes) {
                Map<String, String> values = new HashMap<>();
                Object valueObj = letsRedisTemplate.opsForHash().get(sysParamKey, code.getValue());
                if (Objects.nonNull(valueObj) && valueObj instanceof SysParam) {
                    String jsonValue = ((SysParam) valueObj).getJsonValue();
                    if (StringUtils.isNotBlank(jsonValue)) {
                        JSONObject object = JSONObject.parseObject(jsonValue);
                        Set<String> strings = object.keySet();
                        for (String string : strings) {
                            values.put(string, object.getString(string));
                        }
                    }
                }
                result.add(values);
            }
        }
        return result;
    }

    public static Map<String, String> getSelectMap(RedisTemplate<String, Object> letsRedisTemplate, String tenancyId, SysParamCodeEnum code) {
        if (Objects.nonNull(letsRedisTemplate) && Objects.nonNull(code)) {
            String sysParamKey = RedisConstant.LETS_SYS_PARAM + tenancyId;
            Map<String, String> values = new HashMap<>();
            Object valueObj = letsRedisTemplate.opsForHash().get(sysParamKey, code.getValue());
            if (Objects.nonNull(valueObj) && valueObj instanceof SysParam) {
                String jsonValue = ((SysParam) valueObj).getJsonValue();
                if (StringUtils.isNotBlank(jsonValue)) {
                    JSONObject object = JSONObject.parseObject(jsonValue);
                    Set<String> strings = object.keySet();
                    for (String string : strings) {
                        values.put(string, object.getString(string));
                    }
                }
            }
            return values;
        }
        return new HashMap<>();
    }
}
