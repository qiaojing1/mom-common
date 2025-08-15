package com.lets.platform.model.common.vo;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Api("文件反参")
public class ProcessFileVo {
    @ApiModelProperty(value = "文件id")
    private String processFile;
    @ApiModelProperty(value = "文件")
    private CommonFile processFileDo;
}
