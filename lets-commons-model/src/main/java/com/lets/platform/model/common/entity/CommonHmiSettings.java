package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * HMI配置
 * @author zhangweiyan
 * @since 2023-12-22
 */
@Getter
@Setter
@TableName("common_hmi_settings")
@ApiModel(value = "CommonHmiSettings对象", description = "HMI配置")
public class CommonHmiSettings extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("生产单元id")
    @TableField("product_unit_id")
    private String productUnitId;
    @TableField(exist = false)
    private String productUnitCode;
    @TableField(exist = false)
    private String productUnitName;
    @TableField(exist = false)
    @ApiModelProperty("生产单元编码 不带层级关系 供前端渲染")
    private String productUnitCodeWebUse;
    @TableField(exist = false)
    @ApiModelProperty("生产单元名称 不带层级关系 供前端渲染")
    private String productUnitNameWebUse;
    @ApiModelProperty(value = "生产单元所有子级", hidden = true)
    @TableField(exist = false)
    private Set<String> allProductUnitChildIds;

    @ApiModelProperty("工序档案id")
    @TableField(exist = false)
    private String processId;
    @TableField(exist = false)
    private String processName;
    @TableField(exist = false)
    private String processCode;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("mac地址")
    @TableField("mac_address")
    private String macAddress;

    @TableField(exist = false)
    @ApiModelProperty("关联设备数")
    private Integer deviceCount;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("启用强制生产准备(0否1是)")
    @TableField("force_produce_prepare")
    private Integer forceProducePrepare;
    @TableField(exist = false)
    private String forceProducePrepareName;
    @ApiModelProperty("启用强制物料准备(0否1是)")
    @TableField("force_material_prepare")
    private Integer forceMaterialPrepare;
    @TableField(exist = false)
    private String forceMaterialPrepareName;
    @ApiModelProperty("启用设备自动计数(0否1是)")
    @TableField("device_auto_count")
    private Integer deviceAutoCount;
    @TableField(exist = false)
    private String deviceAutoCountName;
    @ApiModelProperty("启用扫码接收(0否1是)")
    @TableField("scan_code_receive")
    private Integer scanCodeReceive;
    @TableField(exist = false)
    private String scanCodeReceiveName;
    @ApiModelProperty("启用扫码上料(0否1是)")
    @TableField("scan_code_feeding")
    private Integer scanCodeFeeding;
    @TableField(exist = false)
    private String scanCodeFeedingName;
    @ApiModelProperty("启用扫码汇报(报工)(0否1是)")
    @TableField("scan_code_report")
    private Integer scanCodeReport;
    @TableField(exist = false)
    private String scanCodeReportName;
    @ApiModelProperty("启用接收自动开工(0否1是)")
    @TableField("receive_auto_start_work")
    private Integer receiveAutoStartWork;
    @TableField(exist = false)
    private String receiveAutoStartWorkName;
    @ApiModelProperty("启用汇报自动接收(0否1是)")
    @TableField("report_auto_receive")
    private Integer reportAutoReceive;
    @TableField(exist = false)
    private String reportAutoReceiveName;

    @ApiModelProperty("IP地址")
    @TableField("ip")
    private String ip;

    @ApiModelProperty("端口")
    @TableField("port")
    private String port;

    @ApiModelProperty("用户名")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty("密码")
    @TableField("password")
    private String password;

    @ApiModelProperty("密码")
    @TableField("printer_name")
    private String printerName;

    @ApiModelProperty("外部码地址")
    @TableField("external_address")
    private String externalAddress;

    @ApiModelProperty("Bartender接口url")
    @TableField("bartender_url")
    private String bartenderUrl;

    @ApiModelProperty("检测周期（分钟）")
    @TableField("detection_cycle")
    private Integer detectionCycle;

    @ApiModelProperty("延迟时间（秒）")
    @TableField("delay_time")
    private Integer delayTime;

    @ApiModelProperty("是否装箱检测NG[0:否,1:是]")
    @TableField("packing_check")
    private Integer packingCheck;

    @ApiModelProperty("是否仅记录[0:否,1:是]")
    @TableField("record_only")
    private Integer recordOnly;

    @ApiModelProperty("是否只能看到派发给自己的任务[0:否,1:是]")
    @TableField("visible_to_myself")
    private Integer visibleToMyself;

    @Max(value = 1L, message = "自动退出时间不能小于1分钟")
    @Max(value = 1440L, message = "自动退出时间不能大于1440分钟")
    @ApiModelProperty("自动退出时间(分钟)")
    @TableField("auto_logout_min")
    private Long autoLogoutMin;

    @ApiModelProperty("启用扫码校验功能[0:不启用，1:启用]")
    @TableField("scan_code_check")
    private Integer scanCodeCheck;

    @ApiModelProperty("报工时启用未报工工序提示功能(01)")
    @TableField("process_tip_when_report")
    private Integer processTipWhenReport;

    @TableField(exist = false)
    private List<CommonHmiSettingDevices> devices;

    @TableField(exist = false)
    private List<CommonHmiSettingProcesses> processes;
}
