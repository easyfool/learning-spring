package com.wangfengbabe.learning_spring.javaconfig;


import com.wangfengbabe.learning_spring.javaconfig.student.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    Student student = context.getBean(Student.class, "student2");
    student.say();
    System.out.println(student.hello);
    System.out.println(student.url);
    System.out.println(student.jdbcTemplate == null);
    System.out.println(student.limits);

  }

}
