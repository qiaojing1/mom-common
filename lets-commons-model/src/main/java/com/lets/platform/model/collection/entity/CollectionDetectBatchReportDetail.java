package com.lets.platform.model.collection.entity;

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
 * 批量试验报告-修改过的数据
 * </p>
 *
 * @author csy
 * @since 2025-06-05
 */
@Getter
@Setter
@TableName("collection_detect_batch_report_detail")
@ApiModel(value = "CollectionDetectBatchReportDetail对象", description = "批量试验报告-修改过的数据")
public class CollectionDetectBatchReportDetail extends BaseEntity {

    @ApiModelProperty("批次报告主键")
    @TableField("parent_id")
    private String parentId;

    @ApiModelProperty("产品编号")
    @TableField("product_code")
    private String productCode;

    @ApiModelProperty("所有项目名称")
    @TableField("allProjectHeader")
    private String allProjectHeader;

    @ApiModelProperty("所属产品编号每个项目对应的标准值")
    @TableField("standards")
    private String standards;

    @ApiModelProperty("所属产品编号每个项目对应的实测值")
    @TableField("result")
    private String result;
}
