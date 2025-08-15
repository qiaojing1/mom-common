package com.lets.platform.model.uc.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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

import java.util.List;

/**
 * <p>
 * 角色信息表
 * </p>
 *
 * @author DING WEI
 * @since 2023-04-12
 */
@Getter
@Setter
@TableName("sys_role")
@ApiModel(value = "SysRole对象", description = "角色信息表")
public class SysRole extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;
    @ExcelIgnore
    @TableField(exist = false)
    private String oldId;
    @ApiModelProperty("父级角色id")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @ApiModelProperty("角色编码")
    @TableField("code")
    @ExcelProperty(value = "角色编码", index = 0)
    private String code;

    @ApiModelProperty("角色名称")
    @TableField("name")
    @ExcelProperty(value = "角色名称", index = 1)
    @Length(min = 1, max = 20, message = "SysRole.name", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("是否组[0:不是分组;1:是分组]")
    @TableField("is_group")
    @ExcelIgnore
    private Integer isGroup;

    @ApiModelProperty("助记码")
    @TableField("mnemonic_code")
    @ExcelProperty(value = "助记码", index = 2)
    @Length(max = 20, message = "SysRole.mnemonicCode", groups = {Save.class, Update.class})
    private String mnemonicCode;

    @ApiModelProperty("父级角色Name")
    @TableField(exist = false)
    @ExcelProperty(value = "分组", index = 3)
    private String parentName;


    @ApiModelProperty("类型[0超级管理员,1系统管理员,2普通角色]")
    @TableField("type")
    @ExcelIgnore
    private String type;

    @ApiModelProperty("状态[0:禁用;1:启用]")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;

    @ApiModelProperty("状态名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @ApiModelProperty("是否为供应商角色0否1是")
    @TableField("is_supplier")
    private Integer isSupplier;

    @ApiModelProperty("备注")
    @TableField("description")
    @ExcelProperty(value = "备注", index = 4)
    @Length(max = 200, message = "SysRole.description", groups = {Save.class, Update.class})
    private String description;

    @TableField(exist = false)
    @ExcelIgnore
    private List<SysRole> children;
}
