package com.lets.platform.model.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: COMMON服务集群数据传输
 * @author: DING WEI
 * @date: 2022/5/18 18:03
 */
@Data
public class CommonClusterDto implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * @see com.lets.platform.model.common.enums.Common4ClusterTypeEnum
     */
    private String type;
    /**
     * @see com.lets.platform.model.common.enums.Common4ClusterDatasourceTypeEnum
     */
    private String datasourceType;
    /** 类型为datasource时有用,表明数据源主键 */
    private String id;
    /** 类型为websocket时有用,表示发送的消息以及接收人 */
    private String jsonMsg;
    /** 接收用户 */
    private String receiverUser;
    /** 接收的HMI */
    private String receiverHmiId;

}
