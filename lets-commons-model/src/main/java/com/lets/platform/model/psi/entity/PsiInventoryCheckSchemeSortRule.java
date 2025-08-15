package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
 * 盘点单排序规则
 * </p>
 *
 * @author FZY
 * @since 2023-10-07
 */
@Getter
@Setter
@TableName("psi_inventory_check_scheme_sort_rule")
@ApiModel(value = "PsiInventoryCheckSchemeSortRule对象", description = "盘点单排序规则")
public class PsiInventoryCheckSchemeSortRule extends BaseEntity {

    @ApiModelProperty("盘点方案ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("序号")
    @TableField("sort")
    private Integer sort;

    @ApiModelProperty("排序依据[0:物料编码;1:物料名称;2:仓库编码;3:仓库名称;4:库区编码;5:库区名称;6:库位编码;7:库位名称]")
    @TableField("sort_rule")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer sortRule;

    @ApiModelProperty("排序方式[0:升序;1:降序]")
    @TableField("sort_type")
    @JsonSerialize(using = ToStringSerializer.class)
    private Integer sortType;
}
