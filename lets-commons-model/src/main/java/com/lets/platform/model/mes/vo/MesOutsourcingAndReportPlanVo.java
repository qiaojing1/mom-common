package com.lets.platform.model.mes.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.entity.MesProcessPlanDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 工序计划
 *
 * @author DING WEI
 * @since 2023-12-26
 */
@Getter
@Setter
@ApiModel(value = "MesProcessPlan对象", description = "工序计划")
public class MesOutsourcingAndReportPlanVo extends BaseEntity {

    @ApiModelProperty("单据编号")
    private String code;
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    private LocalDateTime orderTime;
    @ApiModelProperty("完工类型 1:委外完工 2:自制完工")
    private String orderType;
    private String orderTypeName;
    @ApiModelProperty("供应商主键")
    private String supplierId;
    @ApiModelProperty("供应商名称")
    private String supplierName;
    @ApiModelProperty("供应商编码")
    private String supplierCode;
    @ApiModelProperty("业务部门")
    private String purchaseOrgName;
    private String purchaseOrgId;
    @ApiModelProperty("业务员")
    private String purchaseUserName;
    private String purchaseUserId;
    @ApiModelProperty("工序类型")
    private String processType;
    private String processTypeName;
    private String processUnitId;
    private String processUnitCode;
    private String processUnitName;
    private Integer processUnitAccuracy;
    private Integer processUnitRoundOffType;

    @ApiModelProperty("物料主键")
    private String materialId;
    @ApiModelProperty("物料编码")
    private String materialCode;
    @ApiModelProperty("物料名称")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    private String materialSpecs;
    @ApiModelProperty("物料类型")
    private String materialType;
    private String materialTypeName;
    @ApiModelProperty("物料特征属性")
    private String materialSpecific;
    @ApiModelProperty("物料分组主键")
    private String groupId;
    @ApiModelProperty("物料分组名称")
    private String groupName;
    @ApiModelProperty("工序单位主键")
    private String produceUnitId;
    @ApiModelProperty("工序单位编码")
    private String produceUnitCode;
    @ApiModelProperty("工序单位名称")
    private String produceUnitName;
    @ApiModelProperty("收发仓库")
    private String storeName;
    private String storeId;
    @ApiModelProperty("批号")
    private String produceBatchNumber;
    @ApiModelProperty("转出-工序号")
    private String outProcessNo;
    @ApiModelProperty("转出-工序主键")
    private String outProcessId;
    @ApiModelProperty("转出-工序编码")
    private String outProcessCode;
    @ApiModelProperty("转出-工序名称")
    private String outProcessName;
    @ApiModelProperty("转出-工序说明")
    private String outProcessRemark ;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("完工数量")
    private BigDecimal finishWorkNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("合格数量")
    private BigDecimal richNumber;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("工废数量")
    private BigDecimal processScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("料废数量")
    private BigDecimal materialScrapNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("让步接收数量")
    private BigDecimal giveInNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("返修数量")
    private BigDecimal repairNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("不良数量")
    private BigDecimal poorNumber;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("计件工资")
    private BigDecimal workPrice;
    @ApiModelProperty("标准工时(min)")
    private Integer standardTime;

    @ApiModelProperty("工时单价")
    private BigDecimal price;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("委外单价")
    private BigDecimal outsourcePrice;
    @ApiModelProperty("班次主键")
    private String shiftId;
    @ApiModelProperty("班次名称")
    private String shiftName;
    @ApiModelProperty("班组主键")
    private String teamsId;
    @ApiModelProperty("班组名称")
    private String teamsName;
    @ApiModelProperty("操作工主键")
    private String operatorId;
    @ApiModelProperty("操作工名称")
    private String operatorName;
    @ApiModelProperty("生产单元")
    private String produceFactoryModeId;
    @ApiModelProperty("生产单元名称")
    private String produceFactoryModeName;
    @ApiModelProperty("设备主键")
    private String deviceId;
    @ApiModelProperty("设备名称")
    private String deviceName;
    private String typeId;
    @ApiModelProperty("设备类型")
    private String typeName ;
    @ApiModelProperty("计划跟踪号")
    private String trackNo;
    @ApiModelProperty("生产工单-主键")
    private String produceOrderId;
    @ApiModelProperty("生产工单-单号")
    private String produceOrderCode;
    @ApiModelProperty("生产工单-行号")
    private Long produceLineNumber;
    @ApiModelProperty("源单类型[1：工序计划单]")
    private String sourceOrderType;
    private String sourceOrderTypeName;
    @ApiModelProperty("源单主键(工序计划单-主键)")
    private String sourceOrderId;
    @ApiModelProperty("源单编码(工序计划单-编码)")
    private String sourceOrderCode;
    @ApiModelProperty("源单行号(工序计划工序号)")
    private String sourceLineNumber;
    @ApiModelProperty("审核时间")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人")
    private String auditUser;
    @ApiModelProperty("审核人名称")
    private String auditUserName;
    private Integer currencyPriceAccuracy;
    private Integer currencyRoundOffType;
    private String outsourcingOutId;
}
