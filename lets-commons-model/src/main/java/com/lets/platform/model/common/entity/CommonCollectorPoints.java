package com.lets.platform.model.common.entity;

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
 * 采集数据项绑定表
 * </p>
 *
 * @author csy
 * @since 2023-10-30
 */
@Getter
@Setter
@TableName("common_collector_points")
@ApiModel(value = "CommonCollectorPoints对象", description = "采集数据项绑定表")
public class CommonCollectorPoints extends BaseEntity {

    @ApiModelProperty("采集器id")
    @TableField("collector_id")
    private String collectorId;

    @ApiModelProperty("数据项id")
    @TableField("point_id")
    private String pointId;


    @TableField(exist = false)
    private String sourceField;

    @TableField(exist = false)
    private String collectorCode;

    @TableField(exist = false)
    private String gatewayId;
}
