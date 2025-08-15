package com.lets.platform.model.tpm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 巡检工单明细
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-12-16
 */
@Getter
@Setter
@TableName("tpm_inspection_project_order_detail")
@ApiModel(value = "TpmInspectionProjectOrderDetail对象", description = "巡检工单明细")
public class TpmInspectionProjectOrderDetail extends BaseEntity {

    @ApiModelProperty("工单id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("巡检路线id (手动新增的明细该字段无值)")
    @TableField("route_id")
    private String routeId;

    @ApiModelProperty("序号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("目标id")
    @TableField("target_id")
    private String targetId;

    @ApiModelProperty("目标编码")
    @TableField("target_code")
    private String targetCode;

    @ApiModelProperty("目标名称")
    @TableField("target_name")
    private String targetName;

    @ApiModelProperty("巡检顺序")
    @TableField("sort")
    private Integer sort;

    @TableField(exist = false)
    private List<TpmInspectionProjectOrderDetailItems> items;
}
