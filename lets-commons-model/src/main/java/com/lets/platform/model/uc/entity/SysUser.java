package com.lets.platform.model.uc.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Login;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import com.lets.platform.model.uc.enums.LetsJobState;
import com.lets.platform.model.uc.enums.SexEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * <p>
 * 操作用户信息表
 * </p>
 *
 * @author DING WEI
 * @since 2023-04-12
 */
@Getter
@Setter
@TableName("sys_user")
@ApiModel(value = "SysUser对象", description = "操作用户信息表")
public class SysUser extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty("系统帐号")
    @Pattern(regexp = GlobalConstant.LETTER_NUMBER_UNDERLINE_1_20, message = "SysUser.username", groups = {Save.class, Update.class})
    @ApiModelProperty("登录帐号")
    @TableField("login_id")
    private String loginId;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String code;

    @ColumnWidth(20)
    @ExcelProperty("姓名")
    @Length(min = 1, max = 20, message = "SysUser.name", groups = {Save.class, Update.class})
    @ApiModelProperty("姓名")
    @TableField("name")
    private String name;

    @ColumnWidth(20)
    @ExcelProperty("手机号")
    @Pattern(regexp = GlobalConstant.PHONE, message = "SysUser.mobile", groups = {Save.class, Update.class})
    @ApiModelProperty("手机号码")
    @TableField("mobile")
    private String mobile;

    @ColumnWidth(20)
    @ExcelProperty("邮箱")
    @ApiModelProperty("EMAIL")
    @TableField("email")
    private String email;

    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;
    @ExcelIgnore
    @ValidatedEnum(enumClass = IsOrNotEnum.class, required = true, message = "SysUser.enable", groups = {Save.class, Update.class})
    @ApiModelProperty("启用状态")
    @TableField("enable")
    private Integer enable;

    @ColumnWidth(20)
    @ExcelProperty("禁止登录")
    @TableField(exist = false)
    private String forbidLoginName;
    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "SysUser.forbidLogin", groups = {Save.class, Update.class})
    @ApiModelProperty("是否禁止登录[NY]")
    @TableField("forbid_login")
    private String forbidLogin;

    @ColumnWidth(20)
    @ExcelProperty("所属部门")
    @TableField(exist = false)
    private String orgName;

    @TableField(exist = false)
    @ExcelIgnore
    private String orgType;

    @TableField(exist = false)
    @ExcelIgnore
    private Integer orgEnable;

    @ExcelIgnore
    @ApiModelProperty("所属部门")
    @TableField("org_id")
    private String orgId;

    @ColumnWidth(20)
    @ExcelProperty("所属岗位")
    @TableField(exist = false)
    private String postNames;
    @ExcelIgnore
    @TableField(exist = false)
    private String postIds;

    @ColumnWidth(20)
    @ExcelProperty("角色")
    @TableField(exist = false)
    private String roleName;
    @ExcelIgnore
    @NotBlank(message = "SysUser.roleId", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private String roleId;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("[0超级管理员,1系统管理员,2普通角色]")
    // 区分角色权限
    private String roleType;

    @ColumnWidth(25)
    @ExcelProperty("部门负责人")
    @TableField(exist = false)
    private String isLeaderName;
    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = false, message = "SysUser.isLeader", groups = {Save.class, Update.class})
    @ApiModelProperty("是否组织负责人 Y:是 N否")
    @TableField("is_leader")
    private String isLeader;

//    @ColumnWidth(10)
//    @ExcelProperty("班组")
//    @ApiModelProperty("班组")
//    @TableField("team")
//    private String team;

    @ColumnWidth(20)
    @ExcelProperty("员工编号")
    @Pattern(regexp = GlobalConstant.LETTER_NUMBER_UNDERLINE_0_20, message = "SysUser.employeeNumber", groups = {Save.class, Update.class})
    @ApiModelProperty("员工编号")
    @TableField("employee_number")
    private String employeeNumber;

    @ApiModelProperty("用户分组")
    @TableField("group_id")
    @ExcelIgnore
    private String groupId;
    @ExcelIgnore
    @TableField(exist = false)
    private String groupName;

    @ApiModelProperty("供应商")
    @TableField("supplier_id")
    @ExcelIgnore
    private String supplierId;
    @TableField("supplier_name")
    @ExcelIgnore
    private String supplierName;

    @ColumnWidth(20)
    @ExcelProperty("入职日期")
    @TableField(exist = false)
    private String entryTimeStr;
    @ExcelIgnore
    @ApiModelProperty("入职日期")
    @TableField("entry_time")
    private LocalDateTime entryTime;

    @ColumnWidth(20)
    @ExcelProperty("就业日期")
    @TableField(exist = false)
    private String jobTimeStr;
    @ExcelIgnore
    @ApiModelProperty("就业日期")
    @TableField("job_time")
    private LocalDateTime jobTime;

    @ColumnWidth(20)
    @ExcelProperty("人员状态")
    @TableField(exist = false)
    private String jobStatusName;
    @ExcelIgnore
    @ValidatedEnum(enumClass = LetsJobState.class, message = "SysUser.jobStatus", groups = {Save.class, Update.class})
    @ApiModelProperty("在职状态 0:在职 1:离职")
    @TableField("job_status")
    private String jobStatus;

    @ColumnWidth(10)
    @ExcelProperty("性别")
    @TableField(exist = false)
    private String sexName;
    @ExcelIgnore
    @ValidatedEnum(enumClass = SexEnum.class, message = "SysUser.sex", groups = {Save.class, Update.class})
    @ApiModelProperty("性别 0:男 1:女")
    @TableField("sex")
    private String sex;

    @ColumnWidth(10)
    @ExcelProperty("生日")
    @TableField(exist = false)
    private String birthdayStr;
    @ExcelIgnore
    @ApiModelProperty("生日")
    @TableField("birthday")
    private LocalDateTime birthday;

    @ColumnWidth(20)
    @ExcelProperty("办公电话")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_0_20, message = "SysUser.officePhone", groups = {Save.class, Update.class})
    @ApiModelProperty("办公电话")
    @TableField("office_phone")
    private String officePhone;

    @ColumnWidth(35)
    @ExcelProperty("办公电话扩展分机号")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_0_20, message = "SysUser.officePhoneExtNumber", groups = {Save.class, Update.class})
    @ApiModelProperty("办公电话扩展分机号")
    @TableField("office_phone_ext_number")
    private String officePhoneExtNumber;

    @ColumnWidth(20)
    @ExcelProperty("企业微信")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_0_50, message = "SysUser.weCom", groups = {Save.class, Update.class})
    @ApiModelProperty("企业微信号")
    @TableField("we_com")
    private String weCom;

    @ColumnWidth(20)
    @ExcelProperty("钉钉")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_0_20, message = "SysUser.dingDing", groups = {Save.class, Update.class})
    @ApiModelProperty("钉钉号")
    @TableField("ding_ding")
    private String dingDing;

    @ColumnWidth(20)
    @ExcelProperty("微信")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_0_20, message = "SysUser.wechat", groups = {Save.class, Update.class})
    @ApiModelProperty("微信")
    @TableField("wechat")
    private String wechat;

    @ColumnWidth(20)
    @ExcelProperty("QQ号")
    @ApiModelProperty("QQ号")
    @TableField("qq")
    private String qq;

    @ExcelIgnore
    @TableField("sign_photo")
    private String signPhoto;

    @ExcelIgnore
    @ApiModelProperty(value = "头像图片地址", hidden = true)
    @TableField(exist = false)
    private CommonFile sign;

    @ExcelIgnore
    @NotBlank(message = "login.SysUser.password", groups = {Login.class})
    @TableField("password")
    @JsonIgnore
    private String password;
    @ExcelIgnore
    @TableField(exist = false)
    private String currentPassword;

    @ExcelIgnore
    @TableField(exist = false)
//    @JsonIgnore
    private String newPassword;

    @ExcelIgnore
    @ApiModelProperty("0:初始化;1:正常在用;2:锁定;")
    @TableField("status")
    private String status;

    @ExcelIgnore
    @ApiModelProperty("最后登录时间")
    @TableField("login_time")
    private LocalDateTime loginTime;

    @ExcelIgnore
    @ApiModelProperty("最后登录IP")
    @TableField("login_ip")
    private String loginIp;

    @ExcelIgnore
    @ApiModelProperty("Y:已登录;N:未登录")
    @TableField("is_login")
    private String isLogin;

    @ExcelIgnore
    @ApiModelProperty("头像图片地址")
    @TableField("photo_path")
    private String photoPath;

    @ExcelIgnore
    @ApiModelProperty(value = "头像图片地址", hidden = true)
    @TableField(exist = false)
    private CommonFile photo;

    @ExcelIgnore
    @ApiModelProperty("最后更改密码时间")
    @TableField("change_password_time")
    private LocalDateTime changePasswordTime;

    @ExcelIgnore
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    @TableLogic(value = "N", delval = "Y")
    private String deleted;

    @ExcelIgnore
    @ApiModelProperty("卡号(厂内使用)")
    @TableField("card_number")
    private String cardNumber;

    /**
     * @see com.lets.platform.model.uc.enums.SysUserCreateTypeEnum
     */
    @ExcelIgnore
    @ApiModelProperty("创建方式[1系统创建,2非系统创建]")
    @TableField("create_type")
    private String createType;

    @ExcelIgnore
    @TableField(exist = false)
    private String clientType;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有点检工单数量")
    private Integer allSpotOrderNumber;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有点检工单")
    private Set<String> allSpotOrderIds;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有点检协助工单")
    private Set<String> assistSpotOrderIds;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有巡检工单数量")
    private Integer allInspectionOrderNumber;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有巡检工单")
    private Set<String> allInspectionOrderIds;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有巡检协助工单")
    private Set<String> assistInspectionOrderIds;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有保养工单数量")
    private Integer allMaintenanceOrderNumber;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有保养工单")
    private Set<String> allMaintenanceOrderIds;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有保养协助工单")
    private Set<String> assistMaintenanceOrderIds;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有维修工单数量")
    private Integer allRepairOrderNumber;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有维修工单")
    private Set<String> allRepairOrderIds;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有维修协助工单")
    private Set<String> assistRepairOrderIds;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有协助工单数量")
    private Integer allAssistOrderNumber;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所有协助工单")
    private Set<String> allAssistOrderIds;
    @ExcelIgnore
    @ApiModelProperty("忙碌状态")
    @TableField(exist = false)
    private String busyStatus;

    @ApiModelProperty("班组主键")
    @TableField(exist = false)
    private String teamsId;
    @ApiModelProperty("班组名称")
    @TableField(exist = false)
    private String teamsName;

}