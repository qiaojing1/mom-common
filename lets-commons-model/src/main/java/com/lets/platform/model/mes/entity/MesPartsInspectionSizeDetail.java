package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 零件检验尺寸库-尺寸明细
 * </p>
 *
 * @author csy
 * @since 2025-07-08
 */
@Getter
@Setter
@TableName("mes_parts_inspection_size_detail")
@ApiModel(value = "MesPartsInspectionSizeDetail对象", description = "零件检验尺寸库-尺寸明细")
public class MesPartsInspectionSizeDetail extends BaseEntity {

    @ApiModelProperty("主表ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("尺寸类型")
    @TableField("size_type")
    private String sizeType;
    @TableField(exist = false)
    private String sizeTypeName;

    @ApiModelProperty("尺寸名称")
    @TableField("size_name")
    private String sizeName;

    @ApiModelProperty("尺寸代号")
    @TableField("size_mark")
    private String sizeMark;

    @ApiModelProperty("标准")
    @TableField("standard")
    private BigDecimal standard;

    @ApiModelProperty("下公差")
    @TableField("min")
    private BigDecimal min;

    @ApiModelProperty("上公差")
    @TableField("max")
    private BigDecimal max;

    @ApiModelProperty("计量仪器")
    @TableField("meter_id")
    private String meterId;

    @ApiModelProperty("计量仪器")
    @TableField("meter_name")
    private String meterName;
}
