package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.businessEntity.BaseSerialEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 工单报工单明细关联序列号
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-08-20
 */
@Getter
@Setter
@TableName("mes_produce_report_order_detail_serial")
@ApiModel(value = "MesProduceReportOrderDetailSerial对象", description = "工单报工单明细关联序列号")
public class MesProduceReportOrderDetailSerial extends BaseSerialEntity {

    @ApiModelProperty("工单报工单明细表id")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @ApiModelProperty("生产工单明细表关联序列号id")
    @TableField("source_serial_id")
    @ExcelIgnore
    private String sourceSerialId;

    @ApiModelProperty("物料id")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    @ExcelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @TableField("material_name")
    @ExcelProperty("物料名称")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    @TableField("material_specs")
    @ExcelIgnore
    private String materialSpecs;

    @ApiModelProperty("物料类型")
    @TableField("material_type")
    @ExcelIgnore
    private String materialType;

    @ApiModelProperty("物料特征属性")
    @TableField("material_specific")
    @ExcelIgnore
    private String materialSpecific;

    @ApiModelProperty("序列号前缀")
    @TableField("prefix_serial")
    @ExcelIgnore
    private String prefixSerial;

    @ApiModelProperty("序列号后缀流水")
    @TableField("suffix_serial")
    @ExcelIgnore
    private String suffixSerial;

    @ApiModelProperty("完整序列号编码")
    @TableField("total_serial")
    @ExcelProperty("序列号")
    private String totalSerial;

    @ApiModelProperty("是否被分配给下游单据 Y:是，N:否")
    @TableField("is_used")
    @ExcelIgnore
    private String isUsed;
}
