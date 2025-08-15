package com.lets.commons.security.access;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈开启安全访问，根据UPM中权限进行判断〉
 *
 * @author DING WEI
 * @create 2019/1/7
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
//@Import(SecurityAccessAutoConfiguration.class)
public @interface EnableSecurityAccess {

}