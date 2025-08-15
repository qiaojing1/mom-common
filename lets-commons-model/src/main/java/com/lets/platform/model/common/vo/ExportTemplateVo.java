package com.lets.platform.model.common.vo;

import com.lets.platform.model.common.entity.CommonFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 导出-模板 展示对象
 *
 * @author: DING WEI
 * @date: 2022/9/20 10:13
 */
@Data
@ApiModel("导出-模板 展示对象")
public class ExportTemplateVo {

    @ApiModelProperty("主键")
    private String id;

    @ApiModelProperty("名称")
    private String name;

    @ApiModelProperty("功能")
    private String menuCode;
    /**
     * @see com.lets.platform.model.common.enums.ExportTemplateMenuCodeEnum
     */
    private String menuCodeName;

    @ApiModelProperty("模板文件")
    private String templateFileId;
    private CommonFile templateFileDo;

    @ApiModelProperty("状态[0未发布1已发布]")
    private String status;
    private String statusName;

    @ApiModelProperty("租户id")
    private String tenancyId;

    @ApiModelProperty("表格行数")
    private Integer rowNumber;
    @ApiModelProperty("WORD是否包含列表(Y包含N不包含)")
    private String wordContainList;

    @ApiModelProperty("明细")
    private List<ExportTemplateDetailVo> details;

    @ApiModelProperty("子模板")
    private List<ExportTemplateVo> child;

    @ApiModelProperty("是否批量")
    private String isBat;

}
