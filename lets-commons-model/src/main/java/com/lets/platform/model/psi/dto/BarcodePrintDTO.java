package com.lets.platform.model.psi.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BarcodePrintDTO {

    private Set<String> barcodeIds;
    private String printerName;
    private String printerUrl;
    private Set<String> containerIds;
    private String ext;  //扩展字段
    private String hmiId;  //扩展字段
    private String materialCode;  //扩展字段
    private LocalDateTime now;  //扩展字段
}
