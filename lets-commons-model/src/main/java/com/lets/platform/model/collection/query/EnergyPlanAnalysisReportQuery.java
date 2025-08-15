package com.lets.platform.model.collection.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 能源计划报表-查询
 * @author: DING WEI
 * @date: 2025/2/22 9:20
 */
@Data
@ApiModel("能源计划报表-查询")
public class EnergyPlanAnalysisReportQuery {

    @ApiModelProperty(value = "能源类型", hidden = true)
    private String energyType;

    @ApiModelProperty("年")
    private Integer year;

    @ApiModelProperty("区域主键")
    private String regionalId;
    private  String regionalName;

    @ApiModelProperty("菜单编码")
    private String menuCode;

    private Integer tabIndex;

    @ApiModelProperty("图片Base64")
    private String imageAsBase64;

}
