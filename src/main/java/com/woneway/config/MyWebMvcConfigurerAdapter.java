package com.woneway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.woneway.interceptor.MyInterceptor;

@Configuration
@SuppressWarnings("deprecation")
public class MyWebMvcConfigurerAdapter extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/skill/**","/news/**").excludePathPatterns("/usr/login").excludePathPatterns("/usr/register");
		super.addInterceptors(registry);
	}

}
