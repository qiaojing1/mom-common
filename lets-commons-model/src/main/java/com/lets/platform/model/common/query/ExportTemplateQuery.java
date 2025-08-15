package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 导出-模板 查询对象
 * @author: DING WEI
 * @date: 2022/9/20 10:13
 */
@Data
@ApiModel("导出-模板 查询对象")
public class ExportTemplateQuery extends PageQuery {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("名称")
    private String name;
    private String nameLike;

    @ApiModelProperty("功能")
    private String menuCode;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
    private String isBat;

}
