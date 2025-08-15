package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.mes.valid.ProduceOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * <p>
 * 供应商资质信息
 * </p>
 *
 * @author csy
 * @since 2023-07-26
 */
@Getter
@Setter
@TableName("psi_supplier_qualification")
@ApiModel(value = "PsiSupplierQualification对象", description = "供应商资质信息")
public class PsiSupplierQualification extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private String sheetName;
    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    @ExcelIgnore
    private String supplierId;
    @ExcelProperty("供应商名称")
    @TableField(exist = false)
    private String supplierName;

    @ApiModelProperty("资质")
    @TableField("qualification")
    @ExcelProperty("资质")
    @Length(max=20,message = "PsiSupplierQualification.qualification",groups = {Save.class, Update.class})
    private String qualification;

    @ApiModelProperty("资质说明")
    @TableField("remark")
    @ExcelProperty("资质说明")
    @Length(max=100,message = "PsiSupplierQualification.remark",groups = {Save.class, Update.class})
    private String remark;


    @ApiModelProperty("是否删除[N否Y是]")
    @ExcelIgnore
      @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;
}
