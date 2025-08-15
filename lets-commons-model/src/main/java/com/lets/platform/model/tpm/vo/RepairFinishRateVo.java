package com.lets.platform.model.tpm.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 维修完成率 展示对象
 * @author DING WEI
 * @date 2025/5/13 10:02
 * @version 1.0
 */
@Data
@ApiModel("维修完成率 展示对象")
public class RepairFinishRateVo {

    @ApiModelProperty("班组")
    private String teamsName;

    @ApiModelProperty("人员")
    private List<String> usernameList;

    @ApiModelProperty("统计维度")
    private String queryDimension;

    @ApiModelProperty("表头")
    private List<String> titles;

    @ApiModelProperty("值")
    private List<String> values;

}
