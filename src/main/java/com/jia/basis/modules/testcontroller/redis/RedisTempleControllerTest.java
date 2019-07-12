package com.jia.basis.modules.testcontroller.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/12 9:45
 */
@RestController
@RequestMapping("redisTemple")
@Slf4j
public class RedisTempleControllerTest {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(value={"add"},method = RequestMethod.POST)
    public void add(){
        log.info("RedisTempleController->add->methodStart");
        stringRedisTemplate.opsForValue().set("name","zjc");
        log.info("RedisTempleController->add->methodEnd");
    }


    @RequestMapping(value={"addList"},method = RequestMethod.POST)
    public void addList(){
        log.info("RedisTempleController->addList->methodStart");
        redisTemplate.opsForList().leftPush("list","zhangjiacheng");
        redisTemplate.opsForList().leftPush("list","加班使我快乐");
        redisTemplate.opsForList().leftPush("list","野猪套天下第一");
        redisTemplate.opsForList().leftPush("list","那就这样吧");
        redisTemplate.opsForList().leftPush("list","我曾");

        log.info("RedisTempleController->addList->methodEnd");
    }
    @RequestMapping(value={"updateList"},method = RequestMethod.POST)
    public void updateList(){
        log.info("RedisTempleController->updateList->methodStart");
        redisTemplate.opsForList().set("list",0,"zhangjiacheng_update");
        redisTemplate.opsForList().set("list",1,"加班使我快乐_update");
        redisTemplate.opsForList().set("list",2,"野猪套天下第一_update");
        redisTemplate.opsForList().set("list",3,"那就这样吧_update");
        redisTemplate.opsForList().set("list",4,"我曾_update");
        log.info("RedisTempleController->updateList->methodEnd");
    }



    @RequestMapping(value={"addUser"},method = RequestMethod.POST)
    public void addUser(){
        log.info("RedisTempleController->addUser->methodStart");

        log.info("RedisTempleController->addUser->methodEnd");
    }





}
