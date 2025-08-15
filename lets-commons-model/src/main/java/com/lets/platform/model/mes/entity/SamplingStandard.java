package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 抽样标准表
 * </p>
 *
 * @author FZY
 * @since 2024-01-05
 */
@Getter
@Setter
@TableName("sampling_standard")
@ApiModel(value = "SamplingStandard对象", description = "抽样标准表")
public class SamplingStandard {

    @ApiModelProperty("抽样严格程度[1:正常;2:放宽;3:加严]")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("字码")
    @TableField("code")
    private String code;

    @ApiModelProperty("AQL")
    @TableField("aql")
    private BigDecimal aql;

    @ApiModelProperty("样本数")
    @TableField("sample_quantity")
    private Integer sampleQuantity;

    @ApiModelProperty("Ac")
    @TableField("ac")
    private Integer ac;

    @ApiModelProperty("Re")
    @TableField("re")
    private Integer re;

    @ApiModelProperty("执行标准")
    @TableField("standard")
    private String standard;
}
