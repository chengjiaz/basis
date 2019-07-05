package com.jia.basis.modules.autoConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/3 14:17
 */
@Configuration
@EnableConfigurationProperties(AutoConfigProperties.class)
@ConditionalOnClass(AutoConfig.class)
@ConditionalOnProperty(prefix = "com.jia.auto.config",value = "enable",matchIfMissing = true)
public class AutoConfigPropertiesClass {
    @Autowired
    private AutoConfigProperties autoConfigProperties;

    @Bean
    @ConditionalOnMissingBean(AutoConfig.class)
    public AutoConfig getAutoConfig(){
        AutoConfig autoConfig = new AutoConfig();
        autoConfig.setClassName(autoConfigProperties.getClassName());
        autoConfig.setPackageName(autoConfigProperties.getPackageName());
        return autoConfig;

    }
}
