package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 作废定时任务记录
 * </p>
 *
 * @author FZY
 * @since 2024-10-23
 */
@Getter
@Setter
@TableName("psi_material_barcode_invalid_xxl_job_record")
@ApiModel(value = "PsiMaterialBarcodeInvalidXxlJobRecord对象", description = "作废定时任务记录")
public class PsiMaterialBarcodeInvalidXxlJobRecord extends BaseEntity {
}
