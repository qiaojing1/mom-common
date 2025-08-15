package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.common.domain.EtlComposeFieldDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * Etl转换组件 数据传输对象
 * @author: DING WEI
 * @date: 2022/6/25 17:22
 */
@Data
@ApiModel("Etl转换组件 数据传输对象")
public class EtlComposeConvertDto {

    @NotBlank(message = "etlComposeConvert.id", groups = {Update.class})
    @ApiModelProperty("主键")
    private String id;

    @NotBlank(message = "etlComposeConvert.designId", groups = {Save.class, Update.class})
    @ApiModelProperty("etl设计主键")
    private String designId;

    @NotBlank(message = "etlComposeConvert.xmlId", groups = {Save.class, Update.class})
    @ApiModelProperty("xml节点主键")
    private String xmlId;

    @NotBlank(message = "etlComposeConvert.type", groups = {Save.class, Update.class})
    @ApiModelProperty("类型[1guid，2集合]")
    private String type;

    @NotBlank(message = "etlComposeConvert.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    private String name;

    @NotBlank(message = "etlComposeConvert.title", groups = {Save.class, Update.class})
    @Length(min = 1, max = 20, message = "etlComposeConvert.title.Length", groups = {Save.class, Update.class})
    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    @Length(max = 30, message = "etlComposeConvert.describe", groups = {Save.class, Update.class})
    private String describe;

    @ApiModelProperty("guid列名称")
    private String columnName;

    @ApiModelProperty("guid列标题")
    private String columnTitle;

    @ApiModelProperty("数据源")
    private String datasourceId;

    @ApiModelProperty("集合类型[1并集去重，2并集不去重，3交集，4差集]")
    private String collectionType;

    @ApiModelProperty("字段列表")
    private List<EtlComposeFieldDo> fieldList;

    @ApiModelProperty("集合设置-字段列表")
    private List<List<EtlComposeFieldDo>> collSettingFieldList;

}
