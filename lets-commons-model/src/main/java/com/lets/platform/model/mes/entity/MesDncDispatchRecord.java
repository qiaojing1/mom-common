package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 程序下发记录
 * </p>
 *
 * @author csy
 * @since 2024-03-05
 */
@Getter
@Setter
@TableName("mes_dnc_dispatch_record")
@ApiModel(value = "MesDncDispatchRecord对象", description = "程序下发记录")
public class MesDncDispatchRecord extends BaseEntity {

    @ApiModelProperty("程序档案id")
    @TableField("program_file_id")
    private String programFileId;

    @ApiModelProperty("程序档案code")
    @TableField("program_file_code")
    private String programFileCode;

    @ApiModelProperty("程序档案name")
    @TableField("program_file_name")
    private String programFileName;

    @ApiModelProperty("程序档案版本")
    @TableField("program_file_version")
    private String programFileVersion;

    @ApiModelProperty("程序名称")
    @TableField("program_name")
    private String programName;

    @ApiModelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("设备name")
    @TableField("device_name")
    private String deviceName;

    @ApiModelProperty("下发方式")
    @TableField("dispatch_type")
    private String dispatchType;

    @ApiModelProperty("程序执行方式")
    @TableField("execute_method")
    private String executeMethod;

    @ApiModelProperty("下发时间")
    @TableField("dispatch_time")
    private LocalDateTime dispatchTime;

    @ApiModelProperty("1成功 0失败")
    @TableField("success")
    private String success;

    @TableField(exist = false)
    private String bgn;
    @TableField(exist = false)
    private String end;
}
