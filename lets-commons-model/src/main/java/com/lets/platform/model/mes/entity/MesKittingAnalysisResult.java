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
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 齐套分析方案
 * </p>
 *
 * @author FZY
 * @since 2024-06-05
 */
@Getter
@Setter
@TableName("mes_kitting_analysis_result")
@ApiModel(value = "MesKittingAnalysisResult对象", description = "齐套分析方案")
public class MesKittingAnalysisResult extends BaseEntity {

    @TableField(exist = false)
    private String key;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("齐套分析方案ID")
    @TableField("plan_id")
    private String planId;

    @ApiModelProperty("齐套分析方案名称")
    @TableField("plan_name")
    private String planName;

    @TableField(exist = false)
    private List<MesKittingAnalysisResultDetail> detailList;

    @TableField(exist = false)
    private String orderId;

    @TableField(exist = false)
    private String detailId;

    @TableField(exist = false)
    private Long lineNumber;

    @TableField(exist = false)
    private String bomId;
    @TableField(exist = false)
    private String bomVersion;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String bomVersionDescribe;

    @TableField(exist = false)
    private BigDecimal inProgressKittingQuantity;

    @TableField(exist = false)
    private BigDecimal inTransitKittingQuantity;

    @TableField(exist = false)
    private BigDecimal inventoryKittingQuantity;

    @TableField(exist = false)
    private BigDecimal kittingAnalysisQuantity;

    @TableField(exist = false)
    private BigDecimal maxKittingQuantity;

    @TableField(exist = false)
    private String materialId;

    @TableField(exist = false)
    private String materialCode;

    @TableField(exist = false)
    private String materialName;

    @TableField(exist = false)
    private String materialSpecs;

    @TableField(exist = false)
    private String materialCharacteristicNames;

    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime planStartTime;

    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime planEndTime;

    @TableField(exist = false)
    private String produceId;
    @TableField(exist = false)
    private String produceCode;

    @TableField(exist = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime produceDate;

    @TableField(exist = false)
    private String sourceOrderCustomerId;

    @TableField(exist = false)
    private String sourceOrderCustomerName;

    @TableField(exist = false)
    private String trackNo;

    @TableField(exist = false)
    private Long produceLineNumber;
    @TableField(exist = false)
    private String produceDetailId;

    @TableField(exist = false)
    private BigDecimal quantity;

    @TableField(exist = false)
    private BigDecimal receivedKittingQuantity;

    @TableField(exist = false)
    private String unitId;

    @TableField(exist = false)
    private String unitCode;

    @TableField(exist = false)
    private String unitName;

    @TableField(exist = false)
    private Integer unitAccuracy;

    @TableField(exist = false)
    private Integer unitRoundOffType;
}
