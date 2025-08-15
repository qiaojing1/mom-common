package com.lets.platform.common.pojo.exception;

import com.lets.platform.common.pojo.enums.EnumUnit;

/**
 * 统一异常
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
public class LetsException extends RuntimeException implements ExceptionInfoGetter {

	private static final long serialVersionUID = 1L;

	private Integer code ;

    private String content;

    public LetsException(EnumUnit enumUnit) {
        super(enumUnit.getDescription());
        this.code = Integer.parseInt(enumUnit.getCode());
        this.content = enumUnit.getDescription();
    }

    public LetsException(String content) {
        super(content);
        this.content = content;
    }

    public LetsException(String content, Throwable throwable) {
        super(content, throwable);
        this.content = content;
    }

    public LetsException(Integer code, String content) {
        super(content);
        this.code = code;
        this.content = content;
    }

    public LetsException(Integer code, String content, Throwable throwable) {
        super(content, throwable);
        this.code = code;
        this.content = content;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
	@Override
	public ExceptionInfo getInfo() {
		return new ExceptionInfo(this.code, this.content);
	}

}
