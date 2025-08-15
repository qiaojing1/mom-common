package com.lets.platform.model.psi.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * 库位管理
 * @author DINGWEI
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_storage_position")
@ApiModel(value = "PsiStoragePosition对象", description = "库位管理")
public class PsiStoragePosition extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value = "库位编码", index = 0)
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "PsiStoragePosition.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value = "库位名称", index = 1)
    @Length(max = 20, message = "PsiStoragePosition.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ExcelIgnore
    @NotBlank(message = "PsiStoragePosition.belongArea", groups = {Save.class, Update.class})
    @ApiModelProperty("所属库区")
    @TableField("belong_area")
    private String belongArea;
    @ColumnWidth(20)
    @ExcelProperty(value = "所属库区", index = 2)
    @TableField(exist = false)
    private String belongAreaCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String belongAreaName;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所属仓库名称")
    private String belongStoreName;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所属仓库编码")
    private String belongStoreCode;
    @ExcelIgnore
    @TableField(exist = false)
    @ApiModelProperty("所属仓库")
    private String belongStore;

    @ColumnWidth(20)
    @ExcelProperty(value = "备注", index = 3)
    @Length(max = 200, message = "PsiStoragePosition.remark", groups = {Save.class, Update.class})
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
    @TableField(exist = false)
    private String isBrainPower;

}
