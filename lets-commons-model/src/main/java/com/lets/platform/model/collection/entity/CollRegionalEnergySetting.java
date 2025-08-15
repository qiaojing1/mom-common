package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * <p>
 * 区域能源配置
 * </p>
 *
 * @author zhangweiyan
 * @since 2025-02-17
 */
@Getter
@Setter
@TableName("coll_regional_energy_setting")
@ApiModel(value = "CollRegionalEnergySetting对象", description = "区域能源配置")
public class CollRegionalEnergySetting extends BaseEntity {

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    /**
     * @see com.lets.platform.model.collection.enums.EnergyTypeEnum
     */
    @ApiModelProperty("1:用电 2：用气 3：用水")
    @TableField("energy_type")
    private String energyType;
    @ApiModelProperty("1:用电 2：用气 3：用水")
    @TableField(exist = false)
    private String energyTypeName;

    @ApiModelProperty("公式内容")
    @TableField("content")
    private String content;

    @ApiModelProperty("公式内容(中文)")
    @TableField("content_chinese")
    private String contentChinese;

    @ApiModelProperty("设备ID列表")
    @TableField("device_id_list")
    private String deviceIdList;
    @TableField(exist = false)
    private Set<String> allDeviceIdList;

    @ApiModelProperty("变量列表")
    @TableField("variable_list")
    private String variableList;

    @ApiModelProperty("公式列表")
    @TableField("formula_list")
    private String formulaList;

    @ApiModelProperty("页面展示HTML")
    @TableField("html")
    private String html;

    @ApiModelProperty("启用停用")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("启用停用")
    @TableField(exist = false)
    private String enableName;
}
