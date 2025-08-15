package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 首页配置查询
 * @author Qiao
 * @date 2021-12-07
 */
@Data
@ApiModel(description = "首页配置查询")
public class CommonIndexConfigQuery extends PageQuery {

    @ApiModelProperty("关联类型 1:生产单元 2:组织")
    private String relationType;
    @ApiModelProperty("图表名称")
    private String name;
    @ApiModelProperty("图标类型 1:饼图 2:条形图")
    private String type;
    private String sort;

    private String tenancyId;

}
