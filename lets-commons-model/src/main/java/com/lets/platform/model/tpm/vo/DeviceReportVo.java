package com.lets.platform.model.tpm.vo;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.google.common.collect.Lists;
import com.lets.platform.common.pojo.constant.GlobalConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 时间稼动率、性能稼动率、设备故障率
 * @author DING WEI
 * @date 2025/6/16 13:50
 * @version 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("时间稼动率、性能稼动率、设备故障率 展示对象")
public class DeviceReportVo {

    @ApiModelProperty("设备主键")
    private String deviceId;
    @ApiModelProperty("设备编码")
    private String deviceCode;
    @ApiModelProperty("设备名称")
    private String deviceName;

    @ApiModelProperty("生产单元主键")
    private String factoryModeId;
    @ApiModelProperty("生产单元编码")
    private String factoryModeCode;
    @ApiModelProperty("生产单元名称")
    private String factoryModeName;

    @ApiModelProperty("车间主键")
    private String workshopFactoryModeId;
    @ApiModelProperty("车间编码")
    private String workshopFactoryModeCode;
    @ApiModelProperty("车间名称")
    private String workshopFactoryModeName;

    @ApiModelProperty("表头")
    private List<String> titles;

    @ApiModelProperty("值")
    private List<String> values;

    @ApiModelProperty("运行时长(H)")
    private List<BigDecimal> runDurationList;

    public List<List<String>> toExcelData(List<DeviceReportVo> list, List<List<Object>> excelData) {
        List<List<String>> head = new ArrayList<>();
        head.add(Lists.newArrayList("序号"));
        head.add(Lists.newArrayList("生产单元"));
        head.add(Lists.newArrayList("设备编码"));
        head.add(Lists.newArrayList("设备名称"));
        if (CollUtil.isNotEmpty(list)) {
            DeviceReportVo first = list.get(0);
            List<String> titles = first.getTitles();
            for (String title : titles) {
                head.add(Lists.newArrayList(title));
            }
            for (int i = 0; i < list.size(); i++) {
                DeviceReportVo rateVo = list.get(i);
                List<Object> one = new ArrayList<>();
                one.add(i + 1);
                one.add(rateVo.getFactoryModeName());
                one.add(rateVo.getDeviceCode());
                one.add(rateVo.getDeviceName());
                List<String> values = rateVo.getValues();
                for (String value : values) {
                    if (StrUtil.equals(GlobalConstant.DOUBLE_MIDDLE_LINE, value)) {
                        one.add(value);
                    } else {
                        one.add(value + "%");
                    }
                }
                excelData.add(one);
            }
        }
        return head;
    }
}
