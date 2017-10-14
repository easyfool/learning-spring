package com.wangfengbabe.learning_spring.aop.java_style_configuration
    .introduction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 28/06/2017.
 */
@Component("writer") public class Writer implements IWrite {

    private static final Logger LOGGER = LoggerFactory.getLogger(Writer.class);

    @Override public void write() {
        LOGGER.info("writing a poem");
    }
}
