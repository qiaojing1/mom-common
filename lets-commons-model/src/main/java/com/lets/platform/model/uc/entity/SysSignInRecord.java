package com.lets.platform.model.uc.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 签到记录
 * @author DING WEI
 * @since 2025-06-24
 */
@Getter
@Setter
@TableName("sys_sign_in_record")
@ApiModel(value = "SysSignInRecord对象", description = "签到记录")
public class SysSignInRecord extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("部门主键")
    @TableField("sign_in_org_id")
    private String signInOrgId;
    @ApiModelProperty("部门名称")
    @TableField("sign_in_org_name")
    private String signInOrgName;

    @ApiModelProperty("姓名主键")
    @TableField("sign_in_user_id")
    private String signInUserId;
    @ApiModelProperty("姓名名称")
    @TableField("sign_in_user_name")
    private String signInUserName;

    @ApiModelProperty("岗位主键")
    @TableField("sign_in_post_id")
    private String signInPostId;
    @ApiModelProperty("岗位名称")
    @TableField("sign_in_post_name")
    private String signInPostName;

    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;
    @ApiModelProperty("单据类别编码")
    @TableField("order_category_code")
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型")
    @TableField("business_id")
    private String businessId;
    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("签到时间")
    @TableField("sign_in_time")
    private LocalDateTime signInTime;

    /**
     * @see com.lets.platform.model.uc.enums.SignInObjectTypeEnum
     */
    @ApiModelProperty("对象类型[1:经销商,2:客户]")
    @TableField("object_type")
    private String objectType;
    @TableField(exist = false)
    private String objectTypeName;

    /**
     * @see com.lets.platform.model.uc.enums.SignInTaskTypeEnum
     */
    @ApiModelProperty("任务类型[1:检验]")
    @TableField("task_type")
    private String taskType;
    @TableField(exist = false)
    private String taskTypeName;

    @ApiModelProperty("对象主键")
    @TableField("object_id")
    private String objectId;
    @ApiModelProperty("对象名称")
    @TableField("object_name")
    private String objectName;

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;
    @ApiModelProperty("源单编号")
    @TableField("source_order_code")
    private String sourceOrderCode;
    @ApiModelProperty("源单明细主键")
    @TableField("source_detail_id")
    private String sourceDetailId;

    @ApiModelProperty("关闭状态[0:关闭;1:正常]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @Length(max = 200, message = "备注长度不能超过200")
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("地址")
    @TableField("address")
    private String address;

    @ApiModelProperty("图片")
    @TableField("image_ids")
    private String imageIds;
    @TableField(exist = false)
    private List<CommonFile> imageList;
}
