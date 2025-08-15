package com.lets.platform.model.common.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.lets.platform.common.pojo.annotation.ValidatedEnum;
import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.base.BaseEntity;
import com.lets.platform.model.common.enums.PrintTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * <p>
 * 导出(打印)模板
 * </p>
 *
 * @author DING WEI
 * @since 2023-10-19
 */
@Getter
@Setter
@TableName("common_export_template")
@ApiModel(value = "CommonExportTemplate对象", description = "导出(打印)模板")
public class CommonExportTemplate extends BaseEntity {

    @ApiModelProperty("名称")
    @TableField("name")
    private String name;

    @ApiModelProperty("功能")
    @TableField("menu_code")
    private String menuCode;
    @TableField(exist = false)
    private String menuCodeName;

    @ApiModelProperty("模板文件")
    @TableField("template_file_id")
    private String templateFileId;
    @TableField(exist = false)
    private CommonFile templateFile;

    @ApiModelProperty("excel模板行数")
    @TableField("excel_row_number")
    private Integer excelRowNumber;

    @ApiModelProperty("word模板是否包含列表(固定变量l)(Y包含N不包含)")
    @TableField("word_contain_list")
    private String wordContainList;

    @ApiModelProperty("模板类型")
    @TableField("type")
    private String type;
    @TableField(exist = false)
    private String typeName;

    @ValidatedEnum(enumClass = PrintTypeEnum.class, required = true, message = "CommonExportTemplate.isPrintExport", groups = {Save.class, Update.class})
    @ApiModelProperty("1导出2打印3Bartender打印")
    @TableField("is_print_export")
    private String isPrintExport;
    @TableField(exist = false)
    private String isPrintExportName;
    @ApiModelProperty("固定行时是否分页")
    @TableField("page_change")
    private String pageChange;
    @ApiModelProperty("PDF是否只打印第一页pdf")
    @TableField("is_first_pdf_page")
    private String isFirstPdfPage;

    @ApiModelProperty("excel是否不合并为一个sheet")
    @TableField("unmerge")
    private String unmerge;

    @ApiModelProperty("单据合并打印")
    @TableField("distinguish")
    private String distinguish;

    @ApiModelProperty("合并字段")
    @TableField("merge_field")
    private String mergeField;
    @TableField(exist = false)
    private List<String> mergeFieldName;

    @ApiModelProperty("是否启用[0否1是]")
    @TableField("enable")
    private Integer enable;
    @TableField(exist = false)
    private String enableName;

    @ApiModelProperty("是否默认模板(单据类别中配置)")
    @TableField(exist = false)
    private String isDefaultTemplate;

    @ApiModelProperty("文本水印")
    @TableField("text_water_mark")
    private String textWaterMark;
    @ApiModelProperty("图片水印")
    @TableField("image_water_mark")
    private String imageWaterMark;
    @TableField(exist = false)
    private CommonFile imageWaterMarkFile;

    @TableField("foundation_field_id")
    private String foundationFieldId;

    @ApiModelProperty("打印内容分组依据")
    @TableField("group_by")
    private String groupBy;

    @TableField("printer_name")
    private String printerName;
    @TableField("print_ip")
    private String printIp;
    /**
     * 导出文件名称是否动态生成 0:不动态  1:动态
     * */
    @TableField("dynamics")
    private Integer dynamics;

    /**
     * 打印模板样式 仅对检验单打印生效 1普通 （默认打印样式） 2行列转换 3全部主表（所有检验项目明细都放在主表中打印）
     * */
    @TableField("print_style")
    private String printStyle;

    @TableField(exist = false)
    private String nameConfig;

    @TableField(exist = false)
    private List<CommonFoundationFieldDetail> foundationFieldDetails;

    @TableField(exist = false)
    private List<CommonExportTemplateDetail> details;

    @TableField(exist = false)
    private List<CommonExportTemplateNameDetail> nameDetails;

    @TableField(exist = false)
    private List<CommonExportTemplate> child;
}
