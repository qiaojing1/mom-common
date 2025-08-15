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
 * 远程监造-扫码记录
 * </p>
 *
 * @author csy
 * @since 2024-10-30
 */
@Getter
@Setter
@TableName("collection_remote_supervision_record")
@ApiModel(value = "CollectionRemoteSupervisionRecord对象", description = "远程监造-扫码记录")
public class CollectionRemoteSupervisionRecord extends BaseEntity {

    @ApiModelProperty("码的id")
    @TableField("qr_id")
    private String qrId;

    @ApiModelProperty("手机号")
    @TableField("phone_number")
    private String phoneNumber;
}
