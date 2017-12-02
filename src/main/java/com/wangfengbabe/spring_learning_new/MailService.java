package com.wangfengbabe.spring_learning_new;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class MailService implements ApplicationEventPublisherAware {

  private List<String> addresses;

  private ApplicationEventPublisher eventPublisher;

  public List<String> getAddresses() {
    return addresses;

  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    this.eventPublisher = applicationEventPublisher;
  }

  public void sendEmail() {
    eventPublisher.publishEvent(new BlackListEvent(this, Arrays.asList("a", "b", "c")));
  }


}
