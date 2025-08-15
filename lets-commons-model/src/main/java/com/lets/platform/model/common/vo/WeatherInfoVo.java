package com.lets.platform.model.common.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.Map;

/**
 * @ClassName : WeatherInfo
 * @Description : 天气数据
 * @Author : DING WEI
 * @Date: 2020-08-25 11:42
 */
@ApiModel(description = "天气数据")
public class WeatherInfoVo {

    //天气，温度，湿度，空气质量，风速
    @ApiModelProperty("天气")
    String weather;
    @ApiModelProperty("温度")
    String temperature;
    @ApiModelProperty("湿度")
    String humidity;
    @ApiModelProperty("风力")
    String windPower;
    @ApiModelProperty("城市")
    String city;
    @ApiModelProperty("省份")
    String provinces;
    @ApiModelProperty("区域")
    String area;
    @ApiModelProperty("天气图片代码")
    String weatherImageCode;
    @ApiModelProperty("最后更新时间")
    Date lastTime;
    @ApiModelProperty("空气质量数值")
    String aqi;
    @ApiModelProperty("空气质量文字")
    String quality;


//    String normalData;

    public WeatherInfoVo(Map<String,Object> datas) {
        //super();
        Map<String,Object> data = (Map<String,Object>)datas.get("data");
        Map<String,Object> cityinfo = (Map<String,Object>)data.get("cityinfo");
        Map<String,Object> now = (Map<String,Object>)data.get("now");
        Map<String,Object> city = (Map<String,Object>)data.get("city");
        Map<String,Object> detail = (Map<String,Object>)now.get("detail");

        this.weather = detail.get("weather").toString();
        this.temperature = detail.get("temperature").toString();
        this.humidity = detail.get("humidity").toString();
        this.windPower = detail.get("wind_power").toString();
        this.city = cityinfo.get("city").toString();
        this.provinces = cityinfo.get("provinces").toString();
        this.area = cityinfo.get("area").toString();
//        if(detail.get("weather_code").toString().equals("00")){
//            this.weatherImageCode = "0";
//        }else if(detail.get("weather_code").toString().equals("01")){
//            this.weatherImageCode = "1";
//        }else {
//            this.weatherImageCode = "2";
//        }
        this.weatherImageCode = detail.get("weather_code").toString();
        this.lastTime = new Date();
        this.aqi = detail.get("aqi").toString();
        this.quality = detail.get("quality").toString();
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWindPower() {
        return windPower;
    }

    public void setWindPower(String wind_power) {
        this.windPower = wind_power;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getWeatherImageCode() {
        return weatherImageCode;
    }

    public void setWeatherImageCode(String weatherImageCode) {
        this.weatherImageCode = weatherImageCode;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        lastTime = lastTime;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
