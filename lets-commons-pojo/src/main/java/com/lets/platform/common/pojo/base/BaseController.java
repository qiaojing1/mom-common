package com.lets.platform.common.pojo.base;

import com.lets.platform.common.pojo.RespMsgBean;

/**
 * 控制器的基类
 *
 * @Author DING WEI
 * @Date 2021/04/23 13:50
 * @Version 1.0
 **/
public class BaseController {

    protected static final String SUCCESS = "操作成功";

    protected static final String UPDATE_SUCCESS = "更新成功";

    protected static final String SAVE_SUCCESS = "保存成功";

    protected static final String FIND_SUCCESS = "查询成功";

    protected static final String DELETE_SUCCESS = "删除成功";

    protected static final String FAILURE = "操作失败";

    protected static final String UPDATE_FAILURE = "更新失败";

    protected static final String SAVE_FAILURE = "保存失败";

    protected static final String FIND_FAILURE = "查询失败";

    protected static final String DELETE_FAILURE = "删除失败";

    public <T> RespMsgBean<T> success() {
        return new RespMsgBean<T>().success();
    }

    public <T> RespMsgBean<T> success(Integer code) {
        return new RespMsgBean<T>().success(code);
    }

    public <T> RespMsgBean<T> success(String msg) {
        return new RespMsgBean<T>().success(msg);
    }

    public <T> RespMsgBean<T> success(T data) {
        return new RespMsgBean<T>().success(data);
    }

    public <T> RespMsgBean<T> success(Integer code, String msg) {
        return new RespMsgBean<T>().success(code, msg);
    }

    public <T> RespMsgBean<T> success(String msg, T data) {
        if (data instanceof RespMsgBean) {
            return (RespMsgBean) data;
        }
        return new RespMsgBean<T>().success(msg, data);
    }

    public <T> RespMsgBean<T> success(Integer code, String msg, T data) {
        return new RespMsgBean<T>().success(code, msg, data);
    }

    /**
     * 失败
     *
     * @author DING WEI
     * @date 2021/04/23 13:50
     */
    public <T> RespMsgBean<T> failure() {
        return new RespMsgBean<T>().failure();
    }

    public <T> RespMsgBean<T> failure(Integer code) {
        return new RespMsgBean<T>().failure(code);
    }

    public <T> RespMsgBean<T> failure(String msg) {
        return new RespMsgBean<T>().failure(msg);
    }

    public <T> RespMsgBean<T> failure(T data) {
        return new RespMsgBean<T>().failure(data);
    }

    public <T> RespMsgBean<T> failure(Integer code, String msg) {
        return new RespMsgBean<T>().failure(code, msg);
    }

    public <T> RespMsgBean<T> failure(String msg, T data) {
        return new RespMsgBean<T>().failure(msg, data);
    }

    public <T> RespMsgBean<T> failure(Integer code, String msg, T data) {
        return new RespMsgBean<T>().failure(code, msg, data);
    }

}