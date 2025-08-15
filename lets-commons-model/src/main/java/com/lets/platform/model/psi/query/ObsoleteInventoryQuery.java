package com.lets.platform.model.psi.query;

import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.model.psi.enums.ObsoleteScopeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

/**
 * 呆滞库存查询对象
 * @author: DING WEI
 * @date: 2025/7/17 10:40
 */
@Data
@ApiModel("呆滞库存查询对象")
public class ObsoleteInventoryQuery {

    @NotNull(message = "请输入[呆滞天数]")
    @Min(value = 10, message = "[呆滞天数]必须大于等于10天")
    @Max(value = 9999999, message = "[呆滞天数]不能超过9999999天")
    @ApiModelProperty("呆滞天数(X4)")
    private Integer obsoleteDays;
    @ApiModelProperty(hidden = true, value = "X1=(X4/2)为整数则减1，如果(X4/2)为小数则直接取整")
    private Integer obsoleteDaysX1;
    @ApiModelProperty(hidden = true, value = "X2=X1+1")
    private Integer obsoleteDaysX2;
    @ApiModelProperty(hidden = true, value = "X3=X4-1")
    private Integer obsoleteDaysX3;

    @ApiModelProperty("物料主键")
    private Set<String> materialIdList;

    @ApiModelProperty("物料分组")
    private Set<String> materialGroupIdList;

    @ApiModelProperty("物料规格")
    private String materialSpecs;

    @ApiModelProperty("批号")
    private String batchNumber;

    @ApiModelProperty("仓库")
    private Set<String> storeIdList;
    @ApiModelProperty("库区")
    private Set<String> areaIdList;
    @ApiModelProperty("库位")
    private Set<String> positionIdList;

    /**
     * @see com.lets.platform.model.psi.enums.ObsoleteInventoryDimEnum
     */
    @NotEmpty(message = "[库存维度]不能为空")
    @ApiModelProperty("库存维度[material_id, store_id, area_id, position_id, batch_number, material_specific]")
    private List<String> inventoryDimList;

    /**
     * @see com.lets.platform.model.psi.enums.ObsoleteScopeEnum
     */
    @ValidatedEnum(enumClass = ObsoleteScopeEnum.class, required = true, message = "[呆滞范围]非法")
    @ApiModelProperty("呆滞范围[1:只进未出,2:未进未出,3:有进有出]")
    private String obsoleteScope;

    @ApiModelProperty("隐藏无呆滞明细(true/false)")
    private Boolean hideNoObsoleteDetail;

    @NotNull(message = "[当前页码]不能为空")
    @ApiModelProperty("当前页码")
    private Integer current;
    @NotNull(message = "[页码大小]不能为空")
    @ApiModelProperty("页码大小")
    private Integer size;
    @ApiModelProperty(hidden = true, value = "菜单编码")
    private String menuCode;
    @ApiModelProperty(hidden = true)
    private Integer tabIndex;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
    @ApiModelProperty(hidden = true)
    private String joinCondition;
    @ApiModelProperty(hidden = true)
    private String joinCondition1;
    @ApiModelProperty(hidden = true)
    private String joinCondition2;
    @ApiModelProperty(hidden = true)
    private String queryField;
    @ApiModelProperty(hidden = true)
    private String subQueryField;
    @ApiModelProperty(hidden = true)
    private String groupByCondition;
    @ApiModelProperty(hidden = true)
    private String subGroupByCondition;
    @ApiModelProperty(hidden = true)
    private String havingCondition;
    @ApiModelProperty(hidden = true)
    private String subHavingCondition;
    @ApiModelProperty(hidden = true)
    private String orderByCondition;
    @ApiModelProperty(hidden = true)
    private String startTime;
    @ApiModelProperty(hidden = true)
    private String endTime;

}
