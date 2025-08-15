package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidBigDecimal;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

/**
 * 工艺路线-明细-工序信息-工艺参数
 * @author DING WEI
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_route_process_parameters")
@ApiModel(value = "CommonRouteProcessParameters对象", description = "工艺路线-明细-工序信息-工艺参数")
public class CommonRouteProcessParameters extends BaseEntity {

    @ApiModelProperty("工艺路线主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("工艺路线-工序关联主键")
    @TableField("route_process_id")
    private String routeProcessId;
    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

    @NotBlank(message = "CommonRouteProcessParameters.parametersId", groups = {Save.class, Update.class})
    @ApiModelProperty("参数主键")
    @TableField("parameters_id")
    private String parametersId;
//    @NotBlank(message = "CommonRouteProcessParameters.parametersCode", groups = {Save.class, Update.class})
    @ApiModelProperty("参数编码")
    @TableField("parameters_code")
    private String parametersCode;
    @NotBlank(message = "CommonRouteProcessParameters.parametersName", groups = {Save.class, Update.class})
    @ApiModelProperty("参数名称")
    @TableField("parameters_name")
    private String parametersName;
    @NotBlank(message = "CommonRouteProcessParameters.itemId", groups = {Save.class, Update.class})
    @ApiModelProperty("数据项主键")
    @TableField("item_id")
    private String itemId;
    @ApiModelProperty("数据项原始标识")
    @TableField("item_source_field")
    private String itemSourceField;
    @ApiModelProperty("数据项名称")
    @TableField("item_field_name")
    private String itemFieldName;
    @ApiModelProperty("数据项标识")
    @TableField("item_field")
    private String itemField;

    @ValidBigDecimal(message = "CommonRouteProcessParameters.standardValue", max = "99999.99999", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("标准值")
    @TableField("standard_value")
    private BigDecimal standardValue;
    @ValidBigDecimal(message = "CommonRouteProcessParameters.maxValue", max = "99999.99999", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("最大值")
    @TableField("max_value")
    private BigDecimal maxValue;
    @ValidBigDecimal(message = "CommonRouteProcessParameters.minValue", max = "99999.99999", includeMin = true, groups = {Save.class, Update.class})
    @ApiModelProperty("最小值")
    @TableField("min_value")
    private BigDecimal minValue;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal minValue1;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private BigDecimal maxValue1;

    @TableField(exist = false)
    private Integer processStep;
    @TableField(exist = false)
    private Integer processSort;
}
