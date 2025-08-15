package com.lets.platform.model.uc.entity;

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
 * 数据打包记录明细
 * </p>
 *
 * @author qiaojing
 * @since 2025-02-25
 */
@Getter
@Setter
@TableName("sys_data_package_log_detail")
@ApiModel(value = "SysDataPackageLogDetail对象", description = "数据打包记录明细")
public class SysDataPackageLogDetail extends BaseEntity {

    @ApiModelProperty("方案id")
    @TableField("log_id")
    private String logId;

    @ApiModelProperty("所属菜单编码(用-分割)")
    @TableField("belong_menu_codes")
    private String belongMenuCodes;

    @ApiModelProperty("所属菜单名称(用-分割)")
    @TableField("belong_menu_names")
    private String belongMenuNames;

    @ApiModelProperty("菜单编码")
    @TableField("menu_code")
    private String menuCode;

    @ApiModelProperty("菜单名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("成功/失败 0失败 1成功")
    @TableField("status")
    private String status;

    @ApiModelProperty("成功/失败 0失败 1成功")
    @TableField(exist = false)
    private String logStatus;
    @ApiModelProperty("文件id")
    @TableField(exist = false)
    private String fileId;
}
