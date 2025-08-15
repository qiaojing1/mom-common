package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 项目汇总表
 * </p>
 *
 * @author FZY
 * @since 2024-07-10
 */
@Getter
@Setter
@TableName("mes_project_order")
@ApiModel(value = "MesProjectOrder对象", description = "项目汇总表")
public class MesProjectOrder extends BaseEntity {

    @ApiModelProperty("项目编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("项目名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("规格型号")
    @TableField("specs")
    private String specs;

    @ApiModelProperty("负责人")
    @TableField("leader_id")
    private String leaderId;
    @ApiModelProperty("负责人")
    @TableField(exist = false)
    private String leaderName;
    @ApiModelProperty("生产部门")
    @TableField("produce_org_id")
    private String produceOrgId;
    @ApiModelProperty("生产部门")
    @TableField(exist = false)
    private String produceOrgName;

    @ApiModelProperty("订货客户ID")
    @TableField("customer_id")
    private String customerId;

    @ApiModelProperty("订货客户名称")
    @TableField("customer_name")
    private String customerName;

    @ApiModelProperty("订单通报日期")
    @TableField("order_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate orderDate;

    @ApiModelProperty("合同发货日期")
    @TableField("contract_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate contractDate;

    @ApiModelProperty("实际发货日期")
    @TableField("actual_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate actualDate;

    @ApiModelProperty("终验收日期")
    @TableField("final_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate finalDate;

    @ApiModelProperty("质保期(月)")
    @TableField("warranty_period")
    private Integer warrantyPeriod;

    @ApiModelProperty("前期准备日期(天)")
    @TableField("preparation_date")
    private Integer preparationDate;

    @ApiModelProperty("安调准备时间(天)")
    @TableField("on_site_installation_preparation_date")
    private Integer onSiteInstallationPreparationDate;

    @ApiModelProperty("质保结束日期")
    @TableField("warranty_expiration_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate warrantyExpirationDate;

    @ApiModelProperty("车间装配额定工时")
    @TableField("workshop_assembly_standard_hours")
    private Integer workshopAssemblyStandardHours;

    @ApiModelProperty("车间装配实际工时")
    @TableField("workshop_assembly_actual_hours")
    private BigDecimal workshopAssemblyActualHours;

    @ApiModelProperty("现场安调额定工时")
    @TableField("on_site_installation_standard_hours")
    private Integer onSiteInstallationStandardHours;

    @ApiModelProperty("现场安调实际工时")
    @TableField("on_site_installation_actual_hours")
    private BigDecimal onSiteInstallationActualHours;

    @ApiModelProperty("质保实际工时")
    @TableField("warranty_actual_hours")
    private BigDecimal warrantyActualHours;

    @ApiModelProperty("数据状态[0:创建,1:暂存,2:审核中,3:已审核]")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("项目状态[0:未排产,1:未执行,2:执行中,3:已完工,4:已发货,5:已验收,6:质保期满]")
    @TableField("project_status")
    private Integer projectStatus;

    @TableField(exist = false)
    private String projectStatusName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人员")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人员名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("完工日期")
    @TableField("completed_date")
    private LocalDate completedDate;

    @ApiModelProperty("计划开始日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate planStartDate;

    @ApiModelProperty("实际开始日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate actualStartDate;

    @ApiModelProperty("计划结束日期")
    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate planEndDate;
    @ApiModelProperty("审核人员")
    @TableField(exist = false)
    private String warrantyExpired;

    @ApiModelProperty("是否标红")
    @TableField(exist = false)
    private String isRed;

    @TableField(exist = false)
    private List<MesProjectOrderDetail> detailList;
}
