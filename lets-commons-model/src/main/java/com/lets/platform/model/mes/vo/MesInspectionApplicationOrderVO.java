package com.lets.platform.model.mes.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 销售订单
 * </p>
 *
 * @author FZY
 * @since 2023-08-09
 */
@Getter
@Setter
@ApiModel(value = "MesInspectionApplicationOrder分页查询对象", description = "检验申请单分页查询对象")
public class MesInspectionApplicationOrderVO {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("明细ID")
    private String detailId;

    @ApiModelProperty("明细编码")
    private String detailCode;

    @ApiModelProperty("订单ID")
    private String orderId;

    @ApiModelProperty("单据编号")
    private String code;

    @ApiModelProperty("单据类别ID")
    private String orderCategoryId;

    @ApiModelProperty("单据类别名称")
    private String orderCategoryName;

    @ApiModelProperty("申请日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime applyTime;

    @ApiModelProperty("申请部门id")
    private String applyOrgId;

    @ApiModelProperty("申请部门名称")
    private String applyOrgName;

    @ApiModelProperty("申请人id")
    private String applyUserId;

    @ApiModelProperty("申请人名称")
    private String applyUserName;

    @ApiModelProperty("数据状态[0:创建,1:暂存,2:审核中,3:已审核]")
    private Integer status;

    private String statusName;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("审核时间")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人员")
    private String auditUser;

    @ApiModelProperty("审核人员名称")
    private String auditUserName;

    @ApiModelProperty("行号")
    private Long lineNumber;

    @ApiModelProperty("物料编码ID")
    private String materialId;

    @ApiModelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料编码名称")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    private String materialSpecs;

    @ApiModelProperty("特征属性")
    private String materialCharacteristicNames;

    @ApiModelProperty("单位ID")
    private String unitId;

    @ApiModelProperty("单位编码")
    private String unitCode;

    @ApiModelProperty("单位精度")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    private String unitRoundOffType;

    @ApiModelProperty("单位名称")
    private String unitName;

    @ApiModelProperty("仓库ID")
    private String storeId;

    @ApiModelProperty("仓库名称")
    private String storeName;

    @ApiModelProperty("库区ID")
    private String areaId;

    @ApiModelProperty("库区名称")
    private String areaName;

    @ApiModelProperty("库位ID")
    private String positionId;

    @ApiModelProperty("库位名称")
    private String positionName;

    @ApiModelProperty("关联单据数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal relationQuantity;

    @ApiModelProperty("检验数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal inspectionQuantity;

    @ApiModelProperty("合格数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal qualifiedQuantity;

    @ApiModelProperty("不合格数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal unqualifiedQuantity;

    @ApiModelProperty("报废数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal scrapQuantity;

    @ApiModelProperty("批号")
    private String batchNumber;

    @ApiModelProperty("数量")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal quantity;

    @ApiModelProperty("源单ID")
    private String sourceId;

    @ApiModelProperty("源单单号")
    private String sourceCode;

    @ApiModelProperty("源单明细ID")
    private String sourceDetailId;

    @ApiModelProperty("源单类型ID")
    private String sourceOrderType;

    @ApiModelProperty("源单类型名称")
    private String sourceOrderTypeName;

    @ApiModelProperty("源单行号")
    private Long sourceLineNumber;

    @ApiModelProperty("行备注")
    private String detailRemark;

    @ApiModelProperty("租户id")
    private String tenancyId;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("创建人姓名")
    private String createUserName;

    @ApiModelProperty("更新时间")
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人")
    private String updateUser;

    @ApiModelProperty("更新人姓名")
    private String updateUserName;

    @ApiModelProperty("计划跟踪号")
    private String trackNo;

    @ApiModelProperty("项目编号")
    private String projectCode;

    @ApiModelProperty("合同编号")
    private String contractCode;

    @ApiModelProperty("源销售订单订货客户id")
    private String sourceOrderCustomerId;

    @ApiModelProperty("源销售订单订货客户名称")
    private String sourceOrderCustomerName;
    @TableField(exist = false)
    private String isMateialDemand;

    @ApiModelProperty("TS编码")
    private String tsCode;

    @ApiModelProperty("优先级")
    private String inspectPriority;
    private String inspectPriorityName;

    @ApiModelProperty("检验地址")
    private String inspectAddress;

    @ApiModelProperty("检验日期")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime inspectDate;

    @ApiModelProperty("处理状态")
    private String handleStatus;
    private String handleStatusName;

    @ApiModelProperty("检验结果")
    private String result;

    @ApiModelProperty("检验结果")
    private String resultName;

    private String unqualifiedHandleName;

    @ApiModelProperty("扩展字段1")
    @TableField(exist = false)
    private String extField1;

    @ApiModelProperty("扩展字段2")
    @TableField(exist = false)
    private String extField2;

    @ApiModelProperty("扩展字段3")
    @TableField(exist = false)
    private String extField3;

    @ApiModelProperty("扩展字段4")
    @TableField(exist = false)
    private String extField4;

    @ApiModelProperty("扩展字段5")
    @TableField(exist = false)
    private String extField5;

    @ApiModelProperty("扩展字段6")
    @TableField(exist = false)
    private String extField6;

    @ApiModelProperty("扩展字段7")
    @TableField(exist = false)
    private String extField7;

    @ApiModelProperty("扩展字段8")
    @TableField(exist = false)
    private String extField8;

    @ApiModelProperty("扩展字段9")
    @TableField(exist = false)
    private String extField9;

    @ApiModelProperty("扩展字段10")
    @TableField(exist = false)
    private String extField10;
}
