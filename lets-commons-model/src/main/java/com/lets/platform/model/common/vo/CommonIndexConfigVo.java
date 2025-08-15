package com.lets.platform.model.common.vo;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 首页配置 出参
 * @author Qiao
 * @date 2021-12-07
 */
@Data
@ApiModel(description = "首页配置出参")
public class CommonIndexConfigVo extends BaseDo {

    @ApiModelProperty("关联类型 1:生产单元 2:组织")
    private String relationType;
    @ApiModelProperty("图表名称")
    private String name;
    @ApiModelProperty("图标类型 1:饼图 2:条形图")
    private String type;
    @ApiModelProperty("图标类型名称")
    private String typeName;
    @ApiModelProperty("排序")
    private String sort;
    @ApiModelProperty("状态 0:禁用 1:启用")
    private String status;

    @ApiModelProperty("关联数据")
    private List<CommonIndexConfigDetailVo> relationList = new ArrayList<>();

}
