package com.wangfengbabe.spring_learning_new;

import java.util.List;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class BlackListNotifier implements ApplicationListener {

  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  private List<String> addresses;

  @Override
  public void onApplicationEvent(ApplicationEvent applicationEvent) {
    this.addresses = ((BlackListEvent) applicationEvent).getAddresses();
    System.out.println(addresses);
  }
}
