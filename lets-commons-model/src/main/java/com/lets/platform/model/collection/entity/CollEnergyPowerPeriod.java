package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

/**
 * 电时段配置方案
 * @author DING WEI
 * @since 2024-12-30
 */
@Getter
@Setter
@TableName("coll_energy_power_period")
@ApiModel(value = "CollEnergyPowerPeriod对象", description = "电时段配置方案")
public class CollEnergyPowerPeriod extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @Length(min = 1, max = 20, message = "[方案名称]长度1~20，支持中文、字母、数字和常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @NotNull(message = "[生效时间]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("生效时间")
    @TableField("effective_time")
    private LocalDate effectiveTime;

    @Length(max = 200, message = "[备注]长度1~200，支持中文，字母、数字和常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String periodId;

    @ApiModelProperty("方案明细")
    @TableField(exist = false)
    private List<CollEnergyPowerPeriodDetail> details;

    @TableField(exist = false)
    private List<CollEnergyPowerPeriodTime> timeList;
}
