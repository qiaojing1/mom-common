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
 * 程序回传记录
 * </p>
 *
 * @author csy
 * @since 2024-03-08
 */
@Getter
@Setter
@TableName("mes_dnc_postback_record")
@ApiModel(value = "MesDncPostbackRecord对象", description = "程序回传记录")
public class MesDncPostbackRecord extends BaseEntity {

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

    @ApiModelProperty("下发时间")
    @TableField("postback_time")
    private LocalDateTime postbackTime;

    @ApiModelProperty("1下发成功 0下发失败")
    @TableField("success")
    private String success;

    @TableField(exist = false)
    private String bgn;
    @TableField(exist = false)
    private String end;
}
