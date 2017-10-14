package com.wangfengbabe.learning_spring.service.impl;

import com.wangfengbabe.learning_spring.model.Spittle;
import com.wangfengbabe.learning_spring.service.ISpittleService;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 14/06/2017.
 */
@Component public class SpittleServiceImpl implements ISpittleService {

    @Override public List<Spittle> findSpittles(long max, int count) {
        return null;
    }
}
