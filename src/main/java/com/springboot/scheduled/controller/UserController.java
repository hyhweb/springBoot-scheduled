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
//    Cron表达式是一个字符串，字符串以5或6个空格隔开，分为6或7个域，每一个域代表一个含义，Cron有如下两种语法格式：
//
//            1.Seconds Minutes Hours DayofMonth Month DayofWeek Year
//2.Seconds Minutes Hours DayofMonth Month DayofWeek
//    举几个例子:
//
//    每隔5秒执行一次："*/5 * * * * ?"
//
//    每隔1分钟执行一次："0 */1 * * * ?"
//
//    每天23点执行一次："0 0 23 * * ?"
//
//    每天凌晨1点执行一次："0 0 1 * * ?"
//
//    每月1号凌晨1点执行一次："0 0 1 1 * ?"
//
//    每月最后一天23点执行一次："0 0 23 L * ?"
//
//    每周星期天凌晨1点实行一次："0 0 1 ? * L"
//
//    在26分、29分、33分执行一次："0 26,29,33 * * * ?"
//
//    每天的0点、13点、18点、21点都执行一次："0 0 0,13,18,21 * * ?"
//
//    表示在每月的1日的凌晨2点调度任务："0 0 2 1 * ? *"
//
//    表示周一到周五每天上午10：15执行作业："0 15 10 ? * MON-FRI"
//
//    表示2002-2006年的每个月的最后一个星期五上午10:15执行："0 15 10 ? 6L 2002-2006"
}
