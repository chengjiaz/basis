package com.jia.basis.service;

import com.jia.basis.entity.SysDict;
import com.jia.basis.mapper.SysDictMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/5 11:54
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SysDictService  {


    @Autowired
    private SysDictMapper sysDictMapper;

    @Transactional(readOnly = true)
    public SysDict selectByPrimaryKey(int id){
       return  sysDictMapper.selectByPrimaryKey(id);
    }

}