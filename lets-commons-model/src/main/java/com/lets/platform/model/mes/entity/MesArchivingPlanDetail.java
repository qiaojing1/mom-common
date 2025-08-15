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
 * 产品档案方案明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-09-20
 */
@Getter
@Setter
@TableName("mes_archiving_plan_detail")
@ApiModel(value = "MesArchivingPlanDetail对象", description = "产品档案方案明细")
public class MesArchivingPlanDetail extends BaseEntity {

    @ApiModelProperty("方案主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("方案目录id")
    @TableField("catalogue_id")
    private String catalogueId;

    @ApiModelProperty("方案目录名称")
    @TableField(exist = false)
    private String catalogueName;

    @ApiModelProperty("单据编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("单据名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("单据id")
    @TableField("menu_id")
    private String menuId;

    @ApiModelProperty("单据类别id")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务对象id")
    @TableField("belong_menu_id")
    private String belongMenuId;

    @ApiModelProperty("业务对象编码")
    @TableField("belong_menu_code")
    private String belongMenuCode;

    @ApiModelProperty("业务对象名称")
    @TableField("belong_menu_name")
    private String belongMenuName;

    @ApiModelProperty("打印内容 0:全部 1:单据 2:单据附件")
    @TableField("print_content_type")
    private String printContentType;

    @ApiModelProperty("指定的打印模板配置的id")
    @TableField("template_id")
    private String templateId;

    @ApiModelProperty("指定的打印模板配置的名称")
    @TableField("template_name")
    private String templateName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
}
