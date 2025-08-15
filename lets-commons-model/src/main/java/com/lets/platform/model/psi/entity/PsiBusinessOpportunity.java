package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 线索商机
 * </p>
 *
 * @author csy
 * @since 2024-04-30
 */
@Getter
@Setter
@TableName("psi_business_opportunity")
@ApiModel(value = "PsiBusinessOpportunity对象", description = "线索商机")
public class PsiBusinessOpportunity extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("商机编码")
    @TableField("code")
    @ExcelIgnore
    private String code;
    @ExcelProperty("商机编码")
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

    @ApiModelProperty("物料id")
    @TableField("material_id")
    @ExcelIgnore
    private String materialId;
    @TableField(exist = false)
    @ExcelIgnore
    private String materialName;
    @TableField(exist = false)
    @ExcelProperty("产品")
    private String materialCode;

    @ApiModelProperty("发现时间")
    @TableField("find_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ExcelIgnore
    private LocalDateTime findTime;
    @TableField(exist = false)
    @ExcelProperty("发现时间")
    private String findTimeStr;

    @ExcelProperty("商机归属")
    @TableField(exist = false)
    private String userLoginId;

    /**
     *  商机阶段
     */
    @ExcelIgnore
    @TableField("stage")
    private String stage;
    @ExcelProperty("商机阶段")
    @TableField("stage_name")
    private String stageName;

    @ApiModelProperty("描述")
    @TableField("remark")
    @ExcelProperty("描述")
    private String remark;

    @ApiModelProperty("预期金额")
    @TableField("amount")
    @ExcelIgnore
    private BigDecimal amount;
    @TableField(exist = false)
    @ExcelProperty("预期金额")
    private String amountStr;


    @ApiModelProperty("预计签单时间")
    @TableField("sign_time")
    @ExcelIgnore
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime signTime;
    @TableField(exist = false)
    @ExcelProperty("预计签单时间")
    private String signTimeStr;


    @ApiModelProperty("可能性")
    @ExcelIgnore
    @TableField("possibility")
    private String possibility;
    @TableField(exist = false)
    @ExcelProperty("可能性")
    private String possibilityName;


    @ApiModelProperty("状态 0跟踪1成功2失败3搁置4失效")
    @TableField("status")
    @ExcelIgnore
    private String status;
    @TableField(exist = false)
    @ExcelProperty("状态")
    private String statusName;


    @ApiModelProperty("归属人员")
    @TableField(exist = false)
    @ExcelIgnore
    private List<PsiBusinessOpportunityUser> users;

    @TableField(exist = false)
    @ExcelIgnore
    private String userNames;

}
