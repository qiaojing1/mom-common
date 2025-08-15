package com.lets.platform.model.base;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 实体类 通用基类
 *
 * @author fzy
 */
@Getter
@Setter
public class BaseProcessEntity<T> extends BaseEntity {

    @ApiModelProperty("启用工作流")
    @TableField(exist = false)
    @ExcelIgnore
    private Boolean flowable;

    @ApiModelProperty("强制执行")
    @TableField(exist = false)
    @ExcelIgnore
    private String force;

    @ApiModelProperty("单据信息")
    @TableField(exist = false)
    @ExcelIgnore
    private T data;

    @ApiModelProperty("入参来源")
    @TableField(exist = false)
    private String from;
}
