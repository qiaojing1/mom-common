package com.lets.platform.model.tpm.vo;

import com.lets.platform.model.common.vo.LogDoVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 操作日志返回实体
 * @author: zhangweiyan
 * @date: 2025/4/9 11:55
 */
@Data
@ApiModel("操作日志返回实体")
public class TpmOperateLogVo {

    @ApiModelProperty("步骤列表")
    private List<String> steps;

    @ApiModelProperty("当前激活步骤")
    private Integer activeStep;

    @ApiModelProperty("操作日志")
    private List<LogDoVo> logDoList;

}
