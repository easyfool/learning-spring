package com.wangfengbabe.learning.dao;

import com.wangfengbabe.learning.vo.User;


public interface IUserDao {
  public User getUser(int id);

  public void save(User user);
}
