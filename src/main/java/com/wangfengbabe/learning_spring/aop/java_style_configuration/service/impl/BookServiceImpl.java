package com.wangfengbabe.learning_spring.aop.java_style_configuration.service
    .impl;

import com.wangfengbabe.learning_spring.aop.java_style_configuration.service
    .IBookService;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 27/06/2017.
 */
@Component
public class BookServiceImpl implements IBookService {

  @Override
  public int getBookStoreByIsbn(String isbn) {
    return 0;
  }
}
