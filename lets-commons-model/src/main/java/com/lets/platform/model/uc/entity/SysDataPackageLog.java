package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * <p>
 * 数据打包记录
 * </p>
 *
 * @author qiaojing
 * @since 2025-02-25
 */
@Getter
@Setter
@TableName("sys_data_package_log")
@ApiModel(value = "SysDataPackageLog对象", description = "数据打包记录")
public class SysDataPackageLog extends BaseEntity {

    @ApiModelProperty("方案id")
    @TableField("scheme_id")
    private String schemeId;

    @ApiModelProperty("方案编码")
    @TableField("scheme_code")
    private String schemeCode;

    @ApiModelProperty("方案名称")
    @TableField("scheme_name")
    private String schemeName;

    @ApiModelProperty("成功/失败 0失败 1成功")
    @TableField("status")
    private String status;

    @ApiModelProperty("文件id")
    @TableField("fileId")
    private String fileId;
    @ApiModelProperty("创建时间")
    @TableField("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @ApiModelProperty("文件id")
    @TableField(exist = false)
    private CommonFile commonFile;
    @TableField(exist = false)
    private String tenancyName;
}
