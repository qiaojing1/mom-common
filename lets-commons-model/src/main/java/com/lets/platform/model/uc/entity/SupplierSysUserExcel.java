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
public class SupplierSysUserExcel extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty("系统帐号")
    @TableField("login_id")
    private String loginId;


    @ColumnWidth(20)
    @ExcelProperty("姓名")
    private String name;


    @ColumnWidth(20)
    @ExcelProperty("用户分组")
    private String groupName;


    @ColumnWidth(20)
    @ExcelProperty("供应商")
    private String supplierName;

    @ColumnWidth(20)
    @ExcelProperty("手机号")
    private String mobile;

    @ColumnWidth(20)
    @ExcelProperty("邮箱")
    private String email;

    @ColumnWidth(20)
    @ExcelProperty("禁止登录")
    private String forbidLoginName;


    @ColumnWidth(20)
    @ExcelProperty("供应商角色")
    private String roleName;

    @ColumnWidth(20)
    @ExcelProperty("员工编号")
    private String employeeNumber;


    @ColumnWidth(20)
    @ExcelProperty("入职日期")
    private String entryTimeStr;


    @ColumnWidth(20)
    @ExcelProperty("就业日期")
    private String jobTimeStr;


    @ColumnWidth(20)
    @ExcelProperty("人员状态")
    private String jobStatusName;


    @ColumnWidth(10)
    @ExcelProperty("性别")
    private String sexName;


    @ColumnWidth(10)
    @ExcelProperty("生日")
    private String birthdayStr;


    @ColumnWidth(20)
    @ExcelProperty("办公电话")
    private String officePhone;

    @ColumnWidth(35)
    @ExcelProperty("办公电话扩展分机号")
    private String officePhoneExtNumber;

    @ColumnWidth(20)
    @ExcelProperty("企业微信")
    private String weCom;

    @ColumnWidth(20)
    @ExcelProperty("钉钉")
    private String dingDing;

    @ColumnWidth(20)
    @ExcelProperty("微信")
    private String wechat;

    @ColumnWidth(20)
    @ExcelProperty("QQ号")
    private String qq;


}