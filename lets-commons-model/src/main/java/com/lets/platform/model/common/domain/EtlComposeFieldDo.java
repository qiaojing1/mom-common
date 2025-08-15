package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * Etl组件字段 实体类
 * @author: DING WEI
 * @date: 2022/6/25 16:46
 */
@Data
public class EtlComposeFieldDo extends BaseDo {

    /** 表输出主键 */
    private String composeId;
    private String xmlId;
    /** 设计资源主键 */
    private String designId;

    /** 字段名称 */
    private String fieldName;

    /** 原始名称 */
    private String originalName;

    /** 字段备注[标题] */
    private String fieldComment;

    /** 字段类型 */
    private String fieldType;

    /** 字段长度 */
    private Integer fieldLength;

    /** 字段精度 */
    private Integer fieldDigits;

    /** 是否关键字[n否y是] */
    private String isKeyword;

    /** 字段来源 */
    private String fieldSource;
    /** 集合设置-字段列表-来源(输入组件) */
    private String inputId;
    /** 集合设置-字段列表-来源(输入组件xml主键) */
    private String inputXmlId;

    /** 租户主键 */
    private String tenancyId;

}
