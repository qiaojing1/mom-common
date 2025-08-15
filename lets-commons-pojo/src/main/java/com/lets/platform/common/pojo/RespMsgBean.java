package com.lets.platform.common.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lets.platform.common.pojo.enums.RespCodeEnum;
import com.lets.platform.common.pojo.exception.LetsException;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.function.Consumer;

/**
 * 统一返回给客户端的数据格式
 **/
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class RespMsgBean<T> implements Serializable {

    public static final String FALLBACK = "fallback";

    private static final long serialVersionUID = 1L;
    /**
     * 数据
     */
    public T data;

    /**
     * 非0代码请求响应成功!
     * 0代表请求响应失败!
     */
    private int code;

    /**
     * 消息提示
     */
    private String msg;

    /**
     * stackTrace
     */
    private String stackTrace;

    public RespMsgBean() {
    }

    public RespMsgBean(T t) {
        success();
        this.data = t;
    }

    public RespMsgBean(int code) {
        this.code = code;
    }

    public RespMsgBean(int code, String msg, T data) {
        this(code);
        this.msg = msg;
        this.data = data;
    }

    public RespMsgBean<T> success() {
        success(RespCodeEnum.SUCCESS.getCode());
        return this;
    }

    public RespMsgBean<T> success(int code) {
        this.code = code;
        this.msg = RespCodeEnum.SUCCESS.getName();
        return this;
    }

    public RespMsgBean<T> success(String msg) {
        success();
        this.msg = msg;
        return this;
    }

    public RespMsgBean<T> success(String msg, T data) {
        success(msg);
        this.data = data;
        return this;
    }

    public RespMsgBean<T> success(int code, String msg) {
        success(code);
        success(msg);
        return this;
    }

    public RespMsgBean<T> success(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        return this;
    }

    public RespMsgBean<T> success(T data) {
        success();
        this.data = data;
        return this;
    }

    public RespMsgBean<T> failure(T data) {
        failure();
        this.data = data;
        return this;
    }

    public RespMsgBean<T> failure() {
        failure(RespCodeEnum.FAILURE.getCode());
        return this;
    }

    public RespMsgBean<T> failure(int code) {
        this.code = code;
        this.msg = RespCodeEnum.FAILURE.getName();
        return this;
    }

    public RespMsgBean<T> failure(String msg) {
        failure(RespCodeEnum.FAILURE.getCode());
        this.msg = msg != null ? msg : RespCodeEnum.FAILURE.getName();
        return this;
    }

    public RespMsgBean<T> failure(RespCodeEnum respCodeEnum) {
        failure(respCodeEnum.getCode());
        this.msg = respCodeEnum.getName();
        return this;
    }

    public RespMsgBean<T> failure(int code, String msg) {
        failure(code);
        this.msg = msg;
        return this;
    }

    public RespMsgBean<T> failure(String msg, T data) {
        failure(msg);
        this.data = data;
        return this;
    }

    public RespMsgBean<T> failure(int code, String msg, T data) {
        failure(code);
        failure(msg, data);
        return this;
    }

    public boolean isSuccess() {
        return this.getCode() == RespCodeEnum.SUCCESS.getCode();
    }

    public T handler() {
        if (isSuccess()) {
            return data;
        } else {
            throw new LetsException(code, msg);
        }
    }

    public T handler(T t) {
        if (isSuccess()) {
            return data == null ? t : data;
        } else {
            throw new LetsException(code, msg);
        }
    }

    public void consumer(Consumer<T> consumer) {
        if (isSuccess()) {
            if (data != null) {consumer.accept(data);}
        } else {
            throw new LetsException(code, msg);
        }
    }
}
