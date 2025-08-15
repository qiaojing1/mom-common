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
 * 额定工时-工序
 * </p>
 *
 * @author csy
 * @since 2024-06-27
 */
@Getter
@Setter
@TableName("mes_nameplate_hour_process")
@ApiModel(value = "MesNameplateHourProcess对象", description = "额定工时-工序")
public class MesNameplateHourProcess extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ExcelProperty("炉型编号")
    @TableField(exist = false)
    private String basicModelCode;

    @ExcelProperty("部件编号")
    @TableField(exist = false)
    private String parentCode;

    @ExcelProperty("工序编号")
    @ApiModelProperty("工序编号")
    @TableField("code")
    private String code;

    @ExcelProperty("工序名称")
    @ApiModelProperty("工序名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("额定工时id")
    @ExcelIgnore
    @TableField("parent_id")
    private String parentId;

    @ExcelIgnore
    @ApiModelProperty("额定工时")
    @TableField("nameplate_hour")
    private Long nameplateHour;
    @ExcelProperty("额定工时")
    @TableField(exist = false)
    private String nameplateHourStr;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MesNameplateHourProcess process = (MesNameplateHourProcess) o;
        return Objects.equals(code, process.code) &&
                 Objects.equals(parentCode, process.parentCode) &&
                 Objects.equals(basicModelCode, process.basicModelCode) &&
                Objects.equals(parentId, process.parentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), code, parentId);
    }
}
