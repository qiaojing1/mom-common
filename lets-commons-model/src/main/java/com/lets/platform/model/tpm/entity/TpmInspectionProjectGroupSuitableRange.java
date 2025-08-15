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
 * 巡检项目适用范围
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-12-05
 */
@Getter
@Setter
@TableName("tpm_inspection_project_group_suitable_range")
@ApiModel(value = "TpmInspectionProjectGroupSuitableRange对象", description = "巡检项目适用范围")
public class TpmInspectionProjectGroupSuitableRange extends BaseEntity {

    @ApiModelProperty("巡检项目分组id")
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
}
