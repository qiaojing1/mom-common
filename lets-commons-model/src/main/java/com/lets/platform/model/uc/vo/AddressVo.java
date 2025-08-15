package com.lets.platform.model.uc.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 地址
 * @author: DING WEI
 * @date: 2025/6/23 15:08
 */
@Data
public class AddressVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String country;
    private String province;
    private String city;
    private String district;
    // 乡镇
    private String town;
    // 街道
    private String street;
    // 门牌号
    private String streetNumber;

    // 纬度
    private Double latitude;
    // 精度
    private Double longitude;

    private String address;
}
