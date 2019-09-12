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

        if(sysDictMapper.findSysList() != null && sysDictMapper.findSysList().size()>0){
            log.info("SysDictService->findSysList:成功获取【{}】条数据",sysDictMapper.findSysList().size());
        }else{
            log.info("SysDictService->findSysList：成功获取【{}】条数据",sysDictMapper.findSysList().size());
        }
        return  sysDictMapper.findSysList();
    }

}