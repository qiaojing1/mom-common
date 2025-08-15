package com.lets.platform.model.psi.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 容器类型 枚举 @ClassName ResetPeriodEnum
 *
 * @author: QIAO
 * @create: 2021/08/18 08:45 @Version 1.0
 */
public enum CustomerTypeEnum implements IEnum<Object> {
  NORMAL("1", "普通客户"),
  OUT("2", "寄售客户"),
  ;

  private String value;

  private String name;

  CustomerTypeEnum(String value, String name) {
    this.value = value;
    this.name = name;
  }

  public static String getValue(String name) {
    if (StringUtils.isEmpty(name)) {
      return null;
    }
    for (CustomerTypeEnum element : CustomerTypeEnum.values()) {
      if (name.equals(element.getName())) {
        return element.getValue();
      }
    }
    return null;
  }

  public static boolean containsName(String name){
    if (StringUtils.isEmpty(name)) {
      return false;
    }
    for (CustomerTypeEnum element : CustomerTypeEnum.values()) {
      if (name.equals(element.getName())) {
        return true;
      }
    }
    return false;
  }

  public static String getName(String value) {
    if (StringUtils.isEmpty(value)) {
      return null;
    }
    for (CustomerTypeEnum element : CustomerTypeEnum.values()) {
      if (value .equals( element.getValue())) {
        return element.getName();
      }
    }
    return null;
  }

  @Override
  public String getValue() {
    return value;
  }

  public String getName() {
    return name;
  }
}
