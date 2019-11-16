package com.springboot.scheduled.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class UserController {
 /* @Scheduled(fixedRate = 2000)
  public void fixedRate() {
    System.out.println("fixedRate>>" + new Date());
  }

  @Scheduled(fixedDelay = 3000)
  public void fixedDelay() {
    System.out.println("fixedDelay" + new Date());
  }

  @Scheduled(initialDelay = 4000, fixedDelay = 5000)
  public void initialDelay(){
    System.out.println("initialDelay>>"+new Date());
  }*/

 //每年每月12日10时33分8秒执行
/*  @Scheduled(cron = "8 33 10 12 * *")
  public void cron() {
    System.out.println("cron>>>>"+new Date());
  }*/

}
