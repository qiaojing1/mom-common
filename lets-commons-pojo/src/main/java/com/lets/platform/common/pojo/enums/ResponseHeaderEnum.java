package com.lets.platform.common.pojo.enums;

/**
 * 响应头 枚举
 *
 * @ClassName ResponseHeaderEnum
 * @author: DING WEI
 * @create: 2021/04/23 16:25
 * @Version 1.0
 **/
public enum ResponseHeaderEnum {

    CONTENT_TYPE_EXCEL("Content-Type", "application/vnd.ms-excel"),
    CONTENT_TYPE_OCTET_STREAM("Content-Type", "application/octet-stream"),

    CONTENT_TYPE_XLS("Content-Type", "application/vnd.ms-excel"),
    CONTENT_TYPE_XLSX("Content-Type", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),

    CONTENT_TYPE_DOC("Content-Type", "application/msword"),
    CONTENT_TYPE_DOCX("Content-Type", "application/vnd.openxmlformats-officedocument.wordprocessingml.document"),

    CONTENT_TYPE_PDF("Content-Type", "application/pdf"),

    CONTENT_DISPOSITION("Content-Disposition", "attachment;filename="),

    PRAGMA_NO_CACHE("Pragma", "No-cache"),
    PRAGMA_NO_STORE("Pragma", "No-store");

    private String name;
    private String value;

    ResponseHeaderEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
