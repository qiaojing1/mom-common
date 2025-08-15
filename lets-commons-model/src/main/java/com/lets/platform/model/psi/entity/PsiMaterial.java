package com.lets.platform.model.psi.entity;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.OrderBy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseTreeEntity;
import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * 物料基本信息
 * </p>
 *
 * @author FZY
 * @since 2023-07-18
 */
@Getter
@Setter
@TableName("psi_material")
@ApiModel(value = "PsiMaterial对象", description = "物料基本信息")
public class PsiMaterial extends BaseTreeEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("物料编码")
    @TableField("code")
    @NotBlank(message = "[物料编码]不能为空")
    private String code;

    @ApiModelProperty("物料名称")
    @TableField("name")
    @NotBlank(message = "[物料名称]不能为空")
    @Length(min = 1, max = 70, message = "[物料名称]长度 1~70，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String name;

    @ApiModelProperty("规格型号")
    @TableField("specs")
    @Length(max = 70, message = "[规格型号]长度 0~70，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String specs;

    @ApiModelProperty("助记码")
    @TableField("mnemonic_code")
    @Length(max = 20, message = "[助记码]长度 0~20，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String mnemonicCode;

    @ApiModelProperty("旧编码")
    @TableField("old_code")
    @Length(max = 50, message = "[助记码]长度 0~50，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String oldCode;

    /**
     * @see com.lets.platform.model.psi.enums.MaterialTypeEnum
     */
    @ApiModelProperty("物料类型")
    @TableField("type")
    @NotBlank(message = "[物料类型]不能为空")
    private String type;

    @ApiModelProperty("物料类型名称")
    @TableField(exist = false)
    private String typeName;

    /**
     * @see com.lets.platform.model.psi.enums.MaterialAssetTypeEnum
     */
    @ApiModelProperty("资产类型 (仅物料类型为资产件时可填)")
    @TableField("asset_type")
    private String assetType;
    @ApiModelProperty("资产类型名称")
    @TableField(exist = false)
    private String assetTypeName;

    @ApiModelProperty("物料分组ID")
    @TableField("group_id")
    @NotBlank(message = "[物料分组]不能为空")
    private String groupId;

    @ApiModelProperty("物料分组编码")
    @TableField(exist = false)
    private String groupCode;

    @ApiModelProperty("物料分组名称")
    @TableField(exist = false)
    private String groupName;

    @ApiModelProperty("生命周期ID")
    @TableField("life_cycle_id")
    private String lifeCycleId;

    @ApiModelProperty("生命周期名称")
    @TableField(exist = false)
    private String lifeCycleName;
    @ApiModelProperty("生命周期名称-失效属性")
    @TableField(exist = false)
    private String lifeCycleLoseEfficacy;

    @ApiModelProperty("基础单位ID")
    @TableField("basic_unit_id")
    private String basicUnitId;
    @ApiModelProperty("基础单位编码")
    @TableField(exist = false)
    private String basicUnitCode;
    @ApiModelProperty("基础单位名称")
    @TableField(exist = false)
    private String basicUnitName;

    @ApiModelProperty("基础单位精度")
    @TableField(exist = false)
    private Integer basicUnitAccuracy;

    @ApiModelProperty("基础单位舍入类型")
    @TableField(exist = false)
    private String basicUnitRoundOffType;

    @ApiModelProperty("描述")
    @TableField("remark")
    @Length(max = 200, message = "[描述]长度 0~200，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String remark;

    @ApiModelProperty("英文名称")
    @TableField("english_name")
    @Length(max = 100, message = "[英文名称]长度 0~100，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String englishName;

    @ApiModelProperty("图号")
    @TableField("drawing_number")
    @Length(max = 50, message = "[图号]长度 0~50，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String drawingNumber;

    @ApiModelProperty("主材质")
    @TableField("main_material")
    @Length(max = 40, message = "[图号]长度 0~40，输入：中文、字母、数字、符号", groups = {Save.class, Update.class})
    private String mainMaterial;

    @ApiModelProperty("可采购")
    @TableField("purchasable")
    private Integer purchasable;

    @ApiModelProperty("可销售")
    @TableField("salable")
    private Integer salable;

    @ApiModelProperty("可生产")
    @TableField("producible")
    private Integer producible;

    @ApiModelProperty("可存货")
    @TableField("storable")
    private Integer storable;

    @ApiModelProperty("可委外")
    @TableField("outsourceable")
    private Integer outsourceable;

    @ApiModelProperty("净重")
    @TableField("net_weight")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal netWeight;

    @ApiModelProperty("毛重")
    @TableField("gross_weight")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal grossWeight;

    @ApiModelProperty("重量单位ID")
    @TableField("weight_unit_id")
    private String weightUnitId;

    @ApiModelProperty("重量单位名称")
    @TableField(exist = false)
    private String weightUnitName;

    @ApiModelProperty("重量单位精度")
    @TableField(exist = false)
    private Integer weightUnitAccuracy;

    @ApiModelProperty("重量单位舍入类型")
    @TableField(exist = false)
    private String weightUnitRoundOffType;

    @ApiModelProperty("长")
    @TableField("length")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal length;

    @ApiModelProperty("宽")
    @TableField("width")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal width;

    @ApiModelProperty("高")
    @TableField("height")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal height;

    @ApiModelProperty("颜色")
    @TableField("color")
    private String color;

    @ApiModelProperty("尺寸单位ID")
    @TableField("size_unit_id")
    private String sizeUnitId;

    @ApiModelProperty("尺寸单位精度")
    @TableField(exist = false)
    private Integer sizeUnitAccuracy;

    @ApiModelProperty("尺寸单位舍入类型")
    @TableField(exist = false)
    private String sizeUnitRoundOffType;

    @ApiModelProperty("尺寸单位名称")
    @TableField(exist = false)
    private String sizeUnitName;

    @ApiModelProperty("默认税种ID")
    @TableField("tax_id")
    private String taxId;

    @ApiModelProperty("税种分类")
    @TableField("tax_type")
    private String taxType;

    @ApiModelProperty("税种名称")
    @TableField("tax_name")
    private String taxName;

    @ApiModelProperty("税种税率")
    @TableField("tax_rate")
    private String taxRate;

    @ApiModelProperty("税种精度")
    @TableField("tax_accuracy")
    private Integer taxAccuracy;

    @ApiModelProperty("存货成本")
    @TableField("inventory_cost")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal inventoryCost;

    @ApiModelProperty("币种ID")
    @TableField("currency_id")
    private String currencyId;

    @ApiModelProperty("币种名称")
    @TableField("currency_name")
    private String currencyName;

    @ApiModelProperty("币种金额精度")
    @TableField("currency_amount_accuracy")
    private Integer currencyAmountAccuracy;

    @ApiModelProperty("币种单价精度")
    @TableField("currency_price_accuracy")
    private Integer currencyPriceAccuracy;

    @ApiModelProperty("币种舍入类型")
    @TableField("currency_round_off_type")
    private Integer currencyRoundOffType;

    @ApiModelProperty("图片地址")
    @TableField("picture_path")
    private String picturePath;

    @ApiModelProperty("工艺文件")
    @TableField("process_file_id")
    private String processFileId;
    @TableField(exist = false)
    private String processFileName;

    @ApiModelProperty("图片地址")
    @TableField(exist = false)
    private String pictureUrl;

    @ApiModelProperty(value = "图片文件")
    @TableField(exist = false)
    private CommonFile picture;

    @ApiModelProperty("数据来源")
    @TableField("source")
    private String source;

    @ApiModelProperty("单据状态")
    @TableField("status")
    private Integer status;

    @ApiModelProperty("单据状态名称")
    @TableField(exist = false)
    private String statusName;
    @ApiModelProperty("技术准备跟踪状态名称")
    @TableField(exist = false)
    private String tecReadyStatusName;

    @ApiModelProperty("是否启用[0:禁用;1:启用]")
    @TableField("enable")
    private Integer enable;

    @ApiModelProperty("是否启用名称")
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("扩展规格备注一")
    @TableField("remark_1")
    private String remark1;

    @ApiModelProperty("扩展规格备注二")
    @TableField("remark_2")
    private String remark2;

    @ApiModelProperty("扩展规格属性分类一")
    @TableField("ext_fl1")
    private String extFl1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField("ext_fl2")
    private String extFl2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField("ext_fl3")
    private String extFl3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField("ext_fl4")
    private String extFl4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField("ext_fl5")
    private String extFl5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField("ext_fl6")
    private String extFl6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField("ext_fl7")
    private String extFl7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField("ext_fl8")
    private String extFl8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField("ext_fl9")
    private String extFl9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField("ext_fl10")
    private String extFl10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField("ext_fl11")
    private String extFl11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField("ext_fl12")
    private String extFl12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField("ext_fl13")
    private String extFl13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField("ext_fl14")
    private String extFl14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField("ext_fl15")
    private String extFl15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField("ext_fl16")
    private String extFl16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField("ext_fl17")
    private String extFl17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField("ext_fl18")
    private String extFl18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField("ext_fl19")
    private String extFl19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField("ext_fl20")
    private String extFl20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField("ext_fl21")
    private String extFl21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField("ext_fl22")
    private String extFl22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField("ext_fl23")
    private String extFl23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField("ext_fl24")
    private String extFl24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField("ext_fl25")
    private String extFl25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField("ext_fl26")
    private String extFl26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField("ext_fl27")
    private String extFl27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField("ext_fl28")
    private String extFl28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField("ext_fl29")
    private String extFl29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField("ext_fl30")
    private String extFl30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField("ext_fl31")
    private String extFl31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField("ext_fl32")
    private String extFl32;

    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlCode1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlCode2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlCode3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlCode4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlCode5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlCode6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlCode7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlCode8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlCode9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlCode10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlCode11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlCode12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlCode13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlCode14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlCode15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlCode16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlCode17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlCode18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlCode19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlCode20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlCode21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlCode22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlCode23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlCode24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlCode25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlCode26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlCode27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlCode28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlCode29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlCode30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlCode31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlCode32;

    @ApiModelProperty("扩展规格属性分类一关联字典项")
    @TableField(exist = false)
    private List<String> extFl1RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二关联字典项")
    @TableField(exist = false)
    private List<String> extFl2RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类三关联字典项")
    @TableField(exist = false)
    private List<String> extFl3RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类四关联字典项")
    @TableField(exist = false)
    private List<String> extFl4RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类五关联字典项")
    @TableField(exist = false)
    private List<String> extFl5RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类六关联字典项")
    @TableField(exist = false)
    private List<String> extFl6RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类七关联字典项")
    @TableField(exist = false)
    private List<String> extFl7RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类八关联字典项")
    @TableField(exist = false)
    private List<String> extFl8RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类九关联字典项")
    @TableField(exist = false)
    private List<String> extFl9RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十关联字典项")
    @TableField(exist = false)
    private List<String> extFl10RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十一关联字典项")
    @TableField(exist = false)
    private List<String> extFl11RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十二关联字典项")
    @TableField(exist = false)
    private List<String> extFl12RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十三关联字典项")
    @TableField(exist = false)
    private List<String> extFl13RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十四关联字典项")
    @TableField(exist = false)
    private List<String> extFl14RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十五关联字典项")
    @TableField(exist = false)
    private List<String> extFl15RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十六关联字典项")
    @TableField(exist = false)
    private List<String> extFl16RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十七关联字典项")
    @TableField(exist = false)
    private List<String> extFl17RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十八关联字典项")
    @TableField(exist = false)
    private List<String> extFl18RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类十九关联字典项")
    @TableField(exist = false)
    private List<String> extFl19RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十关联字典项")
    @TableField(exist = false)
    private List<String> extFl20RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十一关联字典项")
    @TableField(exist = false)
    private List<String> extFl21RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十二关联字典项")
    @TableField(exist = false)
    private List<String> extFl22RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十三关联字典项")
    @TableField(exist = false)
    private List<String> extFl23RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十四关联字典项")
    @TableField(exist = false)
    private List<String> extFl24RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十五关联字典项")
    @TableField(exist = false)
    private List<String> extFl25RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十六关联字典项")
    @TableField(exist = false)
    private List<String> extFl26RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十七关联字典项")
    @TableField(exist = false)
    private List<String> extFl27RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十八关联字典项")
    @TableField(exist = false)
    private List<String> extFl28RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类二十九关联字典项")
    @TableField(exist = false)
    private List<String> extFl29RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类三十关联字典项")
    @TableField(exist = false)
    private List<String> extFl30RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类三十一关联字典项")
    @TableField(exist = false)
    private List<String> extFl31RelationDictCodes;
    @ApiModelProperty("扩展规格属性分类三十二关联字典项")
    @TableField(exist = false)
    private List<String> extFl32RelationDictCodes;

    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlName1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlName2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlName3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlName4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlName5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlName6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlName7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlName8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlName9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlName10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlName11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlName12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlName13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlName14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlName15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlName16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlName17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlName18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlName19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlName20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlName21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlName22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlName23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlName24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlName25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlName26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlName27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlName28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlName29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlName30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlName31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlName32;

    @ApiModelProperty("扩展规格属性分类一")
    @TableField(exist = false)
    private String extFlNotes1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField(exist = false)
    private String extFlNotes2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField(exist = false)
    private String extFlNotes3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField(exist = false)
    private String extFlNotes4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField(exist = false)
    private String extFlNotes5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField(exist = false)
    private String extFlNotes6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField(exist = false)
    private String extFlNotes7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField(exist = false)
    private String extFlNotes8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField(exist = false)
    private String extFlNotes9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField(exist = false)
    private String extFlNotes10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField(exist = false)
    private String extFlNotes11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField(exist = false)
    private String extFlNotes12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField(exist = false)
    private String extFlNotes13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField(exist = false)
    private String extFlNotes14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField(exist = false)
    private String extFlNotes15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField(exist = false)
    private String extFlNotes16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField(exist = false)
    private String extFlNotes17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField(exist = false)
    private String extFlNotes18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField(exist = false)
    private String extFlNotes19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField(exist = false)
    private String extFlNotes20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField(exist = false)
    private String extFlNotes21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField(exist = false)
    private String extFlNotes22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField(exist = false)
    private String extFlNotes23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField(exist = false)
    private String extFlNotes24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField(exist = false)
    private String extFlNotes25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField(exist = false)
    private String extFlNotes26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField(exist = false)
    private String extFlNotes27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField(exist = false)
    private String extFlNotes28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField(exist = false)
    private String extFlNotes29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField(exist = false)
    private String extFlNotes30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField(exist = false)
    private String extFlNotes31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField(exist = false)
    private String extFlNotes32;
    @ApiModelProperty("扩展规格属性hash")
    @TableField("ext_hash")
    private Integer extHash;

    @ApiModelProperty("库存属性")
    @TableField(exist = false)
    private PsiMaterialInventory materialInventory;

    @ApiModelProperty("销售属性")
    @TableField(exist = false)
    private PsiMaterialSale materialSale;

    @ApiModelProperty("采购属性")
    @TableField(exist = false)
    private PsiMaterialPurchase materialPurchase;

    @ApiModelProperty("生产属性")
    @TableField(exist = false)
    private PsiMaterialProduction materialProduction;

    @ApiModelProperty("质量属性")
    @TableField(exist = false)
    private PsiMaterialQuality materialQuality;

    @ApiModelProperty("计划属性")
    @TableField(exist = false)
    private PsiMaterialPlan materialPlan;

    @ApiModelProperty("物料特征")
    @TableField(exist = false)
    private List<PsiMaterialCharacteristic> materialCharacteristic;

    @ApiModelProperty("审核时间")
    @TableField(value = "audit_time")
    @OrderBy(sort = 0)
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField(value = "audit_user")
    private String auditUser;

    @ApiModelProperty("审核姓名")
    @TableField(value = "audit_user_name")
    private String auditUserName;

    @ApiModelProperty(hidden = true)
    @TableField(exist = false)
    private String parentId;

    @ApiModelProperty(value = "最新修改的BOM版本", hidden = true)
    @TableField(exist = false)
    private String bomVersion;
    @TableField(exist = false)
    private String bomVersionId;
    @ApiModelProperty("BOM版本描述")
    @TableField(exist = false)
    private String bomVersionDescribe;

    @ApiModelProperty(value = "库存单位", hidden = true)
    @TableField(exist = false)
    private String inventoryUnitId;
    @TableField(exist = false)
    private String inventoryUnitName;
    @TableField(exist = false)
    private Integer inventoryUnitAccuracy;
    @TableField(exist = false)
    private Integer inventoryUnitRoundOffType;

    @ApiModelProperty("BOM:用量类型[1变动2固定]")
    @TableField(exist = false)
    private String dosageType;
    @ApiModelProperty("BOM:分子用量")
    @TableField(exist = false)
    private BigDecimal numeratorDosage;
    @ApiModelProperty("BOM:分母用量")
    @TableField(exist = false)
    private BigDecimal denominatorDosage;
    @ApiModelProperty("BOM:子项单位主键")
    @TableField(exist = false)
    private String unitId;
    @ApiModelProperty("BOM:子项单位名称")
    @TableField(exist = false)
    private String unitName;
    @ApiModelProperty("BOM:子项单位精度")
    @TableField(exist = false)
    private Integer unitAccuracy;
    @ApiModelProperty("BOM:子项单位舍入方式")
    @TableField(exist = false)
    private Integer unitRoundOffType;

    @ApiModelProperty("安全库存量(基本单位)")
    @TableField("inventory_safe_basic_quantity")
    private BigDecimal inventorySafeBasicQuantity;

    @ApiModelProperty("模穴数")
    @TableField(value = "mod_holes_number", fill = FieldFill.UPDATE)
    private Integer modHolesNumber;

    @ApiModelProperty("物料申请单id")
    @TableField("material_apply_id")
    private String materialApplyId;

    @ApiModelProperty("技术准备状态")
    @TableField("tec_ready_status")
    private String tecReadyStatus;


    @ApiModelProperty("该物料所属的客户物料属性")
    @TableField(exist = false)
    private Map<String, PsiCustomerMaterialDetail> customerMaterialInfos;

    @ApiModelProperty("来自物料申请")
    @TableField(exist = false)
    private String fromMaterialApply;

    @ApiModelProperty("可用库存")
    @TableField(exist = false)
    private BigDecimal availableQuantity;
    @ApiModelProperty("生产单位和采购计价单位是否有转换关系")
    @TableField(exist = false)
    private Boolean hasConvertPurAndPro;
    @ApiModelProperty("所有扩展规格属性val拼起来的字符串")
    @TableField(exist = false)
    private String allExtFlVal;
    public void toUpdateEntity() {
        super.toUpdateEntity();
        this.enable = null;
        this.status = null;
    }

    public void toSaveEntity() {
        super.toSaveEntity();
        this.enable = null;
        this.status = null;
        this.auditTime = null;
        this.auditUser = null;
        this.auditUserName = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PsiMaterial material = (PsiMaterial) o;
        return StrUtil.equals(this.getId(), material.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId());
    }
}
