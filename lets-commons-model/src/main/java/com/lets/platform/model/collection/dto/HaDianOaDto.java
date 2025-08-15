/*
 * csy
 */

package com.lets.platform.model.collection.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @ClassName HaDianOaDto
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/11/5
 */
@Data
public class HaDianOaDto {

    @ApiModelProperty("流程编号")
    private String code;
    @ApiModelProperty("收件人")
    private String receiver;
    @ApiModelProperty("发件人")
    private String sendUserName;
    @ApiModelProperty("收件组织")
    private String receiveOrg;
    @ApiModelProperty("抄送人")
    private String ccTo;
    @ApiModelProperty("抄送组织")
    private String ccOrg;
    @ApiModelProperty("项目编号")
    private String projectCode;
    @ApiModelProperty("详细信息")
    private List<HaDianOaDetail> details;

}
