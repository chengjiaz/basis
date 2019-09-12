package com.jia.basis.modules.testcontroller.conversion;

import com.alibaba.fastjson.JSONObject;
import com.jia.basis.entity.BankAccNoDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author zhangjiacheng
 * @description: bean转map
 * @date 2019/8/14 20:35
 */
@RestController
@RequestMapping("cov")
@Slf4j
public class BeanCovMapControllTest {


    @RequestMapping(value = {"covMap"},method = RequestMethod.POST)
    public String covMap(){
        //组装测试对象
        BankAccNoDTO bankAccNoDTO = new BankAccNoDTO();
        bankAccNoDTO.setAccNo("148595236");
        bankAccNoDTO.setAcctCur("CNY");
        bankAccNoDTO.setAcctStatus("S");
        bankAccNoDTO.setAvlbBal("859625");
        bankAccNoDTO.setCardType("0");
        bankAccNoDTO.setCashFaceBal("785.365");
        bankAccNoDTO.setCis("132625525987");
        bankAccNoDTO.setSubAcctIntrNo("85962041");
        Map map = new BeanMap(bankAccNoDTO);
       log.info("BeanCovMapControllTest->covMap:出参：【{}】",new JSONObject(map));
        return new JSONObject(map).toString();
    }


    @RequestMapping(value = {"covList"},method = RequestMethod.POST)
    public String covList(){
        //组装测试对象
        BankAccNoDTO bankAccNoDTO = new BankAccNoDTO();
        bankAccNoDTO.setAccNo("148595236");
        bankAccNoDTO.setAcctCur("CNY");
        bankAccNoDTO.setAcctStatus("S");
        bankAccNoDTO.setAvlbBal("859625");
        bankAccNoDTO.setCardType("0");
        bankAccNoDTO.setCashFaceBal("785.365");
        bankAccNoDTO.setCis("132625525987");
        bankAccNoDTO.setSubAcctIntrNo("85962041");

        Map map = new BeanMap(bankAccNoDTO);
        log.info("BeanCovMapControllTest->covList:出参：【{}】",new JSONObject(map));
        return new JSONObject(map).toString();
    }


}
