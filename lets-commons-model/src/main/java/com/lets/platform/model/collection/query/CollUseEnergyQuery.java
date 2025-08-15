package com.lets.platform.model.collection.query;

import com.lets.platform.common.pojo.constant.GlobalConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * 用(能耗)报表 查询对象
 * @author: DING WEI
 * @date: 2022/12/9 15:49
 */
@Data
@ApiModel("用(能耗)报表 查询对象")
public class CollUseEnergyQuery {

    /**
     * @see com.lets.platform.model.collection.enums.EnergyTypeEnum
     */
    @ApiModelProperty(value = "水电气类型", hidden = true)
    private String type;
    @ApiModelProperty(value = "设备类型", hidden = true)
    private List<String> typeClassifies;
    private String typeClassify;
    @ApiModelProperty(hidden = true)
    private String queryTable;

    /**
     * @see com.lets.platform.model.common.enums.ResetPeriodEnum
     */
    @ApiModelProperty("1按日、3按月、4按年")
    private String selectType;

    @ApiModelProperty("年")
    private Integer year;
    @ApiModelProperty("月")
    private Integer month;
    @ApiModelProperty("日")
    private Integer day;

    @ApiModelProperty("开始时、月")
    private Integer start;
    @ApiModelProperty("结束时、月")
    private Integer end;

    /**
     * 统计图查询条件
     */
    private Integer startDate;
    private Integer endDate;

    @ApiModelProperty("设备")
    private Set<String> deviceIds;
    @ApiModelProperty("生产单元")
    private Set<String> factoryModeIds;

    @ApiModelProperty("节点")
    private List<String> groupIdList;

    @ApiModelProperty(hidden = true)
    private String tenancyId;
    @ApiModelProperty(value = "页码,默认0")
    private Integer current = GlobalConstant.ZERO;

    @ApiModelProperty(value = "页长,默认10")
    private Integer size = GlobalConstant.TEN;

    public String monthAdStr() {
        if (Objects.nonNull(month)) {
            if (month < GlobalConstant.TEN) {
                return GlobalConstant.ZERO_STR + month;
            } else {
                return String.valueOf(month);
            }
        }
        return GlobalConstant.EMPTY_STR;
    }
    public String dayAsStr() {
        if (Objects.nonNull(day)) {
            if (day < GlobalConstant.TEN) {
                return GlobalConstant.ZERO_STR + day;
            } else {
                return String.valueOf(day);
            }
        }
        return GlobalConstant.EMPTY_STR;
    }
}
