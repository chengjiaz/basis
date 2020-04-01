package com.jia.basis.modules.testcontroller.thread.implway;
/**
 * @author zhangjiacheng
 * @description: 线程实现方式之 实现Runnable接口
 * @date 2020/3/31 16:57
 */
public class CreateThreadByImpl  implements Runnable{


    @Override
    public void run() {

    }

    public static void main(String[] args) {

       // TimeUnit.s
        Thread.yield();
    }
}
