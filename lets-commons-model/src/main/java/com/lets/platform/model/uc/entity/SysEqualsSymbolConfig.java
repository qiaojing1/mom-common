package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * 等价符号配置
 * @author DING WEI
 * @since 2025-04-25
 */
@Getter
@Setter
@TableName("sys_equals_symbol_config")
@ApiModel(value = "SysEqualsSymbolConfig对象", description = "等价符号配置")
public class SysEqualsSymbolConfig extends BaseEntity {

    @NotBlank(message = "[等价符号含义]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("等价符号含义")
    @TableField("name")
    private String name;

    @NotBlank(message = "[等价符号]不能为空", groups = {Save.class, Update.class})
    @ApiModelProperty("等价符号内容")
    @TableField("symbol")
    private String symbol;
}
