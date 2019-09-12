package com.jia.basis.modules.testcontroller;

import com.jia.basis.entity.SysDict;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/8 17:27
 */
@RestController
@RequestMapping("/json")
@Slf4j
public class JsonControllerTest {


    @RequestMapping(value = {"jsonObjectTest"}, method = {RequestMethod.POST})
    public String jsonObjectTest(SysDict sysDict) {
        log.info("JsonControllerTest->jSONObjectTest:入参=【{}】", new JSONObject(sysDict));
        //取值方式
        //getXXX(类型)
        log.info("dictName=【{}】", new JSONObject(sysDict).getString("dictName"));
        log.info("id=【{}】", new JSONObject(sysDict).getInt("id"));
        return new JSONObject(sysDict).toString();
    }

    @RequestMapping(value = {"putListTest"}, method = {RequestMethod.POST})
    public String putListTest() {
        return "";
    }

    @RequestMapping(value = {"putMapTest"}, method = {RequestMethod.POST})
    public String putMapTest() {

        //HashMap使用如下构造方法进行初始化，如果暂时无法确定集合大小，那么指定默认值（16）即可
        Map map = new HashMap<String,String>(16);
        map.put("id", "1");
        map.put("dictName", "理财产品");
        map.put("dictValue", "1");
        map.put("dictOrder", "1");
        map.put("status", "1");
        log.info("JsonControllerTest->putMapTest:入参=【{}】", new JSONObject(map));
        JSONObject jsonObject = new JSONObject().put("map", map);
        log.info("【{}】", jsonObject.get("map"));

        return new JSONObject(map).toString();
    }

    @RequestMapping(value = {"putStringArrayTest"}, method = {RequestMethod.POST})
    public String putStringArrayTest() {
        return "";
    }


}
