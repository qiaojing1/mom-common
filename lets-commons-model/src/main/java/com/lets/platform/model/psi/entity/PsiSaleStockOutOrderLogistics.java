package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import java.math.BigDecimal;
import java.util.List;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 销售出库-物流信息
 * </p>
 *
 * @author csy
 * @since 2025-06-06
 */
@Getter
@Setter
@TableName("psi_sale_stock_out_order_logistics")
@ApiModel(value = "PsiSaleStockOutOrderLogistics对象", description = "销售出库-物流信息")
public class PsiSaleStockOutOrderLogistics extends BaseEntity {

    @ApiModelProperty("单据主键")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty("物流公司Id")
    @TableField("logistics_id")
    private String logisticsId;

    @ApiModelProperty("物流公司名称")
    @TableField("logistics_name")
    private String logisticsName;

    @ApiModelProperty("物流公司代号")
    @TableField("logistics_company_code")
    private String logisticsCompanyCode;

    @ApiModelProperty("物流单号")
    @TableField("logistics_code")
    private String logisticsCode;

    @ApiModelProperty("发货人")
    @TableField("ship_user")
    private String shipUser;

    @ApiModelProperty("发货人")
    @TableField("ship_user_name")
    private String shipUserName;

    @ApiModelProperty("发货人联系方式")
    @TableField("ship_user_phone")
    private String shipUserPhone;

    @ApiModelProperty("发货人联系方式")
    @TableField("car_info")
    private String carInfo;

    @ApiModelProperty("货物重量")
    @TableField("weight")
    private BigDecimal weight;

    @TableField("file_ids")
    private String fileIds;

    @TableField(exist = false)
    private String fileName;

    @TableField(exist = false)
    private List<CommonFile> pics;
}
