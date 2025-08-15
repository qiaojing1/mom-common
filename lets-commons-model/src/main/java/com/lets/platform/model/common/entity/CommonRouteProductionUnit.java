package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.uc.enums.ProductionUnitTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * <p>
 * 工艺路线-明细-生产单元
 * </p>
 *
 * @author DING WEI
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_route_production_unit")
@ApiModel(value = "CommonRouteProductionUnit对象", description = "工艺路线-明细-生产单元")
public class CommonRouteProductionUnit extends BaseEntity {

    @ApiModelProperty("工艺路线主键")
    @TableField("order_id")
    private String orderId;

    @NotBlank(message = "CommonRouteProductionUnit.productionUnitId", groups = {Save.class, Update.class})
    @ApiModelProperty("生产单元主键")
    @TableField("production_unit_id")
    private String productionUnitId;

    @NotBlank(message = "CommonRouteProductionUnit.productionUnitCode", groups = {Save.class, Update.class})
    @ApiModelProperty("生产单元编码")
    @TableField("production_unit_code")
    private String productionUnitCode;

    @NotBlank(message = "CommonRouteProductionUnit.productionUnitName", groups = {Save.class, Update.class})
    @ApiModelProperty("生产单元名称")
    @TableField("production_unit_name")
    private String productionUnitName;

    /**
     * @see com.lets.platform.model.uc.enums.ProductionUnitTypeEnum
     */
    @ValidatedEnum(enumClass = ProductionUnitTypeEnum.class, required = true, message = "CommonRouteProductionUnit.productionUnitType", groups = {Save.class, Update.class})
    @ApiModelProperty("生产单元类型")
    @TableField("production_unit_type")
    private String productionUnitType;
    @TableField(exist = false)
    private String productionUnitTypeName;

    @ApiModelProperty("上级生产单元")
    @TableField("production_unit_parent_id")
    private String productionUnitParentId;

    @ApiModelProperty("上级生产单元编码")
    @TableField("production_unit_parent_code")
    private String productionUnitParentCode;

    @ApiModelProperty("上级生产单元名称")
    @TableField("production_unit_parent_name")
    private String productionUnitParentName;
}
