package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Etl涉及资源 展示对象
 * @author: DING WEI
 * @date: 2022/6/24 11:01
 */
@Data
@ApiModel("Etl涉及资源 展示对象")
public class EtlDesignVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("xml")
    private String content;

    /**
     * 状态 -1未保存，0:未发布 1:已发布
     * @see com.lets.platform.model.common.enums.EtlDesignStatusEnum
     */
    @ApiModelProperty("状态 -1未保存，0:未发布 1:已发布")
    private String status;
    private String statusName;

    @ApiModelProperty("创建时间")
    private Long createTime;

    @ApiModelProperty("创建者")
    private String createUser;

    @ApiModelProperty("创建者名称")
    private String createUserName;

    @ApiModelProperty("更新时间")
    private Long updateTime;

    @ApiModelProperty("更新者")
    private String updateUser;

    @ApiModelProperty("更新者名称")
    private String updateUserName;

    @ApiModelProperty("租户主键")
    private String tenancyId;

    @ApiModelProperty("已生成任务数量")
    private Integer jobCount;

}
