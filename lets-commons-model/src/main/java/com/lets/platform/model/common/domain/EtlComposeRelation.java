package com.lets.platform.model.common.domain;

import lombok.Data;

/**
 * Etl组件关联关系
 * @author: DING WEI
 * @date: 2022/7/4 17:29
 */
@Data
public class EtlComposeRelation {

    private String id;

    private String designId;

    private String preComposeId;
    private String preXmlId;

    private String nextComposeId;
    private String nextXmlId;

    private String tenancyId;

}
