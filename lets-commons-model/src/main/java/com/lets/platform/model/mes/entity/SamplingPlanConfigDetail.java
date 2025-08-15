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
 * 抽样方案配置某明细表
 * </p>
 *
 * @author FZY
 * @since 2024-01-05
 */
@Getter
@Setter
@TableName("sampling_plan_config_detail")
@ApiModel(value = "SamplingPlanConfigDetail对象", description = "抽样方案配置某明细表")
public class SamplingPlanConfigDetail extends BaseEntity {

    @ApiModelProperty("父ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("批量")
    @TableField("batch_quantity")
    private Integer batchQuantity;

    @ApiModelProperty("样本量/样本量比例(%)")
    @TableField("sampling_quantity")
    private BigDecimal samplingQuantity;

    @ApiModelProperty("样本量字码")
    @TableField("sampling_code")
    private String samplingCode;

    @ApiModelProperty("Ac")
    @TableField("ac")
    private Integer ac;

    @ApiModelProperty("Re")
    @TableField("re")
    private Integer re;

    @TableField(exist = false)
    private String inspectionLevelName;

    @TableField(exist = false)
    private String samplingRigorLevelName;

    @TableField(exist = false)
    private String aql;

}
