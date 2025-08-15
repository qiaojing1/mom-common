package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
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
 * 设备控制器
 * @author DING WEI
 * @since 2023-10-26
 */
@Getter
@Setter
@TableName("common_device_controller")
@ApiModel(value = "CommonDeviceController对象", description = "设备控制器")
public class CommonDeviceControllerEntity extends BaseEntity {

    @ExcelIgnore
    @TableField(exist = false)
    private Integer index;

    @ColumnWidth(40)
    @ExcelProperty("设备控制器名称")
    @Length(min = 1, max = 20, message = "CommonDeviceController.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ColumnWidth(40)
    @ExcelProperty("设备控制器编码")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "CommonDeviceController.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ColumnWidth(40)
    @ExcelProperty("控制器品牌")
    @Length(max = 40, message = "[控制器品牌]非必填，长度 1~40，输入：中文、字母、数字及常用符号", groups = {Save.class, Update.class})
    @ApiModelProperty("控制器品牌")
    @TableField("brand")
    private String brand;
}
