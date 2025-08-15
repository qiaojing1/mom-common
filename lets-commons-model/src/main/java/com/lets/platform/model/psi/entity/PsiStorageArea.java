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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Map;

/**
 * 库区管理
 * @author DINGWEI
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_storage_area")
@ApiModel(value = "PsiStorageArea对象", description = "库区管理")
public class PsiStorageArea extends BaseEntity {

    @TableField(exist = false)
    @ExcelIgnore
    private Integer index;

    @ColumnWidth(20)
    @ExcelProperty(value = "库区编码", index = 0)
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "PsiStorageArea.code", groups = {Save.class, Update.class})
    @ApiModelProperty("编码")
    @TableField("code")
    private String code;

    @ColumnWidth(20)
    @ExcelProperty(value = "库区名称", index = 1)
    @Length(max = 20, message = "PsiStorageArea.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ExcelIgnore
    @ValidatedEnum(enumClass = YesOrNo.class, required = true, message = "PsiStorageArea.enablePosition", groups = {Save.class, Update.class})
    @ApiModelProperty("是否开启库位管理[NY]")
    @TableField("enable_position")
    private String enablePosition;
    @ColumnWidth(20)
    @ExcelProperty(value = "库位管理", index = 2)
    @TableField(exist = false)
    private String enablePositionName;

    @ExcelIgnore
    @NotBlank(message = "PsiStorageArea.belongStore", groups = {Save.class, Update.class})
    @ApiModelProperty("所属仓库")
    @TableField("belong_store")
    private String belongStore;
    @ColumnWidth(20)
    @ExcelProperty(value = "所属仓库", index = 3)
    @TableField(exist = false)
    private String belongStoreCode;
    @ExcelIgnore
    @TableField(exist = false)
    private String belongStoreName;

    @ColumnWidth(20)
    @ExcelProperty(value = "备注", index = 4)
    @Length(max = 200, message = "PsiStorageArea.remark", groups = {Save.class, Update.class})
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
    private PsiStoragePosition position;
    @ExcelIgnore
    @TableField(exist = false)
    private Map<String, PsiStoragePosition> positionMap;
}
