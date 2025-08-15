package com.lets.platform.model.common.dto;

import com.lets.platform.common.pojo.valid.Save;
import com.lets.platform.common.pojo.valid.Update;
import com.lets.platform.model.common.vo.ExportTemplateDetailVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * 导出-模板 数据传输对象
 * @author: DING WEI
 * @date: 2022/9/20 10:13
 */
@Data
@ApiModel("导出-模板 数据传输对象")
public class ExportTemplateDto {

    @NotBlank(message = "ExportTemplateDto.id", groups = {Update.class})
    @ApiModelProperty("主键")
    private String id;

    @NotBlank(message = "ExportTemplateDto.name", groups = {Save.class, Update.class})
    @ApiModelProperty("名称")
    private String name;

    @NotBlank(message = "ExportTemplateDto.menuCode", groups = {Save.class, Update.class})
    @ApiModelProperty("功能")
    private String menuCode;

    @NotBlank(message = "ExportTemplateDto.templateFileId", groups = {Save.class, Update.class})
    @ApiModelProperty("模板文件")
    private String templateFileId;

    @ApiModelProperty("模板中表格行数[除去标题行、total合计行]")
    private Integer rowNumber;

    @ApiModelProperty("是否批量[YN]")
    private String isBat;

    @ApiModelProperty("变量明细")
    private List<ExportTemplateDetailVo> details;

}
