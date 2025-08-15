package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.entity.PsiMaterialBarcode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 生产工单报工单
 * @author csy
 * @since 2023-12-22
 */
@Getter
@Setter
@TableName("mes_produce_report_order")
@ApiModel(value = "MesProduceReportOrder对象", description = "生产工单报工单")
public class MesProduceReportOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[单据编号] 长度1~40，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;
    @ApiModelProperty("流水号")
    @TableField("serial_number")
    private Integer serialNumber;

    @ApiModelProperty("单据类别主键")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;

    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("单据日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("生产部门主键")
    @TableField("produce_org_id")
    private String produceOrgId;
    @ApiModelProperty("生产部门名称")
    @TableField("produce_org_name")
    private String produceOrgName;

    @ApiModelProperty("生产人员主键")
    @TableField("produce_user_id")
    private String produceUserId;
    @ApiModelProperty("生产人员名称")
    @TableField("produce_user_name")
    private String produceUserName;

    @ApiModelProperty("单据状态")
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

    @TableField("version")
    private Integer version;

    /**
     * @see com.lets.platform.model.mes.enums.ReportOrderSourceTypeEnum
     * */
    @TableField("source_type")
    private String sourceType;
    @TableField(exist = false)
    private String source;

    @ApiModelProperty("生成的生产领料单主键")
    @TableField("generate_picking_order_id")
    private String generatePickingOrderId;

    @Valid
    @TableField(exist = false)
    private List<MesProduceReportOrderDetail> details;

    @ApiModelProperty("是否生成计划外出库单(末道-工位机报工)(YN)")
    @TableField("generate_wip")
    private String generateWip;

    @ApiModelProperty(value = "审核生成的物料条码", hidden = true)
    @TableField(exist = false)
    private List<PsiMaterialBarcode> barcodeList;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Boolean autoReport;

    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
}
