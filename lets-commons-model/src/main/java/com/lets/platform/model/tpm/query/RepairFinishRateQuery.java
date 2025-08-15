package com.lets.platform.model.tpm.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * 维修完成率
 * @author DING WEI
 * @date 2025/5/13 10:02
 * @version 1.0
 */
@Data
@ApiModel("维修完成率 查询对象")
public class RepairFinishRateQuery {

    /**
     * @see com.lets.platform.model.common.enums.ResetPeriodEnum
     */
    @ApiModelProperty("1按日、2按周、3按月")
    private String selectType;

    @ApiModelProperty("班组")
    private List<String> teamsIds;

    @ApiModelProperty("开始时间")
    private LocalDate startDate;
    @ApiModelProperty("结束时间")
    private LocalDate endDate;

}
