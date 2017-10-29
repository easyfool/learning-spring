package com.wangfengbabe.learning_spring.javaconfig.student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {

  @Autowired
  public JdbcTemplate jdbcTemplate;

  @Value("#{'${hello}'.concat(' you')}")
  public String hello;

  @Value("#{'${limit}'.split(',')}")
  public List<Integer> limits;


  @Value("${jdbc.url}")
  public String url;

  public void say() {
    System.out.println("hello student1");
  }


}
