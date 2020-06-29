package topic;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * @author zhangjiacheng
 * @description: 非工具类方法实现大小写转换
 * @date 2020/4/22 9:30
 */
@Slf4j
public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        change(c);
    }

    //
    public static void change(char c){
        log.info("转换前:【{}】",c);

        //大写转小写   +32
        if(c>='A' && c<='Z'){
            c+=32;
            log.info("toLowerCase:转换后【{}】",c);
        }

        //小写转大写   -32
        if(c>='a' && c<='z'){
            c-=32;
            log.info("toUpperCase:转换后【{}】",c);

        }

    }
}
