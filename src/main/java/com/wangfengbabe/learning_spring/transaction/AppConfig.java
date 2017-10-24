package com.wangfengbabe.learning_spring.transaction;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAspectJAutoProxy
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.wangfengbabe.learning_spring.transaction.*"})
@Import({C3p0DataSourceDBConfig.class})
public class AppConfig {

}
