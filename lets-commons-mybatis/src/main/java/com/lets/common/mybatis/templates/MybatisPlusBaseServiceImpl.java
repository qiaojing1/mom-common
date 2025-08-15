package com.lets.common.mybatis.templates;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.enums.SqlMethod;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.TableFieldInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfo;
import com.baomidou.mybatisplus.core.metadata.TableInfoHelper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lets.common.mybatis.configBuilder.ConditionConfig;
import com.lets.common.mybatis.interfaces.ConditionHandlerFunction;
import com.lets.common.mybatis.utils.MyBatisPlusUtil;
import com.lets.commons.easyexcel.entity.ExcelWriteConfig;
import com.lets.commons.easyexcel.utils.EasyExcelUtil;
import com.lets.commons.security.pojo.User;
import com.lets.commons.security.util.SecurityUtils;
import com.lets.platform.client.uc.client.AutoCodeClient;
import com.lets.platform.client.uc.client.MenuClient;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.base.*;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.*;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.util.ValidateUtil;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import com.lets.platform.model.uc.entity.ExcelExportTool;
import com.lets.platform.model.uc.entity.SysMenu;
import com.lets.platform.model.uc.entity.SysMenuFieldPermission;
import io.seata.spring.annotation.GlobalTransactional;
import io.seata.tm.api.transaction.Propagation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.binding.MapperMethod;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 服务实现类 基类
 *
 * @author fzy
 * @since 2023-04-06
 */
@Slf4j
public abstract class MybatisPlusBaseServiceImpl<M extends BaseMapper<T>, T extends BaseEntity> extends ServiceImpl<M, T> implements MybatisPlusBaseService<T> {

    public static final String EXPORT_FIELD_TYPE_KEY = "export_field_type";
    protected BaseMapper<T> baseMapper;
    @Resource
    private ObjectMapper objectMapper;

    public abstract void setMapper();

    /**
     * 在默认的保存,更新,删除前调用该方法,可以对实体类进行校验与修改
     */
    public void checkOrUpdateEntity(T entity, MethodTypeEnum methodSourceEnum) {
    }

    /**
     * 自动编码填充Map(如果未配置自动编码或没有需要转换的字段,不需要重写此方法)
     */
    public void fillAutoCodeParamMap(T entity, Map<String, Object> data) {

    }

    /**
     * 在提交、审核、反审、撤销、删除、启用、禁用、开启、关闭之前调用查询数据
     */
    @Override
    public Map<String, T> queryBeforeOperate(List<String> ids) {
        return findByIds4Map(ids);
    }

    /**
     * 在默认的批量保存,更新,删除前调用该方法,可以对实体类进行校验与修改
     */
    public List<BaseBatchInformationVO> checkOrUpdateEntityBatch(List<T> entityList, MethodTypeEnum batchMethodTypeEnum) {
        return entityList.stream().map(entity -> new BaseBatchInformationVO(entity.getId(), batchMethodTypeEnum)).collect(Collectors.toList());
    }

    /**
     * 在默认的保存,更新,删除后调用该方法,可以对实体类进行校验与修改
     */
    public void afterModify(T entity, MethodTypeEnum methodSourceEnum) {
    }

    /**
     * 在默认的[批量删除、批量启用、批量停用]后调用该方法,可以对实体类进行校验与修改
     */
    public void afterModifyBatch(List<String> entityList, MethodTypeEnum methodSourceEnum) {
    }

    /**
     * 默认分页查询,如果需要带默认参数可重写此方法
     */
    public void beforePage(QueryWrapper<T> queryWrapper, AutoConditionEntity autoConditionEntity) {
    }

    /**
     * defaultList所有操作之前调用
     */
    public void handleParamBeforeList(AutoConditionEntity autoConditionEntity) {
    }

    /**
     * 默认列表查询,如果需要带默认参数可重写此方法
     */
    public void beforeList(QueryWrapper<T> queryWrapper, AutoConditionEntity autoConditionEntity) {
    }

    /**
     * autoPage、findList 如果需要完善实体类属性,重写该方法
     */
    public void perfectBatch(List<T> records) {
    }

    /**
     * findById、autoPage、findList 如果需要完善实体类属性,重写该方法
     */
    public void perfect(T record) {
        List<T> records = new ArrayList<T>() {
            {
                add(record);
            }
        };
        perfectBatch(records);
    }

    /**
     * 保存、更新、删除 时调用
     * 表动字段引用次数
     *
     * @param beforeEntity   更新前数据
     * @param afterEntity    更新后数据
     * @param deleteDataList 删除的数据
     */
    public void handleFieldQuote(Object beforeEntity, Object afterEntity, List<Object> deleteDataList, MethodTypeEnum methodTypeEnum) {

    }

    /**
     * 生成默认条件构造器
     */
    public QueryWrapper<T> createWrapper(User principal, String tableAlias) {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isBlank(tableAlias)) {
            Class<T> clazz = getEntityClass();
            TableInfo tableInfo = TableInfoHelper.getTableInfo(clazz);
            tableAlias = tableInfo.getTableName();
        }
        queryWrapper.eq(tableAlias + ".tenancy_id", principal.getTenancyId());
        return queryWrapper;
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public String defaultSaveOrUpdate(T t) {
        if (StrUtil.isEmpty(t.getId())) {
            return defaultSave(t);
        }
        T entity = getById(t.getId());
        if (entity == null) {
            return defaultSave(t);
        } else {
            return defaultUpdateById(t);
        }
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public String defaultSave(T t) {
        t.toSaveEntity();
        getInstanceProxy().autoCode(t);
        ValidateUtil.validate(t, Save.class);
        checkOrUpdateEntity(t, MethodTypeEnum.SAVE);
        baseMapper.insert(t);
        afterModify(t, MethodTypeEnum.SAVE);
        handleFieldQuote(null, t, null, MethodTypeEnum.SAVE);
        return t.getId();
    }

    @SuppressWarnings("unchecked")
    public MybatisPlusBaseServiceImpl<M, T> getInstanceProxy() {
        return (MybatisPlusBaseServiceImpl<M, T>) SpringUtil.getBean(this.getClass());
    }

    /**
     * 自动编码规则处理
     */
    @Override
    @GlobalTransactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
    public void autoCode(T entity) {
        String menuCode = entity.getMenuCode();
        if (StrUtil.isNotEmpty(menuCode)) {
            AutoCodeClient autoCodeClient = SpringUtil.getBean(AutoCodeClient.class);
            Map<String, Object> data = BeanUtil.beanToMap(entity);
            fillAutoCodeParamMap(entity, data);
            RespMsgBean<Map<String, Object>> respMsgBean = autoCodeClient.autoCode(data);
            data = respMsgBean.handler();
            if (CollUtil.isNotEmpty(data)) {
                BeanUtil.fillBeanWithMap(data, entity, Boolean.FALSE);
            }
        }
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public String defaultUpdateById(T t) {
        T before = getById(t.getId());
        if (Objects.isNull(before)) {
            throw new LetsException(GlobalConstant.ZERO, I18nUtils.getKey("THIS_DATA_NOT_EXIST"));
        }
        ValidateUtil.validate(t, Update.class);
        t.toUpdateEntity();
        checkOrUpdateEntity(t, MethodTypeEnum.UPDATE);
        baseMapper.updateById(t);
        afterModify(t, MethodTypeEnum.UPDATE);
        handleFieldQuote(before, t, null, MethodTypeEnum.UPDATE);
        return t.getId();
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public Integer defaultDeleteById(T entity) {
        T before = getById(entity.getId());
        if (Objects.isNull(before)) {
            throw new LetsException(GlobalConstant.ZERO, I18nUtils.getKey("THIS_DATA_NOT_EXIST"));
        }
        checkOrUpdateEntity(entity, MethodTypeEnum.DELETE);
        int i = baseMapper.deleteById(entity);
        afterModify(before, MethodTypeEnum.DELETE);
        handleFieldQuote(null, null, Collections.singletonList(before), MethodTypeEnum.DELETE);
        return i;
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public List<BaseBatchInformationVO> defaultDeleteBatchById(List<T> entityList) {
        List<BaseBatchInformationVO> result = checkOrUpdateEntityBatch(entityList, MethodTypeEnum.DELETE);
        List<BaseBatchInformationVO> collect = result.stream().filter(item -> item.getCode() == 200).collect(Collectors.toList());
        if (CollUtil.isNotEmpty(collect)) {
            List<String> deleteIds = new ArrayList<>();
            List<Object> deleteDataList = new ArrayList<>();
            for (BaseBatchInformationVO informationVO : collect) {
                deleteIds.add(informationVO.getId());
                deleteDataList.add(informationVO.getData());
            }
            baseMapper.deleteBatchIds(deleteIds);
            afterModifyBatch(deleteIds, MethodTypeEnum.DELETE);
            handleFieldQuote(null, null, deleteDataList, MethodTypeEnum.DELETE);
        }
        return result;
    }

    @Override
    @GlobalTransactional(rollbackFor = Exception.class)
    public List<BaseBatchInformationVO> defaultEnableOrDisable(List<T> entityList, IsOrNotEnum enableEnum, String force) {
        MethodTypeEnum typeEnum = enableEnum == IsOrNotEnum.IS ? MethodTypeEnum.ENABLE : MethodTypeEnum.DISABLE;
        List<BaseBatchInformationVO> result;
        List<BaseBatchInformationVO> needUpdateList;
        if (StrUtil.isNotEmpty(force) && YesOrNo.YES.getValue().equals(force)) {
            result = entityList.stream().map(entity ->
                    new BaseBatchInformationVO(entity.getId(), typeEnum)
            ).collect(Collectors.toList());
            needUpdateList = result;
        } else {
            result = checkOrUpdateEntityBatch(entityList, typeEnum);
            needUpdateList = result.stream().filter(item -> item.getCode() == 200).collect(Collectors.toList());
        }
        if (CollUtil.isNotEmpty(needUpdateList)) {
            String sqlStatement = this.getSqlStatement(SqlMethod.UPDATE);
            this.executeBatch(needUpdateList, 200, (sqlSession, entity) -> {
                MapperMethod.ParamMap<UpdateWrapper<T>> paramMap = new MapperMethod.ParamMap<>();
                paramMap.put(Constants.ENTITY, null);
                UpdateWrapper<T> updateWrapper = new UpdateWrapper<>();
                updateWrapper.set("enable", enableEnum.getValue());
                Integer version = entity.getVersion();
                if (Objects.nonNull(version)) {
                    updateWrapper.set("version", entity.getVersion() + GlobalConstant.ONE);
                }
                updateWrapper.eq("id", entity.getId());
                if (Objects.nonNull(version)) {
                    updateWrapper.eq("version", entity.getVersion());
                }
                paramMap.put(Constants.WRAPPER, updateWrapper);
                sqlSession.update(sqlStatement, paramMap);
            });
            afterModifyBatch(needUpdateList.stream().map(BaseBatchInformationVO::getId).collect(Collectors.toList()), typeEnum);
        }
        return result;
    }

    @Override
    public T defaultFindById(String id) {
        ServiceAssert.isTrue(StringUtils.isNotBlank(id), 0, I18nUtils.getKey("PLEASE_SELECT_THE_DATA_TO_VIEW"));
        T entity = baseMapper.selectById(id);
        if (Objects.nonNull(entity)) {
            perfect(entity);
        }
        return entity;
    }

    @Override
    public List<T> defaultList(Map<String, Object> queryMap) {
        Object tableAlias = queryMap.get("tableAlias");
        QueryWrapper<T> queryWrapper = createWrapper(SecurityUtils.getPrincipal(), Objects.isNull(tableAlias) ? null : tableAlias.toString());
        if (!CollectionUtils.isEmpty(queryMap)) {
            queryMap.forEach(
                    (k, v) -> {
                        if (StrUtil.isNotEmpty(v.toString())) {
                            queryWrapper.eq(MyBatisPlusUtil.humpToUnderline(k), v);
                        }
                    });
        }
        List<T> list = baseMapper.selectList(queryWrapper);
        if (!CollectionUtils.isEmpty(list)) {
            perfectBatch(list);
        }
        return list;
    }

    public QueryWrapper<T> doQueryBeforePage(AutoConditionEntity autoConditionEntity, DefaultSelectTypeEnum defaultSelectTypeEnum) {
        User user = SecurityUtils.getPrincipal();
        QueryWrapper<T> queryWrapper = createWrapper(user, autoConditionEntity.getTableAlias());
        if (DefaultSelectTypeEnum.DEFAULT_PAGE.equals(defaultSelectTypeEnum)) {
            beforePage(queryWrapper, autoConditionEntity);
        } else if (DefaultSelectTypeEnum.DEFAULT_LIST.equals(defaultSelectTypeEnum)) {
            beforeList(queryWrapper, autoConditionEntity);
        }
        List<QueryField> conditionFields = new ArrayList<>();
        if (CollUtil.isNotEmpty((autoConditionEntity.getConditionList()))) {
            for (ConditionEntity condition : autoConditionEntity.getConditionList()) {
                QueryField queryField = new QueryField(condition, autoConditionEntity.getTabIndex());
                conditionFields.add(queryField);
            }
        }
        //or 连接的查询条件
        List<QueryField> conditionOrFields = new ArrayList<>();
        if (CollUtil.isNotEmpty((autoConditionEntity.getConditionOrList()))) {
            for (ConditionEntity condition : autoConditionEntity.getConditionOrList()) {
                QueryField queryField = new QueryField(condition, autoConditionEntity.getTabIndex());
                conditionOrFields.add(queryField);
            }
        }
        HashMap<QueryField, ConditionHandlerFunction<QueryField, QueryWrapper<T>>> conditionHandlerMap = getConditionHandler();
        // 根据查询条件构造条件构造器
        MyBatisPlusUtil.buildQueryWrapper(queryWrapper, conditionFields, conditionOrFields, conditionHandlerMap);
        // 数据权限处理
        MyBatisPlusUtil.dataPermissionWrapper(queryWrapper, user, autoConditionEntity.getMenuCode(), autoConditionEntity.getTabIndex(), conditionHandlerMap);
        // 默认按 修改时间 倒序、id 正序
        List<OrderEntity> orderList = autoConditionEntity.getOrderList();
        orderByHandler(queryWrapper, orderList, StrUtil.EMPTY);
        MyBatisPlusUtil.cleanEmptyNested(queryWrapper.lambda());
        return queryWrapper;
    }

    @Override
    public IPage<T> defaultPage(AutoConditionEntity autoConditionEntity) {
        QueryWrapper<T> queryWrapper = doQueryBeforePage(autoConditionEntity, DefaultSelectTypeEnum.DEFAULT_PAGE);
        int size = autoConditionEntity.getSize();
        int current = autoConditionEntity.getCurrent();
        IPage<T> page = baseMapper.selectPage(new Page<>(current, size), queryWrapper);
        if (CollUtil.isNotEmpty(page.getRecords())) {
            perfectBatch(page.getRecords());
        }
        return page;
    }

    @Override
    public Map<String, Long> defaultCount(AutoConditionEntity autoConditionEntity) {
        Map<String, Long> returnMap = new HashMap<>();
        OrderEntity orderEntity = new OrderEntity();
        autoConditionEntity.setOrderList(Collections.singletonList(orderEntity));  //不走排序
        if (StringUtils.isNotEmpty(autoConditionEntity.getTableAlias())) {
            autoConditionEntity.setTableAlias(autoConditionEntity.getTableAlias());
        }
        String columnKey = autoConditionEntity.getGroupKey();
        String tableAlias = autoConditionEntity.getTableAlias();
        if (columnKey.contains(".")) {
            String[] split = columnKey.split("\\.");
            columnKey = split[1];
            tableAlias = split[0];
        }
        columnKey = MyBatisPlusUtil.humpToUnderline(columnKey);
        String finalColumnKey = StringUtils.isNotBlank(tableAlias) ? (tableAlias + "." + columnKey) : columnKey;

        autoConditionEntity.getConditionList().removeIf(x -> finalColumnKey.equals(x.getConditionTableAlias() + "." + x.getConditionKey()));
        QueryWrapper<T> queryWrapper = doQueryBeforePage(autoConditionEntity, DefaultSelectTypeEnum.DEFAULT_PAGE);
        orderEntity.setOrderKey(finalColumnKey);

        queryWrapper.groupBy(finalColumnKey);

        if (YesOrNo.NO.getValue().equals(autoConditionEntity.getIsOpen())) {
            queryWrapper.select(finalColumnKey, "COUNT(distinct " + (StringUtils.isNotBlank(tableAlias) ? tableAlias + "." : "") + "id) as count");
        } else {
            queryWrapper.select(finalColumnKey, "COUNT(1) as count");
        }

        queryWrapper.orderByDesc(finalColumnKey);
        //将finalColumnKey的查询条件去掉

        List<Map<String, Object>> result = selectCount(queryWrapper);
        for (Map<String, Object> group : result) {
            String key = String.valueOf(group.get(columnKey));// 分组字段的值
            Long count = (Long) group.get("count"); // 该分组的数量
            returnMap.put(key, returnMap.getOrDefault(key, 0L) + count);
        }
        return returnMap;
    }

    public List<Map<String, Object>> selectCount(QueryWrapper<T> queryWrapper) {
        return baseMapper.selectMaps(queryWrapper);
    }

    @Override
    public List<T> defaultList(AutoConditionEntity autoConditionEntity) {
        handleParamBeforeList(autoConditionEntity);
        QueryWrapper<T> queryWrapper = doQueryBeforePage(autoConditionEntity, DefaultSelectTypeEnum.DEFAULT_LIST);
        List<T> ts = baseMapper.selectList(queryWrapper);
        if (CollUtil.isNotEmpty(ts)) {
            perfectBatch(ts);
        }
        return ts;
    }

    protected HashMap<QueryField, ConditionHandlerFunction<QueryField, QueryWrapper<T>>> getConditionHandler() {
        return MyBatisPlusUtil.getConditionHandler(this::conditionConfig);
    }

    public ConditionConfig<T> conditionConfig() {
        return new ConditionConfig.Builder<T>().build();
    }

    public void orderByHandler(QueryWrapper<T> queryWrapper, List<OrderEntity> orderList, String tableAlias) {
        if (CollectionUtils.isEmpty(orderList)) {
            MyBatisPlusUtil.defaultOrderBy(queryWrapper, tableAlias);
        } else {
            MyBatisPlusUtil.orderBy(queryWrapper, orderList);
        }
    }

    public Map<String, T> findByIds4Map(Collection<String> ids) {
        Map<String, T> resultMap = new HashMap<>();
        if (CollUtil.isNotEmpty(ids)) {
            resultMap = baseMapper.selectBatchIds(ids).stream().collect(Collectors.toMap(T::getId, Function.identity(), (v1, v2) -> v1));
        }
        return resultMap;
    }

    public T defaultFindKeysById(String id, Collection<String> keys) {
        Class<T> clazz = getEntityClass();
        TableInfo tableInfo = TableInfoHelper.getTableInfo(clazz);
        List<TableFieldInfo> fieldList = tableInfo.getFieldList();
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        String keyProperty = tableInfo.getKeyProperty();
        queryWrapper.eq(keyProperty, id);
        if (CollUtil.isNotEmpty(keys)) {
            List<String> existKeys = fieldList.stream().filter(field -> keys.contains(field.getProperty())).map(TableFieldInfo::getColumn).distinct().collect(Collectors.toList());
            existKeys.add(keyProperty);
            queryWrapper.select(existKeys);
        } else {
            queryWrapper.select(keyProperty);
        }
        return baseMapper.selectOne(queryWrapper);
    }

    @Override
    public void defaultExport(AutoConditionEntity autoConditionEntity, HttpServletResponse response) {
        List<?> dataList = getExportData(autoConditionEntity);
        String menuCode = autoConditionEntity.getMenuCode();
        Integer tabIndex = Optional.ofNullable(autoConditionEntity.getTabIndex()).orElse(1);
        List<SysMenuFieldPermission> fields = getExportField(menuCode, tabIndex);
        List<List<String>> headList = ExcelExportTool.getHead(fields);
        List<List<Object>> list = new ArrayList<>();
        for (Object data : dataList) {
            JSONObject jsonObject;
            String jsonString;
            try {
                jsonString = objectMapper.writeValueAsString(data);
                jsonObject = JSONObject.parseObject(jsonString);
            } catch (JsonProcessingException e) {
                throw new LetsException(0, "JSON解析错误");
            }
            List<Object> row = new ArrayList<>();
            for (SysMenuFieldPermission field : fields) {
                row.add(jsonObject.get(field.getFieldKey()));
            }
            list.add(row);
        }
        // 设置响应输出的头类型(设置响应类型)
        response.setHeader(ResponseHeaderEnum.CONTENT_TYPE_XLSX.getName(), ResponseHeaderEnum.CONTENT_TYPE_XLSX.getValue());
        try (ServletOutputStream out = response.getOutputStream()) {
            ExcelWriteConfig sheetConfig = new ExcelWriteConfig(headList, list, getSheetName(menuCode), true, false, true);
            EasyExcelUtil.writeExcelWithConfig(out, sheetConfig);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<?> getExportData(AutoConditionEntity autoConditionEntity) {
        autoConditionEntity.setSize(-1);
        IPage<T> page = defaultPage(autoConditionEntity);
        List<T> records = page.getRecords();
        if (CollUtil.isNotEmpty(records)) {
            ServiceAssert.isTrue(records.size() <= 3000, 0, I18nUtils.getKey("EXPORT_DATA_LIMIT_COUNT", 3000));
        }
        return records;
    }

    public List<SysMenuFieldPermission> getExportField(String menuCode, Integer tabIndex) {
        String type = ExportTypeEnum.ROLE.getValue();
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            HttpServletRequest request = attributes.getRequest();
            type = Optional.ofNullable(request.getHeader(EXPORT_FIELD_TYPE_KEY)).orElse(ExportTypeEnum.ROLE.getValue());
        }
        MenuClient menuClient = SpringUtil.getBean(MenuClient.class);
        if (menuClient != null) {
            if (ExportTypeEnum.ROLE.getValue().equals(type)) {
                return menuClient.getRoleField(menuCode, tabIndex).handler(new ArrayList<>());
            } else if (ExportTypeEnum.USER.getValue().equals(type)) {
                return menuClient.getUserField(menuCode, tabIndex).handler(new ArrayList<>()).stream().filter(SysMenuFieldPermission::isChecked).collect(Collectors.toList());
            }
        }
        return new ArrayList<>();
    }

    public String getSheetName(String menuCode) {
        if (StrUtil.isEmpty(menuCode)) {
            return StrUtil.EMPTY;
        }
        MenuClient menuClient = SpringUtil.getBean(MenuClient.class);
        SysMenu menu = menuClient.getByCode(menuCode).handler();
        if (menu != null) {
            return menu.getName();
        }
        return StrUtil.EMPTY;
    }

    public void exportData(HttpServletResponse response, String sheetName, List<List<String>> headList, List<List<Object>> dataList) {
        response.setHeader(ResponseHeaderEnum.CONTENT_TYPE_XLSX.getName(), ResponseHeaderEnum.CONTENT_TYPE_XLSX.getValue());
        try (ServletOutputStream out = response.getOutputStream()) {
            ExcelWriteConfig sheetConfig = new ExcelWriteConfig(headList, dataList, sheetName, true, false, true);
            EasyExcelUtil.writeExcelWithConfig(out, sheetConfig);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Set<String> checkMaterialsExist(Collection<String> materials) {
        if (CollUtil.isEmpty(materials)) {
            return new HashSet<>();
        }

        // 检查实体类是否存在material字段
        Class<T> entityClass = getEntityClass();
        TableInfo tableInfo = TableInfoHelper.getTableInfo(entityClass);
        Optional<TableFieldInfo> materialField = tableInfo.getFieldList().stream()
                .filter(f -> "material_id".equals(f.getColumn())
                        || "sub_material_id".equals(f.getColumn())
                        || "target_id".equals(f.getColumn())
                        || "value".equals(f.getColumn())
                )
                .findFirst();

        if (!materialField.isPresent()) {
            return new HashSet<>();
        }

        // 构建查询条件
        String column = materialField.get().getColumn();
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("DISTINCT " + column)
                .in(column, materials)
                .last("LIMIT " + materials.size());

        return baseMapper.selectObjs(queryWrapper).stream()
                .filter(Objects::nonNull)
                .map(Object::toString)
                .collect(Collectors.toSet());
    }

    public Set<String> checkMaterialGroupsExist(Collection<String> materialGroupIds) {
        if (CollUtil.isEmpty(materialGroupIds)) {
            return new HashSet<>();
        }

        // 检查实体类是否存在material字段
        Class<T> entityClass = getEntityClass();
        TableInfo tableInfo = TableInfoHelper.getTableInfo(entityClass);
        Optional<TableFieldInfo> materialField = tableInfo.getFieldList().stream()
                .filter(f -> "material_group_id".equals(f.getColumn()))
                .findFirst();

        if (!materialField.isPresent()) {
            return new HashSet<>();
        }

        // 构建查询条件
        String column = materialField.get().getColumn();
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("DISTINCT " + column)
                .in(column, materialGroupIds)
                .last("LIMIT " + materialGroupIds.size());

        return baseMapper.selectObjs(queryWrapper).stream()
                .filter(Objects::nonNull)
                .map(Object::toString)
                .collect(Collectors.toSet());
    }
}
