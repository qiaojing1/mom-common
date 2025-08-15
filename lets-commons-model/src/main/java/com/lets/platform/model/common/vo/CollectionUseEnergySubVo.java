package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

@Data
@ApiOperation("每间隔数据")
public class CollectionUseEnergySubVo {

    @ApiModelProperty("表头")
    private String title;

    @ApiModelProperty("用量")
    private String total;
}
