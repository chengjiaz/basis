package com.jia.basis.mapper;

import com.jia.basis.entity.SysDict;
import org.apache.ibatis.annotations.Mapper;

/**
 * 字典操作方法
 * @author zhangjiacheng
 */
@Mapper
public interface SysDictMapper  {
    /**
     * 根据id删除
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 数据录入
     * @param record
     * @return
     */
    int insert(SysDict record);

    /**
     * 根据对象查找
     * @param record
     * @return
     */

    int insertSelective(SysDict record);

    /**
     * 根据id查找对象
     * @param id
     * @return
     */

    SysDict selectByPrimaryKey(Integer id);

    /**
     * 根据对象修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(SysDict record);


    /**
     * 根据对象修改
     * @param record
     * @return
     */
    int updateByPrimaryKey(SysDict record);
}