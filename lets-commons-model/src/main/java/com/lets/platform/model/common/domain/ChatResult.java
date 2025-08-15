/*
 * csy
 */

/*
 * csy
 */

package com.lets.platform.model.common.domain;

import lombok.Data;

import java.util.List;

/**
 * @ClassName ChatResult
 * @Description
 * @Author CHEN SHAOYONG
 * @Date 2025/3/14
 */
@Data
public class ChatResult {

    private String msg;

    private String answer;

    private String orderId;

    private String orderCode;

    private String menuCode;

    private String success;

    private List<NeedCreateEntity> needCreateEntities;
}
