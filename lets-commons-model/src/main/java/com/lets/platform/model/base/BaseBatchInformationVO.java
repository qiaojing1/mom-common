package com.lets.platform.model.base;

import com.lets.platform.common.pojo.enums.ExceptionEnums;
import com.lets.platform.common.pojo.enums.MethodTypeEnum;
import com.lets.platform.common.pojo.message.I18nUtils;
import com.lets.platform.model.base.enums.BaseInfoTypeEnum;
import com.lets.platform.model.base.enums.ErrorCodeEnum;
import lombok.Data;

@Data
public class BaseBatchInformationVO {

    private Object data;
    private String id;
    private Integer code;
    /**
     * @see com.lets.platform.model.base.enums.BaseInfoTypeEnum
     */
    private String type;
    private String message;
    private MethodTypeEnum methodTypeEnum;
    /**
     * @see ErrorCodeEnum
     */
    private String errorCode;
    private Integer version;

    public BaseBatchInformationVO() {
    }

    public BaseBatchInformationVO(String id, MethodTypeEnum methodTypeEnum) {
        this(id, 200,
                methodTypeEnum == MethodTypeEnum.DELETE ? I18nUtils.getKey(ExceptionEnums.DELETE_SUCCESS) :
                        methodTypeEnum == MethodTypeEnum.ENABLE ? I18nUtils.getKey(ExceptionEnums.ENABLE_SUCCESS) :
                                methodTypeEnum == MethodTypeEnum.DISABLE ? I18nUtils.getKey(ExceptionEnums.DISABLE_SUCCESS) :
                                        I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS),
                methodTypeEnum == MethodTypeEnum.DELETE ? ErrorCodeEnum.DELETE_SUCCESS :
                        methodTypeEnum == MethodTypeEnum.ENABLE ? ErrorCodeEnum.ENABLE_SUCCESS :
                                methodTypeEnum == MethodTypeEnum.DISABLE ? ErrorCodeEnum.DISABLE_SUCCESS :
                                        ErrorCodeEnum.SUCCESS);
    }

    public BaseBatchInformationVO(String id, MethodTypeEnum methodTypeEnum, BaseInfoTypeEnum typeEnum) {
        this(id, 200,
                methodTypeEnum == MethodTypeEnum.DELETE ? I18nUtils.getKey(ExceptionEnums.DELETE_SUCCESS) :
                        methodTypeEnum == MethodTypeEnum.ENABLE ? I18nUtils.getKey(ExceptionEnums.ENABLE_SUCCESS) :
                                methodTypeEnum == MethodTypeEnum.DISABLE ? I18nUtils.getKey(ExceptionEnums.DISABLE_SUCCESS) :
                                        I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS),
                methodTypeEnum == MethodTypeEnum.DELETE ? ErrorCodeEnum.DELETE_SUCCESS :
                        methodTypeEnum == MethodTypeEnum.ENABLE ? ErrorCodeEnum.ENABLE_SUCCESS :
                                methodTypeEnum == MethodTypeEnum.DISABLE ? ErrorCodeEnum.DISABLE_SUCCESS :
                                        ErrorCodeEnum.SUCCESS,
                typeEnum);
    }

    public BaseBatchInformationVO(String id, MethodTypeEnum methodTypeEnum, ErrorCodeEnum errorCode) {
        this(id, 200,
                methodTypeEnum == MethodTypeEnum.DELETE ? I18nUtils.getKey(ExceptionEnums.DELETE_SUCCESS) :
                        methodTypeEnum == MethodTypeEnum.ENABLE ? I18nUtils.getKey(ExceptionEnums.ENABLE_SUCCESS) :
                                methodTypeEnum == MethodTypeEnum.DISABLE ? I18nUtils.getKey(ExceptionEnums.DISABLE_SUCCESS) :
                                        I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS),
                errorCode);
    }

    public BaseBatchInformationVO(String id, MethodTypeEnum methodTypeEnum, ErrorCodeEnum errorCode, Object data) {
        this(id, 200,
                methodTypeEnum == MethodTypeEnum.DELETE ? I18nUtils.getKey(ExceptionEnums.DELETE_SUCCESS) :
                        methodTypeEnum == MethodTypeEnum.ENABLE ? I18nUtils.getKey(ExceptionEnums.ENABLE_SUCCESS) :
                                methodTypeEnum == MethodTypeEnum.DISABLE ? I18nUtils.getKey(ExceptionEnums.DISABLE_SUCCESS) :
                                        I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS),
                errorCode, data);
    }

    public BaseBatchInformationVO(String id, MethodTypeEnum methodTypeEnum, ErrorCodeEnum errorCode, Object data, BaseInfoTypeEnum typeEnum) {
        this(id, 200,
                methodTypeEnum == MethodTypeEnum.DELETE ? I18nUtils.getKey(ExceptionEnums.DELETE_SUCCESS) :
                        methodTypeEnum == MethodTypeEnum.ENABLE ? I18nUtils.getKey(ExceptionEnums.ENABLE_SUCCESS) :
                                methodTypeEnum == MethodTypeEnum.DISABLE ? I18nUtils.getKey(ExceptionEnums.DISABLE_SUCCESS) :
                                        I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS),
                errorCode, data, typeEnum);
    }

    public BaseBatchInformationVO(String id, MethodTypeEnum methodTypeEnum, ErrorCodeEnum errorCode, Integer version) {
        this(id, 200,
                methodTypeEnum == MethodTypeEnum.DELETE ? I18nUtils.getKey(ExceptionEnums.DELETE_SUCCESS) :
                        methodTypeEnum == MethodTypeEnum.ENABLE ? I18nUtils.getKey(ExceptionEnums.ENABLE_SUCCESS) :
                                methodTypeEnum == MethodTypeEnum.DISABLE ? I18nUtils.getKey(ExceptionEnums.DISABLE_SUCCESS) :
                                        methodTypeEnum == MethodTypeEnum.OPEN ? I18nUtils.getKey(ExceptionEnums.OPEN_SUCCESS) :
                                                methodTypeEnum == MethodTypeEnum.CLOSE ? I18nUtils.getKey(ExceptionEnums.CLOSE_SUCCESS) :
                                        I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS),
                errorCode, version);
    }

    public BaseBatchInformationVO(String id, MethodTypeEnum methodTypeEnum, ErrorCodeEnum errorCode, Integer version, BaseInfoTypeEnum typeEnum) {
        this(id, 200,
                methodTypeEnum == MethodTypeEnum.DELETE ? I18nUtils.getKey(ExceptionEnums.DELETE_SUCCESS) :
                        methodTypeEnum == MethodTypeEnum.ENABLE ? I18nUtils.getKey(ExceptionEnums.ENABLE_SUCCESS) :
                                methodTypeEnum == MethodTypeEnum.DISABLE ? I18nUtils.getKey(ExceptionEnums.DISABLE_SUCCESS) :
                                        methodTypeEnum == MethodTypeEnum.OPEN ? I18nUtils.getKey(ExceptionEnums.OPEN_SUCCESS) :
                                                methodTypeEnum == MethodTypeEnum.CLOSE ? I18nUtils.getKey(ExceptionEnums.CLOSE_SUCCESS) :
                                                        I18nUtils.getKey(ExceptionEnums.OPERATE_SUCCESS),
                errorCode, version, typeEnum);
    }

    public BaseBatchInformationVO(String id, Integer code, String message) {
        this.id = id;
        this.code = code;
        this.message = message;
    }

    public BaseBatchInformationVO(String id, Integer code, String message, ErrorCodeEnum errorCode) {
        this.id = id;
        this.code = code;
        this.message = message;
        this.errorCode = errorCode.getValue();
    }

    public BaseBatchInformationVO(String id, Integer code, String message, ErrorCodeEnum errorCode, Object data) {
        this.id = id;
        this.code = code;
        this.message = message;
        this.errorCode = errorCode.getValue();
        this.data = data;
    }

    public BaseBatchInformationVO(String id, Integer code, String message, ErrorCodeEnum errorCode, Object data, BaseInfoTypeEnum typeEnum) {
        this.id = id;
        this.code = code;
        this.message = message;
        this.errorCode = errorCode.getValue();
        this.data = data;
        this.type = typeEnum.getValue();
    }

    public BaseBatchInformationVO(String id, Integer code, String message, ErrorCodeEnum errorCode, BaseInfoTypeEnum typeEnum) {
        this.id = id;
        this.code = code;
        this.message = message;
        this.errorCode = errorCode.getValue();
        this.type = typeEnum.getValue();
    }

    public BaseBatchInformationVO(String id, Integer code, String message, ErrorCodeEnum errorCode, Integer version) {
        this.id = id;
        this.code = code;
        this.message = message;
        this.errorCode = errorCode.getValue();
        this.version = version;
    }

    public BaseBatchInformationVO(String id, Integer code, String message, ErrorCodeEnum errorCode, Integer version, BaseInfoTypeEnum typeEnum) {
        this.id = id;
        this.code = code;
        this.message = message;
        this.errorCode = errorCode.getValue();
        this.version = version;
        this.type = typeEnum.getValue();
    }

    public BaseBatchInformationVO(String id, Integer code, String message, MethodTypeEnum methodTypeEnum) {
        this.id = id;
        this.code = code;
        this.message = message;
        this.methodTypeEnum = methodTypeEnum;
    }
}
