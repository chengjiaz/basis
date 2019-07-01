package com.jia.basis.modules.testcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.jia.basis.common.config.Config;
import com.jia.basis.common.config.ConfigValue;
import com.jia.basis.common.config.ListenerConfig;
import com.jia.basis.common.controller.BaseController;

/**
 * 
 * @author Administrator 测试配置文件获取controller
 * note：
 * 1>JSONObject = fastjson-1.2.44.jar中的对象
 * 
 */
@RestController
@RequestMapping("config")
public class ConfigController extends BaseController {

	@Autowired
	private Config config;

	@Autowired
	private ConfigValue configValue;

	@Autowired
	private Environment env;

	@RequestMapping(value = {"/configLs"}, method = { RequestMethod.POST })
	public String configLs() {
		return JSON.toJSONString(ListenerConfig.getAllProperty());
	}

	@RequestMapping(value = {"/configEnv"}, method = { RequestMethod.POST })
	public String configEnv() {
		String result= JSON.toJSONString(env.getProperty("com.jia.em.name"));
		return result;
	}

	@RequestMapping(value = {"/configValue"}, method = { RequestMethod.POST })
	public String configValue() {
		logger.info("byValue|address=【{}】",  configValue.getAddress());

		logger.info("Value|name=【{}】" , configValue.getName());
		String result = JSON.toJSONString(configValue);
		return result ;
	}

	@RequestMapping(value = {"/config"}, method = { RequestMethod.POST })
	public String config() {
		logger.info("byConfig|address=【{}】" , config.getAddress());
		logger.info("byConfig|name=【{}】" , config.getName());
		return JSON.toJSONString(config);
	}

	@RequestMapping(value = {"/test"}, method = { RequestMethod.POST })
	public String list() {
		logger.info("ConfigController|list|method|into");
		return "";
	}

}
