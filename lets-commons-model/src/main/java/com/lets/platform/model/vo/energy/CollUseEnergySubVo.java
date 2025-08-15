package com.lets.platform.model.collection.vo.energy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 用(能耗)报表 每隔间隔数据
 * @author DING WEI
 * @date 2025/1/2 10:32
 * @version 1.0
 */
@Data
@ApiModel("每隔间隔数据")
public class CollUseEnergySubVo {

    @ApiModelProperty("表头")
    private String title;

    @ApiModelProperty("用量")
    private String total;
}
