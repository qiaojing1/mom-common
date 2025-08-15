package com.lets.platform.common.pojo.base;

import com.lets.platform.common.pojo.enums.YesOrNo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * 分页查询参数
 *
 * @author fzy
 * @since 2023-04-04
 */
@Data
@ApiModel("查询条件实体")
public class AutoConditionEntity {
    private List<ConditionEntity> conditionList;
    private List<ConditionEntity> conditionOrList;
    private List<OrderEntity> orderList;
    private String groupKey;
    private String tenancyId;
    private String isOpen;  //是否展开,默认展开Y
    private int size;
    private int current;
    @ApiModelProperty("菜单编码")
    private String menuCode;
    @ApiModelProperty("列表页序号")
    private Integer tabIndex;

    @ApiModelProperty("租户条件表别名")
    private String tableAlias;

    @ApiModelProperty(hidden = true)
    private Map<String, Object> handlerParamMap;

    private String datasource;
    private String dataSourceType;
}
