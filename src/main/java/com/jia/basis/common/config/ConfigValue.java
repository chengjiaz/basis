package com.jia.basis.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/***
 * 
 * @author Administrator 通过@value获取配置文件内容
 */
@Component
public class ConfigValue {

	@Value("${com.jia.ve.name}")
	public    String name;
	
	@Value("${com.jia.ve.address}")
	public   String address;



}
