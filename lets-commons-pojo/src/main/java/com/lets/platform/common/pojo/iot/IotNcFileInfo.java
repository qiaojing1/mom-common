package com.lets.platform.common.pojo.iot;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * NC目录文件
 * @author: DING WEI
 * @date: 2023/2/23 11:26
 */
@Data
public class IotNcFileInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 文件名 */
    private String fileName;
    /** 文件大小，如果为目录或协议不支持获取文件大小值为null */
    private BigDecimal fileSize;
    /** 修改时间 */
    private String modifyTime;
    /** 是否为目录 */
    private Boolean isDir;
    /** main、sub */
    private String fileType;
    private String ncUri;

}
