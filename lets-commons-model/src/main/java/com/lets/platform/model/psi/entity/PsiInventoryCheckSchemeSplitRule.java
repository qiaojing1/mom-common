package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 盘点单拆分规则
 * </p>
 *
 * @author FZY
 * @since 2023-10-07
 */
@Getter
@Setter
@TableName("psi_inventory_check_scheme_split_rule")
@ApiModel(value = "PsiInventoryCheckSchemeSplitRule对象", description = "盘点单拆分规则")
public class PsiInventoryCheckSchemeSplitRule extends BaseEntity {

    @ApiModelProperty("盘点方案ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("序号")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("拆分依据[0:物料分组;1:物料属性;2:规格型号;3:仓库编码;4:库区编码;5:库位编码]")
    @TableField("split_rule")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer splitRule;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;
}
