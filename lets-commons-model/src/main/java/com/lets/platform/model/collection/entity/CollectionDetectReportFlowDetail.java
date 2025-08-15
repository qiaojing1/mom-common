/*
 * csy
 */

package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 单件试验报告-流阻 明细
 * </p>
 *
 * @author csy
 * @since 2024-12-18
 */
@Getter
@Setter
@TableName("collection_detect_report_flow_detail")
@ApiModel(value = "CollectionDetectReportFlowDetail对象", description = "单件试验报告-流阻 明细")
public class CollectionDetectReportFlowDetail extends BaseEntity {

    @ApiModelProperty("报告id")
    @TableField("report_id")
    private String reportId;

    @ApiModelProperty("行标记")
    @TableField("flag")
    private String flag;

    @ApiModelProperty("额定行程")
    @TableField(value = "nameplate_travel",updateStrategy = FieldStrategy.IGNORED)
    private String nameplateTravel;

    @ApiModelProperty("流量系数")
    @TableField(value = "flow_coefficient",updateStrategy = FieldStrategy.IGNORED)
    private String flowCoefficient;

    @ApiModelProperty("偏差")
    @TableField(value = "diff",updateStrategy = FieldStrategy.IGNORED)
    private String diff;

    @ApiModelProperty("10%")
    @TableField(value = "ten",updateStrategy = FieldStrategy.IGNORED)
    private String ten;

    @ApiModelProperty("20%")
    @TableField(value = "twenty",updateStrategy = FieldStrategy.IGNORED)
    private String twenty;

    @ApiModelProperty("30%")
    @TableField(value = "thirty",updateStrategy = FieldStrategy.IGNORED)
    private String thirty;

    @ApiModelProperty("40%")
    @TableField(value = "forty",updateStrategy = FieldStrategy.IGNORED)
    private String forty;

    @ApiModelProperty("50%")
    @TableField(value = "fifty",updateStrategy = FieldStrategy.IGNORED)
    private String fifty;

    @ApiModelProperty("60%")
    @TableField(value = "sixty",updateStrategy = FieldStrategy.IGNORED)
    private String sixty;

    @ApiModelProperty("70%")
    @TableField(value = "seventy",updateStrategy = FieldStrategy.IGNORED)
    private String seventy;

    @ApiModelProperty("80%")
    @TableField(value = "eighty",updateStrategy = FieldStrategy.IGNORED)
    private String eighty;

    @ApiModelProperty("90%")
    @TableField(value = "ninety",updateStrategy = FieldStrategy.IGNORED)
    private String ninety;

    @ApiModelProperty("100%")
    @TableField(value = "hundred",updateStrategy = FieldStrategy.IGNORED)
    private String hundred;

    @ApiModelProperty("预留1")
    @TableField(value = "reserve1",updateStrategy = FieldStrategy.IGNORED)
    private String reserve1;

    @ApiModelProperty("预留2")
    @TableField(value = "reserve2",updateStrategy = FieldStrategy.IGNORED)
    private String reserve2;

    @ApiModelProperty("预留3")
    @TableField(value = "reserve3",updateStrategy = FieldStrategy.IGNORED)
    private String reserve3;

    @ApiModelProperty("预留4")
    @TableField(value = "reserve4",updateStrategy = FieldStrategy.IGNORED)
    private String reserve4;

    @ApiModelProperty("预留5")
    @TableField(value = "reserve5",updateStrategy = FieldStrategy.IGNORED)
    private String reserve5;

    @ApiModelProperty("预留6")
    @TableField(value = "reserve6",updateStrategy = FieldStrategy.IGNORED)
    private String reserve6;

    @ApiModelProperty("预留7")
    @TableField(value = "reserve7",updateStrategy = FieldStrategy.IGNORED)
    private String reserve7;

    @ApiModelProperty("预留8")
    @TableField(value = "reserve8",updateStrategy = FieldStrategy.IGNORED)
    private String reserve8;

    @ApiModelProperty("预留9")
    @TableField(value = "reserve9",updateStrategy = FieldStrategy.IGNORED)
    private String reserve9;

    @ApiModelProperty("预留10")
    @TableField(value = "reserve10",updateStrategy = FieldStrategy.IGNORED)
    private String reserve10;
}
