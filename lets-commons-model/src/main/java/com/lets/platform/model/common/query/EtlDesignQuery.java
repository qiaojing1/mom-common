package com.lets.platform.model.common.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Etl涉及资源 查询对象
 * @author: DING WEI
 * @date: 2022/6/24 11:01
 */
@Data
@ApiModel("Etl涉及资源 查询对象")
public class EtlDesignQuery extends PageQuery {

    @ApiModelProperty("主键")
    private String id;
    @ApiModelProperty(hidden = true)
    private String unId;

    @ApiModelProperty("名称(精准查询)")
    private String name;
    @ApiModelProperty("名称(模糊查询)")
    private String nameLike;

    /**
     * 状态 -1未保存，0:未发布 1:已发布
     * @see com.lets.platform.model.common.enums.EtlDesignStatusEnum
     */
    @ApiModelProperty("状态 0:未发布 1:已发布")
    private String status;

    @ApiModelProperty("创建者")
    private String createUser;
    @ApiModelProperty("创建者名称")
    private String createUserName;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
