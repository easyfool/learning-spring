package com.wangfengbabe.learning.dao.impl;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;
import com.wangfengbabe.learning.dao.IUserDao;
import com.wangfengbabe.learning.vo.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoImplTest {

  @Autowired
  private IUserDao userDao;

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testAutowiredPropertyNotNull() {
    assertThat(userDao, notNullValue());
  }

  @Test
  public void getUser() throws Exception {
    int id = 11;
    User user = userDao.getUser(id);
    System.out.println(user.getName() + " |" + user.getAge());
  }

  @Test
  public void save() throws Exception {
    User user = new User();
//    user.setId(13);
    user.setName("wangfeng");
    user.setAge(28);
    userDao.save(user);
  }

}
