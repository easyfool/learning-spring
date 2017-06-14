package com.wangfengbabe.learning_spring;

/**
 * Created by wangfeng on 13/06/2017.
 */
public class DefaultServiceLocator {

  private static ClientService clientService = new ClientServiceImpl();
  private static AccountService accountService = new AccountServiceImpl();

  public DefaultServiceLocator() {

  }

  public ClientService createClientService() {
    return clientService;
  }

  public AccountService createAccountService() {
    return accountService;
  }

}
