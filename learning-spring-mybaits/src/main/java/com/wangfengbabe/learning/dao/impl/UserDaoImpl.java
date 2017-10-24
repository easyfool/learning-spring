package com.wangfengbabe.learning.dao.impl;

import com.wangfengbabe.learning.dao.IUserDao;
import com.wangfengbabe.learning.vo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

  @Autowired
  private SqlSessionTemplate sqlSessionTemplate;

  @Override
  public User getUser(int id) {
    return sqlSessionTemplate.selectOne("com.wangfengbabe.learning.UsersMapper.getUser", id);
  }

  @Override
  public void save(User user) {
    sqlSessionTemplate.insert("com.wangfengbabe.learning.UsersMapper.insertUser", user);

  }
}
