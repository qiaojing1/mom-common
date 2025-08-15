package com.lets.platform.model.uc.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.IsOrNotEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.util.List;

/**
 * <p>
 * 岗位表
 * </p>
 *
 * @author DING WEI
 * @since 2023-06-20
 */
@Getter
@Setter
@TableName("sys_post")
@ApiModel(value = "SysPost对象", description = "岗位表")
public class SysPost extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value = "岗位编码")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "SysPost.code", groups = {Save.class, Update.class})
    @ApiModelProperty("岗位编码")
    @TableField("code")
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value = "岗位名称")
    @Length(min = 1, max = 20, message = "SysPost.name",  groups = {Save.class, Update.class})
    @ApiModelProperty("岗位名称")
    @TableField("name")
    private String name;

    @ExcelIgnore
    @ApiModelProperty("上级岗位")
    @TableField("parent_id")
    private String parentId;
    @ColumnWidth(20)
    @ExcelProperty(value = "上级岗位")
    @TableField(exist = false)
    private String parentName;

    /**
     * @see IsOrNotEnum
     */
    @ExcelIgnore
    @ValidatedEnum(enumClass = IsOrNotEnum.class, required = true, message = "ENABLE", groups = {Save.class, Update.class})
    @ApiModelProperty("启用状态[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ColumnWidth(20)
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ColumnWidth(20)
    @ExcelProperty(value = "岗位说明")
    @Length(max = 200, message = "SysPost.description", groups = {Save.class, Update.class})
    @ApiModelProperty("说明")
    @TableField("description")
    private String description;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ExcelIgnore
    @ApiModelProperty(value = "子岗位", hidden = true)
    @TableField(exist = false)
    private List<SysPost> children;
}
