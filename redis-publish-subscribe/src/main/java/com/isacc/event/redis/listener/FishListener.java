package com.isacc.event.redis.listener;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * <p>
 * description
 * </p>
 *
 * @author isacc 2019/09/04 17:21
 * @since 1.0
 */
@Slf4j
@Component
@AllArgsConstructor
public class FishListener implements MessageListener {

    private final RedisTemplate redisTemplate;

    @Override
    public void onMessage(Message message, byte[] bytes) {
        log.debug("FishListener message: {}", message.toString());
        log.debug("FishListener message: {}", message.toString());
        log.debug("FishListener message: {}", message.toString());
    }

}
