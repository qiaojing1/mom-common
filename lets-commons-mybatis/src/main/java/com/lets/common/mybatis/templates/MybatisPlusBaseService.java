package com.lets.common.mybatis.templates;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lets.commons.security.pojo.User;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.enums.MethodTypeEnum;
import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.psi.enums.IsOrNotEnum;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 服务类 基类
 *
 * @author fzy
 * @since 2023-04-06
 */
public interface MybatisPlusBaseService<T> extends IService<T> {

    /**
     * 在默认的保存,更新,删除前调用该方法,可以对实体类进行校验与修改
     *
     * @param entity           实体
     * @param methodSourceEnum 方法来源
     */
    void checkOrUpdateEntity(T entity, MethodTypeEnum methodSourceEnum);

    /**
     * autoPage、findList 如果需要完善实体类属性,重写该方法
     *
     * @param records 记录
     */
    void perfectBatch(List<T> records);

    /**
     * findById 如果需要完善实体类属性,重写该方法
     *
     * @param record 记录
     */
    void perfect(T record);

    /**
     * 生成默认条件构造器 默认只有租户ID
     */
    QueryWrapper<T> createWrapper(User principal, String tableAlias);

    String defaultSaveOrUpdate(T t);

    String defaultSave(T t);

    String defaultUpdateById(T t);

    Integer defaultDeleteById(T entity);

    List<BaseBatchInformationVO> defaultDeleteBatchById(List<T> entityList);

    T defaultFindById(String id);

    List<T> defaultList(Map<String, Object> queryMap);

    IPage<T> defaultPage(AutoConditionEntity t);

    List<T> defaultList(AutoConditionEntity autoConditionEntity);

    List<BaseBatchInformationVO> defaultEnableOrDisable(List<T> entityList, IsOrNotEnum enableEnum, String force);

    void autoCode(T entity);

    T defaultFindKeysById(String id, Collection<String> keys);

    Map<String, T> findByIds4Map(Collection<String> ids);

    Map<String, T> queryBeforeOperate(List<String> ids);

    Map<String,Long> defaultCount(AutoConditionEntity autoConditionEntity);

    void defaultExport(AutoConditionEntity autoConditionEntity, HttpServletResponse response);

    Set<String> checkMaterialsExist(Collection<String> materialIds);

    Set<String> checkMaterialGroupsExist(Collection<String> materialIds);
}
