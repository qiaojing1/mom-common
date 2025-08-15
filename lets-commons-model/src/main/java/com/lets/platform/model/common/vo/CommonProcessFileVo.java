package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 工艺文件 展示对象
 * @author DING WEI
 * @date 2024/6/24 18:26
 * @version 1.0
 */
@Data
@ApiModel(value = "工艺文件 展示对象")
public class CommonProcessFileVo {

    @ApiModelProperty("工艺文件主键")
    private String id;

    @ApiModelProperty("文件名称")
    private String name;

    /**
     * @see com.lets.platform.model.common.enums.ScopeOfApplicationEnum
     */
    @ApiModelProperty("适用范围(currency:通用， BOM：BOM，material：物料，		processRouting：工艺路线，moOrder：生产订单)")
    private String scopeDefine;
    @ApiModelProperty("适用范围中文名称")
    private String scopeDefineName;

    @ApiModelProperty("版本")
    private String version;

    /**
     * @see com.lets.platform.model.common.enums.ProcessFileTypeEnum
     */
    @ApiModelProperty("文件类型")
    private String fileType;
    @ApiModelProperty("文件类型名称")
    private String fileTypeName;

    @ApiModelProperty("文件主键")
    private String fileId;
    @ApiModelProperty("文件大小")
    private Long size;
    @ApiModelProperty("上传时间")
    private LocalDateTime uploadTime;
    @ApiModelProperty("文件地址")
    private String url;

    @ApiModelProperty("编制人")
    private String madeUser;
    @ApiModelProperty("编制人名称")
    private String madeUserName;

    @ApiModelProperty("描述")
    private String remark;

}
