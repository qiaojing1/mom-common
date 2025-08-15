package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * <p>
 * 非项目工时子任务
 * </p>
 *
 * @author csy
 * @since 2024-06-28
 */
@Getter
@Setter
@TableName("mes_non_project_hour_task")
@ApiModel(value = "MesNonProjectHourTask对象", description = "非项目工时子任务")
public class MesNonProjectHourTask extends BaseEntity {
    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ExcelProperty("任务分类编号")
    @TableField(exist = false)
    private String groupCode;

    @ApiModelProperty("任务编号")
    @TableField(exist = false)
    @ExcelProperty("任务编号")
    private String parentCode;


    @ApiModelProperty("任务id")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @ApiModelProperty("子任务编码")
    @TableField("code")
    @ExcelProperty("子任务编码")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @ExcelProperty("子任务名称")
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MesNonProjectHourTask that = (MesNonProjectHourTask) o;
        return Objects.equals(parentId, that.parentId) &&
                Objects.equals(groupCode, that.groupCode) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), parentId, code);
    }
}
