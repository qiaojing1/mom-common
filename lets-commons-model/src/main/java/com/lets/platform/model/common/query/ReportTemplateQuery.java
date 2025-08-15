package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 大屏数据表
 * @author wangjx
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏数据模板查询")
public class ReportTemplateQuery extends PageQuery {
    private String id;
    /**
     * 大屏模板名称
     */
    @ApiModelProperty(value = "大屏模板名称")
    private String name;

    /**
     * 大屏类型1:web端2:手机端
     */
    @ApiModelProperty(value = "大屏类型1:web端2:手机端")
    private String type;


    /**
     * 租户id
     */
    @ApiModelProperty(value = "租户id")
    private String tenancyId;

}
