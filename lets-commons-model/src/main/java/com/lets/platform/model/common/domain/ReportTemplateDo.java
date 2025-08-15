package com.lets.platform.model.common.domain;

import com.lets.platform.common.pojo.base.BaseDo;
import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * @description 大屏数据模板表
 * @author wangjx
 * @date 2022-04-08
 */
@Data
@ApiModel("大屏数据模板表")
public class ReportTemplateDo extends BaseDo {

    /**
     * 大屏模板名称
     */
    private String name;

    /**
     * 大屏类型1:web端2:手机端
     */
    private String type;

    /**
     *
     */
    /**
     * 页面整体布局json
     */
    private String data;

    /**
     * 缩略图
     */
    private String thumbnailId;



    /**
     * 租户id
     */
    private String tenancyId;

}
