package com.lets.platform.model.mes.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 生产工单-工艺路线-明细-工序信息-工艺文件-副本
 * @author DING WEI
 * @since 2023-12-05
 */
@Getter
@Setter
@TableName("mes_produce_order_route_process_file")
@ApiModel(value = "MesProduceOrderRouteProcessFile对象", description = "生产工单-工艺路线-明细-工序信息-工艺文件-副本")
public class MesProduceOrderRouteProcessFile extends BaseEntity {

    @ApiModelProperty("生产工单主键")
    @TableField("order_id")
    private String orderId;
    @ApiModelProperty("生产工单明细主键")
    @TableField("detail_id")
    private String detailId;
    @ApiModelProperty("工艺路线主键")
    @TableField("route_id")
    private String routeId;
    @ApiModelProperty("工艺路线明细主键")
    @TableField("route_detail_id")
    private String routeDetailId;

    @ApiModelProperty("工艺路线-工序关联主键")
    @TableField("route_process_id")
    private String routeProcessId;

    @ApiModelProperty("工序主键")
    @TableField("process_id")
    private String processId;

    @ApiModelProperty("工艺文件主键")
    @TableField("process_file_id")
    private String processFileId;

    @ApiModelProperty("工艺文件名称")
    @TableField("process_file_name")
    private String processFileName;

    @ApiModelProperty("工艺文件分组")
    @TableField("process_file_group")
    private String processFileGroup;

    @ApiModelProperty("工艺文件分组名称")
    @TableField("process_file_group_name")
    private String processFileGroupName;

    @ApiModelProperty("工艺文件适用范围")
    @TableField("process_file_scope_define")
    private String processFileScopeDefine;

    @ApiModelProperty("附件主键集合")
    @TableField("enclosure_ids")
    private String enclosureIds;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private List<String> fileIds;

    @ApiModelProperty("附件名称集合")
    @TableField("enclosure_names")
    private String enclosureNames;

    /**
     * @see com.lets.platform.model.common.enums.ProcessFileTypeEnum
     */
    @ApiModelProperty("文件类型 (process:工艺文档, drawing:图纸文档, JobProInsBenchmark:岗位产品检验基准书,ProErrorPreWarning:产品防错和警示,StaOpeInsProRework:产品返工标准作业指导书)")
    @TableField("process_file_type")
    private String processFileType;

    @ApiModelProperty(value = "物料主键", hidden = true)
    @TableField(exist = false)
    private String materialId;
}
