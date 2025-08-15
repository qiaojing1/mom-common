package com.lets.platform.model.common.enums;

import com.lets.platform.common.pojo.enums.IEnum;
import org.springframework.util.StringUtils;

/**
 * 设备台账类型
 * @author DING WEI
 * @date 2023/10/30 15:23
 * @version 1.0
 */
public enum DeviceLedgerTypeEnum implements IEnum<Object> {

    AIR_COMPRESSION("3eb1518e-6f00-4a77-bb4f-cdfa33af9324", "空压机台账", "1"),
    LIGHTING("584a6d2b-3261-4348-b415-5fe9122d15c4", "照明台账", "2"),
    INSTRUMENT("bc52a5f4-91aa-4f0b-969c-a4798396e3e7", "仪表台账", "3"),
    DEVICE("8e96c8a7-a77e-4771-84d9-4b79ebe84b77", "设备台账", "4"),
    DEVICE_DEPRECIATION("994f4c71-4e0d-45bb-bebe-4076bda03dbe", "设备折旧月度报表", "4"),
    LOCK_DEVICE("0c7f70f0-1175-44b4-a507-f97fc6ca6639", "设备锁机控制", "1,2,3,4"),
    ;

    private String value;

    private String name;

    private String menuCode;

    DeviceLedgerTypeEnum(String menuCode, String name, String value) {
        this.value = value;
        this.name = name;
        this.menuCode = menuCode;
    }

    public static String getValue(String name) {
        if (StringUtils.isEmpty(name)) {
            return null;
        }
        for (DeviceLedgerTypeEnum element : DeviceLedgerTypeEnum.values()) {
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
        for (DeviceLedgerTypeEnum element : DeviceLedgerTypeEnum.values()) {
            if (value.equals(element.getValue())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getNameByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (DeviceLedgerTypeEnum element : DeviceLedgerTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getName();
            }
        }
        return null;
    }

    public static String getValueByMenuCode(String menuCode) {
        if (StringUtils.isEmpty(menuCode)) {
            return null;
        }
        for (DeviceLedgerTypeEnum element : DeviceLedgerTypeEnum.values()) {
            if (menuCode.equals(element.getMenuCode())) {
                return element.getValue();
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

    public String getMenuCode() {
        return menuCode;
    }
}
