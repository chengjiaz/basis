package com.jia.basis.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 字段实体类
 * @author zhangjiacheng
 */
@Setter
@Getter
@Entity
@Table
public class SysDictJpa {
    private Integer id;

    private String dictName;

    private String dictValue;

    private String dictOrder;

}