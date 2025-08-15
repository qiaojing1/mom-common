package com.lets.platform.common.pojo.base;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class ScanFeedLog implements Serializable {
    private static final long serialVersionUID = 1L;

    private String code;
    private Integer success;  //200成功,0失败
    private String msg;  //失败的原因
    private String hmiId;  //失败的原因
    private LocalDateTime time;

}
