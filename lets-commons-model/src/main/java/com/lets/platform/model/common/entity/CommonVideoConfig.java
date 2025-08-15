package com.lets.platform.model.common.entity;

import cn.hutool.core.util.HashUtil;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 视频监控配置
 * </p>
 *
 * @author csy
 * @since 2024-05-27
 */
@Getter
@Setter
@TableName("common_video_config")
@ApiModel(value = "CommonVideoConfig对象", description = "视频监控配置")
public class CommonVideoConfig extends BaseEntity {
    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;

    @ExcelIgnore
    @TableField(exist = false)
    private String name;

    @ApiModelProperty("设备id")
    @TableField("device_id")
    @ExcelIgnore
    private String deviceId;
    @ExcelProperty("设备编码")
    @TableField("device_code")
    private String deviceCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String deviceName;

    @ApiModelProperty("ip")
    @TableField("ip")
    @ExcelProperty("IP地址")
    private String ip;

    @ApiModelProperty("端口")
    @TableField("port")
    @ExcelProperty("端口")
    private String port;

    @ApiModelProperty("用户名")
    @TableField("user_name")
    @ExcelProperty("用户名")
    private String userName;

    @ApiModelProperty("密码")
    @TableField("pass_word")
    @ExcelProperty("密码")
    private String passWord;

    @ApiModelProperty("通道代号")
    @TableField("channel")
    @ExcelProperty("通道代号")
    private String channel;

    @ApiModelProperty("协议")
    @TableField("protocol")
    @ExcelIgnore
    private String protocol;
    @ExcelProperty("协议")
    @TableField(exist = false)
    private String protocolName;

    @ApiModelProperty("映射ip")
    @TableField("mapped_ip")
    @ExcelProperty("映射IP")
    private String mappedIp;

    @ApiModelProperty("映射端口")
    @TableField("mapped_port")
    @ExcelProperty("映射端口")
    private String mappedPort;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    @ExcelIgnore
    @ApiModelProperty("预览地址")
    @TableField("pre_url")
    private String preUrl;
    @TableField(exist = false)
    @ExcelIgnore
    private String preUrlName;

    @ExcelIgnore
    @ApiModelProperty("映射预览地址")
    @TableField("mapped_pre_url")
    private String mappedPreUrl;
    @ExcelIgnore
    @ApiModelProperty("截图地址")
    @TableField(exist = false)
    private String picUrl;

    public Integer getHash(String userId){
        return HashUtil.javaDefaultHash(deviceId+"@"+ip+":"+port+"@"+channel+"@"+userId);
    }

}
