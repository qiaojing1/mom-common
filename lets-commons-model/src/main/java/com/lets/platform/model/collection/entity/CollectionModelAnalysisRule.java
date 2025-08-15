package com.lets.platform.model.collection.entity;

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
 * 型号解析规则
 * </p>
 *
 * @author csy
 * @since 2024-04-09
 */
@Getter
@Setter
@TableName("collection_model_analysis_rule")
@ApiModel(value = "CollectionModelAnalysisRule对象", description = "型号解析规则")
public class CollectionModelAnalysisRule extends BaseEntity {

    @ApiModelProperty("规则名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    private String enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("示例")
    @TableField("example")
    private String example;
}
