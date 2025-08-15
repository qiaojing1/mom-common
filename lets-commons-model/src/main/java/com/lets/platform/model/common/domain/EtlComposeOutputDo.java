package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import com.lets.platform.model.common.vo.EtlComposeFieldVo;
import lombok.Data;

import java.util.List;

/**
 * Etl输出组件 实体类
 * @author: DING WEI
 * @date: 2022/6/25 16:14
 */
@Data
public class EtlComposeOutputDo extends BaseDo {

    /** etl设计主键 */
    private String designId;

    /** xml节点主键 */
    private String xmlId;

    /**
     * 类型[1表]
     * @see com.lets.platform.model.common.enums.EtlComposeOutputTypeEnum
     */
    private String type;

    /** 标题 */
    private String title;

    /** 描述 */
    private String describe;

    /** 数据源 */
    private String datasourceId;

    /** 表名称 */
    private String tableName;

    /** 更新方式[1数据附加，2数据覆盖] */
    private String updateType;

    /** 批量大小 */
    private Integer batchSize;

    /** 租户主键 */
    private String tenancyId;

    private List<EtlComposeFieldVo> fieldList;

}
