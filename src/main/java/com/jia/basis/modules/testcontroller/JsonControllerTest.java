package com.jia.basis.modules.testcontroller;

import com.jia.basis.entity.SysDict;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/8 17:27
 */
@RestController
@RequestMapping("/json")
@Slf4j
public class JsonControllerTest {


    @RequestMapping(value = {"jsonObjectTest"},method= {RequestMethod.POST})
    public String jsonObjectTest(SysDict sysDict){
        log.info("JsonControllerTest->jSONObjectTest:入参=【{}】",new JSONObject(sysDict));
        //取值方式
        //getXXX(属性)
        log.info("dictName=【{}】",new JSONObject(sysDict).getString("dictName"));
        log.info("id=【{}】",new JSONObject(sysDict).getInt("id"));
        return new JSONObject(sysDict).toString();
    }


}
