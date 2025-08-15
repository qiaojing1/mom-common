package com.lets.common.mybatis;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.lets.commons.redis.constant.RedisConstant;
import com.lets.commons.security.pojo.User;
import com.lets.commons.security.util.SecurityUtils;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.base.SysRoleField;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.JavaFieldTypeEnum;
import com.lets.platform.common.pojo.enums.RoleTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.*;

/**
 * 字段权限-拦截器
 * @author DING WEI
 * @date 8/23/21 9:12 PM
 * @version 1.0
 */
@Component
@Slf4j
public class FieldPermissionInterceptor implements MethodInterceptor {

    @Resource
    private RedisTemplate<String, Object> letsRedisTemplate;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        FieldPermission annotation = method.getAnnotation(FieldPermission.class);
        if (Objects.nonNull(annotation)) {
            // 获取当前请求
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            if (Objects.nonNull(attributes)) {
                if (annotation.enable()) {
                    String menuCode = annotation.menuCode();
                    String[] levelFields = annotation.levelField();
                    Class clazz = annotation.clazz();
                    User principal = SecurityUtils.getPrincipal();
                    String roleType = principal.getRoleType();
                    String userId = principal.getId();
                    String tenancyId = principal.getTenancyId();
                    // 超级管理员、系统管理员 放行
                    if (RoleTypeEnum.SUPER_ADMIN_ROLE.getValue().equals(roleType)
                            || RoleTypeEnum.SYS_ADMIN_ROLE.getValue().equals(roleType)) {
                        return invocation.proceed();
                    }
                    HttpServletRequest request = attributes.getRequest();
                    String resUrl = request.getRequestURI();
                    // 如果是current请求直接忽略
                    if (GlobalConstant.CURRENT.equals(resUrl)) {
                        return invocation.proceed();
                    }

                    // 来自服务内部feign直接忽略
                    String requestFrom = request.getHeader(GlobalConstant.REQUEST_FROM);
                    if (GlobalConstant.SERVER_INNER.equals(requestFrom)) {
                        return invocation.proceed();
                    }

                    // 获取 当前用户 的角色
                    Object roleObject = letsRedisTemplate.opsForHash().get(RedisConstant.RBAC_USER_ROLES, userId);
                    Set<String> hasRoles = new HashSet<>();
                    if (Objects.nonNull(roleObject) && roleObject instanceof Set && !CollectionUtils.isEmpty((Set<String>)roleObject)) {
                        hasRoles = (Set<String>) roleObject;
                        hasRoles.removeAll(Collections.singleton(null));
                        if (!CollectionUtils.isEmpty(hasRoles) && hasRoles.size() == GlobalConstant.ONE) {
                            String roleId = new ArrayList<>(hasRoles).get(0);
                            Object notFieldsObj = letsRedisTemplate.opsForHash().get(RedisConstant.ROLE_FIELD + roleId, menuCode);
                            if (Objects.nonNull(notFieldsObj) && notFieldsObj instanceof List) {
                                List<SysRoleField> notFields = (List<SysRoleField>) notFieldsObj;
                                // 结果
                                Object proceed = invocation.proceed();
                                if (Objects.nonNull(levelFields)) {
                                    if (levelFields.length == GlobalConstant.ONE) {
                                        return handle(proceed, levelFields[0].split(GlobalConstant.DOUBLE_GT), notFields, clazz);
                                    } else {
                                        for (String levelField : levelFields) {
                                            String[] split = levelField.split(GlobalConstant.DOUBLE_GT);
                                            proceed = handle(proceed, split, notFields, clazz);
                                        }
                                        return proceed;
                                    }
                                } else {
                                    return proceed;
                                }
                            }
                        }
                    } else {
                        ServiceAssert.getThrow(0, "暂无权限");
                    }
                }
            }
        }
        return invocation.proceed();
    }

    private Object handle(Object proceed, String[] levelFields, List<SysRoleField> notFields, Class clazz) {
        // 根据字段权限把相关字段修改成"****"
        if (proceed instanceof RespMsgBean) {
            RespMsgBean respMsgBean = (RespMsgBean) proceed;
            JSONObject o = editField(JSONObject.parseObject(JSON.toJSONString(proceed)), levelFields, 0, notFields);
            Object data = respMsgBean.getData();
            respMsgBean.setCode(Integer.parseInt(o.getString("code")));
            if (data instanceof PageInfo) {
                PageInfo pageInfo = JSON.toJavaObject(o.getJSONObject("data"), PageInfo.class);
                respMsgBean.setData(pageInfo);
            } else {
                respMsgBean.setData(JSON.toJavaObject(o.getJSONObject("data"), clazz));
            }
            respMsgBean.setMsg(o.getString("msg"));
            return respMsgBean;
        } else if (proceed instanceof List) {
            List result = new ArrayList();
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("list", proceed);
            JSONObject o = editField(jsonObject, levelFields, 0, notFields);
            JSONArray list = o.getJSONArray("list");
            for (Object o1 : list) {
                result.add(JSON.toJavaObject(JSONObject.parseObject(JSONObject.toJSONString(o1)), clazz));
            }
            return result;
        } else {
            JSONObject o = editField(JSON.parseObject(JSONObject.toJSONString(proceed)), levelFields, 0, notFields);
            return JSON.toJavaObject(JSONObject.parseObject(JSONObject.toJSONString(o)), clazz);
        }
    }

    private JSONObject editField(JSONObject obj, String[] levelFields, Integer index, List<SysRoleField> notFields) {
        for (SysRoleField roleField : notFields) {
            String javaType = roleField.getJavaType();
            String field = roleField.getField();
            if (JavaFieldTypeEnum.STRING.getValue().equals(javaType)) {
                obj.put(field, GlobalConstant.STARS);
            } else {
                obj.put(field, null);
            }
        }
        if (Objects.nonNull(levelFields) && index < levelFields.length) {
            String level = levelFields[index];
            if (StringUtils.isNotBlank(level)) {
                String levelName = level.split(":")[0];
                String type = level.split(":")[1];
                index = index + GlobalConstant.ONE;
                if ("Object".equals(type)) {
                    JSONObject jsonObject = obj.getJSONObject(levelName);
                    Object o = editField(jsonObject, levelFields, index, notFields);
                    obj.put(levelName, o);
                } else if ("List".equals(type)) {
                    JSONArray jsonArray = obj.getJSONArray(levelName);
                    if (Objects.nonNull(jsonArray)) {
                        for (int i = 0; i < jsonArray.size(); i++) {
                            Object o = jsonArray.get(i);
                            JSONObject jsonObject = editField(JSONObject.parseObject(JSON.toJSONString(o)), levelFields, index, notFields);
                            jsonArray.set(i, jsonObject);
                        }
                    }
                    obj.put(levelName, jsonArray);
                }
            }
        }
        return obj;
    }

}
