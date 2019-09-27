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
public class TargetUser {
    /**id*/
    private Long targetId;

    /**名称*/
    private String targetName;

    /**密码*/
    private String password;

    /**出生日期*/
    @CopyField(originName = "originBirthDay")
    private Date targetBirthDay;

    /**是否健康*/
    @CopyField(originName = "originHealth")
    private Boolean targetHealth;
}
