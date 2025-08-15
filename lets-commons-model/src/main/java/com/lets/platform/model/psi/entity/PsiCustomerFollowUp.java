package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 客户跟进记录
 * </p>
 *
 * @author csy
 * @since 2024-04-28
 */
@Getter
@Setter
@TableName("psi_customer_follow_up")
@ApiModel(value = "PsiCustomerFollowUp对象", description = "客户跟进记录")
public class PsiCustomerFollowUp extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("计划编码")
    @TableField("code")
    @ExcelIgnore
    private String code;
    @ExcelProperty("计划编码")
    @TableField(exist = false)
    private String oldCode;

    @ApiModelProperty("客户主键")
    @TableField("customer_id")
    @ExcelIgnore
    private String customerId;
    @TableField(exist = false)
    @ExcelProperty("客户名称")
    private String customerName;

    @ApiModelProperty("客户联系人id")
    @TableField("customer_user_id")
    @ExcelIgnore
    private String customerUserId;
    @TableField(exist = false)
    @ExcelProperty("联系人")
    private String customerUserName;

    @ApiModelProperty("客户联系人联系方式")
    @TableField("customer_user_phone")
    @ExcelProperty("联系方式")
    private String customerUserPhone;

    @ApiModelProperty("主题")
    @TableField("subject")
    @ExcelProperty("主题")
    private String subject;

    @ApiModelProperty("开始时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("start_time")
    @ExcelIgnore
    private LocalDateTime startTime;
    @TableField(exist = false)
    @ExcelProperty("开始时间")
    private String startTimeStr;

    @ApiModelProperty("截止时间")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("end_time")
    @ExcelIgnore
    private LocalDateTime endTime;
    @ExcelProperty("截止时间")
    @TableField(exist = false)
    private String endTimeStr;

    @ApiModelProperty("分类")
    @TableField("type")
    @ExcelIgnore
    private String type;
    @TableField(exist = false)
    @ExcelProperty("分类")
    private String typeName;

    @ExcelProperty("参与人员")
    @TableField(exist = false)
    private String userLoginId;
    @ExcelIgnore
    @TableField(exist = false)
    private String userNames;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelProperty("描述")
    private String remark;

    @ApiModelProperty("状态")
    @TableField("status")
    @ExcelIgnore
    private String status;
    @TableField(exist = false)
    @ExcelIgnore
    private String statusName;

    @TableField(exist = false)
    @ExcelIgnore
    private List<PsiCustomerFollowUpUser> users;

    @TableField(exist = false)
    @ExcelIgnore
    private List<PsiCustomerFollowUpCost> costs;
    @ExcelIgnore
    @TableField(exist = false)
    private String allCosts;
}
