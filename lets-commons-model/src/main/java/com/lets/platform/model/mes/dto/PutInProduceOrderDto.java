package com.lets.platform.model.mes.dto;

import com.lets.platform.model.mes.entity.MesProduceOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 投放生成生产工单并自动提交、审核
 *
 * @author: DING WEI
 * @date: 2024/8/1 14:28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PutInProduceOrderDto {

    private MesProduceOrder mesProduceOrder;

    private boolean workflow;

    private Integer putInOrderStatus;

    private Boolean matchMergeConfig;
}