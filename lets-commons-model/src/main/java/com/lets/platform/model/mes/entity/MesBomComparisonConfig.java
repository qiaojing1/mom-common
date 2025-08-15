package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * BOM对比配置
 * @author DING WEI
 * @since 2025-04-28
 */
@Getter
@Setter
@TableName("mes_bom_comparison_config")
@ApiModel(value = "MesBomComparisonConfig对象", description = "BOM对比配置")
public class MesBomComparisonConfig extends BaseEntity {

    @ApiModelProperty("字段")
    @TableField("comparison_field")
    private String comparisonField;
}
