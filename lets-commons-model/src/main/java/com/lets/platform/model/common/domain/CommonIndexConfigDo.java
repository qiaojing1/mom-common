package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @description 首页配置
 * @author Qiao
 * @date 2021-12-07
 */
@Data
@ApiModel(description = "首页配置")
public class CommonIndexConfigDo extends BaseDo {

    /**
     * 关联类型 1:生产单元 2:组织
     */
    private String relationType;

    private String name;
    /**
     * 图表类型 图表类型 1:饼图 2:条形图
     */
    private String type;

    /**
     * 排序
     */
    private String sort;

    /**
     * 状态 0:禁用 1:启用
     */
    private String status;

    /**
     * 租户主键[0为系统所有]
     */
    private String tenancyId;

}
