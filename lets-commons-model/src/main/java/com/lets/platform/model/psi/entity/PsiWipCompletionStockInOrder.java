package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 完工入库
 * </p>
 *
 * @author csy
 * @since 2023-10-12
 */
@Getter
@Setter
@TableName("psi_wip_completion_stock_in_order")
@ApiModel(value = "PsiWipCompletionStockInOrder对象", description = "完工入库")
public class PsiWipCompletionStockInOrder extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @ApiModelProperty("单据类别ID")
    @TableField("order_category_id")
    private String orderCategoryId;
    @TableField(exist = false)
    private String orderCategoryCode;
    @ApiModelProperty("单据类别名称")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("业务类型ID")
    @TableField("business_id")
    private String businessId;

    @ApiModelProperty("业务类型名称")
    @TableField("business_name")
    private String businessName;

    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("仓库部门ID")
    @TableField("store_org_id")
    private String storeOrgId;

    @ApiModelProperty("仓库部门名称")
    @TableField("store_org_name")
    private String storeOrgName;

    @ApiModelProperty("库管员ID")
    @TableField("store_user_id")
    private String storeUserId;

    @ApiModelProperty("库管员名称")
    @TableField("store_user_name")
    private String storeUserName;

    @ApiModelProperty("过账日期")
    @TableField("posting_time")
    private LocalDateTime postingTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("过账时间")
    @TableField("real_posting_time")
    private LocalDateTime realPostingTime;

    @ApiModelProperty("过账人")
    @TableField("real_posting_user")
    private String realPostingUser;

    @ApiModelProperty("过账人名称")
    @TableField("real_posting_user_name")
    private String realPostingUserName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField(exist = false)
    private List<String> storeId;
    @TableField(exist = false)
    private List<String> areaId;
    @TableField(exist = false)
    private List<String> positionId;

    @ApiModelProperty("物料明细")
    @TableField(exist = false)
    private List<PsiWipCompletionStockInOrderMaterial> details;

    @TableField(exist = false)
    private List<String> fileIds;

    @TableField("version")
    private Integer version;

    @ApiModelProperty("图号")
    @TableField(exist = false)
    private String drawingNumber;
}
