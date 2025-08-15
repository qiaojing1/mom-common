package com.lets.platform.model.mes.vo;

import com.lets.platform.model.mes.entity.MesArchivingPlanCatalogue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName MesArchivingPlanVo
 * @Description TODO
 * @Date 2024/09/20 15:01
 **/
@Data
@ApiModel("产品档案归档结果返回实体类")
public class MesArchivingPlanVo {

    @ApiModelProperty("明细列表")
    private List<MesTraceDetailVo> details;

    @ApiModelProperty("附件明细")
    private List<Map<String, Object>> files;

    @ApiModelProperty("目录明细列表")
    private List<MesArchivingPlanCatalogue> catalogueList;

    @ApiModelProperty("方案id")
    private String planId;

    @ApiModelProperty("方案id")
    private String catalogueId;

    @ApiModelProperty("销售出库明细id")
    private String saleStockOutDetailId;

    @ApiModelProperty("是否预览 Y:是 N:否 预览仅展示单据")
    private String isPreview = "N";
}
