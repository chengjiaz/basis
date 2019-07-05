package com.jia.basis.modules.testcontroller;

import com.alibaba.fastjson.JSON;
import com.jia.basis.common.config.Config;
import com.jia.basis.common.config.ConfigValue;
import com.jia.basis.common.config.ListenerConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjiacheng
 * @description:
 * @date 2019/7/2 17:05
 */
@RestController
@RequestMapping("config")
@Slf4j
public class ConfigController  {

	@Autowired
	private Config config;

	@Autowired
	private ConfigValue configValue;

	@Autowired
	private Environment env;

	/**
	 * 通过监听的方式
	 * @return
	 */
	@RequestMapping(value = {"/configLs"}, method = { RequestMethod.POST })
	public String configLs() {

		return JSON.toJSONString(ListenerConfig.getAllProperty());
	}

	/**
	 * 通过Environment的方式
	 * @return
	 */
	@RequestMapping(value = {"/configEnv"}, method = { RequestMethod.POST })
	public String configEnv() {
		String result= JSON.toJSONString(env.getProperty("com.jia.em.name"));
		return result;
	}

	/**
	 * 通过@value的方式
	 * @return
	 */
	@RequestMapping(value = {"/configValue"}, method = { RequestMethod.POST })
	public String configValue() {
		log.info("by|@Value|get|address=【{}】",  configValue.name);
		log.info("by|@Value|get|name=【{}】" , configValue.address);
		String result = JSON.toJSONString(configValue);
		return result ;
	}

	/**
	 *通过ConfigurationProperties的方式
	 * @return
	 */
	@RequestMapping(value = {"/config"}, method = { RequestMethod.POST })
	public String config() {
		log.info("byConfig|address=【{}】" , config.getAddress());
		log.info("byConfig|name=【{}】" , config.getName());
		return JSON.toJSONString(config);
	}



}
