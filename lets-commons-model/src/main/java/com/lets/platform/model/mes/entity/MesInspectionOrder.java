package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.entity.PsiOrderCategory;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 检验单表
 * </p>
 *
 * @author FZY
 * @since 2024-01-19
 */
@Getter
@Setter
@TableName("mes_inspection_order")
@ApiModel(value = "MesInspectionOrder对象", description = "检验单表")
public class MesInspectionOrder extends BaseEntity {

    @ApiModelProperty("是否需要锁定工序任务(YN)")
    @TableField(exist = false)
    private String lockDispatchDetail;

    @TableField(exist = false)
    private PsiOrderCategory orderCategory;

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField(exist = false)
    private String businessCode;

    @ApiModelProperty("业务类型名称")
    @TableField(exist = false)
    private String businessName;

    @ApiModelProperty("检验类型")
    @TableField("inspect_type")
    private String inspectType;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime orderTime;

    @ApiModelProperty("检验部门id")
    @TableField("inspection_org_id")
    private String inspectionOrgId;

    @ApiModelProperty("检验部门名称")
    @TableField("inspection_org_name")
    private String inspectionOrgName;

    @ApiModelProperty("检验员id")
    @TableField("inspection_user_id")
    private String inspectionUserId;

    @ApiModelProperty("检验员名称")
    @TableField("inspection_user_name")
    private String inspectionUserName;

    @ApiModelProperty("执行状态")
    @TableField("execution_status")
    private Integer executionStatus;

    @ApiModelProperty("数据状态[0:创建,1:暂存,2:审核中,3:已审核]")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

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

    @ApiModelProperty(hidden = true)
    @TableField("generate_win_stock_in_order")
    private String generateWinStockInOrder;

    @ApiModelProperty(hidden = true)
    @TableField("generate_produce_report_order")
    private String generateProduceReportOrder;

    @ApiModelProperty("TS编码")
    @TableField("ts_code")
    private String tsCode;

    @ApiModelProperty("申请部门id")
    @TableField("org_id")
    private String orgId;

    @ApiModelProperty("申请部门名称")
    @TableField("org_name")
    private String orgName;

    @ApiModelProperty("优先级")
    @TableField("inspect_priority")
    private String inspectPriority;

    @ApiModelProperty("文件ID")
    @TableField(exist = false)
    private List<String> fileIds;

    @TableField(exist = false)
    private List<MesInspectionOrderDetail> detailList;

    @TableField(exist = false)
    private boolean ignoreQualifiedNumber;

    public void toUpdateEntity() {
        super.toUpdateEntity();
        this.status = null;
    }

    public void toSaveEntity() {
        super.toSaveEntity();
        this.status = null;
    }
}
