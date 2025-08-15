package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @ClassName WeldProcessDetailQuery
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2023/1/16 15:13
 * @Version 1.0
 */
@Data
@ApiModel("焊接工艺参数 查询入参")
public class WeldProcessDetailQuery extends PageQuery {
    @ApiModelProperty("焊接工艺id")
    private String weldProcessId;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
}
