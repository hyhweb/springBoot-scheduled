package com.springboot.scheduled.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserController {
  // fixedRate 表示任务执行之间的时间间隔，具体是指两次任务的开始时间间隔，即第二次任务开始时，第一次任务可能还没结束。
  /* @Scheduled(fixedRate = 2000)
    public void fixedRate() {
      System.out.println("fixedRate>>" + new Date());
    }
  //fixedDelay 表示任务执行之间的时间间隔，具体是指本次任务结束到下次任务开始之间的时间间隔。
    @Scheduled(fixedDelay = 3000)
    public void fixedDelay() {
      System.out.println("fixedDelay" + new Date());
    }
  //initialDelay 表示首次任务启动的延迟时间。
    @Scheduled(initialDelay = 4000, fixedDelay = 5000)
    public void initialDelay(){
      System.out.println("initialDelay>>"+new Date());
    }*/

  // @Scheduled 注解也支持 cron 表达式，使用 cron 表达式，可以非常丰富的描述定时任务的时间。cron 表达式格式如下：
  //
  // [秒] [分] [小时] [日] [月] [周] [年]
  // 每年每月12日10时33分8秒执行
  /*  @Scheduled(cron = "8 33 10 12 * *")
  public void cron() {
    System.out.println("cron>>>>"+new Date());
  }*/

}
