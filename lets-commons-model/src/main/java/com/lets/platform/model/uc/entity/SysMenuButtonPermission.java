package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 菜单按钮权限(tenancyId,menuCode,code 当作联合主键,确定数据唯一性)
 * </p>
 *
 * @author FZY
 * @since 2023-04-23
 */
@Getter
@Setter
@TableName("sys_menu_button_permission")
@ApiModel(value = "SysMenuButtonPermission对象", description = "菜单按钮权限")
public class SysMenuButtonPermission extends BaseEntity {

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("按钮CODE")
    @TableField("code")
    private String code;

    @ApiModelProperty("按钮名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("是否必选(0:否;1:是)")
    @TableField("required")
    private Integer required;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("是否默认勾选")
    @TableField("is_default")
    private Integer isDefault;

    @ApiModelProperty("按钮归属")
    @TableField("affiliation")
    private String affiliation;

    @ApiModelProperty("按钮颜色")
    @TableField("color")
    private String color;

    @ApiModelProperty("是否组件")
    @TableField("is_component")
    private Integer isComponent;

    @ApiModelProperty("组件名称")
    @TableField("component_name")
    private String componentName;

    @ApiModelProperty("组件props")
    @TableField("component_props")
    private String componentProps;

    @ApiModelProperty("组件映射名称")
    @TableField("component_ref_name")
    private String componentRefName;

    @ApiModelProperty("触发方法")
    @TableField("fun_name")
    private String funName;

    @ApiModelProperty("方法参数")
    @TableField("fun_params")
    private String funParams;

    @ApiModelProperty("展示依据")
    @TableField("display")
    private String display;

    @ApiModelProperty("校验参数")
    @TableField("check_param")
    private String checkParam;

    @ApiModelProperty("是否异步执行")
    @TableField("is_async")
    private Integer isAsync;

    @ApiModelProperty("数据锁定")
    @TableField("is_lock")
    private Integer isLock;

    @ApiModelProperty("启用单条操作")
    @TableField("enable_single_operation")
    private Integer enableSingleOperation;

    @ApiModelProperty("启用批量操作")
    @TableField("enable_batch_operation")
    private Integer enableBatchOperation;

    @TableField(exist = false)
    private boolean checked;

    @TableField(exist = false)
    private boolean flowable;

    @TableField(exist = false)
    private String workflowMenuCode;
}
