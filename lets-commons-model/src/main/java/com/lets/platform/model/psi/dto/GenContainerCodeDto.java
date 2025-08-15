package com.lets.platform.model.psi.dto;

import com.lets.platform.model.common.entity.CommonExportTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Set;

/**
 * 生成容器条码 数据传输对象
 * @author: DING WEI
 * @date: 2024/10/24 15:10
 */
@Data
@ApiModel("生成容器条码 数据传输对象")
public class GenContainerCodeDto {

    @ApiModelProperty("容器主键")
    private String id;

    @ApiModelProperty("标签明细")
    private Set<String> barcodeIds;

    @ApiModelProperty("装箱状态")
    private String pickingStatus;

    /**
     * @see com.lets.platform.model.psi.enums.BarcodeGenerateSourceEnum
     */
    @ApiModelProperty("生成来源[scanPacking:扫码装箱]")
    private String generateSource;

    @ApiModelProperty("打印模板")
    private CommonExportTemplate exportTemplate;

}
