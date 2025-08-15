package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.base.BaseDo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @description 首页配置明细 入参
 * @author Qiao
 * @date 2021-12-07
 */
@Data
@ApiModel(description = "首页配置明细入参")
public class CommonIndexConfigDetailDto extends BaseDo {

    @NotBlank(message = "indexConfigDetail.relationId", groups = {Save.class, Update.class})
    @ApiModelProperty("关联id")
    private String relationId;
    @ApiModelProperty("扩展字段1")
    private String ext1;


}
