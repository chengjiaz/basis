package com.jia.basis.modules.log;

import com.jia.basis.common.annotation.ControllerLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjiacheng
 * @description:
 * @date 2019/7/2 17:05
 */

@RestController
@RequestMapping(value = "controllerLog")
public class SysControllerLog {
    private Logger logger = LoggerFactory.getLogger(SysControllerLog.class);

    @RequestMapping(value={"/find"},method={RequestMethod.POST})
    @ControllerLog(descrption = "find",businessType = "1")
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
