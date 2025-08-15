package com.lets.common.mybatis.templates;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.annotation.EnableLog;
import com.lets.platform.common.pojo.base.AutoConditionEntity;
import com.lets.platform.common.pojo.base.BaseController;
import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.common.pojo.valid.Delete;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * mybatisPlus控制器 基类
 *
 * @author fzy
 * @since 2023-04-06
 */
public abstract class MybatisPlusBaseController<K extends BaseMapper<T>, T extends BaseEntity> extends BaseController {

    protected MybatisPlusBaseService<T> mybatisPlusBaseService;

    public abstract void setService();

    @PostMapping("/defaultSave")
    @ApiOperation("保存(默认实现)")
    @EnableLog(triggerEvent = "保存")
    public RespMsgBean<String> defaultSave(@RequestBody(required = false) T entity) {
        return success(I18nUtils.getKey(ExceptionEnums.SAVE_SUCCESS), mybatisPlusBaseService.defaultSave(entity));
    }

    @PostMapping("/defaultUpdateById")
    @ApiOperation("根据主键更新(默认实现)")
    @EnableLog(triggerEvent = "更新")
    public RespMsgBean<String> defaultUpdateById(@Validated(value = {Update.class}) @RequestBody(required = false) T entity) {
        return success(I18nUtils.getKey(ExceptionEnums.UPDATE_SUCCESS), mybatisPlusBaseService.defaultUpdateById(entity));
    }

    @PostMapping("/defaultDeleteById")
    @ApiOperation("根据主键删除(默认实现)")
    @EnableLog(triggerEvent = "删除")
    public RespMsgBean<Integer> defaultDeleteById(@Validated(value = {Delete.class}) @RequestBody(required = false) T entity) {
        return success(I18nUtils.getKey(ExceptionEnums.DELETE_SUCCESS), mybatisPlusBaseService.defaultDeleteById(entity));
    }

    @PostMapping("/defaultDeleteBatchById")
    @ApiOperation("根据主键批量删除(默认实现)")
    @EnableLog(triggerEvent = "删除")
    public RespMsgBean<List<BaseBatchInformationVO>> defaultDeleteBatchById(@RequestBody(required = false) List<T> entityList) {
        return success(I18nUtils.getKey(ExceptionEnums.DELETE_SUCCESS), mybatisPlusBaseService.defaultDeleteBatchById(entityList));
    }

    @GetMapping("/defaultFindById")
    @ApiOperation("根据主键查询(默认实现)")
    public RespMsgBean<T> defaultFindById(@RequestParam(value = "id", required = false) String id) {
        return success(I18nUtils.getKey(ExceptionEnums.FIND_SUCCESS), mybatisPlusBaseService.defaultFindById(id));
    }

    @PostMapping("/defaultList")
    @ApiOperation("列表查询(默认实现)")
    public RespMsgBean<List<T>> defaultFindList(@RequestBody(required = false) Map<String, Object> queryMap) {
        return success(I18nUtils.getKey(ExceptionEnums.FIND_SUCCESS), mybatisPlusBaseService.defaultList(queryMap));
    }

    @PostMapping("/defaultPage")
    @ApiOperation("分页查询(默认实现)")
    public RespMsgBean<IPage<T>> defaultPage(@RequestBody AutoConditionEntity autoConditionEntity) {
        return success(I18nUtils.getKey(ExceptionEnums.FIND_SUCCESS), mybatisPlusBaseService.defaultPage(autoConditionEntity));
    }

    @PostMapping("/defaultCount")
    @ApiOperation("数量查询(默认实现;根据传入字段分组)")
    public RespMsgBean<Map<String, Long>> defaultCount(@RequestBody AutoConditionEntity autoConditionEntity) {
        return success(I18nUtils.getKey(ExceptionEnums.FIND_SUCCESS), mybatisPlusBaseService.defaultCount(autoConditionEntity));
    }

    @PostMapping("/defaultSaveOrUpdate")
    @ApiOperation(value = "默认保存或更新(默认实现)")
    @EnableLog(triggerEvent = "保存或更新")
    public RespMsgBean<String> defaultSaveOrUpdate(@RequestBody T entity) {
        return success(I18nUtils.getKey(ExceptionEnums.SAVE_SUCCESS), mybatisPlusBaseService.defaultSaveOrUpdate(entity));
    }

    @PostMapping("/defaultEnable")
    @ApiOperation("启用(默认实现)")
    @EnableLog(triggerEvent = "启用")
    public RespMsgBean<List<BaseBatchInformationVO>> defaultEnable(@RequestBody List<T> list, @RequestParam(value = "force", required = false) String force) {
        return success(I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS), mybatisPlusBaseService.defaultEnableOrDisable(list, IsOrNotEnum.IS, force));
    }

    @PostMapping("/defaultDisable")
    @ApiOperation("禁用(默认实现)")
    @EnableLog(triggerEvent = "停用")
    public RespMsgBean<List<BaseBatchInformationVO>> defaultDisable(@RequestBody List<T> list, @RequestParam(value = "force", required = false) String force) {
        return success(I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS), mybatisPlusBaseService.defaultEnableOrDisable(list, IsOrNotEnum.NOT, force));
    }

    @GetMapping("/defaultFindKeysById")
    @ApiOperation("根据主键查询Keys(默认实现)")
    public RespMsgBean<T> defaultDisable(@RequestParam("id") String id, @RequestParam(value = "keys", required = false) Collection<String> keys) {
        return success(I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS), mybatisPlusBaseService.defaultFindKeysById(id, keys));
    }

    @PostMapping("/defaultExport")
    @ApiOperation("默认导出")
    public void defaultExport(@RequestBody AutoConditionEntity autoConditionEntity, @ApiIgnore HttpServletResponse response) {
        mybatisPlusBaseService.defaultExport(autoConditionEntity, response);
    }
}
