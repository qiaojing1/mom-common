package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.tpm.enums.KnowledgeLibTypeEnum;
import com.lets.platform.model.tpm.enums.RepairLibCreateSourceEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 维修知识库
 * @author DING WEI
 * @since 2024-11-26
 */
@Getter
@Setter
@TableName("tpm_repair_knowledge_lib")
@ApiModel(value = "TpmRepairKnowledgeLib对象", description = "维修知识库")
public class TpmRepairKnowledgeLib extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ExcelIgnore
    @TableField(exist = false)
    private String code;

    @ExcelIgnore
    @ValidatedEnum(enumClass = KnowledgeLibTypeEnum.class, required = true, message = "[知识库类型]非法", groups = {Save.class, Update.class})
    @ApiModelProperty("知识库类型[1:故障代码,2:故障类型]")
    @TableField("type")
    private String type;
    @ColumnWidth(40)
    @ExcelProperty(value = "知识库类型", index = 0)
    @TableField(exist = false)
    private String typeName;

    @ExcelIgnore
    @ApiModelProperty("设备类型主键")
    @TableField("device_type_id")
    private String deviceTypeId;
    @ColumnWidth(40)
    @ExcelProperty(value = "设备类型", index = 1)
    @ApiModelProperty("设备类型名称")
    @TableField("device_type_name")
    private String deviceTypeName;
    @ExcelIgnore
    @ApiModelProperty("设备型号主键")
    @TableField("device_model_id")
    private String deviceModelId;
    @ColumnWidth(40)
    @ExcelProperty(value = "设备型号", index = 2)
    @ApiModelProperty("设备型号名称")
    @TableField("device_model_name")
    private String deviceModelName;
    @ExcelIgnore
    @ApiModelProperty("设备控制器主键")
    @TableField("device_controller_id")
    private String deviceControllerId;
    @ColumnWidth(40)
    @ExcelProperty(value = "设备控制器", index = 3)
    @ApiModelProperty("设备控制器名称")
    @TableField("device_controller_name")
    private String deviceControllerName;
    @ExcelIgnore
    @ApiModelProperty("设备生产厂商主键")
    @TableField("device_manufacturer_id")
    private String deviceManufacturerId;
    @ColumnWidth(40)
    @ExcelProperty(value = "设备生产商", index = 4)
    @ApiModelProperty("设备生产厂商名称")
    @TableField("device_manufacturer_name")
    private String deviceManufacturerName;
    @ExcelIgnore
    @ApiModelProperty("设备供应厂商主键")
    @TableField("device_supplier_id")
    private String deviceSupplierId;
    @ColumnWidth(40)
    @ExcelProperty(value = "设备供应商", index = 5)
    @ApiModelProperty("设备供应厂商名称")
    @TableField("device_supplier_name")
    private String deviceSupplierName;

    @ExcelIgnore
    @ApiModelProperty("故障代码主键")
    @TableField("fault_code_id")
    private String faultCodeId;
    @ColumnWidth(40)
    @ExcelProperty(value = "故障代码", index = 6)
    @ApiModelProperty("故障代码编码")
    @TableField("fault_code_code")
    private String faultCodeCode;
    @ExcelIgnore
    @ApiModelProperty("故障内容")
    @TableField("fault_content")
    private String faultContent;

    @ExcelIgnore
    @ApiModelProperty("故障类型主键[用户数据字典]")
    @TableField("fault_type_id")
    private String faultTypeId;
    @ColumnWidth(40)
    @ExcelProperty(value = "故障类型", index = 7)
    @ApiModelProperty("故障类型名称[用户数据字典]")
    @TableField("fault_type_name")
    private String faultTypeName;

    @ColumnWidth(40)
    @ExcelProperty(value = "故障分析", index = 8)
    @Length(min = 1, max = 1000, message = "[故障分析]长度1-1000，支持文字、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("故障分析")
    @TableField("fault_analysis")
    private String faultAnalysis;
    @ColumnWidth(40)
    @ExcelProperty(value = "维修指导", index = 9)
    @Length(min = 1, max = 1000, message = "[维修指导]长度1-1000，支持文字、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("维修指导")
    @TableField("repair_guidance")
    private String repairGuidance;

    @ExcelIgnore
    @ApiModelProperty("附件主键集合")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @ExcelIgnore
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<CommonFile> enclosureList;

    @ExcelIgnore
    @ApiModelProperty("源单类型[callRepair:报修单]")
    @TableField("source_order_type")
    private String sourceOrderType;
    @ExcelIgnore
    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ExcelIgnore
    @ApiModelProperty("源单编码")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ExcelIgnore
    @ApiModelProperty("维修单主键")
    @TableField("repair_order_id")
    private String repairOrderId;
    @ExcelIgnore
    @ApiModelProperty("维修单编码")
    @TableField("repair_order_code")
    private String repairOrderCode;
    @ExcelIgnore
    @ApiModelProperty("维修人员主键")
    @TableField("repair_user_id")
    private String repairUserId;
    @ExcelIgnore
    @ApiModelProperty("维修人员名称")
    @TableField("repair_user_name")
    private String repairUserName;
    @ValidatedEnum(enumClass = RepairLibCreateSourceEnum.class, required = true, message = "[知识库来源]非法", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("知识库来源[1:手动创建,2:维修转]")
    @TableField("create_source")
    private String createSource;
    @ExcelIgnore
    @TableField(exist = false)
    private String createSourceName;

    @ExcelIgnore
    @ApiModelProperty("审核状态")
    @TableField("status")
    private Integer status;
    @ExcelIgnore
    @TableField(exist = false)
    private String statusName;

    @ExcelIgnore
    @ApiModelProperty("审核时间")
    @TableField("approve_time")
    private LocalDateTime approveTime;
    @ExcelIgnore
    @ApiModelProperty("审核人")
    @TableField("approve_user")
    private String approveUser;
    @ExcelIgnore
    @ApiModelProperty("审核人名称")
    @TableField("approve_user_name")
    private String approveUserName;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<TpmRepairKnowledgeLib> details;
}
