package com.jia.basis.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 字段实体类
 * @author zhangjiacheng
 */
@Setter
@Getter
public class SysDict {
    private Integer id;

    private String dictName;

    private String dictValue;

    private String dictOrder;

}