package com.jia.basis.common.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
/**
 * @author zhangjiacheng
 * @description:
 * @date 2019/7/2 17:05
 */
public @interface ServiceLog {
    //定义成员
    String decription() default "" ;
    String businessType() default "" ;//1:系统操作 2：交易日志 3：定时任务
}