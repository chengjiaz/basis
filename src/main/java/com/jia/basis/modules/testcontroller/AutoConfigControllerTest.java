package com.jia.basis.modules.testcontroller;

import com.alibaba.fastjson.JSON;
import com.jia.basis.modules.autoconfig.AutoConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/3 13:39
 */
@RestController
@RequestMapping("autoConfig")
@Slf4j
public class AutoConfigControllerTest {

    @Autowired
    private AutoConfig  autoConfig;


    @RequestMapping(value = {"get"},method = RequestMethod.POST)
    public String get(){

        return JSON.toJSONString(autoConfig.getProperties());
    }
}
