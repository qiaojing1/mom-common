package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

import java.util.List;

/**
 * Etl转换组件 实体类
 * @author: DING WEI
 * @date: 2022/6/25 17:20
 */
@Data
public class EtlComposeConvertDo extends BaseDo {

    /** etl设计主键 */
    private String designId;

    /** xml节点主键 */
    private String xmlId;

    /** 类型[1GUID, 2集合, 3连接] */
    private String type;

    /** 名称 */
    private String name;

    /** 标题 */
    private String title;

    /** 描述 */
    private String describe;

    /** guid列名称 */
    private String columnName;

    /** guid列标题 */
    private String columnTitle;

    /** 数据源 */
    private String datasourceId;

    /** 集合类型[1并集去重，2并集不去重，3交集，4差集] */
    private String collectionType;

    /** 连接组件的主表 */
    private String mainComposeId;
    /** 连接组件的主表xml主键 */
    private String mainXmlId;

    /** 租户主键 */
    private String tenancyId;

    private List<EtlComposeFieldDo> fieldList;
    private List<List<EtlComposeFieldDo>> collSettingFieldList;

}
