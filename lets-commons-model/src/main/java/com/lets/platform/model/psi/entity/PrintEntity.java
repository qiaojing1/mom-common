/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.model.psi.entity;

import lombok.Data;

import java.io.InputStream;

/**
 * @ClassName PrintEntity
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2024/11/28
 */
@Data
public class PrintEntity {
    private String fileName;
    private String inputStream;
    private String type;
    private String orientation;
    private String printerName;
}
