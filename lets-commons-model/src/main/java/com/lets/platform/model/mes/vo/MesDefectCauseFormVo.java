package com.lets.platform.model.mes.vo;

import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * <p>
 * 缺陷原因报表返回实体
 * </p>
 *
 * @author zwy
 * @since 2024-10-14
 */
@Getter
@Setter
@ApiModel(value = "MesDefectCauseFormVo", description = "缺陷原因报表返回实体")
public class MesDefectCauseFormVo extends BaseEntity {

    @ApiModelProperty("物料ID")
    private String materialId;

    @ApiModelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料名称")
    private String materialName;

    @ApiModelProperty("物料规格型号")
    private String materialSpecs;

    @ApiModelProperty("特征属性名称")
    private String materialCharacteristicNames;

    @ApiModelProperty("单位ID")
    private String unitId;

    @ApiModelProperty("单位编码")
    private String unitCode;

    @ApiModelProperty("单位精度")
    private Integer unitAccuracy;

    @ApiModelProperty("单位舍入类型")
    private Integer unitRoundOffType;

    @ApiModelProperty("单位名称")
    private String unitName;

    @ApiModelProperty("批号")
    private String batchNumber;

    @ApiModelProperty("检验数量")
    private BigDecimal inspectionQuantity;

    @ApiModelProperty("合格数量")
    private BigDecimal qualifiedQuantity;

    @ApiModelProperty("不合格数量")
    private BigDecimal unqualifiedQuantity;

    @ApiModelProperty("缺陷原因ID")
    private String defectCauseId;

    @ApiModelProperty("缺陷原因名称")
    private String defectCauseName;

    @ApiModelProperty("缺陷数量")
    private BigDecimal defectQuantity;

    @ApiModelProperty("缺陷等级")
    private String adverseLevel;

    @ApiModelProperty("缺陷等级")
    private String adverseLevelName;

    @ApiModelProperty("单据日期")
    private String orderTime;

    @ApiModelProperty("缺陷后果[1可修复 2不可修复 3报废 4可接受]")
    private String consequence;
    private String consequenceName;

    @ApiModelProperty("检验类型")
    private String inspectType;
    private String inspectTypeName;
}
