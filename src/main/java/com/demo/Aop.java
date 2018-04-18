package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.animal.*;

public class Aop {
    public static void main(String args[]){
        BeanFactory factory = new ClassPathXmlApplicationContext("classpath*:aop.xml");
        Cat c1 =(Cat)factory.getBean("cat1");
        c1.mark();
    }
}