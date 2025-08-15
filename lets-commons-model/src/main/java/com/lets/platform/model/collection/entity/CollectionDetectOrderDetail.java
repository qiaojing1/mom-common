
package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 试压工单
 * </p>
 *
 * @author csy
 * @since 2024-02-20
 */
@Getter
@Setter
public class CollectionDetectOrderDetail extends CollectionDetectOrder {

    private String detailId;

    @ApiModelProperty("试验类型")
    private String testType;
    private String testTypeName;

    @ApiModelProperty("试验标准")
    private String standardId;

    @ApiModelProperty("试验标准name")
    private String standardName;

    @ApiModelProperty("试验项目")
    private String projectId;

    @ApiModelProperty("试验项目")
    private String projectName;

    @ApiModelProperty("介质")
    private String mediaId;

    @ApiModelProperty("介质")
    private String mediaName;

    @ApiModelProperty("试验压力")
    private String testPressure;

    @ApiModelProperty("最大压力")
    private String maxPressure;

    @ApiModelProperty("保压时长")
    private String holdTime;

    @ApiModelProperty("泄漏率")
    private String leakageRate;


    private String leakageUnitId;
    @ApiModelProperty("泄漏率单位")
    private String leakageUnit;

    @ApiModelProperty("最大扭矩")
    private String maxTorque;

    @ApiModelProperty("是否限制最大压力")
    private String isMaxPressure;

    @ApiModelProperty("是否考察哦泄漏率")
    private String isCheckLeakage;

    @ApiModelProperty("超过最大压力判定不合格")
    private String exceedMaxPressureUnqualified;

    @ApiModelProperty("是否必做")
    private Boolean required;
    @ApiModelProperty("试验方向")
    private String testDirection;

    @ApiModelProperty("计量方法")
    private String meteringMethod;

    @ApiModelProperty("介质分类")
    private String mediaType;

    @ApiModelProperty("阀门分类id")
    private String valveClassifyId;

    @ApiModelProperty("顺序")
    private Integer step;

    @ApiModelProperty("动力源")
    private String powerSource;
    private String powerSourceName;

    @ApiModelProperty("驱动力")
    private String powerValue;

    @ApiModelProperty("试验方式")
    private String testMethod;

    @ApiModelProperty("试验循环次数")
    private Integer loopTimes;

    @ApiModelProperty("试验内容")
    private String testContent;

    @ApiModelProperty("时间下限")
    private Integer timeLowerLimit;
    @ApiModelProperty("时间上限")
    private Integer timeUpperLimit;

    @ApiModelProperty("开关次数")
    private Integer openTimes;

    private String testTemp;
    private String insulationDuration;
    private String pressureIncrement;
    private String keepTime;

    @TableField(exist = false)
    private BigDecimal multi;
    @TableField(exist = false)
    private BigDecimal plus;
}
