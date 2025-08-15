package com.lets.platform.model.base;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 实体类 通用基类
 *
 * @author fzy
 */
@Data
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    @OrderBy(sort = 1)
    @ExcelIgnore
    private String id;

    @ApiModelProperty("租户id")
    @TableField(value = "tenancy_id", fill = FieldFill.INSERT)
    @ExcelIgnore
    private String tenancyId;

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @OrderBy(sort = 0)
    @ExcelIgnore
    private LocalDateTime createTime;

    @ApiModelProperty("创建人")
    @TableField(value = "create_user", fill = FieldFill.INSERT)
    @ExcelIgnore
    private String createUser;

    @ApiModelProperty("创建人姓名")
    @TableField(value = "create_user_name", fill = FieldFill.INSERT)
    @ExcelIgnore
    private String createUserName;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    @ExcelIgnore
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人")
    @TableField(value = "update_user", fill = FieldFill.INSERT_UPDATE)
    @ExcelIgnore
    private String updateUser;

    @ApiModelProperty("更新人姓名")
    @TableField(value = "update_user_name", fill = FieldFill.INSERT_UPDATE)
    @ExcelIgnore
    private String updateUserName;

    @ApiModelProperty("菜单编码")
    @TableField(exist = false)
    @ExcelIgnore
    private String menuCode;

    @ApiModelProperty("表名[用于单个功能,多个表的自动编码,单表可不传]")
    @TableField(exist = false)
    @ExcelIgnore
    private String tableName;
    @TableField(exist = false)
    @ExcelIgnore
    private String oldId;



    public BaseEntity() {
    }

    public BaseEntity(String id) {
        this.id = id;
    }

    public void toUpdateEntity() {
        this.updateTime = null;
        this.updateUser = null;
        this.updateUserName = null;
    }

    public void toSaveEntity() {
        this.id = null;
        this.createTime = null;
        this.createUser = null;
        this.createUserName = null;
        this.updateTime = null;
        this.updateUser = null;
        this.updateUserName = null;
    }
}
