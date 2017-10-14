package com.wangfengbabe.learning_spring;

import static org.junit.Assert.assertNotNull;
import com.wangfengbabe.learning_spring.factorymethod.AccountService;
import com.wangfengbabe.learning_spring.factorymethod.ClientService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangfeng on 13/06/2017.
 */
public class ClientServiceTest {

  @Test
  public void testFactoryMethod() {
    ApplicationContext context = new ClassPathXmlApplicationContext(
        "classpath:spring/spring" + "-instantiation_with_instance_factory_method.xml");
    ClientService clientService = (ClientService) context.getBean("clientService");
    assertNotNull(clientService);
    AccountService accountService = (AccountService) context.getBean("accountService");
    assertNotNull(accountService);
  }

}
