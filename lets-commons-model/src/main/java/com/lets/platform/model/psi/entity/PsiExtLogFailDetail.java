package com.lets.platform.model.psi.entity;

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
 * 第三方调用日志失败明细; 目前定义的是失败是记录, 方便查询失败的数据详情; 在接口调用成功但部分数据失败时可以用来记录在这张表中
 * </p>
 *
 * @author qiao jing
 * @since 2024-10-25
 */
@Getter
@Setter
@TableName("psi_ext_log_fail_detail")
@ApiModel(value = "PsiExtLogFailDetail对象", description = "第三方调用日志失败明细; 目前定义的是失败是记录, 方便查询失败的数据详情; 在接口调用成功但部分数据失败时可以用来记录在这张表中")
public class PsiExtLogFailDetail extends BaseEntity {

    @ApiModelProperty("主表id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("编码; 存储用来在页面上展示时的编码或其他标识字段")
    @TableField("code")
    private String code;

    @ApiModelProperty("信息; 存储用来在页面上展示的错误信息,可以为第三方返回的信息")
    @TableField("message")
    private String message;
}
