package com.lets.platform.model.device.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.lets.commons.easyexcel.entity.ExcelName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * 导入导出设备
 * @author DING WEI
 * @date 1521/5/12 15:19
 * @version 1.0
 **/
@Data
public class DeviceExcelVo {

    @ExcelIgnore
    private Integer order;

    @ColumnWidth(15)
    @ExcelProperty(value  = "设备名称", index = 1, order = 1)
    @ExcelName(names = {"设备名称","Device Name","デバイス名"})
    private String deviceName;

    @ColumnWidth(15)
    @ExcelProperty(value = "设备编码", index = 2, order = 2)
    @ExcelName(names = {"设备编码","Equipment coding","デバイスコーディング"})
    private String code;

    @ColumnWidth(15)
    @ExcelProperty(value = "资产编码", index = 3, order = 3)
    @ExcelName(names = {"资产编码","Asset Code","資産コード"})
    private String assetsCode;

    @ColumnWidth(15)
    @ExcelProperty(value = "使用部门", index = 4, order = 4)
    @ExcelName(names = {"使用部门","user department","使用部署"})
    private String useDeptName;
    @ExcelIgnore
    private String useDept;

    @ColumnWidth(15)
    @ExcelProperty(value = "维保部门", index = 5, order = 5)
    @ExcelName(names = {"维保部门","Maintenance department","保守部門"})
    private String maintenanceDeptName;
    @ExcelIgnore
    private String maintenanceDept;

    @ColumnWidth(15)
    @ExcelProperty(value = "保养等级", index = 6, order = 6)
    @ExcelName(names = {"保养等级","Maintenance level","保守レベル"})
    private String maintainGrade;

    @ColumnWidth(15)
    @ExcelProperty(value = "物联状态", index = 7, order = 7)
    @ExcelName(names = {"物联状态","IoT status","ぶったいじょうたい"})
    private String internetStatusName;
    @ExcelIgnore
    private String internetStatus;

    @ColumnWidth(15)
    @ExcelProperty(value = "设备等级", index = 8, order = 8)
    @ExcelName(names = {"设备等级","Equipment level","デバイスレベル"})
    private String deviceGradeName;
    @ExcelIgnore
    private String deviceGrade;
    @ColumnWidth(15)
    @ExcelProperty(value = "容差值", index = 9, order = 9)
    @ExcelName(names = {"容差值","tolerance","許容値"})
    private String toleranceValue;

    @ColumnWidth(15)
    @ExcelProperty(value = "倍率", index = 10, order = 10)
    @ExcelName(names = {"倍率","Magnification","倍率"})
    private String magnification;
    @ColumnWidth(15)
    @ExcelProperty(value = "能源分项", index = 11, order = 11)
    @ExcelName(names = {"能源分项","Energy sub item","エネルギーセクション"})
    private String energyTypeName;
    @ExcelIgnore
    private String energyType;
    @ColumnWidth(15)
    @ExcelProperty(value = "是否总表", index = 12, order = 12)
    @ExcelName(names = {"是否总表","Is it a summary table","マスターテーブルかどうか"})
    private String totalPowerName;
    @ExcelIgnore
    private String totalPower;

    @ColumnWidth(15)
    @ExcelProperty(value = "表计量程", index = 13, order = 13)
    @ExcelName(names = {"表计量程","Meter range","ゲージレンジ"})
    private String meterRange;
    @ColumnWidth(20)
    @ExcelProperty(value = "前后点位差值", index = 14, order = 14)
    @ExcelName(names = {"前后点位差值","Difference between front and rear points","前後ポイント差値"})
    private String pointDiffValue;

    @ColumnWidth(15)
    @ExcelProperty(value = "资产状态", index = 15, order = 15)
    @ExcelName(names = {"资产状态","Asset status","資産ステータス"})
    private String assetsStatusName;
    @ExcelIgnore
    private String assetsStatus;

    @ColumnWidth(15)
    @ExcelProperty(value = "生产单元", index = 16, order = 16)
    @ExcelName(names = {"生产单元","Production unit","生産ユニット"})
    private String factoryModeName;
    @ExcelIgnore
    private String factoryModeId;

    @ColumnWidth(15)
    @ExcelProperty(value = "安装位置", index = 17, order = 17)
    @ExcelName(names = {"安装位置","Installation position","インストール場所"})
    private String installAddress;

    @ColumnWidth(15)
    @ExcelProperty(value = "设备型号", index = 18, order = 18)
    @ExcelName(names = {"设备型号","Equipment model","設備型番"})
    private String modelName;
    @ExcelIgnore
    private String modelId;

    @ColumnWidth(15)
    @ExcelProperty(value = "设备类型", index = 19, order = 19)
    @ExcelName(names = {"设备类型","Device Type","デバイスタイプ"})
    private String typeName;
    @ExcelIgnore
    private String typeId;

    @ColumnWidth(15)
    @ExcelProperty(value = "控制器", index = 20, order = 20)
    @ExcelName(names = {"控制器","controller","コントローラコントローラ"})
    private String controllerName;
    @ExcelIgnore
    private String controllerId;

    @ColumnWidth(15)
    @ExcelProperty(value = "生产厂商", index = 21, order = 21)
    @ExcelName(names = {"生产厂商","Manufacturer","メーカー"})
    private String manufacturerName;
    @ExcelIgnore
    private String manufacturerId;

    @ColumnWidth(15)
    @ExcelProperty(value = "供应商", index = 22, order = 22)
    @ExcelName(names = {"供应商","supplier","サプライヤ"})
    private String supplierName;
    @ExcelIgnore
    private String supplierId;

    @ColumnWidth(15)
    @ExcelProperty(value = "购置日期", index = 23, order = 23)
    @ExcelName(names = {"购置日期","Acquisition Date","購入日"})
    private String purchaseTimeFormat;
    @ExcelIgnore
    private Long purchaseTime;

    @ColumnWidth(15)
    @ExcelProperty(value = "购置金额", index = 24, order = 24)
    @ExcelName(names = {"购置金额","Purchase amount","購入金額"})
    private String purchaseAmount;

    @ColumnWidth(15)
    @ExcelProperty(value = "入厂日期", index = 25, order = 25)
    @ExcelName(names = {"入厂日期","Date of entry into the factory","出荷日"})
    private String admissionTimeFormat;
    @ExcelIgnore
    private Long admissionTime;

    @ColumnWidth(15)
    @ExcelProperty(value = "质保日期", index = 26, order = 26)
    @ExcelName(names = {"质保日期","Warranty date","品質保証日"})
    private String warrantyTimeFormat;
    @ExcelIgnore
    private Long warrantyTime;

    @ColumnWidth(15)
    @ExcelProperty(value = "备注", index = 27, order = 27)
    @ExcelName(names = {"备注","notes","コメント"})
    private String remark;

    @ColumnWidth(15)
    @ExcelProperty(value = "工位机IP", index = 28, order = 28)
    @ExcelName(names = {"工位机IP","Workstation IP","ステーションマシンIP"})
    private String machineIp;
    @ColumnWidth(25)
    @ExcelProperty(value = "最近登录日期", index = 29, order = 29)
    @ExcelName(names = {"最近登录日期","Last login date","最新ログイン日"})
    private String latelyLoginTime;
    @ColumnWidth(25)
    @ExcelProperty(value = "最近登录人员", index = 30, order = 30)
    @ExcelName(names = {"最近登录人员","Recently logged in personnel","最近のログインユーザ"})
    private String latelyLoginUserName;
    @ExcelProperty(value ="网关id", index = 31, order = 31)
    @ColumnWidth(25)
    @ExcelName(names = {"网关id","Gateway ID","ゲートウェイID"})
    private String gatewayName;
    @ExcelProperty(value = "nc主程序目录", index = 32, order = 32)
    @ColumnWidth(25)
    @ExcelName(names = {"nc主程序目录","NC main program directory","ncホームプログラムディレクトリ"})
    private String ncMainUri;
    @ExcelProperty(value = "nc子程序目录", index = 33, order = 33)
    @ColumnWidth(25)
    @ExcelName(names = {"nc子程序目录","NC subroutine directory","ncサブルーチンディレクトリ"})
    private String ncSubUri;
    public Set<String> getAllDeptName() {
        Set<String> allDept = new HashSet<>();
        if (StringUtils.isNotBlank(useDeptName)) {
            allDept.add(useDeptName);
        }
        if (StringUtils.isNotBlank(maintenanceDeptName)) {
            allDept.add(maintenanceDeptName);
        }
        return allDept;
    }
}
