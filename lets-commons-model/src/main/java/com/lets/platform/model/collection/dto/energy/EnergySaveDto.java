package com.lets.platform.model.collection.dto.energy;

import com.lets.platform.model.collection.domain.EnergyDo;
import lombok.Data;

import java.util.List;

/**
 * JOB保存
 * @author DING WEI
 * @date 2024/12/30 17:15
 * @version 1.0
 */
@Data
public class EnergySaveDto {

    private String tenancyId;
    private Integer yearMonthDay;

    private String waterPriceId;
    private List<EnergyDo> waterSaves;

    private List<EnergyDo> powerSaves;

    private String gasPriceId;
    private List<EnergyDo> gasSaves;

}
