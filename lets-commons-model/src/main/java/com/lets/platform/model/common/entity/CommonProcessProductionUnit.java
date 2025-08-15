package com.lets.platform.model.common.entity;

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

/**
 * <p>
 * 工序维护-生产单元
 * </p>
 *
 * @author csy
 * @since 2023-11-06
 */
@Getter
@Setter
@TableName("common_process_production_unit")
@ApiModel(value = "CommonProcessProductionUnit对象", description = "工序维护-生产单元")
public class CommonProcessProductionUnit extends BaseEntity {

    @ApiModelProperty("工序id")
    @TableField("process_id")
    @ExcelIgnore
    private String processId;

    @ApiModelProperty("生产单元id")
    @TableField("production_unit_id")
    @ExcelIgnore
    private String productionUnitId;

    @ExcelProperty("工序编码")
    @TableField(exist = false)
    private String processCode;

    @ExcelProperty("生产单元编码")
    @TableField(exist = false)
    private String unitCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String processName;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

}
