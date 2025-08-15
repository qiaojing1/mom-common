package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.RouteScopeEnum;
import com.lets.platform.model.common.enums.RouteTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 计划订单-工艺路线-副本
 * @author DING WEI
 * @since 2023-12-18
 */
@Getter
@Setter
@TableName("psi_produce_plan_route")
@ApiModel(value = "PsiProducePlanRoute对象", description = "计划订单-工艺路线-副本")
public class PsiProducePlanRoute extends BaseEntity {

    @ApiModelProperty("计划订单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("计划订单明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("源工艺路线主键")
    @TableField("route_id")
    private String routeId;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    /**
     * @see RouteScopeEnum
     */
    @ApiModelProperty("工艺适用范围[0分组,1物料,2物料分组,3通用]")
    @TableField("type")
    private String type;

    /**
     * @see RouteTypeEnum
     */
    @ApiModelProperty("工艺路线类型")
    @TableField("route_type")
    private String routeType;

    @ApiModelProperty("关联主键[物料主键、物料分组主键]")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料或物料分组编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料或物料分组名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料分组主键")
    @TableField("material_group_id")
    private String materialGroupId;

    @ApiModelProperty("物料分组编码")
    @TableField("material_group_code")
    private String materialGroupCode;

    @ApiModelProperty("物料分组名称")
    @TableField("material_group_name")
    private String materialGroupName;

    @ApiModelProperty("BOM版本主键")
    @TableField("bom_id")
    private String bomId;

    @ApiModelProperty("BOM版本名称")
    @TableField("bom_version")
    private String bomVersion;

    @ApiModelProperty("所属分组")
    @TableField("group_id")
    private String groupId;

    @ApiModelProperty("父级(分组）")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("生效日期")
    @TableField("effective_time")
    private LocalDateTime effectiveTime;

    @ApiModelProperty("失效日期")
    @TableField("expiring_time")
    private LocalDateTime expiringTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;
}
