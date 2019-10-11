package order;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @description: 实现hashmap排序
 * @author zhangjiacheng
 * @date 2019/10/9 9:22
 */


@Slf4j
public class HashMapOrderTest {

    public static void main(String[] args) {

        //(1)准备排序数据
        HashMap <Integer,User> orderMap = new HashMap<>(16);

        orderMap.put(1,new User("zhangjiacheng",18));
        orderMap.put(2,new User("zhangjia",58));
        orderMap.put(3,new User("zhangcheng",16));
        orderMap.put(4,new User("jiacheng",25));

        log.info("原始结果集:"+orderMap);

        //(2)调用排序方法
        HashMap <Integer,User> resultMap = sortHashMap(orderMap);

        //(3)结果输出
        log.info("排序结果输出:"+resultMap);
    }
     public static HashMap<Integer,User>  sortHashMap(HashMap<Integer,User> orderMap){

        //(1)orderMap.entrySet() 获取orderMap键值对集合
        //(2)将set集合转成list集合
        List< Map.Entry<Integer,User>> list =  new ArrayList<Map.Entry<Integer,User>>(orderMap.entrySet());

        //(3)调用排序方法
       Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
           @Override
           public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
              //(3.1)正序
             //  return o1.getValue().getAge().compareTo(o2.getValue().getAge());
              //(3.2)倒序
               return o2.getValue().getAge()-o1.getValue().getAge();
           }
       });

         //(4)创建有序的hashmap子类集合
         LinkedHashMap<Integer,User> linkedHashMap = new LinkedHashMap<Integer, User>(16);

         //(5)list的数据存放到linkhashMap中
         for(Map.Entry<Integer,User> entry: list ){
             linkedHashMap.put(entry.getKey(),entry.getValue());
         }
        return linkedHashMap;

     }


}
