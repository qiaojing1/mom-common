package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author qiaojing
 * @since 2024-04-07
 */
@Getter
@Setter
@TableName("jimu_dict_item")
@ApiModel(value = "JimuDictItem对象", description = "")
public class JimuDictItem extends BaseEntity{
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @OrderBy(sort = 1)
    @ExcelIgnore
    private String id;
    @ApiModelProperty("字典id")
    @TableField("dict_id")
    private String dictId;

    @ApiModelProperty("字典项文本")
    @TableField("item_text")
    private String itemText;

    @ApiModelProperty("字典项值")
    @TableField("item_value")
    private String itemValue;

    @ApiModelProperty("描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("排序")
    @TableField("sort_order")
    private Integer sortOrder;

    @ApiModelProperty("状态（1启用 0不启用）")
    @TableField("status")
    private Integer status;

    @TableField("create_by")
    private String createBy;

    @TableField("update_by")
    private String updateBy;
    @TableField(exist = false)
    private String tenancyId;
    @TableField(exist = false)
    private String createUser;
    @TableField(exist = false)
    private String createUserName;
    @TableField(exist = false)
    private String updateUser;
    @TableField(exist = false)
    private String updateUserName;
}
