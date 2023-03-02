package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.aspect.DemoControllerAspect;

@Configuration
public class DemoConfiguration {
	@Bean
	public DemoControllerAspect demoControllerAspect() {
		return new DemoControllerAspect();
	}

}
