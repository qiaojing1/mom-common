package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class AutoCodeFieldDetailVO {
    private String id;
    private String field;
    private String fieldName;
    private Integer length;
    private Integer isTarget;
    private Integer isDatetime;
    @ApiModelProperty("是否批号编码")
    private Integer isBatchCode;
}
