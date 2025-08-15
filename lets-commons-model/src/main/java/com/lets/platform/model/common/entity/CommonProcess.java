package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.CommonProcessTypeEnum;
import com.lets.platform.model.common.enums.InspectionTypeEnum;
import com.lets.platform.model.common.enums.ProcessTechniqueEnum;
import com.lets.platform.model.common.enums.ReportWayEnum;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * 工序维护
 * @author csy
 * @since 2023-11-06
 */
@Getter
@Setter
@TableName("common_process")
@ApiModel(value = "CommonProcess对象", description = "工序维护")
public class CommonProcess extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField(exist = false)
    @ExcelIgnore
    private Integer Index;

    @ApiModelProperty("编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[工序编码] 长度1~40、支持英文、数字和常用符号", groups = {Save.class, Update.class})
    @ColumnWidth(20)
    @ExcelProperty(value = "工序编码", index = 0)
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @Length(min = 1, max = 40, message = "[工序名称] 长度1~40、支持中文、英文、数字和常用符号", groups = {Save.class, Update.class})
    @ColumnWidth(20)
    @ExcelProperty(value = "工序名称", index = 1)
    private String name;

    @ApiModelProperty("工序类型")
    @TableField("type")
    @ValidatedEnum(enumClass = CommonProcessTypeEnum.class, message = "[工序类型] 非法", groups = {Save.class, Update.class})
    @ExcelIgnore
    private String type;
    @ColumnWidth(20)
    @ExcelProperty(value = "工序类型", index = 2)
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("是否生成报告")
    @TableField("is_generate_report")
    @ColumnWidth(25)
    @ExcelProperty(value = "是否生成报告", index = 3)
    private String isGenerateReport;

    @ValidatedEnum(enumClass = ProcessTechniqueEnum.class, message = "[加工工艺] 非法", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("加工工艺[1“车床加工”、2“铣床加工”、3“钳工加工”、4“冲压加工”、5“注塑加工”、6“锻造加工”]")
    @TableField("process_technique")
    private Integer processTechnique;
    @ColumnWidth(20)
    @ExcelProperty(value = "加工工艺", index = 4)
    @TableField(exist = false)
    private String processTechniqueName;

    @ApiModelProperty("自制检验类型")
    @TableField("inspect_type")
    @ExcelIgnore
    @ValidatedEnum(enumClass = InspectionTypeEnum.class, message = "[检验类型] 非法", groups = {Save.class, Update.class})
    private String inspectType;
    @TableField(exist = false)
    @ColumnWidth(25)
    @ExcelProperty(value = "自制检验类型", index = 5)
    private String inspectTypeName;

    @ExcelIgnore
    @ApiModelProperty("委外工序检验[1是0否]")
    @TableField("outsourcing_inspect_type")
    private Integer outsourcingInspectType;
    @ColumnWidth(30)
    @ExcelProperty(value = "委外工序检验", index = 6)
    @TableField(exist = false)
    private String outsourcingInspectTypeName;

    @ExcelIgnore
    @ApiModelProperty("生产单元主键")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ColumnWidth(20)
    @ExcelProperty(value = "生产单元", index = 7)
    @ApiModelProperty("生产单元名称")
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ApiModelProperty("报工工序")
    @TableField("is_report")
    @ExcelIgnore
    @ValidatedEnum(enumClass = IsOrNotEnum.class, message = "[报工工序] 非法", groups = {Save.class, Update.class})
    private String isReport;
    @ColumnWidth(20)
    @ExcelProperty(value = "报工工序", index = 8)
    @TableField(exist = false)
    private String isReportName;

    @ApiModelProperty("报工方式")
    @TableField("report_way")
    @ExcelIgnore
    @ValidatedEnum(enumClass = ReportWayEnum.class, message = "[报工方式] 非法", groups = {Save.class, Update.class})
    private String reportWay;
    @TableField(exist = false)
    @ColumnWidth(20)
    @ExcelProperty(value = "报工方式", index = 9)
    private String reportWayName;


    @ApiModelProperty("准备时长")
    @TableField(value = "prepare_time",updateStrategy = FieldStrategy.IGNORED)
//    @Min(value = 0, message = "[准备时长] 范围0~99999，只能输入数字", groups = {Save.class, Update.class})
//    @Max(value = 99999, message = "[准备时长] 范围0~99999，只能输入数字", groups = {Save.class, Update.class})
    @ExcelIgnore
    private Integer prepareTime;
    @ColumnWidth(20)
    @ExcelProperty(value = "准备时长", index = 10)
    @TableField(exist = false)
    private String prepareTimeStr;
    @ExcelIgnore
    @TableField(exist = false)
    private String prepareTimeShow;

    @ApiModelProperty("标准工时")
    @TableField(value="standard_time",updateStrategy = FieldStrategy.IGNORED)
//    @Min(value = 0, message = "[标准工时] 范围0~99999，只能输入数字", groups = {Save.class, Update.class})
//    @Max(value = 99999, message = "[标准工时] 范围0~99999，只能输入数字", groups = {Save.class, Update.class})
    @ExcelIgnore
    private Integer standardTime;
    @ColumnWidth(20)
    @ExcelProperty(value = "标准工时", index = 11)
    @TableField(exist = false)
    private String standardTimeStr;
    @TableField(exist = false)
    @ExcelIgnore
    private String standardTimeShow;

    @ExcelIgnore
//    @Min(value = 0, message = "[周转时长] 正整数，范围0-99999", groups = {Save.class, Update.class})
//    @Max(value = 99999, message = "[周转时长] 正整数，范围0-99999", groups = {Save.class, Update.class})
    @ApiModelProperty("周转时长")
    @TableField("turnover_duration")
    private Integer turnoverDuration;
    @ColumnWidth(20)
    @ExcelProperty(value = "周转时长", index = 12)
    @TableField(exist = false)
    private String turnoverDurationStr;
    @TableField(exist = false)
    @ExcelIgnore
    private String turnoverDurationShow;

    @ApiModelProperty("计件工资")
    @TableField(value = "work_price",updateStrategy = FieldStrategy.IGNORED)
    @Min(value = 0, message = "[计件工资] 范围0~100000，只能输入数字,单位精度取本位币单价小数位数", groups = {Save.class, Update.class})
    @Max(value = 100000, message = "[计件工资] 范围0~100000，只能输入数字,单位精度取本位币单价小数位数", groups = {Save.class, Update.class})
    @ExcelIgnore
    private BigDecimal workPrice;
    @ColumnWidth(20)
    @ExcelProperty(value = "计件工资", index = 13)
    @TableField(exist = false)
    private String workPriceStr;

    @ApiModelProperty("默认供应商")
    @TableField(value = "supplier_id",updateStrategy = FieldStrategy.IGNORED)
    @ExcelIgnore
    private String supplierId;
    @TableField(exist = false)
    @ColumnWidth(20)
    @ExcelProperty(value = "默认供应商", index = 14)
    private String supplierName;
    @TableField(exist = false)
    @ExcelIgnore
    private String supplierCode;

    @ApiModelProperty("WIP仓库")
    @TableField("wip_store_id")
    @ExcelIgnore
    private String wipStoreId;

    @TableField("wip_store_name")
    @ExcelIgnore
    private String wipStoreName;

    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    @ExcelIgnore
    private String deleted;

    @ApiModelProperty("状态 0:禁用 1:启用")
    @ExcelIgnore
    @TableField("enable")
    private String enable;

    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @ExcelIgnore
    @ApiModelProperty("是否连续委外[0：否，1：是]")
    @TableField("series")
    private Integer series;
    @ColumnWidth(20)
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelProperty(value = "连续委外", index = 15)
    private String seriesStr;

    @ExcelIgnore
    @ApiModelProperty("启用汇报顺序控制[0:否,1:是]")
    @TableField("report_orderly")
    private Integer reportOrderly;
    @ColumnWidth(30)
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    @ExcelProperty(value = "启用汇报顺序控制", index = 16)
    private String reportOrderlyStr;

    @ColumnWidth(20)
    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty(value = "备注", index = 17)
    private String remark;

    @TableField(exist = false)
    @ExcelIgnore
    private List<Map<String,Object>> guidance;
    @TableField(exist = false)
    @ExcelIgnore
    private List<Map<String,Object>> devices;
    @TableField(exist = false)
    @ExcelIgnore
    private List<Map<String,Object>> processParams;

    @ApiModelProperty("委外提前期(天)")
    @TableField("out_source_advance_day")
    @ExcelIgnore
    private Long outSourceAdvanceDay;

    @ApiModelProperty("准备活动基本量")
    @TableField("prepare_action_time")
    @ExcelIgnore
    private Long prepareActionTime;

    @ApiModelProperty("准备活动基本量单位")
    @TableField("prepare_action_time_unit")
    @ExcelIgnore
    private String prepareActionTimeUnit;

    @ApiModelProperty("加工活动基本量")
    @TableField("process_action_time")
    @ExcelIgnore
    private Long processActionTime;

    @ApiModelProperty("加工活动基本量单位")
    @TableField("process_action_time_unit")
    @ExcelIgnore
    private String processActionTimeUnit;

    @ApiModelProperty("拆卸活动基本量")
    @TableField("dismantle_action_time")
    @ExcelIgnore
    private Long dismantleActionTime;

    @ApiModelProperty("拆卸活动基本量单位")
    @TableField("dismantle_action_time_unit")
    @ExcelIgnore
    private String dismantleActionTimeUnit;

    @ApiModelProperty("标准排队时间")
    @TableField("queue_time")
    @ExcelIgnore
    private Long queueTime;

    @ApiModelProperty("标准排队时间单位")
    @TableField("queue_time_unit")
    @ExcelIgnore
    private String queueTimeUnit;

    @ApiModelProperty("标准等待时间")
    @TableField("wait_time")
    @ExcelIgnore
    private Long waitTime;

    @ApiModelProperty("标准等待时间单位")
    @TableField("wait_time_unit")
    @ExcelIgnore
    private String waitTimeUnit;

    @ApiModelProperty("标准移动时间")
    @TableField("move_time")
    @ExcelIgnore
    private Long moveTime;

    @ApiModelProperty("标准移动时间单位")
    @TableField("move_time_unit")
    @ExcelIgnore
    private String moveTimeUnit;

    @ApiModelProperty("拆卸同时等待")
    @TableField("wait_on_dismantle")
    @ExcelIgnore
    private Integer waitOnDismantle;
}
