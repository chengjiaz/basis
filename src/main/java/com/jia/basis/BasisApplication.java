package com.jia.basis;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.net.InetAddress;

/**
 * //如果想法中使用的@Async,那么则需要在主方法中添加下面的注解(20181127)-第一步
//@EnableAsync //开启异步调用
//(20181128)springboot整合servlet
//注解方式-下面的注解测试时,需要释放-为第一步
//@ServletComponentScan 
//(20181120)方式二
//@PropertySource(value = {"classpath:configYml/application.yml"})
 * @author Administrator
 *
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(basePackages = "com.jia.basis.mapper")
@EnableTransactionManagement
@Slf4j
public class BasisApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BasisApplication.class);
	}

	public static void main(String[] args) {

		//SpringApplication.run(BasisApplication.class, args);


		//关闭banner
		//SpringApplication application = new SpringApplication(BasisApplication.class);
		//application.setBannerMode(Banner.Mode.OFF);
		//application.run(args);


		// 监听方式-获取所有的配置
		//采用这种方式时,需要把语句： SpringApplication.run(BasisApplication.class, args);注释
		// SpringApplication application = new SpringApplication(BasisApplication.class);
		// application.addListeners(new Listener("application.properties"));
		// application.run(args);


		SpringApplication app = new SpringApplication(BasisApplication.class);
		Environment env = app.run(args).getEnvironment();
		String protocol = "http";
		if (env.getProperty("server.ssl.key-store") != null) {
			protocol = "https";
		}
		String hostAddress = "localhost";
		try {
			hostAddress = InetAddress.getLocalHost().getHostAddress();
		} catch (Exception e) {
			log.warn("The host name could not be determined, using `localhost` as fallback");
		}
		log.info("\n----------------------------------------------------------\n\t" +
						"Application '{}' is running! Access URLs:\n\t" +
						"Local: \t\t{}://localhost:{}\n\t" +
						"External: \t{}://{}:{}\n\t" +
						"Profile(s): \t{}\n----------------------------------------------------------",
				env.getProperty("spring.application.name"),
				protocol,
				env.getProperty("server.port"),
				protocol,
				hostAddress,
				env.getProperty("server.port"),
				env.getActiveProfiles());

		String configServerStatus = env.getProperty("configserver.status");
		log.info("\n----------------------------------------------------------\n\t" +
						"Config Server: \t{}\n----------------------------------------------------------",
				configServerStatus == null ? "Not found or not setup for this application" : configServerStatus);

		
		
	}
	
}
