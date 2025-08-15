package com.lets.platform.model.collection.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangweiyan
 * @ClassName CollDataItemVo
 * @Description 数据项实时数据
 * @Date 2023/12/8 15:59
 **/
@Data
@ApiModel("数据项实时数据")
public class CollDataItemVo {
    @ApiModelProperty("采集时间")
    private String collectionDate;

    @ApiModelProperty("数据项编码")
    private String dataItemCode;

    @ApiModelProperty("数据项值")
    private String dataItemData;

    @ApiModelProperty("数据项id")
    private String dataItemId;

    @ApiModelProperty("数据项名称")
    private String dataItemName;

    @ApiModelProperty("数据项单位")
    private String dataItemUnit;

}
