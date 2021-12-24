package com.spring5.test;

import com.spring5.User;
import com.spring5.bean.Emp;
import com.spring5.collectionjava.Student;
import com.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
    public void testAdd(){
//        1、加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        2、获取配置创建的对象（在加载配置文件时候不会创建对象，在获取对象或使用时才会创建对象）
        User user = context.getBean("user", User.class);
        System.out.println(user);//输出user对象地址
        user.add();
    }

    @Test
    public void testBeanDao(){
//        加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
//        获取配置文件的对象（在加载配置文件时候不会创建对象，再获取对象或使用时才会创建对象）
        UserService userService = applicationContext.getBean("userService",UserService.class);
        userService.add();
    }

    @Test
    public void testBean(){
//        加载spring的配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean4.xml");
//        获取配置文件的对象（在加载配置文件的时候不会创建对象，再获取对象或使用时才会创建对象
        Emp emp = applicationContext.getBean("emp",Emp.class);
        emp.test();
    }
    @Test
    public void Bean5(){
//        加载spring配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean5.xml");
//        获取配置文件的对象
        Student student = applicationContext.getBean("student",Student.class);
        student.test();
    }
}
