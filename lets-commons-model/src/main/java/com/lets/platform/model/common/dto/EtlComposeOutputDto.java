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
 * Etl输出组件 数据传输对象
 * @author: DING WEI
 * @date: 2022/6/25 16:14
 */
@Data
@ApiModel("Etl输出组件 数据传输对象")
public class EtlComposeOutputDto {

    @NotBlank(message = "etlComposeOutput.id", groups = {Update.class})
    @ApiModelProperty("输出组件主键")
    private String id;

    @NotBlank(message = "etlComposeOutput.designId", groups = {Save.class, Update.class})
    @ApiModelProperty("etl设计主键")
    private String designId;

    @NotBlank(message = "etlComposeOutput.xmlId", groups = {Save.class, Update.class})
    @ApiModelProperty("xml节点主键")
    private String xmlId;

    /**
     * 类型[1表]
     * @see com.lets.platform.model.common.enums.EtlComposeOutputTypeEnum
     */
    @NotBlank(message = "etlComposeOutput.type", groups = {Save.class, Update.class})
    @ApiModelProperty("类型[1表]")
    private String type;

    @NotBlank(message = "etlComposeOutput.title", groups = {Save.class, Update.class})
    @Length(min = 1, max = 20, message = "etlComposeOutput.title.Length", groups = {Save.class, Update.class})
    @ApiModelProperty("标题")
    private String title;

    @ApiModelProperty("描述")
    @Length(max = 30, message = "etlComposeOutput.describe", groups = {Save.class, Update.class})
    private String describe;

    @ApiModelProperty("数据源")
    private String datasourceId;

    @ApiModelProperty("表名称")
    private String tableName;

    @ApiModelProperty("更新方式[1数据附加，2数据覆盖]")
    private String updateType;

    @ApiModelProperty("批量大小")
    private Integer batchSize;

    @ApiModelProperty("字段列表")
    private List<EtlComposeFieldVo> fieldList;

    @ApiModelProperty(value = "租户主键", hidden = true)
    private String tenancyId;

}
