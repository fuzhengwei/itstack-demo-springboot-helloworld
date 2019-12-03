package org.itstack.demo.test;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.HelloWorldApplication;
import org.itstack.demo.domain.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 公众号：bugstack虫洞栈 | 沉淀、分享、成长，让自己和他人都能有所收获！
 * 博  客：http://bugstack.cn
 * Create by 付政委 on @2019
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWorldApplication.class)
public class ApiTest {

    @Test
    public void starterTest() {
        System.out.println(JSON.toJSONString(new UserInfo("1111","非白名单可访问用户拦截！")));
    }

}
