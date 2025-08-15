package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 状态公式配置
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-14
 */
@Getter
@Setter
@TableName("common_status_formula")
@ApiModel(value = "CommonStatusFormula对象", description = "状态公式配置")
public class CommonStatusFormula extends BaseEntity {

    @ApiModelProperty("公式编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("公式名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("设备数")
    @TableField(exist = false)
    private Integer devicesNum;

    @ApiModelProperty("使用的状态小类列表")
    @TableField(exist = false)
    private Map<String, List<CommonFormulaDetail>> parentCodeMapList;

    @TableField(exist = false)
    private List<CommonFormulaDetail> detailList;

    @ApiModelProperty("关联的设备列表")
    @TableField(exist = false)
    private List<CommonFormulaDevice> deviceList;
}
