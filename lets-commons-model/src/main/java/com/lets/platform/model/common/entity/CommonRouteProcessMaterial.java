package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 工艺路线-明细-工序信息-物料
 * @author DING WEI
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_route_process_material")
@ApiModel(value = "CommonRouteProcessMaterial对象", description = "工艺路线-明细-工序信息-物料")
public class CommonRouteProcessMaterial extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("工艺路线主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("工艺路线-工序关联主键")
    @TableField("route_process_id")
    private String routeProcessId;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

    @NotBlank(message = "CommonRouteProcessMaterial.materialId", groups = {Save.class, Update.class})
    @ApiModelProperty("物料主键")
    @TableField("material_id")
    private String materialId;
    @NotBlank(message = "CommonRouteProcessMaterial.materialCode", groups = {Save.class, Update.class})
    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @NotBlank(message = "CommonRouteProcessMaterial.materialName", groups = {Save.class, Update.class})
    @ApiModelProperty("物料名称")
    @TableField("material_name")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    private String materialSpecs;

    @ApiModelProperty("物料分组")
    @TableField("material_group_id")
    private String materialGroupId;
    @TableField("material_group_name")
    private String materialGroupName;

    @NotNull(message = "CommonRouteProcessMaterial.numeratorDosage", groups = {Save.class, Update.class})
    @ApiModelProperty("分子用量")
    @TableField("numerator_dosage")
    private BigDecimal numeratorDosage;
    @NotNull(message = "CommonRouteProcessMaterial.denominatorDosage", groups = {Save.class, Update.class})
    @ApiModelProperty("分母用量")
    @TableField("denominator_dosage")
    private BigDecimal denominatorDosage;

    @NotBlank(message = "CommonRouteProcessMaterial.unitId", groups = {Save.class, Update.class})
    @ApiModelProperty("单位主键")
    @TableField("unit_id")
    private String unitId;
    @NotBlank(message = "CommonRouteProcessMaterial.unitName", groups = {Save.class, Update.class})
    @ApiModelProperty("单位名称")
    @TableField("unit_name")
    private String unitName;
    @NotNull(message = "CommonRouteProcessMaterial.unitAccuracy", groups = {Save.class, Update.class})
    @ApiModelProperty("单位精度")
    @TableField("unit_accuracy")
    private Integer unitAccuracy;
    @NotNull(message = "CommonRouteProcessMaterial.unitRoundOffType", groups = {Save.class, Update.class})
    @ApiModelProperty("单位舍入方式")
    @TableField("unit_round_off_type")
    private Integer unitRoundOffType;

    @TableField(exist = false)
    private Integer processStep;
    @TableField(exist = false)
    private Integer processSort;
}
