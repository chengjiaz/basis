package com.jia.basis.modules.copy;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;

import java.util.Date;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/9/27 11:39
 */
@Slf4j
public class CopyTest {
    public static void main(String[] args) {

        OriginUser ou = new OriginUser();

        ou.setOriginId(5L);
        ou.setOriginName("zjc");
        ou.setOriginBirthDay(new Date());
        ou.setOriginHealth(false);

        TargetUser tu =  new TargetUser();


        BeanUtils.copyBean(ou,tu);


        log.info("tu=【{}】",new JSONObject(tu));







    }
}
