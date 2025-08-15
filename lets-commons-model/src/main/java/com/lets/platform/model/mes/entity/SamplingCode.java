package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 抽样标准字码表
 * </p>
 *
 * @author FZY
 * @since 2024-01-05
 */
@Getter
@Setter
@TableName("sampling_code")
@ApiModel(value = "SamplingCode对象", description = "抽样标准字码表")
public class SamplingCode {

    @ApiModelProperty("批量最小值")
    @TableField("minimum")
    private Integer minimum;

    @ApiModelProperty("批量最大值")
    @TableField("maximum")
    private Integer maximum;

    @ApiModelProperty("检验水平")
    @TableField("inspection_level")
    private String inspectionLevel;

    @ApiModelProperty("字码")
    @TableField("code")
    private String code;

    @ApiModelProperty("执行标准")
    @TableField("standard")
    private String standard;
}
