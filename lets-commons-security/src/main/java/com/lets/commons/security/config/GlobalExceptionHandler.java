package com.lets.commons.security.config;

import com.lets.platform.common.pojo.RespMsgBean;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.exception.LetsException;
import com.lets.platform.common.pojo.message.I18nUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.TransactionSystemException;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * 全局异常处理器
 *
 * @ClassName GlobalExceptionHandler
 * @author: DING WEI
 * @create: 2021/04/23 17:02
 * @Version 1.0
 **/
@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    private Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public RespMsgBean handler(HttpServletRequest req, HttpServletResponse res, Exception e) {
        // 打印详细异常信息，便于查找
        String stackTrace = this.getExceptionMessage(e);
        log.error(stackTrace);
        int code = 0;
        String msg = "";
        BindingResult bindingResult = null;
        if (res.getStatus() == HttpStatus.BAD_REQUEST.value()) {
            res.setStatus(HttpStatus.OK.value());
        }
        if (e instanceof NullPointerException) {
            msg = "空指针异常";
        } else if (e instanceof IllegalArgumentException) {
            msg = e.getMessage();
            if(msg == null || msg.length() == 0){
                msg = "请求参数类型不匹配";
            }
        } else if (e instanceof SQLException) {
            msg = "数据库访问异常";
        } else if (e instanceof LetsException){
            LetsException serviceException = (LetsException) e;
            code = serviceException.getCode();
            msg = serviceException.getMessage();
        } else if (e instanceof MethodArgumentNotValidException) {
            // 拦截Validator异常提示信息
            MethodArgumentNotValidException exception = (MethodArgumentNotValidException) e;
            bindingResult = exception.getBindingResult();
        } else if (e instanceof BindException) {
            BindException bindException = (BindException) e;
            bindingResult = bindException.getBindingResult();
        } else if (e instanceof DataIntegrityViolationException) {
            DataIntegrityViolationException dataIntegrityViolationException = (DataIntegrityViolationException) e;
            Throwable cause = dataIntegrityViolationException.getCause();
            // Data truncation: Data too long for column 'version' at row 1
            msg = cause.getMessage().replace("Data truncation: Data too long for column '", "字段[").replace("' at row 1", "]过长");
        } else if (e instanceof TransactionSystemException) {
            msg = "获取资源失败，请稍后重试";
        } else {
            msg = "服务内部异常";
        }
        if (Objects.nonNull(bindingResult)) {
            Set<String> errorMsg = new HashSet<>();
            if (bindingResult.hasErrors()) {
                List<FieldError> fieldErrors = bindingResult.getFieldErrors();
                fieldErrors.forEach(error -> {
                    errorMsg.add(error.getDefaultMessage());
                });
            }
            msg = StringUtils.join(errorMsg, ";");
        }
        e.printStackTrace();
        RespMsgBean failure = new RespMsgBean().failure(code, msg);
        failure.setStackTrace(stackTrace);
        return failure;
    }

    @ExceptionHandler(BindException.class)
    public RespMsgBean handler(HttpServletRequest req, HttpServletResponse res, BindException e) {
        log.error(this.getExceptionMessage(e));
        BindingResult bindingResult = e.getBindingResult();
        StringBuilder msg = getMsg(bindingResult, req);
        return new RespMsgBean().failure(0, msg.toString());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public RespMsgBean handler(HttpServletRequest req, HttpServletResponse res, MethodArgumentNotValidException e) {
        log.error(this.getExceptionMessage(e));
        BindingResult bindingResult = e.getBindingResult();
        StringBuilder msg = getMsg(bindingResult, req);
        return new RespMsgBean().failure(0, msg.toString());
    }

    private StringBuilder getMsg(BindingResult bindingResult, HttpServletRequest req) {
        StringBuilder msg = new StringBuilder();
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if (!CollectionUtils.isEmpty(fieldErrors)) {
            for (FieldError fieldError : fieldErrors) {
                String defaultMessage = fieldError.getDefaultMessage();
                String message = I18nUtils.getKey(defaultMessage, req);
                msg.append(message).append(GlobalConstant.SEMICOLON_HALF_ANGLE);
            }
        }
        return msg;
    }

    /**
     * 返回错误信息字符串
     * @return 错误信息字符串
     */
    private String getExceptionMessage(Exception ex) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        ex.printStackTrace(pw);
        return sw.toString();
    }
}
