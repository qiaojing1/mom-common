package com.lets.platform.model.common.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 物料特征属性 通用基类
 *
 * @author fzy
 */

@Data
public class MaterialSpecific extends BaseEntity {

    @ApiModelProperty("物料特征属性")
    @TableField("specific_id")
    private String specificId;

    @ApiModelProperty("物料特征属性名称")
    @TableField("specific_name")
    private String specificName;

    @ApiModelProperty("值来源[1用户数据字典,2手工输入]")
    @TableField("value_source")
    private String valueSource;

    @ApiModelProperty("物料特征属性值")
    @TableField("value")
    private String value;

    @ApiModelProperty("物料特征属性值名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("是否必填")
    @TableField("required")
    private Integer required;
}
