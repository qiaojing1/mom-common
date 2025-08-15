package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.*;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 额定工时
 * </p>
 *
 * @author csy
 * @since 2024-06-27
 */
@Getter
@Setter
@TableName("mes_nameplate_hour")
@ApiModel(value = "MesNameplateHour对象", description = "额定工时")
public class MesNameplateHour extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("炉型编号")
    @ExcelProperty("炉型编号")
    @TableField(exist = false)
    private String basicModelCode;

    @ApiModelProperty("部件编号")
    @ExcelProperty("部件编号")
    @TableField("code")
    private String code;

    @ExcelIgnore
    @ApiModelProperty("设备")
    @TableField(exist = false)
    private String groupName;

    @ExcelIgnore
    @ApiModelProperty("炉型id")
    @TableField("group_id")
    private String groupId;
    @ExcelIgnore
    @ApiModelProperty("炉型")
    @TableField(exist = false)
    private String basicModel;

    @ApiModelProperty("部件名称")
    @TableField("name")
    @ExcelProperty("部件名称")
    private String name;

    @ExcelIgnore
    @ApiModelProperty("任务类型")
    @TableField("type_id")
    private String typeId;
    @ExcelProperty("任务类型")
    @TableField(exist = false)
    private String typeName;

    @ExcelIgnore
    @ApiModelProperty("额定工时")
    @TableField("nameplate_hour")
    private Long nameplateHour;

    @ExcelIgnore
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelProperty("备注")
    @ApiModelProperty("备注")
    @TableField(value = "remark", updateStrategy = FieldStrategy.IGNORED)
    private String remark;

    @ExcelIgnore
    @TableField(exist = false)
    private List<MesNameplateHourProcess> details;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MesNameplateHour that = (MesNameplateHour) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), code, groupId);
    }
}
