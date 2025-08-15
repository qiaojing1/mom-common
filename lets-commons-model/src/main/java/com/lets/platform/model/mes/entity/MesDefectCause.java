package com.lets.platform.model.mes.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * <p>
 * 缺陷原因
 * </p>
 *
 * @author csy
 * @since 2023-12-19
 */
@Getter
@Setter
@TableName("mes_defect_cause")
@ApiModel(value = "MesDefectCause对象", description = "缺陷原因")
public class MesDefectCause extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @ApiModelProperty("编码")
    @TableField("code")
    @ExcelProperty("缺陷原因编码")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "[缺陷原因编码] 长度1~20，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    private String code;

    @ApiModelProperty("缺陷原因名称")
    @TableField("name")
    @ExcelProperty("缺陷原因名称")
    @Length(max = 40, min = 1, message = "[缺陷原因名称] 长度1~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("分组主键")
    @TableField("group_id")
    @ExcelIgnore
    private String groupId;
    @TableField(exist = false)
    @ExcelProperty("缺陷原因分组")
    private String groupName;

    @ApiModelProperty("缺陷后果[1可修复 2不可修复 3报废 4可接受]")
    @TableField("consequence")
    @ExcelIgnore
    private String consequence;
    @TableField(exist = false)
    @ExcelProperty("缺陷后果")
    private String consequenceName;

    @ApiModelProperty("启用状态")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @TableField("remark")
    @ApiModelProperty("描述")
    @ExcelProperty("描述")
    private String remark;

    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("适用检验项目")
    private List<MesDefectCauseInspectionItems> inspectionItemsList;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("限定检验项目分组")
    private List<MesDefectCauseInspectionItems> inspectionItemsGroupList;

}
