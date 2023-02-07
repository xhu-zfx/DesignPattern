package com.panghu.controller;

import com.panghu.framework.context.ApplicationContext;
import com.panghu.framework.context.support.ClassPathXmlApplicationContext;
import com.panghu.service.UserService;

public class UserController {
    public static void main(String[] args) throws Exception {
        // 获取spring的容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从容器中获取userservice对象
        UserService userService = (UserService) applicationContext.getBean("userService");
        // 调用userService方法进行业务逻辑处理
        userService.add();
        
    }
}
