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
 * 非项目工时任务分类
 * </p>
 *
 * @author csy
 * @since 2024-06-28
 */
@Getter
@Setter
@TableName("mes_non_project_hour_group")
@ApiModel(value = "MesNonProjectHourGroup对象", description = "非项目工时任务分类")
public class MesNonProjectHourGroup extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelProperty("任务分类编号")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelProperty("任务分类名称")
    private String name;

    @ApiModelProperty("备注")
    @TableField(value = "remark",updateStrategy = FieldStrategy.IGNORED)
    @ExcelProperty("备注")
    private String remark;

    @ExcelIgnore
    @TableField(exist = false)
    private String level;

    @ExcelIgnore
    @TableField(exist = false)
    private List<MesNonProjectHourGroup> children;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MesNonProjectHourGroup group = (MesNonProjectHourGroup) o;
        return Objects.equals(code, group.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), code);
    }
}
