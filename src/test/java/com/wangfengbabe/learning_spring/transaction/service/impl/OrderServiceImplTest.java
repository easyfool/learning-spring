package com.wangfengbabe.learning_spring.transaction.service.impl;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import com.wangfengbabe.learning_spring.transaction.AppConfig;
import com.wangfengbabe.learning_spring.transaction.service.IAccountService;
import com.wangfengbabe.learning_spring.transaction.service.IOrderService;
import com.wangfengbabe.learning_spring.transaction.service.IPersonService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class OrderServiceImplTest {

  @Mock
  private IPersonService personService;

  @Mock
  private IAccountService accountService;

  @InjectMocks
  @Autowired
  private IOrderService orderService;

  @Before
  public void before() {
    MockitoAnnotations.initMocks(this);
    ReflectionTestUtils.setField(orderService, "personService", personService);
    ReflectionTestUtils.setField(orderService, "accountService", accountService);
  }


  @Test
  public void testAutowiredServicesNotNull() {
    assertThat(orderService, notNullValue());
    assertThat(personService, notNullValue());
    assertThat(accountService, notNullValue());
  }

  @Test
  public void testSuccess() {
    orderService.placeOrder();
    Mockito.verify(personService, Mockito.times(1)).login();
    Mockito.verify(accountService, Mockito.times(1)).pay();
  }

  @Test
  public void testWhenException() {
    doThrow(RuntimeException.class).when(personService).login();
    orderService.placeOrder();


  }


}
