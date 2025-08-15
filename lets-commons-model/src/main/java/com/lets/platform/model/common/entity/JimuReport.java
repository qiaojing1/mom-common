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
 * 在线excel设计器
 * </p>
 *
 * @author qiaojing
 * @since 2024-04-07
 */
@Getter
@Setter
@TableName("jimu_report")
@ApiModel(value = "JimuReport对象", description = "在线excel设计器")
public class JimuReport extends BaseEntity {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @OrderBy(sort = 1)
    @ExcelIgnore
    private String id;
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("说明")
    @TableField("note")
    private String note;

    @ApiModelProperty("状态")
    @TableField("status")
    private String status;

    @ApiModelProperty("类型")
    @TableField("type")
    private String type;

    @ApiModelProperty("json字符串")
    @TableField("json_str")
    private String jsonStr;

    @ApiModelProperty("请求地址")
    @TableField("api_url")
    private String apiUrl;

    @ApiModelProperty("缩略图")
    @TableField("thumb")
    private String thumb;

    @ApiModelProperty("创建人")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("修改人")
    @TableField("update_by")
    private String updateBy;

    @ApiModelProperty("删除标识0-正常,1-已删除")
    @TableField("del_flag")
    private Boolean delFlag;

    @ApiModelProperty("请求方法0-get,1-post")
    @TableField("api_method")
    private String apiMethod;

    @ApiModelProperty("请求编码")
    @TableField("api_code")
    private String apiCode;

    @ApiModelProperty("是否是模板 0-是,1-不是")
    @TableField("template")
    private Boolean template;

    @ApiModelProperty("浏览次数")
    @TableField("view_count")
    private Long viewCount;

    @ApiModelProperty("css增强")
    @TableField("css_str")
    private String cssStr;

    @ApiModelProperty("js增强")
    @TableField("js_str")
    private String jsStr;

    @ApiModelProperty("py增强")
    @TableField("py_str")
    private String pyStr;

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
    @TableField(exist = false)
    private String oldId;
}
