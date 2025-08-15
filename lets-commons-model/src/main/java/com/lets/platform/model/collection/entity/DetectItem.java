package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 试验报告明细
 *
 * @version 1.0
 * @ClassName DetectRecordItem
 * @author: QIAO JING
 * @create: 2022/11/22 11:42
 **/
@Data
@ApiModel("实验报告点位值")
public class DetectItem {

    @ApiModelProperty("时间")
    public Long time;
    @ApiModelProperty("值")
    private String value;
    @ApiModelProperty("点位标识（open<i>/close<i> i为第几次循环）")
    private String tag;
    @ApiModelProperty("电流")
    private String current;

}
