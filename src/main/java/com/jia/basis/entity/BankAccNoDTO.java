package com.jia.basis.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author zhangjiacheng
 * @description: 行方账号余额信息
 * @date 2019/7/31 19:26
 */
@Setter
@Getter
public class BankAccNoDTO implements Serializable {


    /**
     * 状态(主账号/子账号)
     */
    private String acctStatus;

    /**
     * 主账号
     */
    private String cis;

    /**
     * 主账面余额
     */
    private String faceBal;

    /**
     * 子账号
     */

    private String subAcctIntrNo;

    /**
     * 子账面余额
      */
    private String cashFaceBal;

    /**
     *币种
     */
    private String acctCur;

    /**
     * 卡类别
     */

    private  String  cardType;

    /**
     *可用余额
     */
    private String avlbBal;


    /**
     *卡号
     */
    private String accNo;



}
