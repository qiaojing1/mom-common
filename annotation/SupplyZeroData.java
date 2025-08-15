package com.lets.platform.common.pojo.annotation;

import java.lang.annotation.*;

/**
 * 补充数据
 * @author DING WEI
 * @date 2022/5/18 10:23
 * @version 1.0
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SupplyZeroData {

}