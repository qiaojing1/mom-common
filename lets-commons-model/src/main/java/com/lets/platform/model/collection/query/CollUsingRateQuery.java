package com.lets.platform.model.collection.query;

import com.lets.platform.model.common.enums.ResetPeriodEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangweiyan
 * @ClassName CollUsingRateQuery
 * @Description 设备稼动率、开机率、利用率、故障率查询
 * @Date 2023/12/13 11:49
 **/
@Data
@ApiModel("设备稼动率、开机率、利用率、故障率查询实体")
public class CollUsingRateQuery {

    public static final Map<String, String> Type_Map_MenuCode = new HashMap<>();

    static {
        Type_Map_MenuCode.put("1", "a811a643-b564-49cc-8d3e-e6b1751f81b3"); // 稼动率
        Type_Map_MenuCode.put("2", "4dee9df1-323a-48cf-a66d-fba2a8ee3ea5"); // 开机率
        Type_Map_MenuCode.put("3", "00468362-3da4-47db-b13b-7f0c8698ae4b"); // 利用率
        Type_Map_MenuCode.put("4", "ef118fde-4f86-4ba6-92c4-fbc60a27a1ec"); // 故障率
    }

    @ApiModelProperty(value = "设备id列表", required = true)
    private List<String> deviceIdList;

    @ApiModelProperty(value = "生产单元id", required = false)
    private String productUnitId;

    @ApiModelProperty(value = "开始时间, 2023-11-12 00:00:00处理为20231112", required = true)
    private int startTime;

    @ApiModelProperty(value = "结束时间", required = false)
    private int endTime;
    private Integer today;

    @ApiModelProperty(value = "查询类型：1:设备稼动率 2：设备开机率 3: 设备利用率 4: 设备故障率", required = true)
    private String type;

    /**
     * @see ResetPeriodEnum
     */
    @ApiModelProperty(value = "时间查询类型：1:日 2：周 3: 月 4:指定跨度", required = true)
    private String timeType;

    /**
     * 开始时间为 2025-03-01
     * 结束时间为 2025-04-01
     * 跨度范围为7
     * 则统计的每个的范围为 2025-03-01~2025-03-07 2025-03-08~2025-03-14 2025-03-15~2025-03-21 2025-03-22~2025-03-28 2025-03-29~2025-04-01
     * 分别统计每个区间内的数据
     */
    @ApiModelProperty(value = "时间查询类型为指定跨度时，将时间按照起始时间 + 跨度值为一个统计最小单位", required = false)
    private Integer span;

    private String tenancyId;

    @ApiModelProperty("查询当日(YN)")
    private String selectToday;
    private String templeteId;
    private String menuCode;
}
