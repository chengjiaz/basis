package com.jia.basis.modules.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "controller")
public class SysControllerLog {
    private Logger logger = LoggerFactory.getLogger(SysControllerLog.class);

    @RequestMapping(value={"/find"},method={RequestMethod.POST})
    public void find(){
        logger.info("【{controlle|find| method into }】");
    }

    @RequestMapping(value = {"/get"},method={RequestMethod.POST})
    public void get(){
        logger.info("【{controlle |get|method into }】");
    }


    @RequestMapping(value = {"/update"},method={RequestMethod.POST})
    public void update(){
        logger.info("【{controlle |update|method into }】");
    }


    @RequestMapping(value = {"/delete"},method={RequestMethod.POST})
    public void delete(){
        logger.info("【{controlle |delete|method into }】");
    }


}
