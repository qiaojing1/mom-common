package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 程序清单工序表
 * </p>
 *
 * @author FZY
 * @since 2024-02-26
 */
@Getter
@Setter
@TableName("mes_dnc_program_list_process")
@ApiModel(value = "MesDncProgramListProcess对象", description = "程序清单工序表")
public class MesDncProgramListProcess extends BaseEntity {

    @ApiModelProperty("程序清单ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("工序组主键")
    @TableField("process_group_id")
    private String processGroupId;

    @ApiModelProperty("工序组名称")
    @TableField("process_group_name")
    private String processGroupName;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("工序编码")
    @TableField("process_code")
    private String processCode;

    @ApiModelProperty("工序名称")
    @TableField("process_name")
    private String processName;

    @ApiModelProperty("步骤,组排序")
    @TableField("process_step")
    private Integer processStep;

    @ApiModelProperty("顺序,组内工序排序")
    @TableField("process_sort")
    private Integer processSort;

    @ApiModelProperty("加工程序ID")
    @TableField(exist = false)
    private String programFileIds;

    @ApiModelProperty("加工程序名称")
    @TableField(exist = false)
    private String programFileNames;

}
