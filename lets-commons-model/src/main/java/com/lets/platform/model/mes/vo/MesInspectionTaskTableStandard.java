package com.lets.platform.model.mes.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author FZY
 * @since 2025-06-18
 */
@Getter
@Setter
public class MesInspectionTaskTableStandard {
    @ApiModelProperty("分析类型[1定性 2定量]")
    private String analysisType;

    @ApiModelProperty("是否手动录入")
    private Integer isManual;

    @ApiModelProperty("比较符")
    private String comparator;

    @ApiModelProperty("检验标准ID")
    private String inspectionStandardId;

    @ApiModelProperty("检验标准名称")
    private String inspectionStandardName;

    @ApiModelProperty("检验标准值")
    private BigDecimal inspectionStandardValue;

    @ApiModelProperty("上公差")
    private BigDecimal upperDeviation;

    @ApiModelProperty("下公差")
    private BigDecimal lowerDeviation;

    @ApiModelProperty("规范上限值")
    private BigDecimal overLimit;

    @ApiModelProperty("规范下限值")
    private BigDecimal underLimit;

    @ApiModelProperty("精度")
    private Integer valuePrecision;

    @ApiModelProperty("是否必检")
    private Integer required;
}
