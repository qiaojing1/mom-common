package com.lets.common.mybatis.utils;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.baomidou.mybatisplus.core.conditions.ISqlSegment;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lets.common.mybatis.configBuilder.ConditionConfig;
import com.lets.common.mybatis.interfaces.ConditionHandlerFunction;
import com.lets.common.mybatis.interfaces.ConditionHandlerInterface;
import com.lets.commons.redis.constant.RedisConstant;
import com.lets.commons.redis.util.SysParamUtil;
import com.lets.commons.security.pojo.User;
import com.lets.commons.security.util.SecurityUtils;
import com.lets.platform.client.psi.StoreClient;
import com.lets.platform.client.uc.client.MenuClient;
import com.lets.platform.client.uc.client.UserClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.OrderEntity;
import com.lets.platform.common.pojo.base.QueryField;
import com.lets.platform.common.pojo.base.ServiceAssert;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.ConditionExpressionEnum;
import com.lets.platform.common.pojo.enums.RespCodeEnum;
import com.lets.platform.common.pojo.enums.SortByEnum;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.model.psi.entity.PsiStorageStore;
import com.lets.platform.model.uc.entity.SysMenuDataPermissionConfig;
import com.lets.platform.model.uc.entity.SysUser;
import com.lets.platform.model.uc.entity.SysUserRole;
import com.lets.platform.model.uc.enums.SysParamCodeEnum;
import com.lets.platform.model.uc.vo.MenuDateConfigGroupVO;
import com.lets.platform.model.uc.vo.MenuDateConfigVO;
import com.lets.platform.model.whereBuild.SpringContextUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MyBatisPlusUtil {
    public static <T> void buildQueryWrapper(QueryWrapper<T> queryWrapper,
                                             List<QueryField> conditionFields,
                                             List<QueryField> conditionOrFields,
                                             HashMap<QueryField, ConditionHandlerFunction<QueryField, QueryWrapper<T>>> conditionHandlerMap) {
        conditionFields.forEach(condition -> {
            Object value = condition.getValue();
            if (value != null && StrUtil.isNotEmpty(value.toString())) {
                append(queryWrapper, condition, conditionHandlerMap.get(condition));
            }
        });
        if (conditionOrFields.stream().anyMatch(condition -> condition.getValue() != null && StrUtil.isNotEmpty(condition.getValue().toString()))) {
            queryWrapper.and((andWrapper) ->
                    conditionOrFields.forEach(condition -> {
                        Object value = condition.getValue();
                        if (value != null && StrUtil.isNotEmpty(value.toString())) {
                            andWrapper.or(orWrapper -> append(orWrapper, condition, conditionHandlerMap.get(condition)));
                        }
                    })
            );
        }
    }

    /**
     * 构造该角色该菜单的数据权限查询条件到QueryWrapper
     *
     * @param queryWrapper 查询条件构造器
     * @param user         当前用户
     * @param menuCode     菜单编码
     * @author DING WEI
     */
    public static <T> void dataPermissionWrapper(QueryWrapper<T> queryWrapper, User user, String menuCode, Integer tabIndex,
                                                 HashMap<QueryField, ConditionHandlerFunction<QueryField, QueryWrapper<T>>> conditionHandlerMap) {
        if (StrUtil.isNotEmpty(menuCode)) {
            Collection<String> roles = user.getRoles();
            if (!CollectionUtils.isEmpty(roles) && roles.size() == GlobalConstant.ONE) {
                String roleId = new ArrayList<>(roles).get(GlobalConstant.ZERO);
                // 查询该菜单+该角色配置的查询条件
                MenuClient menuClient = SpringUtil.getBean(MenuClient.class);
                RespMsgBean<MenuDateConfigVO> respMsgBean = menuClient.getRoleFieldPermission(user.getTenancyId(), menuCode, roleId, tabIndex);
                MenuDateConfigVO menuDateConfigVO = null;
                if (respMsgBean != null) {
                    int code = respMsgBean.getCode();
                    if (RespCodeEnum.SUCCESS.getCode().equals(code)) {
                        menuDateConfigVO = respMsgBean.getData();
                    }
                }
                if (menuDateConfigVO != null) {
                    // 根据groupSign分组
                    List<MenuDateConfigGroupVO> groups = menuDateConfigVO.getGroups();
                    queryWrapper.and(CollUtil.isNotEmpty(groups), wq -> {
                        for (int i = GlobalConstant.ZERO; i < groups.size(); i++) {
                            MenuDateConfigGroupVO group = groups.get(i);
                            List<SysMenuDataPermissionConfig> configs = group.getConfigs();
                            wq.or(groupWq -> buildGroup(groupWq, configs, conditionHandlerMap));
                        }
                    });
                }
            }
        }
    }

    public static void cleanEmptyNested(LambdaQueryWrapper<?> lambdaQueryWrapper) {
        int size = lambdaQueryWrapper.getExpression().getNormal().size();
        for (int i = size - 1; i >= 0; i--) {
            ISqlSegment item = lambdaQueryWrapper.getExpression().getNormal().get(i);
            if (item instanceof LambdaQueryWrapper<?>) {
                LambdaQueryWrapper<?> query = (LambdaQueryWrapper<?>) item;
                cleanEmptyNested(query);
                if (query.getExpression().getNormal().isEmpty()) {
                    lambdaQueryWrapper.getExpression().getNormal().remove(i);
                }
            }
        }
    }

    public static <T> void append(QueryWrapper<T> queryWrapper, QueryField conditionField, ConditionHandlerFunction<QueryField, QueryWrapper<T>> handlerFunction) {
        if (handlerFunction != null) {
            handlerFunction.apply(conditionField, queryWrapper);
            return;
        }
        String conditionHandler = conditionField.getConditionHandler();
        if (StringUtils.isNotBlank(conditionHandler)) {
            Object handlerBean = SpringUtil.getBean(conditionHandler);
            if (handlerBean instanceof ConditionHandlerInterface) {
                ConditionHandlerInterface handler = (ConditionHandlerInterface) handlerBean;
                handler.apply(conditionField, queryWrapper);
                return;
            }
        }
        String expression = conditionField.getExpression();
        String conditionKey = conditionField.getConditionKey();
        Object value = conditionField.getValue();
        String tableAlias = conditionField.getTableAlias();
        if (StringUtils.isNotBlank(tableAlias)) {
            conditionKey = tableAlias + GlobalConstant.POINT + humpToUnderline(conditionKey);
        } else {
            conditionKey = humpToUnderline(conditionKey);
        }
        if (expression.contains(GlobalConstant.COMMA_HALF_ANGLE)) {
            String[] specialExpression = expression.split(",");
            ServiceAssert.isTrue(specialExpression.length == 3, GlobalConstant.ZERO, "查询条件格式不正确,请检查");
            String connect = !GlobalConstant.AND.equals(specialExpression[1]) ? " or " : " and ";  //关联条件 &/|

            String specialExpressionValue = value.toString().replaceAll("\\[", GlobalConstant.EMPTY_STR).replaceAll("]", GlobalConstant.EMPTY_STR);
            String[] values = specialExpressionValue.split(GlobalConstant.COMMA_HALF_ANGLE);
            ServiceAssert.isTrue(values.length == 2, GlobalConstant.ZERO, "查询条件格式不正确,请检查");
            final String keyFinal = conditionKey;
            queryWrapper.and(q ->
                    q.apply(keyFinal + specialExpression[0] + values[0] + connect + keyFinal + specialExpression[2] + values[1]));
        }
        ConditionExpressionEnum conditionExpression = ConditionExpressionEnum.getEnumByValue(expression);
        if (conditionExpression == null) {
            return;
        }
        switch (conditionExpression) {
            case EQUALS: // 等于=
                //value = escapeChar4Equals(conditionField.getValue());
                queryWrapper.eq(conditionKey, value);
                break;
            case NOT_EQUALS: // 不等于<>
                queryWrapper.ne(conditionKey, value);
                break;
            case LIKE: // 模糊查询 LIKE
                value = escapeChar4Like(conditionField.getValue());
                like(queryWrapper, conditionKey, String.valueOf(value));
                break;
            case NOT_LIKE: // 模糊查询没有这个关键字
                value = escapeChar4Like(conditionField.getValue());
                queryWrapper.notLike(conditionKey, value);
                break;
            case LEFT_LIKE: // 以什么结尾的查询
                value = escapeChar4Like(conditionField.getValue());
                queryWrapper.likeLeft(conditionKey, value);
                break;
            case RIGHT_LIKE: // 以什么开头
                value = escapeChar4Like(conditionField.getValue());
                queryWrapper.likeRight(conditionKey, value);
                break;
            case LT: // 小于
                queryWrapper.lt(conditionKey, value);
                break;
            case LE: // 小于等于 <=
                queryWrapper.le(conditionKey, value);
                break;
            case GT: // 大于
                queryWrapper.gt(conditionKey, value);
                break;
            case GE: // 大于等于 >=
                queryWrapper.ge(conditionKey, value);
                break;
            case IN: // in
                if (value instanceof Collection) {
                    queryWrapper.in(CollUtil.isNotEmpty((Collection<?>) value), conditionKey, (Collection<?>) value);
                } else {
                    queryWrapper.in(conditionKey, Arrays.asList(value.toString().split(GlobalConstant.COMMA_HALF_ANGLE)));
                }
                break;
            case NOT_IN: // not_in
                if (value instanceof Collection) {
                    queryWrapper.notIn(CollUtil.isNotEmpty((Collection<?>) value), conditionKey, (Collection<?>) value);
                } else {
                    queryWrapper.notIn(conditionKey, Arrays.asList(value.toString().split(GlobalConstant.COMMA_HALF_ANGLE)));
                }
                break;
            case BETWEEN: //
                String date = value.toString().replaceAll("\\[", GlobalConstant.EMPTY_STR).replaceAll("]", GlobalConstant.EMPTY_STR);
                String[] values = date.split(GlobalConstant.COMMA_HALF_ANGLE);
                if (values.length > 1) {
                    queryWrapper.between(conditionKey, values[0], values[1]);
                }
                break;
            case IS_NOT_NULL:
                queryWrapper.isNotNull(conditionKey);
                break;
            case IS_NULL:
                queryWrapper.isNull(conditionKey);
                break;
            default:
                break;
        }

    }

    public static Object escapeChar4Equals(Object string) {
        if (Objects.nonNull(string)) {
            if (string instanceof String) {
                if (StringUtils.isNotBlank(string.toString())) {
                    string = string.toString().replaceAll(GlobalConstant.BACKSLASH, "\\\\");
                    string = StringUtils.replace(string.toString(), "_", "\\_");
                    string = StringUtils.replace(string.toString(), "%", "\\%");
                }
            }
        }
        return string;
    }

    public static Object escapeChar4Like(Object string) {
        if (Objects.nonNull(string)) {
            if (string instanceof String) {
                if (StringUtils.isNotBlank(string.toString())) {
                    string = string.toString().replaceAll(GlobalConstant.BACKSLASH, "\\\\\\\\");
                    string = StringUtils.replace(string.toString(), "_", "\\_");
                    string = StringUtils.replace(string.toString(), "%", "\\%");
                }
            }
        }
        return string;
    }

    public static <T> void like(QueryWrapper<T> queryWrapper, String conditionKey, String values) {
        StringBuilder conditionKeyBuilder = new StringBuilder(conditionKey);
        boolean hasComma = values.trim().contains(GlobalConstant.COMMA_HALF_ANGLE);
        RedisTemplate<String, Object> letsRedisTemplate = SpringUtil.getBean("letsRedisTemplate", RedisTemplate.class);
        String tenancyId = SecurityUtils.getTenancyId();
        boolean queryBySpace = SysParamUtil.getParamValue(letsRedisTemplate, tenancyId, SysParamCodeEnum.QUERYBYSPACE);
        boolean queryMindCase = SysParamUtil.getParamValue(letsRedisTemplate, tenancyId, SysParamCodeEnum.QueryMindCase);
        if (queryMindCase) {
            conditionKeyBuilder.append(GlobalConstant.MIND_CASE);
        }
        boolean hasSpace = values.trim().contains(" ") && queryBySpace;
        if (!hasComma && !hasSpace) {
            Set<String> symbolList = equalsSymbolList(values, tenancyId, letsRedisTemplate);
            if (CollUtil.isNotEmpty(symbolList)) {
                queryWrapper.and(andWrapper -> {
                    for (String symbolV : symbolList) {
                        andWrapper.or().like(conditionKeyBuilder.toString(), symbolV);
                    }
                });
            } else {
                queryWrapper.like(conditionKeyBuilder.toString(), values);
            }
            return;
        }
        if (hasComma) {
            List<String> valueList = Arrays.stream(values.split(GlobalConstant.COMMA_HALF_ANGLE)).map(String::trim).distinct().filter(StrUtil::isNotEmpty).collect(Collectors.toList());
            if (CollUtil.isNotEmpty(valueList)) {
                queryWrapper.and(andWrapper -> {
                    for (String value : valueList) {
                        if (value.contains(" ") && queryBySpace) {
                            List<String> spaceValueListInComma = Arrays.stream(value.split(" ")).map(String::trim).distinct().filter(StrUtil::isNotEmpty).collect(Collectors.toList());
                            andWrapper.or(orAnd -> {
                                for (String spaceValueInComma : spaceValueListInComma) {
                                    Set<String> symbolList = equalsSymbolList(spaceValueInComma, tenancyId, letsRedisTemplate);
                                    if (CollUtil.isNotEmpty(symbolList)) {
                                        orAnd.and(orAndOr -> {
                                            for (String symbolV : symbolList) {
                                                orAndOr.or().like(conditionKeyBuilder.toString(), symbolV);
                                            }
                                        });
                                    } else {
                                        orAnd.like(conditionKeyBuilder.toString(), spaceValueInComma);
                                    }
                                }
                            });
                        } else {
                            Set<String> symbolList = equalsSymbolList(value, tenancyId, letsRedisTemplate);
                            if (CollUtil.isNotEmpty(symbolList)) {
                                for (String symbolV : symbolList) {
                                    andWrapper.or().like(conditionKeyBuilder.toString(), symbolV);
                                }
                            } else {
                                andWrapper.or().like(conditionKeyBuilder.toString(), value);
                            }
                        }
                    }
                });

            } else {
                queryWrapper.like(conditionKeyBuilder.toString(), values);
            }
            return ;
        }

        List<String> spaceValueList = Arrays.stream(values.split(" ")).map(String::trim).distinct().filter(StrUtil::isNotEmpty).collect(Collectors.toList());
        if(CollUtil.isNotEmpty(spaceValueList)) {
            for (String value : spaceValueList) {
                Set<String> symbolList = equalsSymbolList(value, tenancyId, letsRedisTemplate);
                if (CollUtil.isNotEmpty(symbolList)) {
                    symbolList.add(value);
                    queryWrapper.and(andWrapper -> {
                        for (String symbolV : symbolList) {
                            andWrapper.or().like(conditionKeyBuilder.toString(), symbolV);
                        }
                    });
                } else {
                    queryWrapper.like(conditionKeyBuilder.toString(), value);
                }
            }
        }
    }

    private static Set<String> equalsSymbolList(String value, String tenancyId, RedisTemplate<String, Object> letsRedisTemplate) {
        Set<String> result = new HashSet<>();
        generateCombinations(value, 0, new StringBuilder(), result, tenancyId, letsRedisTemplate);
        return result;
    }

    private static void generateCombinations(String input, int index, StringBuilder current, Set<String> result,
                                             String tenancyId, RedisTemplate<String, Object> letsRedisTemplate) {
        if (index == input.length()) {
            result.add(current.toString());
            return;
        }
        char currentChar = input.charAt(index);
        String symbol = String.valueOf(currentChar);
        String key = RedisConstant.LETS_EQUALS_SYMBOL_CONFIG + tenancyId + GlobalConstant.COLON_HALF_ANGLE + symbol;
        Object o = letsRedisTemplate.opsForValue().get(key);
        if (Objects.nonNull(o) && o instanceof Set) {
            // 如果当前字符有等价字符，遍历所有等价字符
            for (String equivalentChar : (Set<String>) o) {
                current.append(equivalentChar);
                generateCombinations(input, index + 1, current, result, tenancyId, letsRedisTemplate);
                current.deleteCharAt(current.length() - 1); // 回溯
            }
        } else {
            // 如果当前字符没有等价字符，直接添加到结果中
            current.append(currentChar);
            generateCombinations(input, index + 1, current, result, tenancyId, letsRedisTemplate);
            current.deleteCharAt(current.length() - 1); // 回溯
        }
    }

    public static <T> void defaultOrderBy(QueryWrapper<T> queryWrapper, String tableAlias) {
        String prefix = StrUtil.isNotEmpty(tableAlias) ? tableAlias + "." : StrUtil.EMPTY;
        queryWrapper.orderByDesc(prefix + MyBatisPlusUtil.humpToUnderline(GlobalConstant.PARAM_ORDER_DESC_2));
        queryWrapper.orderByAsc(prefix + MyBatisPlusUtil.humpToUnderline(GlobalConstant.PARAM_ORDER_ASC_3));
    }

    public static <T> HashMap<QueryField, ConditionHandlerFunction<QueryField, QueryWrapper<T>>> getConditionHandler(Callable<ConditionConfig<T>> conditionConfig) {
        try {
            HashMap<QueryField, ConditionHandlerFunction<QueryField, QueryWrapper<T>>> result = new HashMap<>();
            ConditionConfig<T> config = conditionConfig.call();
            config.getTabConfigs().forEach(tabConfig ->
                    tabConfig.getTableConfigs().forEach(tableConfig ->
                            tableConfig.getFieldConfig().forEach(fieldConfig -> {
                                if (StrUtil.isNotEmpty(fieldConfig.getConditionKey())) {
                                    QueryField queryField = new QueryField(fieldConfig.getConditionKey(), tabConfig.getTabIndex(),
                                            tableConfig.getTableAlias());
                                    result.put(queryField, fieldConfig.getHandler());
                                }
                            })));
            config.getFieldConfigs().forEach(fieldConfig -> {
                QueryField queryField = new QueryField(fieldConfig.getConditionKey(), fieldConfig.getTabIndex(), fieldConfig.getTableAlias());
                result.put(queryField, fieldConfig.getHandler());
            });
            return result;
        } catch (Exception e) {
            throw new LetsException(GlobalConstant.ZERO, "查询条件解析错误!");
        }
    }

    public static <T> void orderBy(QueryWrapper<T> queryWrapper, List<OrderEntity> orderList) {
        for (OrderEntity orderEntity : orderList) {
            String tableAlias = orderEntity.getTableAlias();
            String orderKey = orderEntity.getOrderKey();
            String orderExpression = orderEntity.getOrderExpression();
            if (StringUtils.isBlank(orderKey)) {
                continue;
            }
            if (StringUtils.isNotBlank(orderExpression)) {
                if (SortByEnum.ASC_LOWER_CASE.getValue().equals(orderExpression.toLowerCase())) {
                    if (StringUtils.isBlank(tableAlias)) {
                        queryWrapper.orderByAsc(MyBatisPlusUtil.humpToUnderline(orderKey));
                    } else {
                        queryWrapper.orderByAsc(tableAlias + GlobalConstant.POINT + MyBatisPlusUtil.humpToUnderline(orderKey));
                    }
                } else {
                    if (StringUtils.isBlank(tableAlias)) {
                        queryWrapper.orderByDesc(MyBatisPlusUtil.humpToUnderline(orderKey));
                    } else {
                        queryWrapper.orderByDesc(tableAlias + GlobalConstant.POINT + MyBatisPlusUtil.humpToUnderline(orderKey));
                    }
                }
            } else {
                if (StringUtils.isBlank(tableAlias)) {
                    queryWrapper.orderByAsc(MyBatisPlusUtil.humpToUnderline(orderKey));
                } else {
                    queryWrapper.orderByAsc(tableAlias + GlobalConstant.POINT + MyBatisPlusUtil.humpToUnderline(orderKey));
                }
            }
        }
    }

    public static String humpToUnderline(String param) {
        StringBuilder sb = new StringBuilder();
        if (StringUtils.isNotEmpty(param) && !param.contains(GlobalConstant.UNDERLINE)) {
            for (int i = GlobalConstant.ZERO; i < param.length(); i++) {
                char c = param.charAt(i);
                if (Character.isUpperCase(c)) {
                    sb.append(GlobalConstant.UNDERLINE).append(String.valueOf(c).toLowerCase());
                } else {
                    sb.append(c);
                }
            }
        } else {
            sb.append(param);
        }
        return sb.toString();
    }

    private static <T> void initParam(List<SysMenuDataPermissionConfig> configs, int size) {
        /**
         * 值有可能是预置的变量
         * 当前登录用户：sysUserId
         * 当前角色：sysRoleId
         * 当前部门：sysOrgId
         * 当前日期：sysDate
         */
        Set<String> queryRoleByUserIds = new HashSet<>();
        Set<String> queryOrgByUserIds = new HashSet<>();
        Set<String> queryStoreByUserIds = new HashSet<>();
        for (int i = GlobalConstant.ZERO; i < size; i++) {
            SysMenuDataPermissionConfig config = configs.get(i);
            String conditionValue = config.getConditionValue();
            //当前登陆角色
            if ("${sysRoleId}".equals(conditionValue)) {
                queryRoleByUserIds.addAll(SecurityUtils.getPrincipal().getRoles().stream().collect(Collectors.toSet()));
            }
            //当前登陆人所属的部门
            if ("${createSysOrgId}".equals(conditionValue)) {
                queryOrgByUserIds.add(SecurityUtils.getPrincipal().getOrgId());
            }
            //当前登陆人所属部门负责的仓库
            if ("${sysStoreByUser}".equals(conditionValue)) {
                //根据登陆人找到所属部门
                //筛选出仓库负责人是登陆人所属部门的仓库
                queryStoreByUserIds.add(SecurityUtils.getPrincipal().getOrgId());
            }
        }
        String roleUserIds = "";
        String orgUserIds = "";
        String storeIds = "";
        if (CollUtil.isNotEmpty(queryRoleByUserIds)) {
            UserClient userClient = (UserClient) SpringContextUtil.getBean("com.lets.platform.client.uc.client.UserClient");
            List<SysUserRole> handler = userClient.findUserIdByRoleIds(queryRoleByUserIds).handler();
            roleUserIds = handler.stream().map(SysUserRole::getUserId).collect(Collectors.joining(","));
        }
        if (CollUtil.isNotEmpty(queryOrgByUserIds)) {
            UserClient userClient = (UserClient) SpringContextUtil.getBean("com.lets.platform.client.uc.client.UserClient");
            List<SysUser> handler = userClient.findByOrgIds(queryOrgByUserIds).handler();
            orgUserIds = handler.stream().map(SysUser::getId).collect(Collectors.joining(","));
        }
        if (CollUtil.isNotEmpty(queryStoreByUserIds)) {
            UserClient userClient = (UserClient) SpringContextUtil.getBean("com.lets.platform.client.uc.client.UserClient");
            List<SysUser> userList = userClient.findByOrgIds(queryStoreByUserIds).handler();
            StoreClient storeClient = (StoreClient) SpringContextUtil.getBean("com.lets.platform.client.psi.StoreClient");
            Set<String> userIds = userList.stream().map(SysUser::getId).collect(Collectors.toSet());
            List<PsiStorageStore> storageStores = storeClient.getListInCharges(userIds).handler();
            storeIds = storageStores.stream().map(PsiStorageStore::getId).collect(Collectors.joining(","));
        }
        for (int i = GlobalConstant.ZERO; i < size; i++) {
            SysMenuDataPermissionConfig config = configs.get(i);
            String conditionValue = config.getConditionValue();
            String conditionExpression = config.getConditionExpression();
            if ("${sysUserId}".equals(conditionValue)) {
                conditionValue = SecurityUtils.getUserId();
            } else if ("${sysRoleId}".equals(conditionValue)) {
                if (StringUtils.isNotEmpty(roleUserIds)) {
                    conditionValue = roleUserIds;
                    conditionExpression = ConditionExpressionEnum.IN.getValue();
                }
            } else if ("${sysOrgId}".equals(conditionValue)) {
                conditionValue = SecurityUtils.getPrincipal().getOrgId();
            } else if ("${createSysOrgId}".equals(conditionValue)) {
                if (StringUtils.isNotEmpty(orgUserIds)) {
                    conditionValue = orgUserIds;
                    conditionExpression = ConditionExpressionEnum.IN.getValue();
                }
            }else if ("${sysStoreByUser}".equals(conditionValue)) {
                if (StringUtils.isNotEmpty(storeIds)) {
                    conditionValue = storeIds;
                    conditionExpression = ConditionExpressionEnum.IN.getValue();
                }
            }
            config.setConditionValue(conditionValue);
            config.setConditionExpression(conditionExpression);
        }
    }

    /**
     * 构造每个组的QueryWrapper
     *
     * @param groupWq QueryWrapper
     * @param configs 每个组的所有条件
     * @author DING WEI
     */
    private static <T> void buildGroup(QueryWrapper<T> groupWq, List<SysMenuDataPermissionConfig> configs,
                                       HashMap<QueryField, ConditionHandlerFunction<QueryField, QueryWrapper<T>>> conditionHandlerMap) {
        if (CollUtil.isNotEmpty(configs)) {
            int size = configs.size();
            initParam(configs, size);
            for (int i = GlobalConstant.ZERO; i < size; i++) {
                SysMenuDataPermissionConfig config = configs.get(i);
                QueryField field = new QueryField();
                field.setTabIndex(config.getTabIndex());
                field.setTableAlias(StrUtil.isEmpty(config.getTableAlias()) ? "" : config.getTableAlias());
                field.setConditionKey(config.getConditionKey());
                field.setExpression(config.getConditionExpression());
                field.setValue(config.getConditionValue());
                field.setConditionHandler(config.getConditionHandler());
                field.setRelationField(config.getRelationField());
                MyBatisPlusUtil.append(groupWq, field, conditionHandlerMap.get(field));
            }
        }

    }

    /**
     * 构建queryWrapper
     *
     * @param expression
     * @param value
     * @param conditionKey
     * @param queryWrapper
     * @param qwConnect
     */
    public static <T> void handleNumberField(String expression, Object value, String conditionKey, QueryWrapper<T> queryWrapper, String qwConnect) {
        if (expression.indexOf(GlobalConstant.COMMA_HALF_ANGLE) != -1) {
            String[] specialExpression = expression.split(",");
            ServiceAssert.isTrue(specialExpression.length == 3, GlobalConstant.ZERO, "查询条件格式不正确,请检查");
            String connect = !GlobalConstant.AND.equals(specialExpression[1]) ? " or " : " and ";  //关联条件 &/|

            String specialExpressionValue = value.toString().replaceAll("\\[", GlobalConstant.EMPTY_STR).replaceAll("]", GlobalConstant.EMPTY_STR);
            String[] values = specialExpressionValue.split(GlobalConstant.COMMA_HALF_ANGLE);
            ServiceAssert.isTrue(values.length == 2, GlobalConstant.ZERO, "查询条件格式不正确,请检查");
            final String keyFinal = conditionKey;
            if ("having".equals(qwConnect)) {
                queryWrapper.having(keyFinal + specialExpression[0] + values[0] + connect + keyFinal + specialExpression[2] + values[1]);
            } else {
                queryWrapper.and(q ->
                        q.apply(keyFinal + specialExpression[0] + values[0] + connect + keyFinal + specialExpression[2] + values[1]));
            }

        } else {   //只有单独的>、>=、<、<=
            if ("having".equals(qwConnect)) {
                queryWrapper.having(conditionKey + expression + value);
            } else {
                queryWrapper.and(q -> q.apply(conditionKey + expression + value));
            }
        }
    }
}
