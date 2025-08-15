package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Etl连接组件设置明细 展示对象
 * @author: DING WEI
 * @date: 2022/7/14 15:05
 */
@Data
@ApiModel("Etl连接组件设置明细 展示对象")
public class EtlComposeJoinDetailVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("设计资源主键")
    private String designId;

    @ApiModelProperty("表输出主键")
    private String composeId;

    @ApiModelProperty("节点xml主键")
    private String xmlId;

    /**
     * @see com.lets.platform.model.common.enums.EtlComposeJoinTypeEnum
     */
    @ApiModelProperty("连接方式[1左连接，2右连接，3内连接，4全连接，5交叉连接]")
    private String joinType;

    @ApiModelProperty("连接组件")
    private String joinComposeId;

    @ApiModelProperty("连接组件xml主键")
    private String joinXmlId;

    @ApiModelProperty("连接条件")
    private String joinCondition;

    @ApiModelProperty("字段前缀")
    private String fieldPre;

    @ApiModelProperty("租户主键")
    private String tenancyId;

}
