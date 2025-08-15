package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 供应商管理
 * </p>
 *
 * @author csy
 * @since 2023-07-26
 */
@Getter
@Setter
@TableName("psi_supplier")
@ApiModel(value = "PsiSupplier对象", description = "供应商管理")
public class PsiSupplier extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;
    @TableField(exist = false)
    @ExcelIgnore
    private String sheetName;

    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelProperty(value = "供应商编码", index = 0)
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "PsiSupplier.code", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @Length(min = 1, max = 100, message = "PsiSupplier.name", groups = {Save.class, Update.class})
    @ExcelProperty(value = "供应商名称", index = 1)
    private String name;

    @ApiModelProperty("简称")
    @TableField("simple_name")
    @Length(min = 0, max = 20, message = "PsiSupplier.simpleName", groups = {Save.class, Update.class})
    @ExcelProperty(value = "供应商简称", index = 2)
    private String simpleName;

    @ApiModelProperty("分管部门")
    @TableField("manage_org_id")
    @ExcelIgnore
    private String manageOrgId;
    @TableField(exist = false)
    @ExcelIgnore
    private String manageOrgCode;
    @TableField(exist = false)
    @ExcelProperty(value = "分管部门", index = 6)
    private String manageOrgName;

    @ApiModelProperty("分管人员")
    @TableField("manage_user_id")
    @ExcelIgnore
    private String manageUserId;
    @TableField(exist = false)
    @ExcelIgnore
    private String manageUserName;
    @TableField(exist = false)
    @ExcelProperty(value = "分管人员", index = 7)
    private String manageUserLoginId;

    @ApiModelProperty("资质等级")
    @TableField("grade")
    @ExcelIgnore
    private String grade;
    @ExcelProperty(value = "资质等级", index = 5)
    @TableField(exist = false)
    private String gradeName;

    @ApiModelProperty("供应商分组")
    @TableField("group_id")
    @ExcelIgnore
    private String groupId;
    @ExcelProperty(value = "供应商分组", index = 3)
    @TableField(exist = false)
    private String groupName;

    @ApiModelProperty("企业性质")
    @TableField("enterprise_nature")
    @ExcelProperty(value = "企业性质", index = 8)
    @Length(min = 0, max = 20, message = "PsiSupplier.enterpriseNature", groups = {Save.class, Update.class})
    private String enterpriseNature;

    @ApiModelProperty("默认付款条件")
    @TableField("payment_condition_id")
    @ExcelIgnore
    private String paymentConditionId;
    @ApiModelProperty("默认付款条件")
    @TableField("payment_condition_name")
    @ExcelProperty(value = "默认付款条件", index = 9)
    private String paymentConditionName;


    @ApiModelProperty("合作类型")
    @TableField("cooperation_type")
    @ExcelIgnore
    private String cooperationType;
    @TableField(exist = false)
    @ExcelProperty(value = "合作类型", index = 4)
    private String cooperationTypeName;

    @ExcelIgnore
    @ApiModelProperty("单据状态[0创建,1暂存,2审核中,3已审核]")
    @TableField("status")
    private String status;
    @ExcelIgnore
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("法人代表")
    @TableField("legal_person")
    @ExcelIgnore
    @Pattern(regexp = GlobalConstant.CHINESE_LETTER_NUMBER_UNDERLINE_0_20, message = "PsiSupplier.legalPerson", groups = {Save.class, Update.class})
    private String legalPerson;

    @ApiModelProperty("开户银行")
    @TableField("bank_of_deposit")
    @ExcelIgnore
    @Length(max = 50, message = "PsiCustom.bankOfDeposit", groups = {Save.class, Update.class})
    private String bankOfDeposit;

    @ApiModelProperty("账号")
    @TableField("bank_account")
    @ExcelIgnore
    @Pattern(regexp = GlobalConstant.NUMBER_0_30, message = "PsiSupplier.account", groups = {Save.class, Update.class})
    private String bankAccount;

    @ApiModelProperty("纳税号")
    @TableField("tax_id")
    @ExcelIgnore
    @Length(max = 20, message = "PsiSupplier.taxId", groups = {Save.class, Update.class})
    private String taxId;

    @ApiModelProperty("供应商电话")
    @TableField("supplier_phone")
    @ExcelIgnore
    @Pattern(regexp = GlobalConstant.NUMBER_DASH_BRACKET_0_20, message = "PsiSupplier.supplierPhone", groups = {Save.class, Update.class})
    private String supplierPhone;

    @ApiModelProperty("供应商地址")
    @TableField("address")
    @ExcelIgnore
    @Length(max = 50, message = "PsiSupplier.address", groups = {Save.class, Update.class})
    private String address;

    @ApiModelProperty("经营范围")
    @TableField("scope_of_business")
    @ExcelIgnore
    @Length(max = 200, message = "PsiSupplier.scopeOfBusiness", groups = {Save.class, Update.class})
    private String scopeOfBusiness;

    @ApiModelProperty("分组描述")
    @TableField("remark")
    @ExcelIgnore
    @Pattern(regexp = GlobalConstant.CHINESE_LETTER_NUMBER_UNDERLINE_0_40, message = "PsiSupplier.remark", groups = {Save.class, Update.class})
    private String remark;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    @ExcelIgnore
    private String deleted;
    @TableField("audit_user")
    @ExcelIgnore
    private String auditUser;
    @TableField("audit_user_name")
    @ExcelIgnore
    private String auditUserName;
    @ExcelIgnore
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @TableField("is_group")
    @ExcelIgnore
    private Integer isGroup;
    /**
     * @see com.lets.platform.model.psi.enums.SupplierTypeEnum
     */
    @TableField("supplier_type")
    @ExcelIgnore
    private String supplierType;
    @ExcelProperty(value = "供应商类型", index = 10)
    @TableField(exist = false)
    private String supplierTypeName;

    @ApiModelProperty("是否为协同供应商 1是 0否")
    @TableField("is_collaboration")
    @ExcelIgnore
    private String isCollaboration;
    @ExcelProperty(value = "启用供应商协同", index = 11)
    @TableField(exist = false)
    private String isCollaborationName;

    @ApiModelProperty("供应商协同有效期")
    @TableField("coll_expiration")
    @ExcelIgnore
    private LocalDate collExpiration;
    @TableField(exist = false)
    @ExcelProperty(value = "有效期", index = 12)
    private String collExpirationStr;


    /**
     * 采购询价单明细行id
     */
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty(hidden = true)
    private String inquirySupplierId;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiSupplier> children;
    @ExcelIgnore
    @TableField(exist = false)
    private String contactPerson;
    @ExcelIgnore
    @TableField(exist = false)
    private String contactWay;
    @Valid
    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiSupplierQualification> qualifications;
    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiSupplierFile> files;

    @ExcelIgnore
    @TableField(exist = false)
    private List<String> idList;
    @Valid
    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiSupplierContact> contactList;
}
