package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 扩展表, 暂时用于第三方对接
 * </p>
 *
 * @author qiao jing 
 * @since 2024-06-25
 */
@Getter
@Setter
@TableName("common_ext_data")
@ApiModel(value = "CommonExtData对象", description = "扩展表, 暂时用于第三方对接")
public class CommonExtData extends BaseEntity {

    @ApiModelProperty("扩展1")
    @TableField("ext1")
    private String ext1;

    @ApiModelProperty("扩展2")
    @TableField("ext2")
    private String ext2;

    @ApiModelProperty("扩展3")
    @TableField("ext3")
    private String ext3;

    @ApiModelProperty("扩展4")
    @TableField("ext4")
    private String ext4;

    @ApiModelProperty("扩展5")
    @TableField("ext5")
    private String ext5;

    @ApiModelProperty("扩展6")
    @TableField("ext6")
    private String ext6;
    @ApiModelProperty("扩展7")
    @TableField("ext7")
    private String ext7;
    /**
     * 奇精 mesDataInesert 接口入参: ext5表示type; type为"qjMesDataInesert"
     */

    @ApiModelProperty("设备编号")
    @TableField(exist = false)
    private String deviceId;  //对应ext1
    @ApiModelProperty("设备编号")
    @TableField(exist = false)
    private String deviceNo;  //对应ext2
    @ApiModelProperty("产量")
    @TableField(exist = false)
    private Long output;
    @ApiModelProperty("不良数量")
    @TableField(exist = false)
    private Long badNumber;
    @ApiModelProperty("不良数量")
    @TableField(exist = false)
    private Date dateTime;
    @ApiModelProperty("工单")
    @TableField(exist = false)
    private String orderId;
    @ApiModelProperty("计划数量")
    @TableField(exist = false)
    private Long planNumber;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @TableField(exist = false)
    private String planStartTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @TableField(exist = false)
    private String planEndTime;
}
