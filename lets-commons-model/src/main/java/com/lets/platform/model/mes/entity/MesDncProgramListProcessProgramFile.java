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
 * 程序清单工序绑定程序档案表
 * </p>
 *
 * @author FZY
 * @since 2024-02-26
 */
@Getter
@Setter
@TableName("mes_dnc_program_list_process_program_file")
@ApiModel(value = "MesDncProgramListProcessProgramFile对象", description = "程序清单工序绑定程序档案表")
public class MesDncProgramListProcessProgramFile extends BaseEntity {

    @ApiModelProperty("程序清单ID")
    @TableField("program_list_id")
    private String programListId;

    @ApiModelProperty("程序清单工序ID")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("程序档案ID")
    @TableField("program_file_id")
    private String programFileId;

    @ApiModelProperty("程序档案名称")
    @TableField("program_file_name")
    private String programFileName;
}
