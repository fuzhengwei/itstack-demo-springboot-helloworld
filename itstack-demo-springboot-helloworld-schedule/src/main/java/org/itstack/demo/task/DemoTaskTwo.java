package org.itstack.demo.task;

import org.itstack.middleware.schedule.annotation.DcsScheduled;
import org.springframework.stereotype.Component;

/**
 * 博  客：http://bugstack.cn
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * create by 付政委 on 2019/12/4
 */
@Component("demoTaskTwo")
public class DemoTaskTwo {

    @DcsScheduled(cron = "0 * * * * *", desc = "02定时任务执行测试：taskMethod01")
    public void taskMethod01() {
        System.out.println("02定时任务执行测试：taskMethod01");
    }

    @DcsScheduled(cron = "*/10 * * * * *", desc = "02定时任务执行测试：taskMethod02")
    public void taskMethod02() {
        System.out.println("02定时任务执行测试：taskMethod02");
    }

}
