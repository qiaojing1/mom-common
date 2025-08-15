package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * 工序组维护
 * </p>
 *
 * @author csy
 * @since 2023-11-08
 */
@Getter
@Setter
@TableName("common_process_group")
@ApiModel(value = "CommonProcessGroup对象", description = "工序组维护")
public class CommonProcessGroup extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer rowIndex;

    @ApiModelProperty("编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_40, message = "[工序组编码] 长度1~40、支持英文、数字和常用符号", groups = {Save.class, Update.class})
    @ExcelProperty("工序组编码")
    private String code;

    @ApiModelProperty("名称")
    @TableField("name")
    @Length(min = 1, max = 40, message = "[工序组名称] 长度1~40、支持中文、英文、数字和常用符号", groups = {Save.class, Update.class})
    @ExcelProperty("工序组名称")
    private String name;

    @ApiModelProperty("状态 0:禁用 1:启用")
    @TableField("enable")
    @ExcelIgnore
    private String enable;
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @ApiModelProperty("备注")
    @TableField("remark")
    @ExcelProperty("备注")
    private String remark;

    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonProcess> details;

}
