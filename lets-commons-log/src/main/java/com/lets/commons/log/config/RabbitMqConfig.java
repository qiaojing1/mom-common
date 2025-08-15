package com.lets.commons.log.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: RabbitMQ配置类
 * @author: DING WEI
 * @date: 8/17/21 10:17 AM
 */
@Configuration
@ConditionalOnProperty(name = "spring.rabbitmq.enable", havingValue = "true", matchIfMissing = false)
@EnableConfigurationProperties({RabbitMqProperties.class})
public class RabbitMqConfig {

    @Autowired
    private RabbitMqProperties rabbitMqProperties;

    /**
     * 日志存储队列
     */
    @Bean
    public Queue logMsgQueue() {
        return new Queue(rabbitMqProperties.getLogQueueName(), true);
    }

    /**
     * 日志交换机
     */
    @Bean
    public FanoutExchange logExchange() {
        return new FanoutExchange(rabbitMqProperties.getLogExchangeName(), true, false);
    }

    /**
     * 日志交换机-队列绑定
     */
    @Bean
    public Binding bindingExchange(@Qualifier("logMsgQueue") Queue queue, @Qualifier("logExchange") FanoutExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange);
    }
}
