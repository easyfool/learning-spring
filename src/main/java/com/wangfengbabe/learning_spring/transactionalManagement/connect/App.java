package com.wangfengbabe.learning_spring.transactionalManagement.connect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by wangfeng on 26/06/2017.
 */
public class App {

  public static void main(String[] args) {
    ApplicationContext context =
        new ClassPathXmlApplicationContext("classpath:spring/spring-database.xml");
    JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
    int count = jdbcTemplate.queryForObject("select count(*) from customer", Integer.class);
    System.out.println(count);

  }

}
