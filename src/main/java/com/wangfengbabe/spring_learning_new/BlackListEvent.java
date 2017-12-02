package com.wangfengbabe.spring_learning_new;

import java.util.List;
import org.springframework.context.ApplicationEvent;

public class BlackListEvent extends ApplicationEvent {
  private List<String> addresses;

  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public BlackListEvent(Object source, List<String> addresses) {
    super(source);
    this.addresses = addresses;
  }
}
