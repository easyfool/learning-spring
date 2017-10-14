package com.wangfengbabe.learning_spring.aop.java_style_configuration.pointcut.api;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;

/**
 * Created by wangfeng on 29/06/2017.
 */
public class MyStaticPointcutTest {

  public static void main(String[] args) {

    BeanOne beanOne = new BeanOne();
    BeanTwo beanTwo = new BeanTwo();

    BeanOne proxyOne;
    BeanTwo proxyTwo;
    StaticMethodMatcherPointcut pc = new MyStaticPointcut();

    Advice advice = new SimpleAdvice();
    Advisor advisor = new DefaultPointcutAdvisor(pc, advice);

    ProxyFactory proxyFactory = new ProxyFactory();
    proxyFactory.addAdvisor(advisor);
    proxyFactory.setTarget(beanOne);
    proxyOne = (BeanOne) proxyFactory.getProxy();
    proxyOne.foo();
    proxyOne.bar();

    proxyFactory.addAdvisor(advisor);
    proxyFactory.setTarget(beanTwo);
    proxyTwo = (BeanTwo) proxyFactory.getProxy();
    proxyTwo.foo();
    proxyTwo.bar();

  }

}
