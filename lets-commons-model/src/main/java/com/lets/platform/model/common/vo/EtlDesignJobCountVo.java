package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Etl任务数量 展示对象
 * @author: DING WEI
 * @date: 2022/7/6 13:33
 */
@Data
@ApiModel("Etl任务数量 展示对象")
public class EtlDesignJobCountVo {

    private String designId;

    private Integer jobCount;
}
