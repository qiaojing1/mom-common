/*
 * csy
 */

package com.lets.platform.model.common.query;

import lombok.Data;

/**
 * @ClassName TodoOrderQuery
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2025/1/11
 */
@Data
public class TodoOrderQuery {
    private Integer current;
    private Integer size;
    private String userId;
    private String tenancyId;
}
