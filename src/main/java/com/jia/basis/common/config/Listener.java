package com.jia.basis.common.config;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/***
 * 
 * @author Administrator 通过listener获取配置文件
 */
public class Listener implements ApplicationListener<ApplicationStartedEvent> {

	private String configFileName;

	public Listener(String configFileName) {
		this.configFileName = configFileName;
	}

	@Override
	public void onApplicationEvent(ApplicationStartedEvent arg0) {
		ListenerConfig.loadAllProperties(configFileName);
	}

}
