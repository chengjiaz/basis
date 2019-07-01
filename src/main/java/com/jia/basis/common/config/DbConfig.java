package com.jia.basis.common.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@ConfigurationProperties(prefix="spring.datasource")
@Slf4j
@Setter
@Getter
public class DbConfig {

    /**
     * 用户名
     */
    @Value("${spring.datasource.username}")
    private  String  userName;

    /**
     * 密码
     */
    @Value("${spring.datasource.password}")
    private  String password;

    /**
     * url
     */
    @Value("${spring.datasource.url}")
    private  String url;

    /**
     * driver-class-name
     */
    @Value("${spring.datasource.driver-class-name}")
    private   String driverClassName;



}
