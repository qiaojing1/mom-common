package com.lets.platform.model.collection.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 单件试验报告-明细
 * </p>
 *
 * @author csy
 * @since 2024-01-27
 */
@Getter
@Setter
@TableName("collection_detect_report_detail")
@ApiModel(value = "CollectionDetectReportDetail对象", description = "单件试验报告-明细")
public class CollectionDetectReportDetail extends BaseEntity {

    @TableField("bgn_time")
    @ApiModelProperty("开始时间")
    private Long bgnTime;
    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private Long endTime;

    @TableField("hold_bgn_time")
    @ApiModelProperty("开始时间")
    private Long holdBgnTime;
    @ApiModelProperty("结束时间")
    @TableField("hold_end_time")
    private Long holdEndTime;

    @ApiModelProperty("报告id")
    @TableField("report_id")
    private String reportId;

    @ApiModelProperty("项目名称")
    @TableField("project_name")
    private String projectName;

    @ApiModelProperty("标准压力")
    @TableField(value = "std_press",updateStrategy = FieldStrategy.IGNORED)
    private String stdPress;

    @ApiModelProperty("实际压力")
    @TableField(value = "real_press",updateStrategy = FieldStrategy.IGNORED)
    private String realPress;

    @ApiModelProperty("保压时长(标准值）")
    @TableField(value = "std_holding_time",updateStrategy = FieldStrategy.IGNORED)
    private String stdHoldingTime;

    @ApiModelProperty("保压时长(实际值）")
    @TableField(value = "real_holding_time",updateStrategy = FieldStrategy.IGNORED)
    private String realHoldingTime;

    @ApiModelProperty("泄漏率(实际值）")
    @TableField(value = "std_leakage",updateStrategy = FieldStrategy.IGNORED)
    private String stdLeakage;

    @ApiModelProperty("泄漏率(实际值）")
    @TableField(value = "real_leakage",updateStrategy = FieldStrategy.IGNORED)
    private String realLeakage;

    @ApiModelProperty("备注")
    @TableField(value = "remark",updateStrategy = FieldStrategy.IGNORED)
    private String remark;

    @ApiModelProperty("泄漏率备注")
    @TableField("leakage_remark")
    private String leakageRemark;

    @ApiModelProperty("试验方向")
    @TableField("detect_direction")
    private String detectDirection;

    @ApiModelProperty("计量方法")
    @TableField("measurement_method")
    private String measurementMethod;

    @ApiModelProperty("项目结果")
    @TableField("item_result")
    private String itemResult;
    @TableField(exist = false)
    private String itemResultName;

    @ApiModelProperty("介质名称")
    @TableField("media")
    private String media;

    @ApiModelProperty("泄漏率单位")
    @TableField("leakage_unit")
    private String leakageUnit;

    @ApiModelProperty("人工结果")
    @TableField("man_res")
    private String manRes;

    @ApiModelProperty("项目状态 0: 待试验，1：试验中，2: 已暂停，3：已终止，4：已完成")
    @TableField("status")
    private String status;

    @ApiModelProperty("标准最大压力")
    @TableField("std_max_press")
    private String stdMaxPress;

    @ApiModelProperty("试验类型")
    @TableField("test_type")
    private String testType;

    @ApiModelProperty("最大持续时间")
    @TableField("max_duration")
    private String maxDuration;

    @ApiModelProperty("最小持续时间")
    @TableField("min_duration")
    private String minDuration;


    @ApiModelProperty("标准扭矩")
    @TableField("std_torque")
    private String stdTorque;
    @ApiModelProperty("扭矩")
    @TableField(exist = false)
    private List<Object> torqueList;
    @TableField(value = "torque",updateStrategy = FieldStrategy.IGNORED)
    private String torque;

    @ApiModelProperty("额定电压")
    @TableField("std_vol")
    private String stdVol;
    @ApiModelProperty("时间")
    @TableField(exist = false)
    private List<Object> timeList;
    @TableField(value = "time",updateStrategy = FieldStrategy.IGNORED)
    private String time;

    @ApiModelProperty("累计泄漏率")
    @TableField(value = "accum_leakage",updateStrategy = FieldStrategy.IGNORED)
    private String accumLeakage;


    @ApiModelProperty("开/关平均电流")
    @TableField(exist = false)
    private List<Object> currentList;
    @TableField("current")
    private String current;
    @ApiModelProperty("开/关平均电压")
    @TableField(exist = false)
    private List<Object> voltageList;
    @TableField("voltage")
    private String voltage;
    @ApiModelProperty("开/关结果")
    @TableField("result")
    private String result;

    @TableField(exist = false)
    @ApiModelProperty("点位数据")
    private List<DetectItem> items;

    @TableField(exist = false)
    private CommonFile commonFile;

    @TableField(exist = false)
    private List<String> ffmpegStr;

    @TableField(exist = false)
    private List<CollectionDetectReportVideo> videos;
}
