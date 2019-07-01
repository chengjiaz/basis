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
	private  static  String name;
	
	@Value("${com.jia.ve.address}")
	private  static String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		ConfigValue.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		ConfigValue.address = address;
	}

}
