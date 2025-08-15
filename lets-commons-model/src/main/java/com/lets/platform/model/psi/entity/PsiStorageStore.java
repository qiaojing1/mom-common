package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.YesOrNo;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.psi.enums.StoreTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Map;

/**
 * 仓库管理
 *
 * @author DINGWEI
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_storage_store")
@ApiModel(value = "PsiStorageStore对象", description = "仓库管理")
public class PsiStorageStore extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value = "仓库编码", index = 0)
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "PsiStorageStore.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value = "仓库名称", index = 1)
    @Length(max = 20, message = "PsiStorageStore.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ExcelIgnore
    @ValidatedEnum(enumClass = StoreTypeEnum.class, required = true, message = "PsiStorageStore.type", groups = {Save.class, Update.class})
    @ApiModelProperty("仓库类型[1普通仓库 2寄售仓库 3线边仓库 4寄售仓库]")
    @TableField("type")
    private String type;
    @ColumnWidth(20)
    @ExcelProperty(value = "仓库类型", index = 2)
    @TableField(exist = false)
    private String typeName;

    @ExcelIgnore
    @ApiModelProperty("仓库负责人id（仓储部门人员）")
    @TableField("person_in_charge_id")
    private String personInChargeId;
    @ExcelProperty(value = "仓库负责人", index = 3)
    @ColumnWidth(20)
    @ApiModelProperty("仓库负责人账号")
    @TableField(exist = false)
    private String personInChargeLoginId;
    @ExcelIgnore
    @ApiModelProperty("仓库负责人名称（仓储部门人员）")
    @TableField("person_in_charge_name")
    private String personInChargeName;

    @ExcelIgnore
    @TableField("custom_id")
    private String customId;
    @ColumnWidth(20)
    @ExcelProperty(value = "客户名称", index = 4)
    @TableField(exist = false)
    private String customName;

    @ApiModelProperty("关联工序")
    @ExcelIgnore
    @TableField(exist = false)
    private String processId;
    @ExcelIgnore
    @TableField(exist = false)
    private String processName;

    @ExcelIgnore
    @ApiModelProperty("关联生产单元")
    @TableField("factory_mode_id")
    private String factoryModeId;
    @ExcelIgnore
    @TableField("factory_mode_name")
    private String factoryModeName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiStorageStore.enableArea", groups = {Save.class, Update.class})
    @ApiModelProperty("是否开启库区管理[NY]")
    @TableField("enable_area")
    private String enableArea;
    @ColumnWidth(20)
    @ExcelProperty(value = "库区管理", index = 5)
    @TableField(exist = false)
    private String enableAreaName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiStorageStore.isCost", groups = {Save.class, Update.class})
    @ApiModelProperty("是否成本库[NY]")
    @TableField("is_cost")
    private String isCost;
    @ColumnWidth(30)
    @ExcelProperty(value = "成本库", index = 6)
    @TableField(exist = false)
    private String isCostName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiStorageStore.isBrainPower", groups = {Save.class, Update.class})
    @ApiModelProperty("是否智能库[NY]")
    @TableField("is_brain_power")
    private String isBrainPower;
    @ColumnWidth(30)
    @ExcelProperty(value = "智能仓库", index = 7)
    @TableField(exist = false)
    private String isBrainPowerName;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, message = "PsiStorageStore.isJoinMrp", groups = {Save.class, Update.class})
    @ApiModelProperty("是否参与MRP[NY]")
    @TableField("is_join_mrp")
    private String isJoinMrp;
    @ExcelIgnore
    @TableField(exist = false)
    private String isJoinMrpName;

    @ExcelIgnore
    @ApiModelProperty("允许发货YN")
    @TableField("allow_shipment")
    private String allowShipment;

    @ExcelProperty(value = "是否允许发货",index = 8)
    @ColumnWidth(20)
    @TableField(exist = false)
    private String allowShipmentName;

    @ColumnWidth(20)
    @ExcelProperty(value = "备注", index = 9)
    @Length(max = 200, message = "PsiStorageStore.remark", groups = {Save.class, Update.class})
    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ExcelIgnore
    @ApiModelProperty("是否启用[0停用1启用]")
    @TableField("enable")
    private Integer enable;
    @ExcelIgnore
    @TableField(exist = false)
    private String enableName;

    @ExcelIgnore
    @ApiModelProperty("是否删除[N否Y是]")
    @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @ExcelIgnore
    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    private String supplierId;
    @ColumnWidth(30)
    @ExcelProperty(value = "供应商名称", index = 10)
    @TableField("supplier_name")
    private String supplierName;

    @ExcelIgnore
    @TableField(exist = false)
    private PsiStorageArea area;
    @ExcelIgnore
    @TableField(exist = false)
    private Map<String, PsiStorageArea> areaMap;

    @ExcelIgnore
    @TableField(exist = false)
    private List<PsiStoreProcess> process;
}
