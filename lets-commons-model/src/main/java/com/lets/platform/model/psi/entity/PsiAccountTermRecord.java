package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 账期管理-开关帐记录
 * </p>
 *
 * @author csy
 * @since 2025-07-28
 */
@Getter
@Setter
@TableName("psi_account_term_record")
@ApiModel(value = "PsiAccountTermRecord对象", description = "账期管理-开关帐记录")
public class PsiAccountTermRecord extends BaseEntity {

    @ApiModelProperty("账期ID")
    @TableField("term_id")
    private String termId;

    @TableField(exist = false)
    private String code;

    @ApiModelProperty("账期名称")
    @TableField(exist = false)
    private String name;


    @ApiModelProperty("开始日期")
    @TableField(exist = false)
    private LocalDate startDate;

    @ApiModelProperty("结束日期")
    @TableField(exist = false)
    private LocalDate endDate;

    @ApiModelProperty("操作类型")
    @TableField("type")
    private Integer type;
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("提交人")
    @TableField("submit_time")
    private LocalDateTime submitTime;

    @ApiModelProperty("提交时间")
    @TableField("submit_user")
    private String submitUser;

    @ApiModelProperty("提交人")
    @TableField("submit_user_name")
    private String submitUserName;

    @ApiModelProperty("审核人")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核时间")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人")
    @TableField("audit_user_name")
    private String auditUserName;
}
