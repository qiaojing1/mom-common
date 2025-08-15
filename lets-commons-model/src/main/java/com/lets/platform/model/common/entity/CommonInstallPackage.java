package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * 安装包维护
 * @author DING WEI
 * @since 2024-01-13
 */
@Getter
@Setter
@TableName("common_install_package")
@ApiModel(value = "CommonInstallPackage对象", description = "安装包维护")
public class CommonInstallPackage extends BaseEntity {

    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    /**
     * @see com.lets.platform.model.common.enums.InstallPackageTypeEnum
     */
    @ApiModelProperty("类型")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ApiModelProperty("版本")
    @TableField("version")
    private String version;

    @ApiModelProperty("是否强制更新(YN)")
    @TableField("is_force")
    private String isForce;
    @TableField(exist = false)
    private String isForceName;

    @ApiModelProperty("exe安装包文件")
    @TableField("exe_file_id")
    private String exeFileId;
    @TableField(exist = false)
    private CommonFile exeFile;

    @ApiModelProperty("apk安装包文件")
    @TableField("apk_file_id")
    private String apkFileId;
    @TableField(exist = false)
    private CommonFile apkFile;

    @ApiModelProperty("扩展文件")
    @TableField("extend_file_id1")
    private String extendFileId1;
    @TableField(exist = false)
    private CommonFile extendFile1;

    @ApiModelProperty("扩展文件")
    @TableField("extend_file_id2")
    private String extendFileId2;
    @TableField(exist = false)
    private CommonFile extendFile2;

    @ApiModelProperty("状态 0:禁用 1:启用")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @Length(max = 2048, message = "CommonTerminalVersion.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("租户编码")
    @TableField("tenancy_code")
    private String tenancyCode;
}
