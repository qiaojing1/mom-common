package com.lets.commons.log.config.callback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

/**
 * @description: ConfirmCallback确认模式
 * @author: DING WEI
 * @date: 8/19/21 8:53 AM
 */
@Slf4j
@Component
public class ConfirmCallbackService implements RabbitTemplate.ConfirmCallback {

    /**
     * 消息只要被 rabbitmq broker 接收到就会触发 confirmCallback 回调
     * @param correlationData 对象内部只有一个 id 属性，用来表示当前消息的唯一性
     * @param ack 消息投递到broker 的状态，true表示成功
     * @param cause 表示投递失败的原因
     * @return
     * @author DING WEI
     * @date 8/19/21 8:55 AM
     * @version 1.0
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        if (!ack) {
            log.error("消息发送异常!");
        } else {
            log.info("发送者已经收到确认，correlationData={} ,ack={}, cause={}", correlationData.getId(), true, cause);
        }
    }

}
