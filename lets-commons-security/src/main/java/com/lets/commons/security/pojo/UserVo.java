package com.lets.commons.security.pojo;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 用户实体
 *
 * @ClassName SysUser
 * @author: DING WEI
 * @create: 2021/04/23 13:50
 * @Version 1.0
 **/
@Data
public class UserVo extends BaseDo {

    @NotBlank(message = "员工姓名不允许为空")
    private String name;

    @NotBlank(message = "员工工号不允许为空")
    private String username;

    @NotBlank(message = "角色不允许为空")
    private String roleName;

    private String roleType;

    @ApiModelProperty("电话号码")
    private String phoneNumber;

    @ApiModelProperty("性别")
    private String sex;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("微信")
    private String wechat;

    @ApiModelProperty("工作状态")
    private String jobState;

    @ApiModelProperty("状态")
    private String status;

    @ApiModelProperty("租户id")
    private String tenancyId;
    @ApiModelProperty("租住名称")
    private String tenancyName;
    private String tenancyCode;
    @ApiModelProperty("登陆时间")
    private Long loginTime;
    @ApiModelProperty("登陆ip")
    private String loginIp;
    private String isLogin;
    private String photoPath;
    //    private CommonFile photoPathFile;
    private String changePasswordTime;
    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("所属部门")
    private String orgId;
    @ApiModelProperty("所属部门名称")
    private String orgName;
    @ApiModelProperty("角色id")
    private String roleId;
    private Collection<String> roles = new ArrayList<>();

    @ApiModelProperty("负责人")
    private String leader;
    @ApiModelProperty("供应商")
    private String supplierId;

    @ApiModelProperty("卡号")
    private String cardNumber;
    private String password;

    @ApiModelProperty("创建方式[1系统创建,2非系统创建]")
    private String createType;
    private Integer count;

}