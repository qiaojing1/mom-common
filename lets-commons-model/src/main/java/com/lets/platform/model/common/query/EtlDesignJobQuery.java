package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Etl任务 查询对象
 * @author: DING WEI
 * @date: 2022/7/6 13:33
 */
@Data
@ApiModel("Etl任务 查询对象")
public class EtlDesignJobQuery extends PageQuery {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("设计资源主键")
    private String designId;

    @ApiModelProperty("任务名称(精准查询)")
    private String name;
    @ApiModelProperty("任务名称(模糊查询)")
    private String nameLike;

    @ApiModelProperty("状态 0:停止 1:运行")
    private String status;

    @ApiModelProperty("运行方式 1点击执行，2定时执行")
    private String type;

    @ApiModelProperty("创建者")
    private String createUser;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
