package com.lets.platform.model.mes.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangweiyan
 * @ClassName MesTraceDetailVo
 * @Description 明细列表实体类
 * @Date 2024/6/3 15:30
 **/
@Data
@ApiModel("明细列表实体类")
public class MesTraceDetailVo {
    @ApiModelProperty("单据类别编码")
    private String orderCategoryCode;

    @ApiModelProperty("单据类别编码")
    private String orderCategoryName;

    @ApiModelProperty("单据编码")
    private String orderCode;

    @ApiModelProperty("单据日期")
    private String orderTime;

    @ApiModelProperty("菜单编码")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    private String menuName;

    @ApiModelProperty("单据id")
    private String orderId;

    @ApiModelProperty("单据明细id")
    private String orderDetailId;

    @ApiModelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料编码")
    private String materialName;

    @ApiModelProperty("规格型号")
    private String materialSpecs;

    @ApiModelProperty("炉/批号")
    private String batchNumber;

    @ApiModelProperty("打印类型")
    private String printType;

    @ApiModelProperty("指定的打印模板id")
    private String templateId;

    @ApiModelProperty("关联的产品档案明细id")
    private String planDetailId;

    @ApiModelProperty("前端使用的id")
    private String id;

    @ApiModelProperty("关联的产品档案目录顺序")
    private Integer catalogueSort;

    @ApiModelProperty("是否为单据 0:是 1:否")
    private Integer isOrder = 1;

    private Long lineNumber;

    @ApiModelProperty("关联的附件id")
    private List<String> enclosureIds = new ArrayList<>();
}
