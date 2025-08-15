package com.lets.platform.model.device.query;

import com.lets.platform.common.pojo.base.PageQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 工厂建模查询参数
 *
 * @version 1.0
 * @ClassName DeviceFactoryModeQuery
 * @author: Qiao
 * @create: 2021/08/20 22:56
 **/
@Data
@ApiModel("工厂建模查询参数")
public class DeviceFactoryModeQuery extends PageQuery {

    @ApiModelProperty("生产单元名称")
    private String modeName;

    @ApiModelProperty("生产单元编码")
    private String code;

    @ApiModelProperty("单元类型")
    private String modeType;
    @ApiModelProperty(hidden = true)
    private String moreThanType;

    @ApiModelProperty("单元状态")
    private String status;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
    @ApiModelProperty(hidden = true)
    private String id;
    @ApiModelProperty(hidden = true)
    private List<String> ids;
    @ApiModelProperty(hidden = true)
    private String parentModeCode;
    @ApiModelProperty(hidden = true)
    private List<String> codeList;
}
