package com.lets.platform.model.common.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BarcodeParserDTO {

    private String barcode;

    @ApiModelProperty("解析菜单[0:生产配料]")
    private String menu;

    private Map<String, String> map = new HashMap<>();
}
