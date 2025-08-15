package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 生产工单-执行记录(工位机)关联数据项
 * </p>
 *
 * @author qiaojing
 * @since 2025-03-28
 */
@Getter
@Setter
@TableName("psi_produce_order_pursuance_record_keys")
@ApiModel(value = "PsiProduceOrderPursuanceRecordKeys对象", description = "生产工单-执行记录(工位机)关联数据项")
public class PsiProduceOrderPursuanceRecordKeys extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("记录id")
    @TableField("record_id")
    private String recordId;

    @ApiModelProperty("设备主键")
    @TableField("device_id")
    private String deviceId;

    @ApiModelProperty("开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty("结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty("关联数据项值")
    @TableField("item_keys")
    private String itemKeys;
    @ApiModelProperty("关联数据项值-带NG")
    @TableField("item_keys_1")
    private String itemKeys1;

    @ApiModelProperty("创建人")
    @TableField(exist = false)
    @ExcelIgnore
    private String createUser;

    @ApiModelProperty("创建人姓名")
    @TableField(exist = false)
    @ExcelIgnore
    private String createUserName;

    @ApiModelProperty("更新时间")
    @TableField(exist = false)
    @ExcelIgnore
    private LocalDateTime updateTime;

    @ApiModelProperty("更新人")
    @TableField(exist = false)
    @ExcelIgnore
    private String updateUser;

    @ApiModelProperty("更新人姓名")
    @TableField(exist = false)
    @ExcelIgnore
    private String updateUserName;

}
