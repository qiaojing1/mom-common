package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.collection.entity.CollectionDetectReport;
import com.lets.platform.model.uc.entity.SysTenancy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 模板打印 数据传输对象
 *
 * @author: DING WEI
 * @date: 2023/3/16 17:50
 */
@Data
@ApiModel("模板打印 数据传输对象")
public class ExportWithTemplateDto {

    @NotEmpty(message = "ExportTemplate.ids", groups = {Save.class, Update.class})
    @ApiModelProperty("主键")
    private List<String> ids;

    private Set<String> primaryKeys;

    /**
     * 用于通过分类字段查询对应的模板
     */
    private List<Map<String,Object>> foundationData;

    @NotBlank(message = "ExportTemplate.menuCode", groups = {Save.class, Update.class})
    @ApiModelProperty("菜单编码")
    private String menuCode;

    @NotBlank(message = "ExportTemplate.templateId", groups = {Update.class})
    @ApiModelProperty("模板主键")
    private String templateId;
    @ApiModelProperty("表格行数")
    private Integer rowNumber;

    private CollectionDetectReport data;

    @ApiModelProperty("是否转换PDF")
    private boolean convertToPDF;

    /** 产品打印 参数 开始 **/
    @ApiModelProperty("是否直接输出流")
    private Boolean directOutputStream;

    @ApiModelProperty("目录内容")
    private List<String> catalogueContentList;
    @ApiModelProperty("目录word模板主键")
    private String catalogueTemplateId;
    /**
     * @see com.lets.platform.model.common.enums.ProductArchiveTypeEnum
     */
    @ApiModelProperty("产品档案打印方式[1:全部,2:单据,3:单据附件]")
    private String productArchiveType;
    @ApiModelProperty("Bartender打印url")
    private String printerUrl;
    @ApiModelProperty("需要打印的附件主键集合")
    private List<String> enclosureIds;

    @ApiModelProperty("打印内容分组依据")
    private String groupBy;

    @ApiModelProperty("是否打印第一页(只对excel生效)")
    private String isFirstPage;
    //日期,物料条码追溯如果没有传id话根据日期查询
    private String date;

    @ApiModelProperty(hidden = true)
    private SysTenancy tenancy;
    @ApiModelProperty(hidden = true)
    private Integer sort;
    @ApiModelProperty(hidden = true)
    private Integer isOrder = 1;
    //扩展字段
    private String ext;
    private String hmiId;
    private String materialCode;
    /** 产品打印 参数 结束 **/

    public List<String> repeatIds() {
        return ids.stream().distinct().collect(Collectors.toList());
    }

    public Integer getIsOrder() {
        return Objects.nonNull(isOrder) ? isOrder : 1;
    }

    public Integer getSort() {
        return Objects.nonNull(sort) ? sort : 999999;
    }
}
