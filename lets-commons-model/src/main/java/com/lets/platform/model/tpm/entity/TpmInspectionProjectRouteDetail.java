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

/**
 * <p>
 * 巡检路线节点
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-12-09
 */
@Getter
@Setter
@TableName("tpm_inspection_project_route_detail")
@ApiModel(value = "TpmInspectionProjectRouteDetail对象", description = "巡检路线节点")
public class TpmInspectionProjectRouteDetail extends BaseEntity {

    @ApiModelProperty("巡检路线id")
    @TableField("parent_id")
    private String parentId;

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
}
