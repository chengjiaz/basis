
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zhangjiacheng
 * @description: 通过队列，模拟堆结构
 * 队列:先进先出
 * 堆:先进后出
 * @date 2019/10/11 10:40
 */
@Slf4j
public class HeapTest {
    public static void main(String[] args) {

        //(1)定义两个空队列，以及一个中间过渡的list

        Queue<String> queueA = new LinkedList<>();

        Queue<String> queueB = new LinkedList<>();

        List tempList = new ArrayList<>();

        //(2)队列A准备输入
        queueA.offer("a");
        queueA.offer("b");
        queueA.offer("c");
        queueA.offer("d");
        queueA.offer("e");

        //(3)数据放入list中
        for(String str :queueA){
            tempList.add(str);
        }

        //(4)通过倒序方式,把list数据放入队列B中
        for(int i=tempList.size()-1;i>=0;i--){
            queueB.offer(tempList.get(i).toString());
        }

        //(5)遍历输出队列B
        for(String str:queueB){
            log.info("str=【{}】",str);
        }

    }
}
