package com.jia.basis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

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

public class BasisApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BasisApplication.class);
	}

	public static void main(String[] args) {

		SpringApplication.run(BasisApplication.class, args);


		//关闭banner
		//SpringApplication application = new SpringApplication(BasisApplication.class);
		//application.setBannerMode(Banner.Mode.OFF);
		//application.run(args);


		// 监听方式-获取所有的配置
		//采用这种方式时,需要把语句： SpringApplication.run(BasisApplication.class, args);注释
		// SpringApplication application = new SpringApplication(BasisApplication.class);
		// application.addListeners(new Listener("application.properties"));
		// application.run(args);
		
		
	}
	
}
