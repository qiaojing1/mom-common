package com.lets.platform.common.pojo.enums;

/**
 * Enum 接口,标准化系统内所有Enum的读取方式;
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
public interface EnumUnit<T> {
	
    /**
     * 获取枚举的编码值;
     * @return 枚举实例的值
     */
    String getCode();
    
    /**
     * 获取枚举实例的描述信息
     * @return 描述信息
     */
    String getDescription();
    
}
