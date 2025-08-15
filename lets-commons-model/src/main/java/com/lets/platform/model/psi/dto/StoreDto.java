package com.lets.platform.model.psi.dto;

import lombok.Data;

import java.util.List;

/**
 * 库存异动返回数据
 * @author: DING WEI
 * @date: 2023/12/15 14:33
 */
@Data
public class StoreDto {

    private List<String> keys;

    private String message;

}
