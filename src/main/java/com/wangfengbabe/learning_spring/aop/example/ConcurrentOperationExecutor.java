package com.wangfengbabe.learning_spring.aop.example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Component;

/**
 * Created by wangfeng on 28/06/2017.
 */
@Aspect
@Component
public class ConcurrentOperationExecutor implements Ordered {

  private int order = 1;
  private static final int DEFAULT_MAX_RETRIES = 2;
  private int maxRetries = DEFAULT_MAX_RETRIES;

  @Override
  public int getOrder() {
    return this.order;
  }

  @Around("")
  public Object doConcurrentOperation(ProceedingJoinPoint joinPoint) {
    int numAttempts = 0;
    PessimisticLockingFailureException lockFailureException = null;
    do {
      numAttempts++;
      try {
        return joinPoint.proceed();
      } catch (PessimisticLockingFailureException ex) {
        lockFailureException = ex;

      } catch (Throwable throwable) {
        throwable.printStackTrace();
      }
    } while (numAttempts < this.maxRetries);

    throw lockFailureException;
  }
}
