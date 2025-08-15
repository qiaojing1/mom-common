package com.lets.platform.model.tpm.enums;

import org.hibernate.validator.constraints.NotBlank;
import com.lets.platform.model.tpm.enums.*;
import java.util.ArrayList;
import java.util.List;

public enum MaintainOrderStatus {
    WAIT_REPONSE("1","待响应"),
    HANDLE("2","保养中"),
    COMPLETE("3","保养完成"),
    REVIEWED("4","审核通过"),
    NOT_PASS("5","审核不通过"),
    CANCEL("6","已作废"),
    SCRAP("7","已报废"),
    ALLOCATION_ED("8","已调拨");

    String code;

    String message;

    private MaintainOrderStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static MaintainOrderStatus getEnumByCode(@NotBlank(message = "code不能为空") String code) {
        MaintainOrderStatus[] values = MaintainOrderStatus.values();
        for (MaintainOrderStatus roleType : values) {
            if (roleType.getCode().equals(code)) {
                return roleType;
            }
        }
        return null;
    }

    public static List<String> getNotComplete() {
        List<String> notComplete = new ArrayList<>();
        notComplete.add(WAIT_REPONSE.getCode());
        notComplete.add(HANDLE.getCode());
        return notComplete;
    }
}
