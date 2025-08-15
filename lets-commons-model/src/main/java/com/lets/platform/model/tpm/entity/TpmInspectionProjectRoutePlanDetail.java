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
 * 巡检计划-巡检路线
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-12-11
 */
@Getter
@Setter
@TableName("tpm_inspection_project_route_plan_detail")
@ApiModel(value = "TpmInspectionProjectRoutePlanDetail对象", description = "巡检计划-巡检路线")
public class TpmInspectionProjectRoutePlanDetail extends BaseEntity {

    @ApiModelProperty("计划id")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("序号")
    @TableField("line_number")
    private Integer lineNumber;

    @ApiModelProperty("巡检路线id")
    @TableField("route_id")
    private String routeId;

    @ApiModelProperty("巡检路线名称")
    @TableField(exist = false)
    private String routeName;

    @ApiModelProperty("巡检路线")
    @TableField(exist = false)
    private String routeMaps;

    @ApiModelProperty("巡检路线节点id(按顺序保存)")
    @TableField(exist = false)
    private String routeMapsIds;

    @ApiModelProperty("执行人员id")
    @TableField("execution_user_id")
    private String executionUserId;

    @ApiModelProperty("执行人员名称")
    @TableField("execution_user_name")
    private String executionUserName;

    @TableField(exist = false)
    private List<TpmInspectionProjectRoutePlanItems> itemsList;
}
