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
 * 折旧方案
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-01-21
 */
@Getter
@Setter
@TableName("tpm_depreciation_scheme")
@ApiModel(value = "TpmDepreciationScheme对象", description = "折旧方案")
public class TpmDepreciationScheme extends BaseEntity {

    @ApiModelProperty("方案编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("方案名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("是否启用 1是 0否")
    @TableField("enable")
    private Integer enable;
    @ApiModelProperty("是否启用 1是 0否")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("是否预设 1是 0否")
    @TableField("preset_state")
    private Integer presetState;
    @ApiModelProperty("是否预设 1是 0否")
    @TableField(exist = false)
    private String presetStateName;

    @ApiModelProperty("明细列表")
    @TableField(exist = false)
    private List<TpmDepreciationSchemeDetail> details;
}
