package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class AutoCodeFieldVO {
    private String menuCode;
    private String menuName;
    private Integer menuType;
    private String tableName;
    private String tableDisplayName;
    @ApiModelProperty("是否批号编码")
    private Integer isBatchCode;
    private String isBatchCodeName;
    private List<AutoCodeFieldDetailVO> details;
}
