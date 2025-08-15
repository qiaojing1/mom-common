package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 质量追溯方案明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-05-30
 */
@Getter
@Setter
@TableName("mes_quality_trace_detail")
@ApiModel(value = "MesQualityTraceDetail对象", description = "质量追溯方案明细")
public class MesQualityTraceDetail extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("菜单id")
    @TableField("menu_id")
    private String menuId;

    @ApiModelProperty("单据类型")
    @TableField("order_type")
    private String orderType;

    @ApiModelProperty("单据名称")
    @TableField("order_type_name")
    private String orderTypeName;

    @ApiModelProperty("父菜单编码")
    @TableField("belong_menu_code")
    private String belongMenuCode;

    @ApiModelProperty("父菜单名称")
    @TableField("belong_menu_name")
    private String belongMenuName;

    @ApiModelProperty("是否打印附件 Y：是；N：否")
    @TableField("print_or_not")
    private String printOrNot;
    @TableField(exist = false)
    private String printOrNotName;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @TableField(exist = false)
    private Integer lineNumber;
}
