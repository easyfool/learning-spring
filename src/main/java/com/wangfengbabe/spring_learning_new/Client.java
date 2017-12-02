package com.wangfengbabe.spring_learning_new;

import com.sun.deploy.util.BlackList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

    Person person = context.getBean("person", Person.class);
    Animal animal = context.getBean(Animal.class);
    System.out.println(animal);
    Object person1 = context.getBean("person1");
    System.out.println(person1);

    Bird bird = context.getBean(Bird.class);
    System.out.println(bird.applicationContext.getBean("conf"));
    System.out.println(bird.beanName);
    System.out.println(bird.getAnimal());

    MailService mailService = context.getBean(MailService.class);
    mailService.sendEmail();
    // BlackListNotifier notifier = context.getBean(BlackListNotifier.class);

  }

}
