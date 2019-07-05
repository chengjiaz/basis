package com.jia.basis.modules.autoConfig;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/3 14:11
 */
@Getter
@Setter
@Slf4j
public class AutoConfig {

    private String className;
    private String packageName;

    public String getProperties(){
        log.info("AutoConfig-getProperties-get|className=【{}】",this.getClassName());
        log.info("AutoConfig-getProperties-get|packageName=【{}】",this.getPackageName());
        return "properties:className【{"+this.getClassName()+"}】;packageName【{"+ this.getPackageName()+ "}】";
    }

}
