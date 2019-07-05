package com.jia.basis.modules.testcontroller;

import com.jia.basis.common.config.DbConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author zhangjiacheng
 * @description:
 * @date 2019/7/2 17:05
 */
@RestController
@RequestMapping("db")
@Slf4j
public class DbControllerTest {


    @Autowired
    private  DbConfig db;

    @RequestMapping(value = {"/context"}, method = { RequestMethod.POST })
    public void context(){

        log.info("get|driver-class-name=【{}】",db.getDriverClassName());
        log.info("get|userName=【{}】",db.getUserName());
        log.info("get|url=【{}】",db.getUrl());
        log.info("get|password=【{}】",db.getPassword());
    }
}
