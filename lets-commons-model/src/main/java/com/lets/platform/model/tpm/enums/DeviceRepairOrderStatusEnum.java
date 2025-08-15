package com.lets.platform.model.tpm.enums;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;
import com.lets.platform.model.tpm.enums.*;

import java.util.Arrays;
import java.util.List;

/**
 * 设备故障报修 枚举
 * @author Qiao
 * @date 11/18/21 14:30
 * @version 1.0
 */
public enum DeviceRepairOrderStatusEnum implements IEnum<Object> {

    WAIT_RESPONSE("1","待响应"),
    HANDLE("2","处理中"),
    COMPLETE("4","已完成"),
    CANCLE("5","已取消"),
    HANG_UP("6","挂起"),
    OUTSOURCING("7","委外"),
    OFF("8","已报废"),
    ALLOCATION_ED("9","已调拨"),
    ;

    private String value;

    private String name;

    DeviceRepairOrderStatusEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DeviceRepairOrderStatusEnum element : DeviceRepairOrderStatusEnum.values()) {
            if (name.equals(element.getName())) {
                return element.getValue();
            }
        }
        return null;
    }

    public static String getName(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }
        for (DeviceRepairOrderStatusEnum element : DeviceRepairOrderStatusEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }


    @Override
    public String getValue() {
        return value;
    }


    public String getName() {
        return name;
    }
    /**
     * 获取枚举中的编码[除了参数中的编码]
     * @param codeArr 需要该处在外的编码
     * @return
     * @Author DING WEI
     * @Date 2021/1/11 16:47
     * @Version 1.0
     **/
    public static String[] getCodeArrExcept(String... codeArr) {
        String[] result = new String[DeviceRepairOrderStatusEnum.values().length - codeArr.length];
        List<String> codeList = Arrays.asList(codeArr);
        int i = GlobalConstant.ZERO;
        for (DeviceRepairOrderStatusEnum element : DeviceRepairOrderStatusEnum.values()) {
            String code = element.getValue();
            if (!codeList.contains(code)) {
                result[i] = element.getValue();
                i += 1;
            }
        }
        return result;
    }
}
