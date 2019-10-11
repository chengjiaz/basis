package mode.singon;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/10/9 10:38
 */

import java.net.Socket;
import java.sql.Connection;

/**
 * Double-Check
 * 高效的数据同步策略，首次初始化时加锁，之后允许多个线程同时进行getInstance调用来获得实例
 */
public final class Singleton {

    //定义实例,不初始化
    private static Singleton instance = null;

    Connection conn;

    Socket socket;

    //私有构造函数，不允许外部new
    private Singleton(){
        //初始化conn
        //初始化socket
    }

    public static Singleton getInstance(){
        //当instance为null时，进入同步代码块，同时可避免了每次都需要进入同步代码块，可提高效率
        if(null == instance) {
            synchronized (Singleton.class){
                //判断如果instance为null时创建
                if(null == instance){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}