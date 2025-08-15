package com.lets.platform.model.device.vo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import lombok.Data;

/**
 * 导入特种设备管理
 *
 * @author FZY
 * @date 2023/3/2 15:19
 * @version 1.0
 */
@Data
public class SpecialDeviceManagerImportVo {

  @ColumnWidth(15)
  @ExcelProperty(value = "设备编码")
  private String deviceCode;

  @ColumnWidth(15)
  @ExcelProperty(value = "负责人")
  private String managerUserCode;

  @ColumnWidth(25)
  @ExcelProperty(value = "检测周期")
  private String checkPeriod;
}
