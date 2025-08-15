package com.lets.platform.model.common.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 首页配置明细 出参
 * @author Qiao
 * @date 2021-12-07
 */
@Data
@ApiModel(description = "首页配置明细出参")
public class CommonIndexConfigDetailVo extends BaseDo {

    @ApiModelProperty("关联id")
    private String relationId;
    private String configId;
    @ApiModelProperty("扩展字段1")
    private String ext1;
    @ApiModelProperty("关联名称")
    private String relationName;
    @ApiModelProperty("关联编码")
    private String relationCode;
    @ApiModelProperty("关联类型")
    private String relationType;
    @ApiModelProperty("数量")
    private Integer number;
    @ApiModelProperty("负责人")
    private String leaderUserName;

}
