package com.jia.basis.modules.testcontroller;

import com.alibaba.fastjson.JSON;
import com.jia.basis.entity.SysDict;
import com.jia.basis.service.SysDictService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/5 10:06
 */
@RestController
@RequestMapping("sysDict")
@Slf4j
public class SysDictControllerTest {

    @Autowired
    private SysDictService sysDictService;

    @RequestMapping(value={"/get/{id}"},method = RequestMethod.POST)
    public String get(@PathVariable("id") int id){

        log.info("【{}】",JSON.toJSONString(sysDictService.selectByPrimaryKey(id)));
        return JSON.toJSONString(sysDictService.selectByPrimaryKey(id));

    }
}
