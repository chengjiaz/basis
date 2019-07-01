package com.jia.basis.common.config;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 
 * @author Administrator 通过@@ConfigurationProperties获取配置文件内容
 */
@Component
@ConfigurationProperties(prefix = "com.jia.cp")
@Setter
@Getter
public class Config {

	private String name;
	private String address;


}
