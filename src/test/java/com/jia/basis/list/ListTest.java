package com.jia.basis.list;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/26 11:37
 */
@Slf4j
public class ListTest {
    public static void main(String[] args){

        Test test1 = new Test();
        test1.setName("zjc1");
        test1.setAge("181");
        Test test2 = new Test();
        test2.setName("zjc");
        test2.setAge("18");



        Test test4 = new Test();
        test4.setName("zjc4");
        test4.setAge("184");

        List<Test> list1=new ArrayList<>();
        list1.add(test1);
        list1.add(test2);


        List<Test> list2 = new ArrayList<>();

        list2.add(test2);
        list2.add(test4);



        list1.retainAll(list2);

        if(list1 != null && list1.size()>0){
            for(int j=0;j<list1.size();j++){
                log.info("【{}】",list1.get(j).getAge()+";"+list1.get(j).getName());
            }
        }



    }


}
