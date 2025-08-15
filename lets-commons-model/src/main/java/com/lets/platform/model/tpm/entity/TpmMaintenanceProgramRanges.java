package com.lets.platform.model.tpm.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
 * 保养项目适用范围
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-11-07
 */
@Getter
@Setter
@TableName("tpm_maintenance_program_ranges")
@ApiModel(value = "TpmMaintenanceProgramRanges对象", description = "保养项目适用范围")
public class TpmMaintenanceProgramRanges extends BaseEntity {

    @ApiModelProperty("保养项目分组id或保养项id")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @ApiModelProperty("保养项目分组id或保养项id")
    @TableField(exist = false)
    @ExcelProperty("保养项名称")
    private String parentName;

    @ApiModelProperty("目标id(如果是保养项则这里保存的是设备备件清单里的物料id)")
    @TableField("target_id")
    @ExcelIgnore
    private String targetId;

    @ApiModelProperty("目标编码")
    @TableField("target_code")
    @ExcelProperty("备件编码")
    private String targetCode;

    @ApiModelProperty("目标名称")
    @TableField("target_name")
    @ExcelIgnore
    private String targetName;

    @ApiModelProperty(hidden = true)
    @ExcelIgnore
    @TableField(exist = false)
    private Integer excelIndex;
}
