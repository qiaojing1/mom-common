package com.lets.platform.model.psi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.lets.platform.model.base.BaseEntity;
import java.time.LocalDateTime;
import java.util.List;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 物料申请单
 * </p>
 *
 * @author csy
 * @since 2024-05-20
 */
@Getter
@Setter
@TableName("psi_material_apply")
@ApiModel(value = "PsiMaterialApply对象", description = "物料申请单")
public class PsiMaterialApply extends BaseEntity {

    @ApiModelProperty("单据编号")
    @TableField("code")
    private String code;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("单据日期")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty("单据类别")
    @TableField("order_category_id")
    private String orderCategoryId;

    @ApiModelProperty("单据类别")
    @TableField("order_category_name")
    private String orderCategoryName;

    @ApiModelProperty("源单类别")
    @TableField("source_order_type")
    private String sourceOrderType;
    @TableField(exist = false)
    private String sourceOrderTypeName;

    @ApiModelProperty("源单单号")
    @TableField("source_order_code")
    private String sourceOrderCode;

    @ApiModelProperty("源单主键")
    @TableField("source_order_id")
    private String sourceOrderId;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty("源单日期")
    @TableField("source_order_time")
    private LocalDateTime sourceOrderTime;

    @ApiModelProperty("订货客户id")
    @TableField("order_customer_id")
    private String orderCustomerId;

    @ApiModelProperty("订货客户")
    @TableField("order_customer_name")
    private String orderCustomerName;

    @ApiModelProperty("申请部门")
    @TableField("apply_org_id")
    private String applyOrgId;

    @ApiModelProperty("申请部门")
    @TableField("apply_org_name")
    private String applyOrgName;

    @ApiModelProperty("申请人")
    @TableField("apply_user_id")
    private String applyUserId;

    @ApiModelProperty("申请人")
    @TableField("apply_user_name")
    private String applyUserName;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("物料编码")
    @TableField("material_code")
    private String materialCode;
    @TableField("material_id")
    private String materialId;

    @ApiModelProperty("物料名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("规格型号")
    @TableField("specs")
    private String specs;

    @ApiModelProperty("物料属性")
    @TableField("type")
    private String type;

    @ApiModelProperty("物料分组ID")
    @TableField("group_id")
    private String groupId;
    @TableField(exist = false)
    private String groupName;

    @ApiModelProperty("基础单位ID")
    @TableField("basic_unit_id")
    private String basicUnitId;
    @TableField(exist = false)
    private String basicUnitName;

    @ApiModelProperty("扩展规格属性分类一")
    @TableField("ext_fl1")
    private String extFl1;
    @TableField("ext_fl_name1")
    private String extFlName1;

    @ApiModelProperty("扩展规格属性分类二")
    @TableField("ext_fl2")
    private String extFl2;
    @TableField("ext_fl_name2")
    private String extFlName2;

    @ApiModelProperty("扩展规格属性分类三")
    @TableField("ext_fl3")
    private String extFl3;
    @TableField("ext_fl_name3")
    private String extFlName3;

    @ApiModelProperty("扩展规格属性分类四")
    @TableField("ext_fl4")
    private String extFl4;
    @TableField("ext_fl_name4")
    private String extFlName4;

    @ApiModelProperty("扩展规格属性分类五")
    @TableField("ext_fl5")
    private String extFl5;
    @TableField("ext_fl_name5")
    private String extFlName5;

    @ApiModelProperty("扩展规格属性分类六")
    @TableField("ext_fl6")
    private String extFl6;
    @TableField("ext_fl_name6")
    private String extFlName6;

    @ApiModelProperty("扩展规格属性分类七")
    @TableField("ext_fl7")
    private String extFl7;
    @TableField("ext_fl_name7")
    private String extFlName7;

    @ApiModelProperty("扩展规格属性分类八")
    @TableField("ext_fl8")
    private String extFl8;
    @TableField("ext_fl_name8")
    private String extFlName8;

    @ApiModelProperty("扩展规格属性分类九")
    @TableField("ext_fl9")
    private String extFl9;
    @TableField("ext_fl_name9")
    private String extFlName9;

    @ApiModelProperty("扩展规格属性分类十")
    @TableField("ext_fl10")
    private String extFl10;
    @TableField("ext_fl_name10")
    private String extFlName10;

    @ApiModelProperty("扩展规格属性分类十一")
    @TableField("ext_fl11")
    private String extFl11;
    @TableField("ext_fl_name11")
    private String extFlName11;

    @ApiModelProperty("扩展规格属性分类十二")
    @TableField("ext_fl12")
    private String extFl12;
    @TableField("ext_fl_name12")
    private String extFlName12;

    @ApiModelProperty("扩展规格属性分类十三")
    @TableField("ext_fl13")
    private String extFl13;
    @TableField("ext_fl_name13")
    private String extFlName13;

    @ApiModelProperty("扩展规格属性分类十四")
    @TableField("ext_fl14")
    private String extFl14;
    @TableField("ext_fl_name14")
    private String extFlName14;

    @ApiModelProperty("扩展规格属性分类十五")
    @TableField("ext_fl15")
    private String extFl15;
    @TableField("ext_fl_name15")
    private String extFlName15;

    @ApiModelProperty("扩展规格属性分类十六")
    @TableField("ext_fl16")
    private String extFl16;
    @TableField("ext_fl_name16")
    private String extFlName16;

    @ApiModelProperty("扩展规格属性分类十七")
    @TableField("ext_fl17")
    private String extFl17;
    @TableField("ext_fl_name17")
    private String extFlName17;

    @ApiModelProperty("扩展规格属性分类十八")
    @TableField("ext_fl18")
    private String extFl18;
    @TableField("ext_fl_name18")
    private String extFlName18;

    @ApiModelProperty("扩展规格属性分类十九")
    @TableField("ext_fl19")
    private String extFl19;
    @TableField("ext_fl_name19")
    private String extFlName19;

    @ApiModelProperty("扩展规格属性分类二十")
    @TableField("ext_fl20")
    private String extFl20;
    @TableField("ext_fl_name20")
    private String extFlName20;

    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField("ext_fl21")
    private String extFl21;
    @TableField("ext_fl_name21")
    private String extFlName21;

    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField("ext_fl22")
    private String extFl22;
    @TableField("ext_fl_name22")
    private String extFlName22;

    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField("ext_fl23")
    private String extFl23;
    @TableField("ext_fl_name23")
    private String extFlName23;

    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField("ext_fl24")
    private String extFl24;
    @TableField("ext_fl_name24")
    private String extFlName24;

    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField("ext_fl25")
    private String extFl25;
    @TableField("ext_fl_name25")
    private String extFlName25;

    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField("ext_fl26")
    private String extFl26;
    @TableField("ext_fl_name26")
    private String extFlName26;

    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField("ext_fl27")
    private String extFl27;
    @TableField("ext_fl_name27")
    private String extFlName27;

    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField("ext_fl28")
    private String extFl28;
    @TableField("ext_fl_name28")
    private String extFlName28;

    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField("ext_fl29")
    private String extFl29;
    @TableField("ext_fl_name29")
    private String extFlName29;

    @ApiModelProperty("扩展规格属性分类三十")
    @TableField("ext_fl30")
    private String extFl30;
    @TableField("ext_fl_name30")
    private String extFlName30;

    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField("ext_fl31")
    private String extFl31;
    @TableField("ext_fl_name31")
    private String extFlName31;

    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField("ext_fl32")
    private String extFl32;
    @TableField("ext_fl_name32")
    private String extFlName32;

    @ApiModelProperty("扩展规格属性分类一")
    @TableField("ext_fl_code1")
    private String extFlCode1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField("ext_fl_code2")
    private String extFlCode2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField("ext_fl_code3")
    private String extFlCode3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField("ext_fl_code4")
    private String extFlCode4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField("ext_fl_code5")
    private String extFlCode5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField("ext_fl_code6")
    private String extFlCode6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField("ext_fl_code7")
    private String extFlCode7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField("ext_fl_code8")
    private String extFlCode8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField("ext_fl_code9")
    private String extFlCode9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField("ext_fl_code10")
    private String extFlCode10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField("ext_fl_code11")
    private String extFlCode11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField("ext_fl_code12")
    private String extFlCode12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField("ext_fl_code13")
    private String extFlCode13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField("ext_fl_code14")
    private String extFlCode14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField("ext_fl_code15")
    private String extFlCode15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField("ext_fl_code16")
    private String extFlCode16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField("ext_fl_code17")
    private String extFlCode17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField("ext_fl_code18")
    private String extFlCode18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField("ext_fl_code19")
    private String extFlCode19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField("ext_fl_code20")
    private String extFlCode20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField("ext_fl_code21")
    private String extFlCode21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField("ext_fl_code22")
    private String extFlCode22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField("ext_fl_code23")
    private String extFlCode23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField("ext_fl_code24")
    private String extFlCode24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField("ext_fl_code25")
    private String extFlCode25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField("ext_fl_code26")
    private String extFlCode26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField("ext_fl_code27")
    private String extFlCode27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField("ext_fl_code28")
    private String extFlCode28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField("ext_fl_code29")
    private String extFlCode29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField("ext_fl_code30")
    private String extFlCode30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField("ext_fl_code31")
    private String extFlCode31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField("ext_fl_code32")
    private String extFlCode32;


    @ApiModelProperty("扩展规格属性分类一")
    @TableField("ext_fl_note1")
    private String extFlNotes1;
    @ApiModelProperty("扩展规格属性分类二")
    @TableField("ext_fl_note2")
    private String extFlNotes2;
    @ApiModelProperty("扩展规格属性分类三")
    @TableField("ext_fl_note3")
    private String extFlNotes3;
    @ApiModelProperty("扩展规格属性分类四")
    @TableField("ext_fl_note4")
    private String extFlNotes4;
    @ApiModelProperty("扩展规格属性分类五")
    @TableField("ext_fl_note5")
    private String extFlNotes5;
    @ApiModelProperty("扩展规格属性分类六")
    @TableField("ext_fl_note6")
    private String extFlNotes6;
    @ApiModelProperty("扩展规格属性分类七")
    @TableField("ext_fl_note7")
    private String extFlNotes7;
    @ApiModelProperty("扩展规格属性分类八")
    @TableField("ext_fl_note8")
    private String extFlNotes8;
    @ApiModelProperty("扩展规格属性分类九")
    @TableField("ext_fl_note9")
    private String extFlNotes9;
    @ApiModelProperty("扩展规格属性分类十")
    @TableField("ext_fl_note10")
    private String extFlNotes10;
    @ApiModelProperty("扩展规格属性分类十一")
    @TableField("ext_fl_note11")
    private String extFlNotes11;
    @ApiModelProperty("扩展规格属性分类十二")
    @TableField("ext_fl_note12")
    private String extFlNotes12;
    @ApiModelProperty("扩展规格属性分类十三")
    @TableField("ext_fl_note13")
    private String extFlNotes13;
    @ApiModelProperty("扩展规格属性分类十四")
    @TableField("ext_fl_note14")
    private String extFlNotes14;
    @ApiModelProperty("扩展规格属性分类十五")
    @TableField("ext_fl_note15")
    private String extFlNotes15;
    @ApiModelProperty("扩展规格属性分类十六")
    @TableField("ext_fl_note16")
    private String extFlNotes16;
    @ApiModelProperty("扩展规格属性分类十七")
    @TableField("ext_fl_note17")
    private String extFlNotes17;
    @ApiModelProperty("扩展规格属性分类十八")
    @TableField("ext_fl_note18")
    private String extFlNotes18;
    @ApiModelProperty("扩展规格属性分类十九")
    @TableField("ext_fl_note19")
    private String extFlNotes19;
    @ApiModelProperty("扩展规格属性分类二十")
    @TableField("ext_fl_note20")
    private String extFlNotes20;
    @ApiModelProperty("扩展规格属性分类二十一")
    @TableField("ext_fl_note21")
    private String extFlNotes21;
    @ApiModelProperty("扩展规格属性分类二十二")
    @TableField("ext_fl_note22")
    private String extFlNotes22;
    @ApiModelProperty("扩展规格属性分类二十三")
    @TableField("ext_fl_note23")
    private String extFlNotes23;
    @ApiModelProperty("扩展规格属性分类二十四")
    @TableField("ext_fl_note24")
    private String extFlNotes24;
    @ApiModelProperty("扩展规格属性分类二十五")
    @TableField("ext_fl_note25")
    private String extFlNotes25;
    @ApiModelProperty("扩展规格属性分类二十六")
    @TableField("ext_fl_note26")
    private String extFlNotes26;
    @ApiModelProperty("扩展规格属性分类二十七")
    @TableField("ext_fl_note27")
    private String extFlNotes27;
    @ApiModelProperty("扩展规格属性分类二十八")
    @TableField("ext_fl_note28")
    private String extFlNotes28;
    @ApiModelProperty("扩展规格属性分类二十九")
    @TableField("ext_fl_note29")
    private String extFlNotes29;
    @ApiModelProperty("扩展规格属性分类三十")
    @TableField("ext_fl_note30")
    private String extFlNotes30;
    @ApiModelProperty("扩展规格属性分类三十一")
    @TableField("ext_fl_note31")
    private String extFlNotes31;
    @ApiModelProperty("扩展规格属性分类三十二")
    @TableField("ext_fl_note32")
    private String extFlNotes32;

    @ApiModelProperty("技术要求")
    @TableField("tec_demand")
    private String tecDemand;

    @ApiModelProperty("状态")
    @TableField("status")
    private Integer status;
    @TableField(exist = false)
    private String statusName;

    @ApiModelProperty("审核时间")
    @TableField("audit_time")
    private LocalDateTime auditTime;

    @ApiModelProperty("审核人")
    @TableField("audit_user")
    private String auditUser;

    @ApiModelProperty("审核人名称")
    @TableField("audit_user_name")
    private String auditUserName;

    @TableField(exist = false)
    private String enclosureFilesIds;

    @TableField(exist = false)
    private List<CommonFile> enclosureFiles;

    @TableField(exist = false)
    private String lifeCycleId;
    @TableField(exist = false)
    private String lifeCycleName;

    @TableField(exist = false)
    private String tecReadyStatusName;
    @TableField(exist = false)
    private String tecReadyStatus;

}
