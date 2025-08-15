package com.lets.platform.model.uc.enums;

import lombok.Getter;

/**
 * 审批意见的类型
 *
 * @date : 2022/05/25
 */
@Getter
public enum CommentTypeEnum {
    FQ("发起", "0"), CH("撤回", "1"), SP("通过", "2"), BH("驳回", "3"), FS("反审", "4"),

    JS("结束", "5"), FJ("否决", "6"), ZC("暂存", "7"),
    TJ("提交", "8"), SPTG("审批通过", "9");

    private final String name; // 名称

    private final String value;

    private CommentTypeEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * 通过type获取Msg
     *
     * @param type
     * @return @Description:
     */
    public static String getEnumMsgByType(String type) {
        for (CommentTypeEnum e : CommentTypeEnum.values()) {
            if (e.toString().equals(type)) {
                return e.name;
            }
        }
        return "";
    }

}
