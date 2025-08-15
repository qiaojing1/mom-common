package com.lets.platform.model.common.vo;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.Map;

/**
 * 高德天气数据
 * @author DING WEI
 * @date 2023/2/28 10:44
 * @version 1.0
 */
@Data
@ApiModel(description = "高德天气数据")
public class WeatherInfoGaoDeVo {

    @ApiModelProperty("省份(JSON中的key:province)")
    private String provinces;
    @ApiModelProperty("城市(JSON中的key:city)")
    private String city;
    @ApiModelProperty("天气现象（汉字描述）(JSON中的key:weather)")
    private String weather;
    @ApiModelProperty("实时气温，单位：摄氏度(JSON中的key:temperature)")
    private String temperature;

    @ApiModelProperty("风向描述(JSON中的key:winddirection)")
    private String windDirection;
    @ApiModelProperty("风力级别，单位：级(JSON中的key:windpower)")
    private String windPower;

    @ApiModelProperty("空气湿度(JSON中的key:humidity)")
    private String humidity;
    @ApiModelProperty("数据发布的时间(JSON中的key:reporttime)")
    private Date lastTime;

    public WeatherInfoGaoDeVo() {
    }

    public WeatherInfoGaoDeVo(JSONObject jsonObject) {
        this.provinces = jsonObject.getString("province");
        this.city = jsonObject.getString("city");
        this.weather = jsonObject.getString("weather");
        this.temperature = jsonObject.getString("temperature");
        this.windDirection = jsonObject.getString("winddirection");
        this.windPower = jsonObject.getString("windpower");
        this.humidity = jsonObject.getString("humidity");
        this.lastTime = jsonObject.getDate("reporttime");
    }
}
