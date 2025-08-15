package com.lets.commons.log.service;

import com.lets.platform.model.common.entity.LogDo;

/**
 * 日志接口
 * @author DING WEI
 * @date 8/17/21 11:05 AM
 * @version 1.0
 */
public interface LogService {

    /**
     * 存储
     * @param log
     * @return
     * @author DING WEI
     * @date 8/17/21 11:06 AM
     * @version 1.0
     */
    void insert(LogDo log);
}
