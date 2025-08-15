package com.lets.commons.easyexcel.entity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface ExcelName {
 
    //这里是数组，可以放入表头的多个语言，各语言在数组的位置需固定，工具类会用到
    String[] names() default {};
}