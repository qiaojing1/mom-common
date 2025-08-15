package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import com.lets.platform.model.common.vo.EtlComposeFieldVo;
import lombok.Data;

import java.util.List;

/**
 * Etl出入组件 实体类
 * @author: DING WEI
 * @date: 2022/6/25 11:13
 */
@Data
public class EtlComposeInputDo extends BaseDo {

    /** etl设计主键 */
    private String designId;

    /** xml节点主键 */
    private String xmlId;

    /** 类型[1sql] */
    private String type;

    /** 标题 */
    private String title;

    /** 描述 */
    private String describe;

    /** 数据源 */
    private String datasourceId;

    /** sql语句 */
    private String sql;

    /** 是否增量[NY] */
    private String isIncrement;
    /** 增量类型[1时间戳增量] */
    private String incrementType;
    /** 时间戳字段 */
    private String timestampField;

    /** 租户主键 */
    private String tenancyId;

    private List<EtlComposeFieldVo> fieldList;

}
