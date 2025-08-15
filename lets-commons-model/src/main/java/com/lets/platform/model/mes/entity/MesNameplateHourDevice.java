package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 额定工时-设备
 * </p>
 *
 * @author csy
 * @since 2024-06-27
 */
@Getter
@Setter
@TableName("mes_nameplate_hour_device")
@ApiModel(value = "MesNameplateHourDevice对象", description = "额定工时-设备")
public class MesNameplateHourDevice extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ExcelProperty("炉型编号")
    @ApiModelProperty("炉型编号")
    @TableField("code")
    private String code;

    @ExcelProperty("设备")
    @ApiModelProperty("设备")
    @TableField("name")
    private String name;

    @ExcelProperty("炉型")
    @ApiModelProperty("炉型")
    @TableField("basic_model")
    private String basicModel;

    @ExcelIgnore
    @ApiModelProperty("额定工时")
    @TableField(exist = false)
    private Long nameplateHour;

    @ExcelProperty("备注")
    @ApiModelProperty("备注")
    @TableField(value = "remark", updateStrategy = FieldStrategy.IGNORED)
    private String remark;

    @ExcelIgnore
    @ApiModelProperty("层级")
    @TableField(exist = false)
    private String level;
    @ExcelIgnore
    @ApiModelProperty("层级")
    @TableField(exist = false)
    private String copyId;
    @ExcelIgnore
    @ApiModelProperty("层级")
    @TableField(exist = false)
    private String lable;
    @ExcelIgnore
    @TableField(exist = false)
    private List<MesNameplateHourDevice> children;


    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        MesNameplateHourDevice device = (MesNameplateHourDevice) o;
        return Objects.equals(code, device.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), code);
    }
}
