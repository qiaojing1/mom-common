package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 工序维护-指导作业
 * </p>
 *
 * @author csy
 * @since 2023-11-06
 */
@Getter
@Setter
@TableName("common_process_guidance")
@ApiModel(value = "CommonProcessGuidance对象", description = "工序维护-指导作业")
public class CommonProcessGuidance extends BaseEntity {

    @ApiModelProperty("工序id")
    @TableField("process_id")
    @ExcelIgnore
    private String processId;

    @ApiModelProperty("工序文档id")
    @TableField("process_file_id")
    @ExcelIgnore
    private String processFileId;


    @ExcelProperty("工序编码")
    @TableField(exist = false)
    private String processCode;

    @ExcelProperty("工艺文件编码")
    @TableField(exist = false)
    private String fileCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String processName;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;
}
