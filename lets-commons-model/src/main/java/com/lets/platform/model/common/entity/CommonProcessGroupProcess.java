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
 * 工序组维护-工序
 * </p>
 *
 * @author csy
 * @since 2023-11-08
 */
@Getter
@Setter
@TableName("common_process_group_process")
@ApiModel(value = "CommonProcessGroupProcess对象", description = "工序组维护-工序")
public class CommonProcessGroupProcess extends BaseEntity {

    @ApiModelProperty("工序组id")
    @TableField("process_group_id")
    @ExcelIgnore
    private String processGroupId;

    @ApiModelProperty("工序id")
    @TableField("process_id")
    @ExcelIgnore
    private String processId;

    @TableField(exist = false)
    @ExcelProperty("工序组编码")
    private String processGroupCode;

    @TableField(exist = false)
    @ExcelProperty("工序编码")
    private String processCode;

    @ExcelIgnore
    @TableField(exist = false)
    private String processGroupName;

    @ExcelIgnore
    @TableField(exist = false)
    private Integer rowIndex;


}
