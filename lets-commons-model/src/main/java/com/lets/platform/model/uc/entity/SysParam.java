package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lets.platform.common.pojo.tools.JsonColSerializer;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 系统参数设置
 * @author DING WEI
 * @since 2024-01-08
 */
@Getter
@Setter
@TableName("sys_param")
@ApiModel(value = "SysParam对象", description = "系统参数设置")
public class SysParam extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("参数标识")
    @TableField("code")
    private String code;

    @ApiModelProperty("参数名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("参数值")
    @TableField("value")
    private String value;

    @ApiModelProperty("数据字典-名称")
    @TableField(exist = false)
    private String dictName;

    @JsonSerialize(using = JsonColSerializer.class)
    @ApiModelProperty("json类型的value，适用于有多项的配置")
    @TableField("json_value")
    private String jsonValue;
    @TableField(exist = false)
    private List<String> jsonValue4List;
    @TableField(exist = false)
    private Map<String, Object> jsonValue4Map;

    @ApiModelProperty("分组")
    @TableField("group_name")
    private String groupName;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("状态")
    @TableField("status")
    private String status;

    @ApiModelProperty("排序")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("提示信息")
    @TableField(exist = false)
    private String tip;

    @ApiModelProperty("子级分组")
    @TableField(exist = false)
    private List<SysParam> child;
}
