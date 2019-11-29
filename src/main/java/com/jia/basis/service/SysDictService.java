package com.jia.basis.service;

import com.jia.basis.entity.SysDict;
import com.jia.basis.mapper.SysDictMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/5 11:54
 */
@Service
@Transactional(rollbackFor = Exception.class)
@Slf4j
public class SysDictService  {


    @Autowired
    private SysDictMapper sysDictMapper;

    @Transactional(readOnly = true)
    public SysDict selectByPrimaryKey(int id){
       return  sysDictMapper.selectByPrimaryKey(id);
    }




    @Transactional(readOnly = true)
    public List<SysDict> findSysList(){
        /**
         * 三元表达式方式:
         * 由?:符号表示的
         * 这种运算符会将某个条件作两种处理:
         * a如果满足条件的话就执行第一个结果，
         * b如果不满足的话就执行另外一个结果，
         * 例如：
         * Int A,B,C;
         * A=2;
         * B=3;
         * C=A>B ? 100 :200;
         * 这条语句的意思是，如果A>B的话，就将100赋给C，否则就将200赋给C
         */
        if(sysDictMapper.findSysList() != null ){
            log.info("SysDictService->findSysList:成功获取【{}】条数据",sysDictMapper.findSysList().size()>0?sysDictMapper.findSysList().size():sysDictMapper.findSysList().size());
        }
        return  sysDictMapper.findSysList();
    }

}