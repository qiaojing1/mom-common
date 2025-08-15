package com.lets.platform.model.collection.entity;

import com.lets.platform.model.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 第三方系统获取试压报告文件实体
 * </p>
 *
 * @author csy
 * @since 2024-01-27
 */
@Getter
@Setter
public class DetectReportFileExtDetail extends BaseEntity {
    private String project;
    private String testPressure;
    private String holdingTime;
    private String result;
}
