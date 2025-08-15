package com.lets.platform.model.tpm.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Collection;

/**
 * 人员任务查询条件
 * @author: DING WEI
 * @date: 2025/1/15 17:32
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserTaskQuery {

    private String tenancyId;
    private Collection<String> userIds;
    private String userIdsStr;
    @ApiModelProperty("开始日期")
    private LocalDate startDate;
    @ApiModelProperty("结束日期")
    private LocalDate endDate;

    @ApiModelProperty("是否包含协助人员")
    private Boolean containAssist;

    private Collection<Integer> orderStatuses;
}
