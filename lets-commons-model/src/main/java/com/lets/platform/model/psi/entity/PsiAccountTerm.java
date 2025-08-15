package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.base.BaseTimer;
import com.lets.platform.model.base.BaseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.lets.platform.model.base.BaseTreeEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 账期管理
 * </p>
 *
 * @author csy
 * @since 2025-07-28
 */
@Getter
@Setter
@TableName("psi_account_term")
@ApiModel(value = "PsiAccountTerm对象", description = "账期管理")
public class PsiAccountTerm extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @TableField(exist = false)
    @ExcelIgnore
    private String code;

    @ApiModelProperty("年度")
    @TableField("year")
    @ExcelIgnore
    private Integer year;
    @ExcelProperty("年度")
    @TableField(exist = false)
    private String yearStr;

    @ApiModelProperty("账期名称")
    @TableField("name")
    @ExcelProperty("账期名称")
    private String name;


    @ApiModelProperty("开始日期")
    @TableField("start_date")
    @ExcelIgnore
    private LocalDate startDate;
    @ExcelProperty("开始日期")
    @TableField(exist = false)
    private String startDateStr;

    @ApiModelProperty("结束日期")
    @TableField("end_date")
    @ExcelIgnore
    private LocalDate endDate;
    @ExcelProperty("结束日期")
    @TableField(exist = false)
    private String endDateStr;

    @ApiModelProperty("状态")
    @TableField("status")
    @ExcelIgnore
    private Integer status;
    @TableField(exist = false)
    @ExcelIgnore
    private String statusName;

    @ExcelIgnore
    @ApiModelProperty("业务状态")
    @TableField("business_status")
    private Integer businessStatus;
    @ExcelIgnore
    @TableField(exist = false)
    private String businessStatusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    @ExcelIgnore
    @ApiModelProperty("关账人")
    @TableField("close_time")
    private LocalDateTime closeTime;

    @ExcelIgnore
    @ApiModelProperty("关账时间")
    @TableField("close_user")
    private String closeUser;

    @ExcelIgnore
    @ApiModelProperty("关账人")
    @TableField("close_user_name")
    private String closeUserName;

    @ExcelIgnore
    @ApiModelProperty("审核人")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ExcelIgnore
    @ApiModelProperty("审核时间")
    @TableField("audit_user")
    private String auditUser;

    @ExcelIgnore
    @ApiModelProperty("审核人")
    @TableField("audit_user_name")
    private String auditUserName;

    @ExcelIgnore
    @ApiModelProperty("是否标红（前后两行数据日期不连续）")
    @TableField(exist = false)
    private String isRed;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiAccountTerm> children;
    @ExcelIgnore
    @TableField(exist = false)
    private String parentId;
}
