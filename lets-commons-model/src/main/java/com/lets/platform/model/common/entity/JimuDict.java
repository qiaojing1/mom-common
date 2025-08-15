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
@TableName("jimu_dict")
@ApiModel(value = "JimuDict对象", description = "")
public class JimuDict extends BaseEntity{
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @OrderBy(sort = 1)
    @ExcelIgnore
    private String id;
    @ApiModelProperty("字典名称")
    @TableField("dict_name")
    private String dictName;

    @ApiModelProperty("字典编码")
    @TableField("dict_code")
    private String dictCode;

    @ApiModelProperty("描述")
    @TableField("description")
    private String description;

    @ApiModelProperty("删除状态")
    @TableField("del_flag")
    private Integer delFlag;

    @ApiModelProperty("创建人")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("更新人")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("字典类型0为string,1为number")
    @TableField("type")
    private Integer type;

    @ApiModelProperty("多租户标识")
    @TableField("tenant_id")
    private String tenantId;

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
