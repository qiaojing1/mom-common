package com.lets.platform.model.uc.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 数据打包方案
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-02-21
 */
@Getter
@Setter
@TableName("sys_data_package_scheme")
@ApiModel(value = "SysDataPackageScheme对象", description = "数据打包方案")
public class SysDataPackageScheme extends BaseEntity {

    @ApiModelProperty("方案编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @ApiModelProperty("是否预设 Y是 N否")
    @TableField("is_presets")
    private String isPresets;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String isPresetsName;

    @ExcelIgnore
    @ApiModelProperty("是否启用 1是0否")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String enableName;

    @TableField(exist = false)
    @ApiModelProperty("明细列表")
    private List<SysDataPackageSchemeDetail> detailList;
}
