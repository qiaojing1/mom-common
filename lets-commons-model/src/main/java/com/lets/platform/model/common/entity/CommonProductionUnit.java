package com.lets.platform.model.common.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
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
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 生产单元表
 *
 * @author FZY
 * @since 2023-07-04
 */
@Getter
@Setter
@TableName("common_production_unit")
@ApiModel(value = "CommonProductionUnit对象", description = "生产单元表")
public class CommonProductionUnit extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("生产单元编码")
    @TableField("code")
    @Pattern(regexp = GlobalConstant.NOT_CHINESE_1_20, message = "生产单元编码[长度 1~20，支持字母、数字和常用符号]", groups = {Save.class, Update.class})
    @ExcelProperty(value = "生产单元编码", index = 0)
    private String code;

    @ApiModelProperty("生产单元名称")
    @TableField("name")
    @ExcelProperty(value = "生产单元名称", index = 1)
    @Length(max = 20, message = "[生产单元名称]长度 1~20，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;

    /**
     * @see com.lets.platform.model.uc.enums.ProductionUnitTypeEnum
     */
    @ApiModelProperty("生产单元类型[工厂、车间、产线、工位]")
    @TableField("type")
    @ExcelIgnore
    private String type;

    @TableField(exist = false)
    @ExcelProperty(value = "生产单元类型", index = 2)
    private String typeName;

    @ApiModelProperty("上级生产单元ID")
    @TableField("parent_id")
    @ExcelIgnore
    private String parentId;

    @TableField(exist = false)
    @ExcelProperty(value = "上级生产单元", index = 3)
    private String parentName;

    @ApiModelProperty("负责人ID")
    @TableField("leader_id")
    @ExcelIgnore
    private String leaderId;

    @TableField(exist = false)
    @ExcelProperty(value = "负责人", index = 4)
    private String leaderName;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    @ExcelIgnore
    private Integer enable;

    @TableField(exist = false)
    @ExcelIgnore
    private String enableName;

    @NotBlank(message = "[生产部门]不能为空", groups = {Save.class, Update.class})
    @ExcelIgnore
    @ApiModelProperty("生产部门")
    @TableField("produce_org_id")
    private String produceOrgId;
    @ExcelProperty(value = "生产部门", index = 5)
    @TableField("produce_org_name")
    private String produceOrgName;

    @ExcelIgnore
    @ApiModelProperty("智能车间")
    @TableField("intelligence_workshop")
    private String intelligenceWorkshop;
    @ExcelProperty(value = "智能车间", index = 6)
    @TableField(exist = false)
    private String intelligenceWorkshopName;

    @ApiModelProperty("排序")
    @TableField("sort")
    @ExcelIgnore
    private Integer sort;

    @ApiModelProperty("底图")
    @TableField("background")
    @ExcelIgnore
    private String background;
    @ApiModelProperty("底图-宽")
    @TableField("width")
    @ExcelIgnore
    private String width;
    @ApiModelProperty("底图-高")
    @TableField("height")
    @ExcelIgnore
    private String height;
    @ExcelProperty(value = "排序", index = 7)
    @TableField(exist = false)
    private String sortStr;

    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonProductionUnit> children;

    @TableField(exist = false)
    @ExcelIgnore
    private List<CommonProductionUnitDeviceConf> confs;

    @TableField(exist = false)
    @ExcelIgnore
    private CommonFile backgroundFile;

    @ExcelIgnore
    @ApiModelProperty("生成复检单-点检标识[生成时间]")
    @TableField("repeat_inspect_spot_sign")
    private LocalDateTime repeatInspectSpotSign;

    @ExcelIgnore
    @ApiModelProperty("生成复检单-保养标识[生成时间]")
    @TableField("repeat_inspect_main_sign")
    private LocalDateTime repeatInspectMainSign;

    public Integer getSortKey() {
        if (sort == null) {
            return Integer.MAX_VALUE;
        }
        return sort;
    }
}
