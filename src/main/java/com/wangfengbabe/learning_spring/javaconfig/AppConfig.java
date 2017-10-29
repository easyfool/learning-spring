package com.wangfengbabe.learning_spring.javaconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = {"com.wangfengbabe.learning_spring.javaconfig"})
@PropertySources({@PropertySource(value = "classpath:properties/mysql.properties"),
    @PropertySource(name = "test", value = "classpath:properties/test.properties")

})
@Import({DBConfig.class})
public class AppConfig {

}
