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

/**
 * <p>
 * 设备生产商表
 * </p>
 *
 * @author FZY
 * @since 2023-10-26
 */
@Getter
@Setter
@TableName("common_device_manufacturer")
@ApiModel(value = "CommonDeviceManufacturer对象", description = "设备生产商表")
public class CommonDeviceManufacturer extends BaseEntity {

    @ApiModelProperty("设备生产商编码")
    @ExcelProperty("设备生产商编码")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "[设备生产商编码]长度 1~20，支持字母、数字和常用符号", groups = {Save.class, Update.class})
    @TableField("code")
    private String code;

    @ApiModelProperty("设备生产商名称")
    @TableField("name")
    @ExcelProperty("设备生产商名称")
    @Length(min = 1, max = 20, message = "[设备生产商名称]长度 1~20，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;

    @ApiModelProperty("是否启用名称")
    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;
}
