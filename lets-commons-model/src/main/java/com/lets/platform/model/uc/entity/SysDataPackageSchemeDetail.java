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
 * 数据打包方案-明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-02-21
 */
@Getter
@Setter
@TableName("sys_data_package_scheme_detail")
@ApiModel(value = "SysDataPackageSchemeDetail对象", description = "数据打包方案-明细")
public class SysDataPackageSchemeDetail extends BaseEntity {

    @ApiModelProperty("方案表头id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private String lineNumber;

    @ApiModelProperty("所属菜单编码(用-分割)")
    @TableField("belong_menu_codes")
    private String belongMenuCodes;

    @ApiModelProperty("所属菜单名称(用-分割)")
    @TableField("belong_menu_names")
    private String belongMenuNames;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("数据筛选")
    @TableField("sorted_by_conditions")
    private String sortedByConditions;

    @ApiModelProperty("前置基础资料")
    @TableField("pre_menu_code")
    private String preMenuCode;

    @ApiModelProperty("前置基础资料-名称")
    @TableField("pre_menu_name")
    private String preMenuName;

    @ApiModelProperty("菜单前缀请求url")
    @TableField(exist = false)
    private String prefixBaseUrl;
}
