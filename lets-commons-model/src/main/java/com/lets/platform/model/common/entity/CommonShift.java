package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 班次
 * </p>
 *
 * @author zhangweiyan
 * @since 2024-07-01
 */
@Getter
@Setter
@TableName("common_shift")
@ApiModel(value = "CommonShift对象", description = "班次")
public class CommonShift extends BaseEntity {

    @ApiModelProperty("班次编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("班次名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("总时长（小时）")
    @TableField("total")
    private BigDecimal total;

    @ApiModelProperty("单据状态")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @TableField(exist = false)
    private List<CommonShiftTimes> timesList;
}
