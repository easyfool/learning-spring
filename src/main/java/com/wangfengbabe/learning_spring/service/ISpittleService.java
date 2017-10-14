package com.wangfengbabe.learning_spring.service;

import com.wangfengbabe.learning_spring.model.Spittle;
import java.util.List;

/**
 * Created by wangfeng on 12/06/2017.
 */
public interface ISpittleService {

  List<Spittle> findSpittles(long max, int count);

}
