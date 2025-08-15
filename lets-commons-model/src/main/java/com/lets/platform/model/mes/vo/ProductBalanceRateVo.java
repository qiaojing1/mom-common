package com.lets.platform.model.mes.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.mes.entity.MesProduceJobSingletonProcess;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * 产品平衡率 展示对象
 * @author: DING WEI
 * @date: 2024/3/5 8:51
 */
@Data
@ApiModel("产品平衡率 展示对象")
public class ProductBalanceRateVo {

    @ApiModelProperty("物料主键")
    private String materialId;
    @ApiModelProperty("物料编码")
    private String materialCode;
    @ApiModelProperty("物料名称")
    private String materialName;
    @ApiModelProperty("物料规格型号")
    private String materialSpecs;
    @ApiModelProperty("批号")
    private String batchNumber;
    @ApiModelProperty("图号")
    private String drawingNo;
    @ApiModelProperty("图纸版本")
    private String drawingVersion;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("产线平衡率")
    private BigDecimal productionLineBalanceRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("产线损失率")
    private BigDecimal productionLineLossRate;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("产线每小时产能")
    private BigDecimal productionLineCapacityHourly;
    @ApiModelProperty("瓶颈工序")
    private List<String> bottleneckProcess;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty("瓶颈工时(min)")
    private BigDecimal bottleneckTime;

    @ApiModelProperty("任务清单")
    private List<MesProduceJobSingletonProcess> singletonProcesses;

}
