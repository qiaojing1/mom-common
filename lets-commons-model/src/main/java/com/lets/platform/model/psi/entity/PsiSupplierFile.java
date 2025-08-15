package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.Resource;

/**
 * <p>
 * 供应商附件
 * </p>
 *
 * @author csy
 * @since 2023-07-26
 */
@Getter
@Setter
@TableName("psi_supplier_file")
@ApiModel(value = "PsiSupplierFile对象", description = "供应商附件")
public class PsiSupplierFile extends BaseEntity {

    @ApiModelProperty("供应商主键")
    @TableField("supplier_id")
    private String supplierId;

    @ApiModelProperty("文件id")
    @TableField("file_id")
    private String fileId;

    @TableField(exist = false)
    private String name;

    @TableField(exist = false)
    private Long size;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("是否删除[N否Y是]")
      @TableField(value = "deleted", fill = FieldFill.INSERT)
    private String deleted;

    @TableField(exist = false)
    private CommonFile file;
}
