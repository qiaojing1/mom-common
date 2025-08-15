package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 税率查询
 *
 * @version 1.0
 * @ClassName TaxQuery
 * @author: Qiao
 * @create: 2021/08/24 15:50
 **/
@Data
@ApiModel("税率查询相关")
public class TaxQuery extends PageQuery {
    @ApiModelProperty(value = "税种编码")
    private String code;
    @ApiModelProperty(value = "税种名称")
    private String taxName;

    @ApiModelProperty(value = "税种分类")
    private String taxType;

    @ApiModelProperty(value = "单价含税")
    private String priceContainTax;

    @ApiModelProperty(value = "状态")
    private String status;
    @ApiModelProperty(hidden = true)
    private String tenancyId;
    @ApiModelProperty(hidden = true)
    private String id;
}
