package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 生产工单-BOM管理-副本
 * @author DING WEI
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("mes_produce_order_bom")
@ApiModel(value = "MesProduceOrderBom对象", description = "生产工单-BOM管理-副本")
public class MesProduceOrderBom extends BaseEntity {

    @ApiModelProperty("生产工单主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("生产工单明细主键")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("源BOM主键")
    @TableField("bom_id")
    private String bomId;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("BOM类型[0分组1制造BOM2订单BOM]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料属性[采购件、自制件、委外件、虚拟件]")
    @TableField("material_type")
    private String materialType;

    @ApiModelProperty("是否必须有BOM[NY]")
    @TableField("must_has_bom")
    private String mustHasBom;

    @ApiModelProperty("生产单位")
    @TableField("product_unit_id")
    private String productUnitId;
    @ApiModelProperty("生产单位编码")
    @TableField("product_unit_code")
    private String productUnitCode;
    @ApiModelProperty("生产单位名称")
    @TableField("product_unit_name")
    private String productUnitName;
    @ApiModelProperty("生产单位精度")
    @TableField("product_unit_accuracy")
    private Integer productUnitAccuracy;
    @ApiModelProperty("生产单位舍入方式")
    @TableField("product_unit_round_off_type")
    private Integer productUnitRoundOffType;

    @ApiModelProperty("成品率")
    @TableField("finish_product_rate")
    private BigDecimal finishProductRate;

    @ApiModelProperty("版本号")
    @TableField("bom_version")
    private String bomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField("bom_version_describe")
    private String bomVersionDescribe;

    @ApiModelProperty("所属分组")
    @TableField("group_id")
    private String groupId;

    @ApiModelProperty("父级主键")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("附件")
    @TableField("enclosure_ids")
    private String enclosureIds;

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
