package com.lets.platform.model.mes.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class KittingAnalysisResult implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 0 未开始;
     * 100 正在执行;
     * 200 成功;
     * 300 失败;
     */
    private int code;

    private String message;

    public KittingAnalysisResult() {
    }

    public KittingAnalysisResult(int code) {
        this.code = code;
    }

    public KittingAnalysisResult(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
