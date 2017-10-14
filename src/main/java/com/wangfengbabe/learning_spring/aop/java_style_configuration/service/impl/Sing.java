package com.wangfengbabe.learning_spring.aop.java_style_configuration.service
    .impl;

import com.wangfengbabe.learning_spring.aop.java_style_configuration.service
    .IPerform;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 28/06/2017.
 */
@Component("sing")
public class Sing implements IPerform {

  private static final Logger LOGGER = LoggerFactory.getLogger(Sing.class);

  @Override
  public void perform(int i) throws IOException {
    LOGGER.info("sing a song");
    if (i == 0) {
      throw new IOException("");
    }
  }
}
