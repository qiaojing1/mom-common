package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 规格型号解析导入模板
 * </p>
 *
 * @author qiao jing
 * @since 2024-11-13
 */
@Getter
@Setter
@ApiModel(value = "PsiSpecsAnalysisImportExcel对象", description = "规格型号解析导入模板")
public class PsiSpecsAnalysisImportExcel extends BaseEntity {

    @ApiModelProperty("物料编码")
    @ExcelProperty("物料编码")
    private String materialCode;

    @ApiModelProperty("物料名称")
    @ExcelProperty("物料名称")
    private String materialName;

    @ApiModelProperty("规格型号")
    @ExcelProperty("规格型号")
    private String specs;

    @ExcelIgnore
    private Integer index;

}
