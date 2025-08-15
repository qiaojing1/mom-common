package com.lets.platform.model.common.query;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author gm
 * @description
 * @since date 2022/4/07 19:44
 */
@Data
public class DateFilterQuery {

    private String key;

    private int value;

    private String includeCurrentDay;

    private String join;

    private Long startTime;

    private Long endTime;

    private int beforeDay;
    private int afterDay;

}
