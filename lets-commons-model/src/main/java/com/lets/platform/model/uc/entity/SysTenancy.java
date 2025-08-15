package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 系统租户表
 * </p>
 *
 * @author DING WEI
 * @since 2023-04-12
 */
@Getter
@Setter
@TableName("sys_tenancy")
@ApiModel(value = "SysTenancy对象", description = "系统租户表")
public class SysTenancy extends BaseEntity {
    @ApiModelProperty("id")
    @TableField("id")
    private String id;

    @ApiModelProperty("编码")
    @TableField("code")
    @NotBlank(message = "SysTenancy.code", groups = {Save.class, Update.class})
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_0_30, message = "SysTenancy.code", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("租户名称")
    @NotBlank(message = "SysTenancy.name", groups = {Update.class})
    @Length(min = 0, max = 30, message = "SysTenancy.name", groups = {Update.class})
    @TableField("name")
    private String name;

    @ApiModelProperty("租户类型")
    @NotBlank(message = "SysTenancy.type", groups = {Save.class, Update.class})
    @Length(min = 0, max = 30, message = "SysTenancy.type", groups = {Save.class, Update.class})
    @TableField("type")
    private String type;

    @ApiModelProperty("租户地址")
    @Length(min = 0, max = 200, message = "SysTenancy.address", groups = {Save.class, Update.class})
    @TableField("address")
    private String address;

    @ApiModelProperty("最大用户数")
    @TableField("max_user")
    @NotNull(message = "SysTenancy.maxUser")
    @Max(
            value = 9999999999L,
            message = "SysTenancy.maxUserLength",
            groups = {Save.class, Update.class})
    private Integer maxUser;

    @ApiModelProperty("最大设备数")
    @NotNull(message = "SysTenancy.maxDevice")
    @Max(
            value = 9999999999L,
            message = "SysTenancy.maxDeviceLength",
            groups = {Save.class, Update.class})
    @TableField("max_device")
    private Integer maxDevice;

    @ApiModelProperty("报表数量")
    @NotNull(message = "SysTenancy.maxAddMenu")
    @Max(
            value = 9999999999L,
            message = "SysTenancy.maxAddMenuLength",
            groups = {Save.class, Update.class})
    @TableField("max_add_menu")
    private Integer maxAddMenu;

    @ApiModelProperty("报表数量")
    @NotNull(message = "SysTenancy.maxAddBigMenu")
    @Max(
            value = 9999999999L,
            message = "SysTenancy.maxAddBigMenuLength",
            groups = {Save.class, Update.class})
    @TableField("max_add_big_menu")
    private Integer maxAddBigMenu;

    @ApiModelProperty("有效期 开始时间")
    @TableField("begin_time")
    @NotNull(message = "SysTenancy.beginTime", groups = {Save.class, Update.class})
    private LocalDateTime beginTime;

    @ApiModelProperty("有效期 结束时间")
    @NotNull(message = "SysTenancy.endTime", groups = {Save.class, Update.class})
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("本位币")
    @TableField("standard_currency")
    private String standardCurrency;

    @ApiModelProperty("logo图片")
    @TableField("logo_image")
    private String logoImage;

    @ApiModelProperty("icon")
    @TableField("icon_image")
    private String iconImage;

    @ApiModelProperty("工位机登录页LOGO")
    @TableField("mdc_logo_image")
    private String mdcLogoImage;

    @ApiModelProperty("终端主图标")
    @TableField("station_main_logo")
    private String stationMainLogo;

    @ApiModelProperty("终端主标题")
    @TableField("station_main_title")
    private String stationMainTitle;

    @ApiModelProperty("终端次标题")
    @TableField("station_sub_title")
    private String stationSubTitle;

    @ApiModelProperty("终端底部标题")
    @TableField("station_bottom_title")
    private String stationBottomTitle;

    @ApiModelProperty("终端详情标题")
    @TableField("station_detail_title")
    private String stationDetailTitle;

    @ApiModelProperty("邮编")
    @TableField("zip_code")
    @Length(min = 0, max = 200, message = "SysTenancy.zipCode", groups = {Update.class})
    private String zipCode;

    @ApiModelProperty("纳税号")
    @TableField("tax_number")
    @Length(min = 0, max = 200, message = "SysTenancy.taxNumber", groups = {Update.class})
    private String taxNumber;

    @ApiModelProperty("银行账号")
    @TableField("bank_account")
    @Length(min = 0, max = 200, message = "SysTenancy.bankAccount", groups = {Update.class})
    private String bankAccount;

    @ApiModelProperty("开户行")
    @TableField("open_bank")
    @Length(min = 0, max = 200, message = "SysTenancy.openBank", groups = {Update.class})
    private String openBank;

    @ApiModelProperty("邮箱地址")
    @Length(min = 0, max = 200, message = "SysTenancy.email", groups = {Update.class})
    @TableField("email")
    private String email;

    @ApiModelProperty("传真")
    @Length(min = 0, max = 200, message = "SysTenancy.fax", groups = {Update.class})
    @TableField("fax")
    private String fax;

    @ApiModelProperty("电话")
    @Length(min = 0, max = 200, message = "SysTenancy.tel", groups = {Update.class})
    @TableField("tel")
    private String tel;

    @ApiModelProperty("录入文字")
    @Length(min = 0, max = 20, message = "SysTenancy.text", groups = {Update.class})
    @TableField("text")
    private String text;

    @ApiModelProperty("状态[0禁用,1启用,2销户  默认值为1]")
    @TableField("status")
    private Integer status;

    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ApiModelProperty("租户id")
    @TableField(exist = false)
    private String tenancyId;

    @TableField(exist = false)
    private CommonFile mdcLogoImageFile;
    @TableField(exist = false)
    private CommonFile stationMainLogoFile;

    @TableField(exist = false)
    private CommonFile logoImageFile;

    @TableField(exist = false)
    private CommonFile iconImageFile;

    @TableField(exist = false)
    private long currentUserNumber;

    @TableField(exist = false)
    private long currentDeviceNumber;

    @ApiModelProperty("手持终端主标题")
    @TableField("pda_main_title")
    private String pdaMainTitle;

    @ApiModelProperty("手持终端次标题")
    @TableField("pda_sub_title")
    private String pdaSubTitle;

    @ApiModelProperty("手持终端登录页LOGO文件ID")
    @TableField("pda_logo_file_id")
    private String pdaLogoFileId;
    @ApiModelProperty("授权信息类型 1:文字2:图片")
    @TableField("copyright_type")
    private String copyrightType;

    @ApiModelProperty("授权信息 文字或图片")
    @TableField("copyright")
    private String copyright;
    @TableField(exist = false)
    private CommonFile copyrightFile;
    @ApiModelProperty("底部提示标语")
    @TableField("cue_banner")
    private String cueBanner;
    @TableField(exist = false)
    private CommonFile pdaLogoFile;

    @ApiModelProperty("手持终端名称")
    @TableField("pda_main_name")
    private String pdaMainName;
    @TableField(exist = false)
    private CommonFile pdaBackgroundFile;
    @ApiModelProperty("手持终端背景")
    @TableField("pda_background_file_id")
    private String pdaBackgroundFileId;
    @ApiModelProperty("工位机详情logo")
    @TableField("mdc_sub_logo_image")
    private String mdcSubLogoImage;
    @TableField(exist = false)
    private CommonFile mdcSubLogoImageFile;

    @TableField(exist = false)
    private List<String> reportIds;
    @TableField(exist = false)
    private List<String> deleteReportIds;
    @ApiModelProperty("节日图标")
    @TableField("holiday")
    private String holiday;
}
