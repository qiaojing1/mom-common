package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 导出-模板 实体类
 * @author: DING WEI
 * @date: 2022/9/20 10:12
 */
@Data
public class ExportTemplateDo extends BaseDo {

    /** 名称 */
    private String name;

    /** 功能 */
    private String menuCode;

    /** 模板文件 */
    private String templateFileId;

    /** 状态[0未发布1已发布] */
    private String status;

    /** 租户id */
    private String tenancyId;

    /** excel模板行数 */
    private Integer excelRowNumber;

    /** WORD是否包含列表(Y包含N不包含) */
    private String wordContainList;
    /** 是否批量[YN] */
    private String isBat;

}
