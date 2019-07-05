package com.jia.basis.modules.autoConfig;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zhangjiacheng
 * @description:
 * @date 2019/7/3 14:06
 */
@Component
@ConfigurationProperties(prefix = "com.jia.auto.config")
@Setter
@Getter
public class AutoConfigProperties {
    private String packageName;
    private String className;
}
