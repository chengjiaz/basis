package com.jia.basis.modules.testcontroller.conversion;

import com.alibaba.fastjson.JSONObject;
import com.jia.basis.common.utils.Conversion;
import com.jia.basis.entity.BankAccNoDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangjiacheng
 * @description: javabean转map/map转javabean 测试类
 * @date 2019/8/14 20:35
 */

@Slf4j
public class CovControllTest {


    /**
     *  javabean 转map
     */
    public   void   covMap(){
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
        //commons-beanutils
        Map map = new BeanMap(bankAccNoDTO);
       log.info("成功转换map=：【{}】",new JSONObject(map));


    }

    /**
     * map转javabean
     * @throws Exception
     */
    public   void covBean() throws Exception {
        Map<String,Object> resultMap = new HashMap<String,Object>(16);
        resultMap.put("acctStatus","S");
        resultMap.put("cis","9527");
        resultMap.put("faceBal","12.00");
        resultMap.put("subAcctIntrNo","2659874631");
        resultMap.put("cashFaceBal","14.00");
        BankAccNoDTO bankAccNoDTO =  (BankAccNoDTO) Conversion.mapToObject(BankAccNoDTO.class,resultMap);
        log.info("成功获取客户号=【{}】",bankAccNoDTO.getCis());
        log.info("成功获取卡状态=【{}】",bankAccNoDTO.getAcctStatus());
    }




    public static void main(String[] args) throws Exception {
        CovControllTest cct = new CovControllTest();

        //(1)map转javabean
        //cct.covBean();

        //(2)javabean转map
        cct.covMap();

    }








}
