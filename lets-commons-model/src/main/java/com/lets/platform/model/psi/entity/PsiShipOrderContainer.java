package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 发运单-箱条码明细
 * </p>
 *
 * @author csy
 * @since 2024-07-05
 */
@Getter
@Setter
@TableName("psi_ship_order_container")
@ApiModel(value = "PsiShipOrderContainer对象", description = "发运单-箱条码明细")
public class PsiShipOrderContainer extends BaseEntity {

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("箱条码")
    @TableField("container_barcode")
    private String containerBarcode;

    @ApiModelProperty("容器")
    @TableField("container_code")
    private String containerCode;

    @ApiModelProperty("容器")
    @TableField("container_name")
    private String containerName;

    @ApiModelProperty("容器")
    @TableField("container_model")
    private String containerModel;

    @ApiModelProperty("装箱数量")
    @TableField("quantity")
    private BigDecimal quantity;

    @ApiModelProperty("装箱时间")
    @TableField("package_date")
    private LocalDateTime packageDate;

    @ApiModelProperty("装箱人员")
    @TableField("package_user")
    private String packageUser;

    @ApiModelProperty("装箱人员")
    @TableField("package_user_name")
    private String packageUserName;

    @ApiModelProperty("容器主键")
    @TableField("container_id")
    private String containerId;

}
