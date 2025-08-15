package com.lets.platform.model.mes.query;

import cn.hutool.core.date.DateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zhangweiyan
 * @ClassName InspectionReportQuery
 * @Description 检验质量统计报表查询类
 * @Date 2024/7/23 09:23
 **/
@Data
@ApiModel("检验质量统计报表查询类")
public class InspectionReportQuery {

    @ApiModelProperty("检验类型")
    private String inspectType;

    @ApiModelProperty("单据日期开始时间")
    private DateTime startTime;

    @ApiModelProperty("单据日期结束时间")
    private DateTime endTime;

    @ApiModelProperty("供应商id")
    private String supplierId;

    @ApiModelProperty("物料id")
    private String materialId;

    @ApiModelProperty("检验部门")
    private String orgId;

    @ApiModelProperty("检验员")
    private String userId;

    @ApiModelProperty("检验单编号")
    private String inspectOrderCode;

    @ApiModelProperty("展示规则 1:忽略特征属性 2:忽略批号")
    private String showRule;
}
