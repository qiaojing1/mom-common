package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.common.vo.EtlComposeFieldVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * Etl输入组件 数据传输对象
 * @author: DING WEI
 * @date: 2022/6/25 11:21
 */
@Data
@ApiModel("Etl输入组件 数据传输对象")
public class EtlComposeInputDto {

    @NotBlank(message = "etlComposeInput.id", groups = {Update.class})
    @ApiModelProperty("主键")
    private String id;

    @NotBlank(message = "etlComposeInput.designId", groups = {Save.class, Update.class})
    @ApiModelProperty("etl设计主键")
    private String designId;

    @NotBlank(message = "etlComposeInput.xmlId", groups = {Save.class, Update.class})
    @ApiModelProperty("xml节点主键")
    private String xmlId;

    /**
     * 输入组件类型
     * @see com.lets.platform.model.common.enums.EtlComposeInputTypeEnum
     */
    @NotBlank(message = "etlComposeInput.type", groups = {Save.class, Update.class})
    @ApiModelProperty("类型[1sql]")
    private String type;

    @NotBlank(message = "etlComposeInput.title", groups = {Save.class, Update.class})
    @Length(min = 1, max = 20, message = "etlComposeInput.title.Length", groups = {Save.class, Update.class})
    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    @Length(max = 30, message = "etlComposeInput.describe", groups = {Save.class, Update.class})
    private String describe;

    @ApiModelProperty("数据源")
    private String datasourceId;

    @ApiModelProperty("sql语句")
    private String sql;

    @ApiModelProperty("是否增量[NY]")
    private String isIncrement;
    @ApiModelProperty("增量类型[1时间戳增量]")
    private String incrementType;
    @ApiModelProperty("时间戳字段")
    private String timestampField;

    @ApiModelProperty("字段列表")
    private List<EtlComposeFieldVo> fieldList;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
