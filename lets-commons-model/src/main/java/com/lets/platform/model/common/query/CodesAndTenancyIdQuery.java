package com.lets.platform.model.common.query;

import lombok.Data;

import java.util.List;

/**
 * 编码以及租户主键
 * @author: DING WEI
 * @date: 2022/12/8 15:41
 */
@Data
public class CodesAndTenancyIdQuery {

    private String tenancyId;

    private List<String> codes;

}
