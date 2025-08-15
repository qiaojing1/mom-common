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

import java.util.List;

/**
 * <p>
 * oa对接记录
 * </p>
 *
 * @author csy
 * @since 2024-11-05
 */
@Getter
@Setter
@TableName("collection_joint_record")
@ApiModel(value = "CollectionJointRecord对象", description = "oa对接记录")
public class CollectionJointRecord extends BaseEntity {

    @ApiModelProperty("流程编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("项目编号")
    @TableField("project_code")
    private String projectCode;

    @ApiModelProperty("收件人")
    @TableField("receiver")
    private String receiver;

    @ApiModelProperty("收件人Id")
    @TableField("receiver_id")
    private String receiverId;

    @TableField("send_user")
    private String sendUser;
    @TableField("send_user_name")
    private String sendUserName;

    @ApiModelProperty("收件组织")
    @TableField("receive_org")
    private String receiveOrg;

    @ApiModelProperty("收件组织Id")
    @TableField("receiver_org_id")
    private String receiverOrgId;

    @ApiModelProperty("抄送人Id")
    @TableField("cc_to")
    private String ccTo;

    @ApiModelProperty("抄送人Id")
    @TableField("cc_to_id")
    private String ccToId;

    @ApiModelProperty("抄送组织Id")
    @TableField("cc_org")
    private String ccOrg;

    @ApiModelProperty("抄送组织Id")
    @TableField("cc_org_id")
    private String ccOrgId;

    @ApiModelProperty("清单号")
    @TableField("list_no")
    private String listNo;

    @ApiModelProperty("阀门类型")
    @TableField("valve_type")
    private String valveType;

    @TableField(exist = false)
    private List<CollectionTestSynopsis> synopses;
}
