package com.lets.platform.model.uc.entity;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import java.util.Objects;

/**
 * <p>
 * 菜单查询条件字段权限(tenancyId,menuCode,type,tabIndex,tableAlias,fieldKey 当作联合主键,确定数据唯一性)
 * </p>
 *
 * @author FZY
 * @since 2023-04-23
 */
@Getter
@Setter
@TableName("sys_menu_field_permission")
@ApiModel(value = "SysMenuFieldPermission对象", description = "菜单查询条件字段权限")
public class SysMenuFieldPermission extends BaseEntity {

    private static final long serialVersionUID = 1436515031349876237L;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("表别名")
    @TableField("table_alias")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String tableAlias;

    @ApiModelProperty("字段key")
    @TableField("field_key")
    private String fieldKey;

    @ApiModelProperty("查询条件字段key")
    @TableField("field_condition_key")
    private String fieldConditionKey;

    @ApiModelProperty("条件类型(=,like等)")
    @TableField("condition_expression")
    private String conditionExpression;

    @ApiModelProperty("字段名")
    @TableField("field_name")
    private String fieldName;

    @ApiModelProperty("字段名")
    @TableField(exist = false)
    @Length(max = 24, message = "menu.displayName", groups = {Update.class})
    private String displayName;

    @ApiModelProperty("类型[0:列表页字段,1:表单字段]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("字段类型[例如:number;string]")
    @TableField("field_type")
    private String fieldType;

    @ApiModelProperty("是否默认勾选")
    @TableField("is_default")
    private Integer isDefault;

    @ApiModelProperty("是否组件")
    @TableField("is_component")
    private Integer isComponent;

    @ApiModelProperty("组件类型[例:select,input,number,date,datetime]")
    @TableField("component_type")
    private String componentType;

    @ApiModelProperty("组件映射实例")
    @TableField("ref_name")
    private String refName;

    @ApiModelProperty("实例入参数")
    @TableField("props")
    private String props;

    @ApiModelProperty("表单字段是否组件")
    @TableField("table_is_component")
    private Integer tableIsComponent;

    @ApiModelProperty("列表组件类型[例:select,input,number,date,datetime]")
    @TableField("table_component_type")
    private String tableComponentType;

    @ApiModelProperty("列表组件映射实例")
    @TableField("table_ref_name")
    private String tableRefName;

    @ApiModelProperty("列表实例入参数")
    @TableField("table_props")
    private String tableProps;

    @ApiModelProperty("列表字段宽度")
    @TableField("table_width")
    @Max(value = 1000, message = "menu.tableWidth", groups = {Update.class})
    private Integer tableWidth;

    @ApiModelProperty("是否必选(0:否;1:是)")
    @TableField("required")
    private Integer required;

    @ApiModelProperty("是否禁用[0:否;1:是](仅对type=1生效)")
    @TableField("is_editable")
    private Integer isEditable;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("tab页序号")
    @TableField("tab_index")
    private Integer tabIndex;

    @ApiModelProperty("tab页名称")
    @TableField("tab_name")
    private String tabName;

    @ApiModelProperty("固定列属性(left|right)")
    @TableField("fixed")
    private String fixed;

    @ApiModelProperty("对齐方式")
    @TableField("align")
    private String align;

    @ApiModelProperty("是否汇总(0:否;1:是)")
    @TableField("sum")
    private Integer sum;

    @ApiModelProperty("是否平均值(0:否;1:是)")
    @TableField("avg")
    private Integer avg;

    //@ApiModelProperty("下拉源[type为select生效]")
    //@TableField("select_url")
    //private String selectUrl;
    //
    //@ApiModelProperty("下拉值字段")
    //@TableField("select_value")
    //private String selectValue;
    //
    //@ApiModelProperty("下拉展示字段")
    //@TableField("select_label")
    //private String selectLabel;

    @ApiModelProperty("查询条件后台处理类")
    @TableField("condition_handler")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String conditionHandler;

    @ApiModelProperty("关联字段")
    @TableField("relation_field")
    @JsonInclude(JsonInclude.Include.ALWAYS)
    private String relationField;

    @ApiModelProperty("是否主表数据[0:否;1:是]")
    @TableField("is_main_table")
    private Integer isMainTable;

    @ApiModelProperty("是否全域查询[0:否;1:是]")
    @TableField("is_all_query")
    private Integer isAllQuery;

    @ApiModelProperty("分组名称")
    @TableField("group_name")
    private String groupName;

    @ApiModelProperty("分组序号")
    @TableField("group_index")
    private Integer groupIndex;

    @ApiModelProperty("是否可查询[0:否;1:是]")
    @TableField("is_query")
    private Integer isQuery;

    @ApiModelProperty("是否可排序[0:否;1:是]")
    @TableField("is_sort")
    private Integer isSort;

    @ApiModelProperty("是否渲染[0:否;1:是]; 在卡片视图下,配置为是的字段做为颜色渲染卡片 ")
    @TableField("is_render")
    private Integer isRender;

    @TableField(exist = false)
    private boolean checked;

    @TableField(exist = false)
    private Integer isShow;

    @TableField(exist = false)
    private Integer isDefaultCondition;

    public boolean isSameField(SysMenuFieldPermission other) {
        return StrUtil.equals(this.menuCode, other.getMenuCode())
               && Objects.equals(this.type, other.getType())
               && Objects.equals(this.tabIndex, other.getTabIndex())
               && StrUtil.equals(this.tableAlias, other.getTableAlias())
               && StrUtil.equals(this.fieldKey, other.getFieldKey());
//               && StrUtil.equals(this.fieldName, other.getFieldName());
    }

    public boolean isSameField(SysMenuFieldPermissionRole other) {
        return StrUtil.equals(this.menuCode, other.getMenuCode())
               && Objects.equals(this.type, other.getType())
               && Objects.equals(this.tabIndex, other.getTabIndex())
               && StrUtil.equals(this.tableAlias, other.getTableAlias())
               && StrUtil.equals(this.fieldKey, other.getFieldKey());
        //                && StrUtil.equals(this.fieldName, other.getFieldName());
    }

    public boolean isSameField(SysMenuFieldPermissionUser other) {
        return StrUtil.equals(this.menuCode, other.getMenuCode())
               && this.type.equals(0)
               && Objects.equals(this.tabIndex, other.getTabIndex())
               && StrUtil.equals(this.tableAlias, other.getTableAlias())
               && StrUtil.equals(this.fieldKey, other.getFieldKey());
        //                && StrUtil.equals(this.fieldName, other.getFieldName());
    }

    public boolean isSameField(SysMenuConditionSchemeDetails other) {
        return StrUtil.equals(this.menuCode, other.getMenuCode())
               && this.type.equals(0)
               && Objects.equals(this.tabIndex, other.getTabIndex())
               && StrUtil.equals(this.tableAlias, other.getTableAlias())
               && StrUtil.equals(this.fieldKey, other.getFieldKey());
    }

    public boolean isSameField(SysMenuDataPermissionConfig other) {
        return StrUtil.equals(this.menuCode, other.getMenuCode())
               && this.type.equals(0)
               && Objects.equals(this.tabIndex, other.getTabIndex())
               && StrUtil.equals(this.tableAlias, other.getTableAlias())
               && StrUtil.equals(this.fieldKey, other.getFieldKey());
    }
}
