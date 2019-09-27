package com.jia.basis.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.json.JSONObject;

import java.util.Map;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/9/27 15:42
 */
@Slf4j
public class Conversion {

    /**
     * map转javabean
     * @param beanClass
     * @param map
     * @return
     * @throws Exception
     */
    public static Object mapToObject(Class<?> beanClass, Map<String, Object> map) throws Exception {
        log.info("Conversion->mapToObject:入参：beanClass=【{}】",beanClass);
        log.info("Conversion->mapToObject:入参：map=【{}】",new JSONObject(map));
        if (map == null){
            return null;
        }

        Object obj = beanClass.newInstance();
        BeanUtils.populate(obj, map);
        return obj;
    }
}
