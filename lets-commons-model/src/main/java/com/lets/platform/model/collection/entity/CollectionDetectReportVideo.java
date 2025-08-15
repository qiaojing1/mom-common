/*
 * csy
 */

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
 * 单件试验报告-视频
 * </p>
 *
 * @author csy
 * @since 2025-02-13
 */
@Getter
@Setter
@TableName("collection_detect_report_video")
@ApiModel(value = "CollectionDetectReportVideo对象", description = "单件试验报告-视频")
public class CollectionDetectReportVideo {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @ApiModelProperty("报告编号")
    @TableField("detail_id")
    private String detailId;

    @ApiModelProperty("视频地址")
    @TableField("video")
    private String video;

    @ApiModelProperty("是否是合并的视频")
    @TableField("is_merge")
    private String isMerge;

    @TableField(exist = false)
    private String view;

    @TableField(exist = false)
    private String reportCode;

    @TableField(exist = false)
    private String productCode;

    @TableField(exist = false)
    private String projectName;

    @TableField(exist = false)
    private String name;

    public String getChannel() {
        String[] split = video.split(".mp4")[0].split("_");
        return split[split.length - 1];
    }
}
