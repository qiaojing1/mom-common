package com.lets.platform.model.common.domain;

import lombok.Data;

/**
 * 自定义导出(打印)模板-变量
 * @author: DING WEI
 * @date: 2022/9/20 10:35
 */
@Data
public class ExportTemplateDetailDo {

    /** 主键 */
    private String detailId;

    /** 模板主键 */
    private String orderId;

    /** 变量名称 */
    private String variableName;

    /** 变量类型[1文本，2二维码，3条形码，4图片] */
    private String variableType;

    /** 变量来源[1主表单字段，2子表单字段，3企业字段，4其他模板] */
    private String variableSource;

    /** 变量字段 */
    private String variableField;

    /** 宽度 */
    private Integer width;

    /** 高度 */
    private Integer height;

    /** 租户id */
    private String tenancyId;

}
