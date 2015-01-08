package com.lynas.etweb.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
public class AppConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {

		InternalResourceViewResolver iRVR = new InternalResourceViewResolver();
		iRVR.setPrefix("/");
		iRVR.setSuffix(".jsp");
		return iRVR;

	}

}
