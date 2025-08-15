/*
 * csy
 */

package com.lets.platform.model.common.dto;

import com.lets.platform.model.common.entity.CommonBatchCodeRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * 批号-自动编码
 * @author: DING WEI
 * @date: 2023/11/23 10:13
 */
@Data
@ApiModel("自动编码批号")
public class ExecuteDto {

    private String cmd;

    private CountDownLatch sub;


}
