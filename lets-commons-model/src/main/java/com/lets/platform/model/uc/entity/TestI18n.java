package com.lets.platform.model.uc.entity;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;

/**
 * TestI18n
 * @author: DING WEI
 * @date: 2023/4/12 11:46
 */
@Data
public class TestI18n {

    @NotBlank(message = "TestI18n.name")
    private String name;

    @Max(value = 200, message = "TestI18n.age")
    private Integer age;

}
