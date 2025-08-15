package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 重置周期 枚举 @ClassName ResetPeriodEnum
 *
 * @author: QIAO
 * @create: 2021/08/18 08:45 @Version 1.0
 */
public enum CheckStatusEnum implements IEnum<Object> {
  NORMAL(1, "正常"),
  ABNORMAL(2, "异常"),
  ADVENT(3, "临期"),
  OVERDUE(4, "过期"),
  REVIEWED(5, "待复审"),
  ;

  private Integer value;

  private String name;

  CheckStatusEnum(Integer value, String name) {
    this.value = value;
    this.name = name;
  }

  public static Integer getValue(String name) {
    if (StringUtils.isEmpty(name)) {
      return null;
    }
    for (CheckStatusEnum element : CheckStatusEnum.values()) {
      if (name.equals(element.getName())) {
        return element.getValue();
      }
    }
    return null;
  }

  public static String getName(Integer value) {
    if (StringUtils.isEmpty(value)) {
      return null;
    }
    for (CheckStatusEnum element : CheckStatusEnum.values()) {
      if (value == element.getValue()) {
        return element.getName();
      }
    }
    return null;
  }

  @Override
  public Integer getValue() {
    return value;
  }

  public String getName() {
    return name;
  }
}
