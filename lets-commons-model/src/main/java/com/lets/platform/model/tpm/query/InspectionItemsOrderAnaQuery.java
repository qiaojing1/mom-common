package com.lets.platform.model.tpm.query;

import cn.hutool.core.date.DateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

/**
 * 点检统计分析报表 查询对象
 * @author: zhangweiyan
 * @date: 2024/12/23 11:30
 */
@Data
@ApiModel("点检统计分析报表 查询对象")
public class InspectionItemsOrderAnaQuery {

    @ApiModelProperty(value = "实际开始日期", hidden = true)
    private LocalDate actualStartDate;
    @NotNull(message = "开始时间不能为空")
    @ApiModelProperty("开始日期")
    private DateTime startDate;
    @NotNull(message = "结束时间不能为空")
    @ApiModelProperty("结束日期")
    private DateTime endDate;

    @ApiModelProperty("生产单元")
    private Collection<String> factoryModeIds;

    @ApiModelProperty("班组id")
    private Collection<String> teamIds;

    @ApiModelProperty(hidden = true)
    private String tenancyId;

    @ApiModelProperty(hidden = true)
    private String status;

    @ApiModelProperty(hidden = true)
    private List<String> maintenanceType;

    @ApiModelProperty(hidden = true)
    private Collection<String> deviceIds;

    @ApiModelProperty(hidden = true)
    private Collection<String> onInternetDeviceIds;

    @ApiModelProperty(hidden = true)
    private Collection<String> userIds;

}
