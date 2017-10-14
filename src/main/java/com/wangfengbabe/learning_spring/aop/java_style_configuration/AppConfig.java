package com.wangfengbabe.learning_spring.aop.java_style_configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by wangfeng on 27/06/2017.
 */
@Configuration
@ComponentScan(basePackages = {"com.wangfengbabe.learning_spring.aop.java_style_configuration"})
@EnableAspectJAutoProxy
public class AppConfig {

}
