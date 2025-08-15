package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 齐套分析方案仓库范围
 * </p>
 *
 * @author FZY
 * @since 2024-06-03
 */
@Getter
@Setter
@TableName("mes_kitting_analysis_plan_store")
@ApiModel(value = "MesKittingAnalysisPlanStore对象", description = "齐套分析方案仓库范围")
public class MesKittingAnalysisPlanStore extends BaseEntity {

    @ApiModelProperty("方案ID")
    @TableField("plan_id")
    private String planId;

    @ApiModelProperty("仓库ID")
    @TableField("store_id")
    private String storeId;
}
