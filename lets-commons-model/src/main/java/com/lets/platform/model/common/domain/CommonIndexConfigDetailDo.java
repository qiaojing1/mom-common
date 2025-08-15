package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @description 首页配置明细
 * @author Qiao
 * @date 2021-12-07
 */
@Data
@ApiModel(description = "首页配置明细")
public class CommonIndexConfigDetailDo extends BaseDo {

    private String configId;
    private String relationId;
    private String ext1;
    /**
     * 租户主键[0为系统所有]
     */
    private String tenancyId;

}
