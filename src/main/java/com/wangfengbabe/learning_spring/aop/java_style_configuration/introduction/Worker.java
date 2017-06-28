package com.wangfengbabe.learning_spring.aop.java_style_configuration.introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 28/06/2017.
 */
@Component("worker")
public class Worker implements IWork {

  private static final Logger LOGGER = LoggerFactory.getLogger(Worker.class);

  @Override
  public void work() {
    LOGGER.info("working");
  }
}
