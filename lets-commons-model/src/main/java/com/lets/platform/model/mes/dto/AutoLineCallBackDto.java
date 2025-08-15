package com.lets.platform.model.mes.dto;

import com.lets.platform.model.mes.entity.AutoLineModelingFeedingBuffer;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 自动线回执 数据传输
 * @author: DING WEI
 * @date: 2024/9/24 17:19
 */
@Data
public class AutoLineCallBackDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<AutoLineModelingFeedingBuffer> autoLineList;

}
