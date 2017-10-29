package com.wangfengbabe.learning_spring.javaconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:spring/spring-database.xml")
public class DBConfig {

}
