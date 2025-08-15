package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @description 大屏数据表
 * @author wangjx
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏数据模板表")
public class ReportTemplateDto {

    @NotBlank(message = "ReportTemplateDto.id", groups = {Update.class})
    @ApiModelProperty("主键")
    private String id;

    /**
     * 大屏名称
     */
    @ApiModelProperty(value = "大屏数据模板名称")
    @NotBlank(message = "ReportTemplateDto.name", groups = {Save.class, Update.class})
    private String name;

    /**
     * 大屏类型1:web端2:手机端
     */
    @ApiModelProperty(value = "大屏类型1:web端2:手机端")
    private String type;

    /**
     * 发布(0:未发布;1:已发布
     */
    @ApiModelProperty(value = "发布(0:未发布;1:已发布)")
    private String releaseStatus;

    /**
     * 页面整体布局json
     */
    @ApiModelProperty(value = "页面整体布局json")
    private String data;

    /**
     * 缩略图
     */
    @ApiModelProperty(value = "缩略图")
    private String thumbnailId;

}
