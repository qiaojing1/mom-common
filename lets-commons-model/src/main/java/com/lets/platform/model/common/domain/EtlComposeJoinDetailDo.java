package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * Etl连接组件设置明细 实体类
 * @author: DING WEI
 * @date: 2022/7/14 15:05
 */
@Data
public class EtlComposeJoinDetailDo extends BaseDo {

    /** 设计资源主键 */
    private String designId;

    /** 表输出主键 */
    private String composeId;

    /** 节点xml主键 */
    private String xmlId;

    /**
     * 连接方式[1左连接，2右连接，3内连接，4全连接，5交叉连接]
     * @see com.lets.platform.model.common.enums.EtlComposeJoinTypeEnum
     */
    private String joinType;

    /** 连接组件 */
    private String joinComposeId;

    /** 连接组件xml主键 */
    private String joinXmlId;

    /** 连接条件 */
    private String joinCondition;

    /** 字段前缀 */
    private String fieldPre;

    /** 租户主键 */
    private String tenancyId;

}
