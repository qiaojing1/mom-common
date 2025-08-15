package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 计划订单-工艺路线-明细-工艺文件-副本
 * @author DING WEI
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("psi_produce_plan_route_file")
@ApiModel(value = "PsiProducePlanRouteFile对象", description = "计划订单-工艺路线-明细-工艺文件-副本")
public class PsiProducePlanRouteFile extends BaseEntity {

    @ApiModelProperty("计划订单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("计划订单明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("工艺路线主键")
    @TableField("route_id")
    private String routeId;

    @ApiModelProperty("源工艺路线明细主键")
    @TableField("route_detail_id")
    private String routeDetailId;

    @ApiModelProperty("工艺文件主键")
    @TableField("process_file_id")
    private String processFileId;

    @ApiModelProperty("工艺文件名称")
    @TableField("process_file_name")
    private String processFileName;

    @ApiModelProperty("工艺文件分组")
    @TableField("process_file_group")
    private String processFileGroup;

    @ApiModelProperty("工艺文件分组名称")
    @TableField("process_file_group_name")
    private String processFileGroupName;

    @ApiModelProperty("工艺文件适用范围")
    @TableField("process_file_scope_define")
    private String processFileScopeDefine;

    @ApiModelProperty("附件主键集合")
    @TableField("enclosure_ids")
    private String enclosureIds;

    @ApiModelProperty("附件名称集合")
    @TableField("enclosure_names")
    private String enclosureNames;
}
