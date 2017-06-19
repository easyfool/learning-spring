package com.wangfengbabe.learning_spring.dependencyWithCollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by wangfeng on 18/06/2017.
 */
public class ComplexObject {

  private Properties adminEmails;
  private List someList;
  private Map someMap;
  private Set someSet;

  public Properties getAdminEmails() {
    return adminEmails;
  }

  public void setAdminEmails(Properties adminEmails) {
    this.adminEmails = adminEmails;
  }

  public List getSomeList() {
    return someList;
  }

  public void setSomeList(List someList) {
    this.someList = someList;
  }

  public Map getSomeMap() {
    return someMap;
  }

  public void setSomeMap(Map someMap) {
    this.someMap = someMap;
  }

  public Set getSomeSet() {
    return someSet;
  }

  public void setSomeSet(Set someSet) {
    this.someSet = someSet;
  }
}
