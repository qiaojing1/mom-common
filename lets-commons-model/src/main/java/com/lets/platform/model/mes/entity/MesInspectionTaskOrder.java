package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.mes.vo.MesInspectionOrderVO;
import com.lets.platform.model.mes.vo.MesInspectionTaskTable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

/**
 * <p>
 * 检验任务
 * </p>
 *
 * @author FZY
 * @since 2025-06-17
 */
@Getter
@Setter
@TableName("mes_inspection_task_order")
@ApiModel(value = "MesInspectionTaskOrder对象", description = "检验任务")
public class MesInspectionTaskOrder extends BaseEntity {

    @ApiModelProperty("检验单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("检验单明细ID")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("任务编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("检验方案ID")
    @TableField("config_id")
    private String configId;

    @ApiModelProperty("检验方案名称")
    @TableField("config_name")
    private String configName;

    @ApiModelProperty("抽样方案ID")
    @TableField("sampling_plan_id")
    private String samplingPlanId;

    @ApiModelProperty("抽样方案名称")
    @TableField("sampling_plan_name")
    private String samplingPlanName;

    @ApiModelProperty("检验水平")
    @TableField("inspection_level")
    private String inspectionLevel;

    @ApiModelProperty("检验水平名称")
    @TableField(exist = false)
    private String inspectionLevelName;

    @ApiModelProperty("严格程度")
    @TableField("sampling_rigor_level")
    private String samplingRigorLevel;

    @ApiModelProperty("严格程度名称")
    @TableField(exist = false)
    private String samplingRigorLevelName;

    @ApiModelProperty("AQL")
    @TableField("aql")
    private String aql;

    @ApiModelProperty("批量")
    @TableField("inspect_quantity")
    private BigDecimal inspectQuantity;

    @ApiModelProperty("样本量")
    @TableField("sample_quantity")
    private Integer sampleQuantity;

    @ApiModelProperty("Ac")
    @TableField("ac")
    private Integer ac;

    @ApiModelProperty("Re")
    @TableField("re")
    private Integer re;

    @ApiModelProperty("不良数量")
    @TableField("unqualified_quantity")
    private Integer unqualifiedQuantity;

    @ApiModelProperty("检验结果[1:合格;2:不合格]")
    @TableField("result")
    private String result;

    @ApiModelProperty("数据状态[0:创建,1:暂存,2:审核中,3:已审核]")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

    @TableField(exist = false)
    private InspectPlanConfig inspectPlanConfig;

    @TableField(exist = false)
    private MesInspectionOrder mesInspectionOrder;

    @TableField(exist = false)
    private MesInspectionOrderDetail mesInspectionOrderDetail;

    @TableField(exist = false)
    List<MesInspectionTaskOrderColumn> columnList;

    @TableField(exist = false)
    List<MesInspectionTaskOrderValue> dataList;

    @TableField(exist = false)
    private List<CommonFile> fileList;

    @ApiModelProperty("项目名称")
    @TableField(exist = false)
    private String projectCode;

    @ApiModelProperty("项目名称")
    @TableField(exist = false)
    private String trackNo;

    @ApiModelProperty("阀门生产号")
    @TableField(exist = false)
    private String saleOrderCode;

    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialCode;

    @ApiModelProperty("物料编码")
    @TableField(exist = false)
    private String materialName;

    @ApiModelProperty("规格型号")
    @TableField(exist = false)
    private String materialSpecs;

    @ApiModelProperty("批次号")
    @TableField(exist = false)
    private String batchNumber;

    @ApiModelProperty("优先级")
    @TableField(exist = false)
    private String inspectPriority;
    @TableField(exist = false)
    private String inspectPriorityName;

    @ApiModelProperty("重点检验")
    @TableField(exist = false)
    private String important;
    @TableField(exist = false)
    private String importantName;

    @ApiModelProperty("检验员")
    @TableField(exist = false)
    private String inspectionUserId;
    @TableField(exist = false)
    private String inspectionUserName;

    @ApiModelProperty("来源部门")
    @TableField(exist = false)
    private String orgName;

    @ApiModelProperty("检验类型")
    @TableField(exist = false)
    private String inspectType;
    @TableField(exist = false)
    private String inspectTypeName;

    @ApiModelProperty("TS编码")
    @TableField(exist = false)
    private String tsCode;

    @ApiModelProperty("单据类别")
    @TableField(exist = false)
    private String orderCategoryId;

    @ApiModelProperty("单据类别")
    @TableField(exist = false)
    private String orderCategoryName;

    @TableField(exist = false)
    private List<MesInspectionOrderDetailRecord> recordList;

    @TableField(exist = false)
    private List<CommonFile> recordFileList;

    @TableField(exist = false)
    private MesInspectionTaskTable table;

    @TableField(exist = false)
    private MesInspectionOrderVO inspectionOrderVO;
}
