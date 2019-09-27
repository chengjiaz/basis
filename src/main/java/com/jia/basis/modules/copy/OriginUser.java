package com.jia.basis.modules.copy;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/9/27 11:31
 */
@Getter
@Setter
public class OriginUser {/**id*/
@CopyField(targetName = "targetId")
private Long originId;

    /**名称*/
    @CopyField(targetName = "targetName")
    private String originName;

    /**密码*/
    private String password;

    /**出生日期*/
    private Date originBirthDay;

    /**是否健康*/
    private Boolean originHealth;
}
