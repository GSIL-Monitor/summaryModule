package com.summary.webpc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages="com.summary.webpc.mapper")
//@EnableAutoConfiguration
//@EnableScheduling
@ComponentScan(basePackages = "com.summary.webpc")
public class WebPcApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WebPcApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(WebPcApplication.class, args);
	}
}
