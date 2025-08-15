package com.lets.platform.model.common.dto;

import com.lets.platform.model.base.BaseBatchInformationVO;
import com.lets.platform.model.common.entity.CommonExportTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 打印校验
 * @author: DING WEI
 * @date: 2023/10/26 9:08
 */
@Data
@ApiModel("打印提示信息以及待选模板")
public class CheckBeforeExportVo {

    @ApiModelProperty("校验信息")
    private List<BaseBatchInformationVO> informationVOS;

    @ApiModelProperty("待选模板")
    private List<CommonExportTemplate> templateList;

    @ApiModelProperty("该菜单下是否只有一个主打印模板")
    private boolean onlyOne;

    @ApiModelProperty("单据类别默认模板")
    private String defaultTemplateId;

}
