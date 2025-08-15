package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
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
 * 状态原因配置表
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-12-21
 */
@Getter
@Setter
@TableName("common_status_reason")
@ApiModel(value = "CommonStatusReason对象", description = "状态原因配置表")
public class CommonStatusReason extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;
    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    private Short enable;
    @TableField(exist = false)
    private String enableName;
}
