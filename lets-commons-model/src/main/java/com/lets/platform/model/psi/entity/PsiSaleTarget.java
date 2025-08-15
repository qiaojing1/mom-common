package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 销售目标管理
 * @author DING WEI
 * @since 2024-05-14
 */
@Getter
@Setter
@TableName("psi_sale_target")
@ApiModel(value = "PsiSaleTarget对象", description = "销售目标管理")
public class PsiSaleTarget extends BaseEntity {

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private Integer index;
    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String sheetName;

    @NotNull(message = "SaleTarget.year", groups = {Save.class, Update.class})
    @ApiModelProperty("年度")
    @TableField("year")
    private Integer year;

    @NotNull(message = "SaleTarget.companyYearAmount", groups = {Save.class, Update.class})
    @ApiModelProperty("企业年度目标")
    @TableField("company_year_amount")
    private BigDecimal companyYearAmount;
    @ApiModelProperty("未分配目标金额(部门)")
    @TableField("dept_not_distribute_amount")
    private BigDecimal deptNotDistributeAmount;
    @ApiModelProperty("已分配目标金额(部门)")
    @TableField("dept_distribute_amount")
    private BigDecimal deptDistributeAmount;
    @ApiModelProperty("未分配目标金额(产品)")
    @TableField("product_not_distribute_amount")
    private BigDecimal productNotDistributeAmount;
    @ApiModelProperty("已分配目标金额(产品)")
    @TableField("product_distribute_amount")
    private BigDecimal productDistributeAmount;

    @ApiModelProperty("目标金额")
    @TableField(exist = false)
    private BigDecimal userTargetAmount;
    @ApiModelProperty("未分配目标金额(人员)")
    @TableField(exist = false)
    private BigDecimal userNotDistributeAmount;
    @ApiModelProperty("已分配目标金额(人员)")
    @TableField(exist = false)
    private BigDecimal userDistributeAmount;

    /**
     * @see com.lets.platform.model.psi.enums.UnitMultiplierEnum
     */
    @ApiModelProperty("企业目标金额单位倍率")
    @TableField("company_unit")
    private String companyUnit;
    @TableField(exist = false)
    private String companyUnitName;
    @ApiModelProperty("部门目标金额单位倍率")
    @TableField("dept_unit")
    private String deptUnit;
    @TableField(exist = false)
    private String deptUnitName;
    @ApiModelProperty("个人目标金额单位倍率")
    @TableField("user_unit")
    private String userUnit;
    @TableField(exist = false)
    private String userUnitName;
    @ApiModelProperty("产品目标金额单位倍率")
    @TableField("product_unit")
    private String productUnit;
    @TableField(exist = false)
    private String productUnitName;

    @Length(max = 200, message = "Order.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;
    @ApiModelProperty("审核人员")
    @TableField("audit_user")
    private String auditUser;
    @ApiModelProperty("审核人员名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @ApiModelProperty("是否忽略已经填写的")
    @TableField(exist = false)
    private Boolean ignore;

    @ApiModelProperty("部门月度目标")
    @TableField(exist = false)
    private List<PsiSaleTargetDetail> deptList;
    @ApiModelProperty("员工月度目标")
    @TableField(exist = false)
    private List<PsiSaleTargetDetail> userList;
    @ApiModelProperty("产品年度目标")
    @TableField(exist = false)
    private List<PsiSaleTargetDetail> productList;
}
