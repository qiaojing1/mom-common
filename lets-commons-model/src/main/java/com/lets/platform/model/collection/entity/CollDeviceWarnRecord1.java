package com.lets.platform.model.collection.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 设备报警记录
 * @author DING WEI
 * @since 2023-11-28
 */
@Getter
@Setter
@ApiModel(value = "导出按设备对象", description = "设备报警记录")
public class CollDeviceWarnRecord1 {
    @ExcelProperty("设备名称")
    @ApiModelProperty("设备名称")
    @ColumnWidth(20)
    private String deviceName;
    @ExcelProperty("生产单元")
    @ApiModelProperty("生产单元名称")
    @ColumnWidth(20)
    private String factoryModeName;
    @ExcelProperty("报警时长(min)")
    @ApiModelProperty("报警持续时间(分钟) 保留两位小数")
    @ColumnWidth(20)
    private BigDecimal warningContinuedTimeMin;
    @ExcelProperty("报警次数")
    @ApiModelProperty("报警次数")
    @ColumnWidth(20)
    private Integer count;

}
