package com.lets.platform.model.collection.vo.energy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 能耗-电时段-配置信息
 * @author DING WEI
 * @date 2024/12/30 16:58
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnergyPeriodConfigVo {

    private Integer[] period;

    private String periodSign;

}
