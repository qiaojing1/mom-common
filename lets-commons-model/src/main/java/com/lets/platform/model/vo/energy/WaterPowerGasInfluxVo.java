package com.lets.platform.model.collection.vo.energy;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * 水电气Influx数据
 * @author DING WEI
 * @date 2024/12/30 17:00
 * @version 1.0
 */
@Data
@ApiModel("水电气Influx数据")
public class WaterPowerGasInfluxVo {

    @ApiModelProperty("下标递增")
    private Integer index;

    @ApiModelProperty("采集器")
    private String collectionCode;

    @ApiModelProperty("设备主键")
    private String deviceId;

    @ApiModelProperty("水")
    private BigDecimal water;
    @ApiModelProperty("电")
    private BigDecimal power;
    @ApiModelProperty("正向无功电")
    private BigDecimal uselessPower;
    @ApiModelProperty("气")
    private BigDecimal gas;

    @ApiModelProperty("时间")
    private LocalDateTime time;
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer hour;
    private Integer minute;
    private Integer second;
    private Integer yearMonthDay;

    /**
     * @see com.lets.platform.model.collection.enums.PowerSignEnum
     */
    @ApiModelProperty("电-尖峰平谷标识")
    private List<String> powerSigns;
    private String powerSign;
    @ApiModelProperty(value = "时段标识,一样的值代表为同一时段", hidden = true)
    private List<String> periodSigns;
    private String periodSign;

    @ApiModelProperty("租户")
    private String tenancyId;

    public BigDecimal waterNotNull() {
        if (Objects.isNull(water)) {
            return BigDecimal.ZERO;
        } else {
            return water;
        }
    }
    public BigDecimal powerNotNull() {
        if (Objects.isNull(power)) {
            return BigDecimal.ZERO;
        } else {
            return power;
        }
    }
    public BigDecimal gasNotNull() {
        if (Objects.isNull(gas)) {
            return BigDecimal.ZERO;
        } else {
            return gas;
        }
    }

    public String monthAsStr() {
        if (month < GlobalConstant.TEN) {
            return GlobalConstant.ZERO_STR + month;
        } else {
            return String.valueOf(month);
        }
    }
    public String dayAsStr() {
        if (day < GlobalConstant.TEN) {
            return GlobalConstant.ZERO_STR + day;
        } else {
            return String.valueOf(day);
        }
    }

    public String minuteAsStr() {
        if (minute < GlobalConstant.TEN) {
            return GlobalConstant.ZERO_STR + minute;
        } else {
            return String.valueOf(minute);
        }
    }
    public String secondAsStr() {
        if (second < GlobalConstant.TEN) {
            return GlobalConstant.ZERO_STR + second;
        } else {
            return String.valueOf(second);
        }
    }
}
