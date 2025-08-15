package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 首页配置-组件
 * @author DING WEI
 * @since 2024-01-16
 */
@Getter
@Setter
@TableName("sys_index_config_unit")
@ApiModel(value = "SysIndexConfigUnit对象", description = "首页配置-组件")
public class SysIndexConfigUnit extends BaseEntity {

    @ApiModelProperty("配置主键")
    @TableField("config_id")
    private String configId;

    @ApiModelProperty("组件主键")
    @TableField("unit_id")
    private String unitId;

    @ApiModelProperty("组件编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("组件名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("组件标签")
    @TableField("icon")
    private String icon;

    @ApiModelProperty("所属菜单")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("所属菜单名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("宽度")
    @TableField("width")
    private Integer width;

    @ApiModelProperty("高度")
    @TableField("height")
    private Integer height;

    @ApiModelProperty("[0:禁用;1:启用]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("数据请求接口(POST)")
    @TableField("data_url")
    private String dataUrl;

    @ApiModelProperty("数据请求接口参数")
    @TableField("data_param")
    private String dataParam;

    /**
     * @see com.lets.platform.model.uc.enums.UnitDataSourceTypeEnum
     */
    @ApiModelProperty("类型(1:接口请求,2:自定义SQL)")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("自定义SQL")
    @TableField("sql_content")
    private String sqlContent;

    @ApiModelProperty("默认数据源")
    @TableField("datasource")
    private String datasource;
    @TableField("datasource_name")
    private String datasourceName;

    @ApiModelProperty("自定义链接")
    @TableField("custom_link")
    private String customLink;
}
