package com.hanyu;

import com.hanyu.domian.User;
import com.hanyu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) ac.getBean("userService");
        User user = new User();
        user.setName("hanyu");
        user.setPassword("hanyu");
        userService.save(user);
        System.out.println(userService);
    }
}
