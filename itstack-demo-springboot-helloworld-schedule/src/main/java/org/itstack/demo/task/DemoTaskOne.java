package org.itstack.demo.task;

import org.itstack.middleware.schedule.annotation.DcsScheduled;
import org.springframework.stereotype.Component;

/**
 * 博  客：http://bugstack.cn
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * create by 付政委 on 2019/12/4
 */
@Component("demoTaskOne")
public class DemoTaskOne {

    @DcsScheduled(cron = "0/3 * * * * *", desc = "01定时任务执行测试：taskMethod01", autoStartup = true)
    public void taskMethod01() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
        System.out.println("01定时任务执行测试：taskMethod01");
    }

    @DcsScheduled(cron = "0/5 * * * * *", desc = "01定时任务执行测试：taskMethod02", autoStartup = false)
    public void taskMethod02() {
        try {
            Thread.sleep(35);
        } catch (InterruptedException ignored) {
        }
        System.out.println("01定时任务执行测试：taskMethod02");
    }

}
