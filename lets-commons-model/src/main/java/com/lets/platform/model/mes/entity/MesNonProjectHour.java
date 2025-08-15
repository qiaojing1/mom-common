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
 * 非项目工时
 * </p>
 *
 * @author csy
 * @since 2024-06-28
 */
@Getter
@Setter
@TableName("mes_non_project_hour")
@ApiModel(value = "MesNonProjectHour对象", description = "非项目工时")
public class MesNonProjectHour extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ExcelProperty("任务分类编号")
    @TableField(exist = false)
    private String groupCode;

    @ApiModelProperty("任务编号")
    @TableField("code")
    @ExcelProperty("任务编号")
    private String code;

    @ApiModelProperty("任务分类")
    @TableField("group_id")
    @ExcelIgnore
    private String groupId;
    @TableField(exist = false)
    @ExcelIgnore
    private String groupName;

    @ApiModelProperty("任务名称")
    @TableField("name")
    @ExcelProperty("任务名称")
    private String name;

    @ApiModelProperty("启用停用")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("备注")
    @TableField(value = "remark", updateStrategy = FieldStrategy.IGNORED)
    @ExcelProperty("备注")
    private String remark;

    @TableField(exist = false)
    @ExcelIgnore
    private List<MesNonProjectHourTask> details;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MesNonProjectHour that = (MesNonProjectHour) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), code, groupId);
    }
}
