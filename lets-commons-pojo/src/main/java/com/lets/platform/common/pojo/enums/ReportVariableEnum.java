package com.lets.platform.common.pojo.enums;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 状态 枚举 @ClassName StatusEnum
 *
 * @author: DING WEI
 * @create: 2021/04/27 13:32 @Version 1.0
 */
public enum ReportVariableEnum implements IEnum<Object> {
  WaterManagement("waterManagement", "农机用水");

  private String value;

  private String name;

  ReportVariableEnum(String value, String name) {
    this.value = value;
    this.name = name;
  }

  @Override
  public String getValue() {
    return value;
  }

  public String getName() {
    return name;
  }
}
