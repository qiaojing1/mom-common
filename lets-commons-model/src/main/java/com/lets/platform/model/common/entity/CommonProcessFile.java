package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 工艺文件管理表头
 * </p>
 *
 * @author zhangweiyan
 * @since 2023-11-06
 */
@Getter
@Setter
@TableName("common_process_file")
@ApiModel(value = "CommonProcessFile对象", description = "工艺文件管理表头")
public class CommonProcessFile extends BaseEntity {

    @ApiModelProperty("文档编码")
    @TableField("code")
    private String code;

    @ApiModelProperty("文档名称")
    @TableField("name")
    @NotBlank(message = "CommonProcessFile.name.notNull")
    private String name;

    @ApiModelProperty("适用范围(currency:通用， BOM：BOM，material：物料，		processRouting：工艺路线，moOrder：生产订单)")
    @TableField("scope_define")
    private String scopeDefine;

    @ApiModelProperty("适用范围中文名称")
    @TableField(exist = false)
    private String scopeDefineName;

    @ApiModelProperty("版本")
    @TableField("version")
    private String version;

    @ApiModelProperty("文件类型")
    @TableField("file_type")
    @NotBlank(message = "CommonProcessFile.fileType.notNull")
    private String fileType;

    @TableField(exist = false)
    @ExcelIgnore
    @ApiModelProperty("文件类型名称")
    private String fileTypeName;

    @ApiModelProperty("生效日期")
    @TableField("effective_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime effectiveDate;

    @ApiModelProperty("失效日期")
    @TableField("expiring_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime expiringDate;

    @ApiModelProperty("分组id")
    @TableField("group_id")
    @NotBlank(message = "CommonProcessFile.group.notNull")
    private String groupId;

    @TableField(exist = false)
    @ApiModelProperty("分组名称")
    private String groupName = "全部";

    @ApiModelProperty("编制人")
    @TableField("made_user")
    @NotBlank(message = "CommonProcessFile.group.notNull")
    private String madeUser;

    @ApiModelProperty("编制人名称")
    @TableField(exist = false)
    private String madeUserName;

    @ApiModelProperty("下发部门")
    @TableField("deploy_dept")
    @NotBlank(message = "CommonProcessFile.group.notNull")
    private String deployDept;

    @ApiModelProperty("下发部门名称")
    @TableField(exist = false)
    private String deployDeptName;

    @ApiModelProperty("是否启用 0：未启用；1：已启用")
    @TableField("enable")
    private Integer enable = 1;

    @ApiModelProperty("是否有效, 默认为1，有效")
    @TableField(exist = false)
    private Integer validOrNot;


    @ApiModelProperty("是否有效, 默认为是，有效")
    @TableField(exist = false)
    private String validOrNotName;

    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("描述")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("当前文件下所有附件的名称")
    @TableField(exist = false)
    private String file;

    @ApiModelProperty("数据项关联字段")
    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonProcessFileAssociation> associations;

    @ApiModelProperty(value = "附件", hidden = true)
    @TableField("enclosure_ids")
    @ExcelIgnore
    private String enclosureIds;
    @Size(max = 20, message = "Order.enclosureIds", groups = {Save.class, Update.class})
    @TableField(exist = false)
    private List<String> fileIds;
    @ApiModelProperty("文件列表")
    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonFile> enclosureFileList;

    @TableField(exist = false)
    private String tableName = "common_process_file";

    @ApiModelProperty("关联主键")
    @TableField(exist = false)
    @ExcelIgnore
    private String relationId;
}
