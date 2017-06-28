package com.wangfengbabe.learning_spring.aop.java_style_configuration.pointcut;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import com.wangfengbabe.learning_spring.aop.java_style_configuration.model.Account;
import com.wangfengbabe.learning_spring.aop.java_style_configuration.service.IAccountService;
import com.wangfengbabe.learning_spring.aop.java_style_configuration.service.IBookService;
import com.wangfengbabe.learning_spring.aop.java_style_configuration.service.impl.DeprecatedAccountServiceImpl;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangfeng on 27/06/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.wangfengbabe.learning_spring.aop.java_style_configuration.AppConfig.class})
public class SystemArchitectureTest {

  @Rule
  public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

  @Autowired
  private Account account;

  @Autowired
  private IAccountService accountService;

  @Autowired
  private DeprecatedAccountServiceImpl deprecatedAccountService;

  @Autowired
  IBookService bookService;

  @Test
  public void testAnyPublicOperation() {
    account.deposite(10.0);//this will output twice including test method
    assertThat(systemOutRule.getLog(), containsString("logger before any public Opration"));
  }

  @Test
  public void testAnyOperationStartsWithSet() {
    account.setBalance(100.0);
    assertThat(systemOutRule.getLog(), not(containsString("logger before any operation in service package")));
    assertThat(systemOutRule.getLog(), containsString("logger before any Opration starts with set"));
  }

  @Test
  public void testAnyOperationInAccountServiceShouldOutputProper() {
    accountService.transfer(new Account(), new Account(), 20.0);
    assertThat(systemOutRule.getLog(), containsString("logger before any operation for IAccountService"));
    assertThat(systemOutRule.getLog(), containsString("logger before any operation in service package"));

  }

  @Test
  public void testAnyOperationNotInAccountServiceShouldNotOutputProper() {
    String isbn = "123456";
    bookService.getBookStoreByIsbn(isbn);
    assertThat(systemOutRule.getLog(), not(containsString("logger before any operation for IAccountService")));
    assertThat(systemOutRule.getLog(), containsString("logger before any operation in service package"));
  }

  @Test
  public void testAnyOperationInServiceOrSubPackage() {
    deprecatedAccountService.print();
    assertThat(systemOutRule.getLog(), containsString("logger before any operation in service or sub package"));
    assertThat(systemOutRule.getLog(), not(containsString("logger before any operation in service package")));

  }

  @Test
  public void testAnyOperationWithinPackage() {
    bookService.getBookStoreByIsbn("");
  }

}