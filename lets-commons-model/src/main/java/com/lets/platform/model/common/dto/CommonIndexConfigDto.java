package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.base.BaseDo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @description 首页配置 入参
 * @author Qiao
 * @date 2021-12-07
 */
@Data
@ApiModel(description = "首页配置入参")
public class CommonIndexConfigDto extends BaseDo {

    @NotBlank(message = "indexConfig.id", groups = {Update.class})
    private String id;
    @NotBlank(message = "indexConfig.code", groups = {Update.class})
    private String code;
    @NotBlank(message = "indexConfig.relationType", groups = {Save.class, Update.class})
    @ApiModelProperty("关联类型 1:生产单元 2:组织")
    private String relationType;
    @ApiModelProperty("图表名称")
    private String name;
    @ApiModelProperty("图表类型")
    private String type;
    @ApiModelProperty("排序")
    private String sort;
    @ApiModelProperty("状态 0:禁用 1:启用")
    private String status;

    @ApiModelProperty("关联明细")
    private List<CommonIndexConfigDetailDto> relationList;

}
