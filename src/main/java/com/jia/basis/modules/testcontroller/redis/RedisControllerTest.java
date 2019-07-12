package com.jia.basis.modules.testcontroller.redis;

import com.jia.basis.common.config.RedisConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/12 11:20
 */
@RestController
@RequestMapping("redis")
@Slf4j
public class RedisControllerTest {

    @Autowired
    private RedisConfig redisConfig;

    @RequestMapping("config")
    public void config(){
        log.info("redisControllerTest->config->methodStart");
        log.info("host=【{}】",redisConfig.getHost());
        log.info("port=【{}】",redisConfig.getPort());
        log.info("password=【{}】",redisConfig.getPassword());
        log.info("redisControllerTest->config->methodEnd");

    }
}
