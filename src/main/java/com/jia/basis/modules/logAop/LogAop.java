package com.jia.basis.modules.logAop;

import com.jia.basis.common.annotation.ControllerLog;
import com.jia.basis.common.annotation.ServiceLog;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.omg.CORBA.portable.ApplicationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangjiacheng
 * @description:
 * @date 2019/7/2 17:05
 */
@Aspect
@Component
@Order(6)
public class LogAop {


    private Logger logger = LoggerFactory.getLogger(LogAop.class);

    /**
     *如果需要做落库操作,需要注入对应的service层
     */



    /***
     * 定义规则：
     * 规则：
     * service切入点拦截规则
     * controller切入点拦截规则
     */
    @Pointcut("@annotation(com.jia.basis.common.annotation.ServiceLog)")
    public void serviceAspect(){}


    @Pointcut("@annotation(com.jia.basis.common.annotation.ControllerLog)")
    public void controllerAspect(){}

    /***
     * 获取service的操作信息
     * @param joinpoint
     * @return
     * @throws Exception
     */
    public Map<String,String> getServiceMethodMsg(JoinPoint joinpoint) throws Exception{
        //获取连接点目标类名
        String className =joinpoint.getTarget().getClass().getName() ;
        //获取连接点签名的方法名
        String methodName = joinpoint.getSignature().getName() ;
        //获取连接点参数
        Object[] args = joinpoint.getArgs() ;
        //根据连接点类的名字获取指定类
        Class targetClass = Class.forName(className);
        //拿到类里面的方法
        Method[] methods = targetClass.getMethods() ;

        Map map = new HashMap() ;
        String description = "" ;
        String businessType="";
        //遍历方法名，找到被调用的方法名
        for (Method method : methods) {
            if (method.getName().equals(methodName)){
                Class[] clazzs = method.getParameterTypes() ;
                if (clazzs.length==args.length){
                    //操作描述
                    description = method.getAnnotation(ServiceLog.class).decription();
                    //业务类型
                    businessType = method.getAnnotation(ServiceLog.class).businessType();
                    break;
                }
            }
        }
        map.put("description",description);
        map.put("businessType",businessType);
        return map ;
    }

    /***
     * 获取controller的操作信息
     * @param point
     * @return
     */
    public Map<String,String> getControllerMethodDescription(ProceedingJoinPoint point) throws  Exception{
        //获取连接点目标类名
        String targetName = point.getTarget().getClass().getName() ;
        //获取连接点签名的方法名
        String methodName = point.getSignature().getName() ;
        //获取连接点参数
        Object[] args = point.getArgs() ;
        //根据连接点类的名字获取指定类
        Class targetClass = Class.forName(targetName);
        //获取类里面的方法
        Method[] methods = targetClass.getMethods() ;

        Map map = new HashMap() ;
        String description = "" ;
        String businessType="";
        for (Method method : methods) {
            if (method.getName().equals(methodName)){
                Class[] clazzs = method.getParameterTypes();
                if (clazzs.length == args.length){

                    //操作描述
                    description = method.getAnnotation(ControllerLog.class).descrption();
                    //业务类型
                    businessType = method.getAnnotation(ControllerLog.class).businessType();
                    break;
                }
            }
        }
        map.put("description",description);
        map.put("businessType",businessType);
        return map ;
    }

    /***
     * 拦截控制层的操作日志
     * 如果需要抓取service层,则把注解修改为:
     * @Around("serviceAspect()")
     *
     */

    @Around("controllerAspect()")
    public void recordLog(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("【{LogAop|recordLog|method|into}】");
       logger.info("操作类型=【{}】", getControllerMethodDescription(joinPoint).get("businessType"));
        logger.info("操作表述=【{}】",getControllerMethodDescription(joinPoint).get("description"));

        /**
         * (1)如果需要进行落库操作,此处可以定义：对象接参
         * eg：
         * XXX xx = new XXX();
         */


        Object proceed = null ;

        /**
         * (2)准备数据:
         * 用户/(可以从session获取)
         * 请求ip/
         * 时间/
         * 操作的类/joinPoint.getSignature().getDeclaringTypeName()
         * 执行的方法名/joinPoint.getSignature().getName()
         * xx.set(yy)
         */

        proceed = joinPoint.proceed();

        /**
         * 如果方法,返回类型是void,不需要此步骤
         * 如果方法，需要返回,需要此步骤
         * (3)对象转换
         * YYY yy = (YYY)proceed;
         */


        /***
         * (4)获取操作信息
         * 获取执行方法的注解内容|getServiceMethodMsg(joinPoint).get("description")
         * 获取执行方法的业务类型|getServiceMethodMsg(joinPoint).get("businessType")
         * 设置操作状态
         */


        /**
         * (5)参数处理
         * 获取参数|joinPoint.getArgs() ;
         */


        /**
         * 如果需要落库
         * 根据不同的业务类型,落进不同的表
         */
        int type = Integer.parseInt(getControllerMethodDescription(joinPoint).get("businessType").toString());

        if(type==1){
            //调用落库方法
            logger.info("type=【{}】",type);
        }else if(type==2){
            //调用落库方法
            logger.info("type=【{}】",type);
        } else if(type==3){
            //调用落库方法
            logger.info("type=【{}】",type);
        }


    }

    /**
     * 如果需要抓取service层,则把注解修改为:
     * @AfterThrowing(pointcut = "serviceAspect()",throwing="e")
     *
     *
     */
    @AfterThrowing(pointcut = "controllerAspect()",throwing="e")
    public void doAfterThrowing(JoinPoint joinPoint, ApplicationException e) throws Throwable{

        logger.info("【{doAfterThrowing}】");

        /**
         * 异常
         * 可以参看recordLog
         */

        /**
         * 异常处理
         */
        String errMsg =e.getMessage();
        if(errMsg.length()>300){
            errMsg=e.getMessage().substring(0,e.getMessage().charAt('\n'));
        }


        int type = Integer.parseInt(getServiceMethodMsg(joinPoint).get("businessType").toString());
        if (type==1){

        }else if(type==2){

        }else if(type==3){

        }
    }



}
