package com.lets.platform.model.common.entity;

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
 * <p>
 * 工艺路线-明细-工序信息-工艺文件
 * </p>
 *
 * @author DING WEI
 * @since 2023-11-15
 */
@Getter
@Setter
@TableName("common_route_process_file")
@ApiModel(value = "CommonRouteProcessFile对象", description = "工艺路线-明细-工序信息-工艺文件")
public class CommonRouteProcessFile extends BaseEntity {

    @ApiModelProperty("工艺路线主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("工艺路线-工序关联主键")
    @TableField("route_process_id")
    private String routeProcessId;
    @TableField("process_id")
    private String processId;

    @NotBlank(message = "CommonRouteProcessFile.processFileId", groups = {Save.class, Update.class})
    @ApiModelProperty("工艺文件主键")
    @TableField("process_file_id")
    private String processFileId;
    @TableField("process_file_name")
    private String processFileName;

    @ApiModelProperty("工艺文件分组")
    @TableField("process_file_group")
    private String processFileGroup;
    @TableField("process_file_group_name")
    private String processFileGroupName;

    /**
     * @see com.lets.platform.model.common.enums.ScopeOfApplicationEnum
     */
    @ApiModelProperty("工艺文件适用范围")
    @TableField("process_file_scope_define")
    private String processFileScopeDefine;
    @TableField(exist = false)
    private String processFileScopeDefineName;

    @NotBlank(message = "CommonRouteProcessFile.processFile", groups = {Save.class, Update.class})
    @ApiModelProperty("附件集合")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @TableField("enclosure_names")
    private String enclosureNames;

    /**
     * @see com.lets.platform.model.common.enums.ProcessFileTypeEnum
     */
    @ApiModelProperty("文件类型 (process:工艺文档, drawing:图纸文档, JobProInsBenchmark:岗位产品检验基准书,ProErrorPreWarning:产品防错和警示,StaOpeInsProRework:产品返工标准作业指导书)")
    @TableField("process_file_type")
    private String processFileType;

    @TableField(exist = false)
    private Integer processStep;
    @TableField(exist = false)
    private Integer processSort;
}
