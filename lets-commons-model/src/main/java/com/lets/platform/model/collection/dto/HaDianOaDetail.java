/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.model.collection.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @ClassName HaDianOaDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/11/5
 */
@Data
public class HaDianOaDetail {
    @ApiModelProperty("文件编码")
    private String docCode;
    @ApiModelProperty("版本号")
    private String version;
    @ApiModelProperty("下发类型")
    private String issueType;
    @ApiModelProperty("文件类型")
    private String docType;
    @ApiModelProperty("总图好")
    private String drawNo;
    @ApiModelProperty("主要内容")
    private String subject;
    @ApiModelProperty("清单号")
    private String listNos;
    @ApiModelProperty("阀门类型")
    private String valveTypes;
    @ApiModelProperty("附件")
    private Map<String,String> files;
}
