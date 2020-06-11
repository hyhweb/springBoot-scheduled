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

//
//    每一个域都使用数字，但还可以出现如下特殊字符，它们的含义是：
//            (1) *：表示匹配该域的任意值，假如在Minutes域使用*, 即表示每分钟都会触发事件。
//
//            (2) ?：只能用在DayofMonth和DayofWeek两个域。它也匹配域的任意值，但实际不会。因为DayofMonth和 DayofWeek会相互影响。例如想在每月的20日触发调度，不管20日到底是星期几，则只能使用如下写法： 13 13 15 20 * ?, 其中最后一位只能用？，而不能使用*，如果使用*表示不管星期几都会触发，实际上并不是这样。
//
//            (3) -：表示范围，例如在Minutes域使用5-20，表示从5分到20分钟每分钟触发一次
//
//            (4) /：表示起始时间开始触发，然后每隔固定时间触发一次，例如在Minutes域使用5/20,则意味着5分钟触发一次，而25，45等分别触发一次.
//
//            (5) ,：表示列出枚举值值。例如：在Minutes域使用5,20，则意味着在5和20分每分钟触发一次。
//
//            (6) L：表示最后，只能出现在DayofWeek和DayofMonth域，如果在DayofWeek域使用5L,意味着在最后的一个星期四触发。
//
//            (7) W：表示有效工作日(周一到周五),只能出现在DayofMonth域，系统将在离指定日期的最近的有效工作日触发事件。例如：在 DayofMonth使用5W，如果5日是星期六，则将在最近的工作日：星期五，即4日触发。如果5日是星期天，则在6日(周一)触发；如果5日在星期一 到星期五中的一天，则就在5日触发。另外一点，W的最近寻找不会跨过月份。
//
//            (8) LW：这两个字符可以连用，表示在某个月最后一个工作日，即最后一个星期五。
//
//            (9) #：用于确定每个月第几个星期几，只能出现在DayofMonth域。例如在4#2，表示某月的第二个星期三。
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
