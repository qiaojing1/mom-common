package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import lombok.Data;

/**
 * 系统参数
 * @author Qiao
 * @date 2021/09/01 17:23
 * @version 1.0
 **/
@Data
public class ParamDo extends BaseDo {

    private String tenancyId;

    private String name;

    private String code;

    private String value;
    private String jsonValue;

    private String remark;

    private String status;
}