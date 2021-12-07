package com.isacc.event.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: doudou
 * @since: 2021-12-07
 */
@RestController()
@RequestMapping("/send")
public class PublishController {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/1")
    public String send1(@RequestParam String channnel, @RequestParam String content) {
        redisTemplate.convertAndSend(channnel, content);
        return content;
    }

}
