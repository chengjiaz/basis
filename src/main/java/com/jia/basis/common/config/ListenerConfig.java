package com.jia.basis.common.config;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.core.io.support.PropertiesLoaderUtils;

/**
 * 
 * @author Administrator
 *
 */
public class ListenerConfig {

	public static Map<String, String> propertiesMap = new HashMap<String, String>();

	private static void processProperties(Properties props) throws BeansException {
		for (Object key : props.keySet()) {
			String keyStr = key.toString();
			try {
				propertiesMap.put(keyStr, props.getProperty(keyStr));
			} catch (java.lang.Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void loadAllProperties(String propertyFileName) {
		try {
			Properties properties = PropertiesLoaderUtils.loadAllProperties(propertyFileName);
			processProperties(properties);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String name) {
		return propertiesMap.get(name).toString();
	}

	public static Map<String, String> getAllProperty() {
		return propertiesMap;
	}
}
