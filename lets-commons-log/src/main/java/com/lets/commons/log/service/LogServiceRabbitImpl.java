package com.lets.commons.log.service;

import com.lets.commons.log.config.RabbitMqProperties;
import com.lets.commons.log.config.callback.ConfirmCallbackService;
import com.lets.commons.log.config.callback.ReturnCallbackService;
import com.lets.platform.model.common.entity.LogDo;
import org.springframework.amqp.core.MessageDeliveryMode;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * RabbitMQ实现发送日志
 */
@Service
public class LogServiceRabbitImpl implements LogService {

    @Autowired(required = false)
    private RabbitMqProperties rabbitMqProperties;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ConfirmCallbackService confirmCallbackService;

    @Autowired
    private ReturnCallbackService returnCallbackService;

    @Override
    public void insert(LogDo log) {
        if (Objects.nonNull(rabbitMqProperties) && Objects.nonNull(log)) {
            /*
              确保消息发送失败后可以重新返回到队列中
              注意：yml需要配置 publisher-returns: true
             */
            rabbitTemplate.setMandatory(true);

            /*
              ConfirmCallback
              目的：ConfirmCallback 是用来确认消息是否成功被 RabbitMQ 服务器接收。它是 Publisher Confirms（发布者确认）机制的一部分。
              触发时机：当消息被 RabbitMQ 服务器接收到或者在到达服务器之前失败时（例如，因为无法连接到服务器），ConfirmCallback 会被触发。
              参数：它提供了三个参数：CorrelationData（用于追踪消息的标识），ack（表示确认或拒绝），以及cause（如果有的话，提供拒绝的原因）。
              使用场景：当你需要确认每条消息是否成功到达服务器时使用，适合于需要高可靠性的消息发送场景。
             */
            rabbitTemplate.setConfirmCallback(confirmCallbackService);

            /*
              ReturnCallback
              目的：ReturnCallback 用于处理那些从服务器正确到达但未能被任何队列接收的消息（即未被路由）。这通常是由于没有绑定合适的队列到交换器上。
              触发时机：当消息无法被任何队列接收（无匹配队列）且消息被设置为可返回（mandatory 标志设置为 true）时，ReturnCallback 会被触发。
              参数：提供了消息本身、回复的状态码、回复的文本、交换器名和路由键。
              使用场景：用于处理和记录无法被路由的消息，确保不丢失任何消息，适合于需要确保消息至少被一个队列接收的场景。
             */
            rabbitTemplate.setReturnCallback(returnCallbackService);

            /*
              发送消息
             */
            rabbitTemplate.convertAndSend(rabbitMqProperties.getLogExchangeName(), "", log,
                    message -> {
                        message.getMessageProperties().setDeliveryMode(MessageDeliveryMode.PERSISTENT);
                        return message;
                    },
                    new CorrelationData(log.getId()));
        }
    }
}
