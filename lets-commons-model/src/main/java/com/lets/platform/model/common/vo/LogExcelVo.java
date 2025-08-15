package com.lets.platform.model.common.vo;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.lets.commons.easyexcel.entity.ExcelName;
import lombok.Data;

/**
 * @description: 日志导出对象
 * @author: DING WEI
 * @date: 8/17/21 10:41 AM
 */
@Data
public class LogExcelVo {

    @ColumnWidth(10)
    @ExcelProperty(value  = "序号")
    @ExcelName(names = {"序号", "order number","シーケンス番号"})
    private Integer orderNum;

    @ExcelIgnore
    private Long createTime;
    @ColumnWidth(20)
    @ExcelProperty(value  = "操作时间")
    @ExcelName(names = {"序号", "Operation time","そうさじかん"})
    private String createTimeFormat;

    @ExcelIgnore
    private String createUser;
    @ColumnWidth(20)
    @ExcelProperty(value  = "操作帐号")
    @ExcelName(names = {"操作帐号", "Operation Account Number","オペレーションアカウント"})
    private String createUserLoginId;
    @ColumnWidth(20)
    @ExcelProperty(value  = "人员姓名")
    @ExcelName(names = {"人员姓名", "Name of person","ユーザ名"})
    private String createUserName;

    @ColumnWidth(20)
    @ExcelProperty(value  = "IP地址")
    @ExcelName(names = {"IP地址", "IP Address","IPアドレス"})
    private String requestIp;

    @ColumnWidth(20)
    @ExcelProperty(value  = "归属菜单")
    @ExcelName(names = {"归属菜单", "Attribution Menu","ホーム・メニュー"})
    private String belongMenu;

    @ColumnWidth(20)
    @ExcelProperty(value  = "触发事件")
    @ExcelName(names = {"触发事件", "Trigger Event","イベントのトリガー"})
    private String triggerEvent;

}
