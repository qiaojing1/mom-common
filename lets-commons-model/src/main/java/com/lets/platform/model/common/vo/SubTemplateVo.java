package com.lets.platform.model.common.vo;

import lombok.Data;

import java.io.InputStream;

/**
 * SubTemplateVo
 * @author: DING WEI
 * @date: 2023/11/2 16:57
 */
@Data
public class SubTemplateVo {

    private InputStream inputStream;

    private Integer canDeleteChartIndex;

    private String errorMsg;
    private String name;

    public SubTemplateVo() {
    }

    public SubTemplateVo(InputStream inputStream,Integer canDeleteChartIndex) {
        this.inputStream = inputStream;
        this.canDeleteChartIndex=canDeleteChartIndex;
    }
    public SubTemplateVo(String name,Integer canDeleteChartIndex) {
        this.name = name;
        this.canDeleteChartIndex=canDeleteChartIndex;
    }
    public SubTemplateVo(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
