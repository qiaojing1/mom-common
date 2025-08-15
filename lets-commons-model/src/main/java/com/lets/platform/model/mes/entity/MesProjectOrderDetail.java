package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

/**
 * <p>
 * 项目汇总明细表
 * </p>
 *
 * @author FZY
 * @since 2024-07-10
 */
@Getter
@Setter
@TableName("mes_project_order_detail")
@ApiModel(value = "MesProjectOrderDetail对象", description = "项目汇总明细表")
public class MesProjectOrderDetail extends BaseEntity {

    @TableField(exist = false)
    private LocalDate orderDate;

    @ApiModelProperty("项目汇总ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("项目汇总Code")
    @TableField(exist = false)
    private String orderCode;

    @ApiModelProperty("项目汇总Code")
    @TableField(exist = false)
    private String orderCodeStr;

    @ApiModelProperty("行号")
    @TableField("line_number")
    private String lineNumber;

    @ApiModelProperty("设备ID")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备名称")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("炉型")
    @TableField("device_basic_model")
    private String deviceBasicModel;

    @ApiModelProperty("数量")
    @TableField("quantity")
    private Integer quantity;

    @ApiModelProperty("车间装配工时")
    @TableField("workshop_assembly_standard_hours")
    private Integer workshopAssemblyStandardHours;

    @ApiModelProperty("车间装配总工时(装配+其他)")
    @TableField("total_workshop_assembly_standard_hours")
    private Integer totalWorkshopAssemblyStandardHours;

    @ApiModelProperty("现场安调工时")
    @TableField("on_site_installation_standard_hours")
    private Integer onSiteInstallationStandardHours;

    @ApiModelProperty("现场安调总工时")
    @TableField("total_on_site_installation_standard_hours")
    private Integer totalOnSiteInstallationStandardHours;

    @ApiModelProperty("额定工时")
    @TableField("standard_hours")
    private Integer standardHours;

    @ApiModelProperty("总额定工时")
    @TableField("total_standard_hours")
    private Integer totalStandardHours;

    @ApiModelProperty("计划开始日期")
    @TableField("plan_start_date")
    private LocalDate planStartDate;

    @TableField(exist = false)
    private LocalDate planEndDate;

    @TableField(exist = false)
    private LocalDate contractDate;

    @ApiModelProperty("实际开始日期")
    @TableField(value = "actual_start_date", updateStrategy = FieldStrategy.ALWAYS)
    private LocalDate actualStartDate;

    @ApiModelProperty("发货日期")
    @TableField(value = "delivery_date")
    private LocalDate deliveryDate;

    @ApiModelProperty("项目状态[0:未排产,1:未执行,2:执行中,3:已完工,4:已发货,5:已验收,6:质保期满]")
    @TableField("project_status")
    private Integer projectStatus;

    @TableField(exist = false)
    private String projectStatusName;

    @TableField(exist = false)
    private List<MesProjectOrderDetailProcess> processList;

    @ApiModelProperty("前期准备日期(天)")
    @TableField("preparation_date")
    private Integer preparationDate;

    @ApiModelProperty("暂停日期")
    @TableField("pause_date")
    private LocalDate pauseDate;
}
