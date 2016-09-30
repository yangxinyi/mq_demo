package com.winxuan.mq_demo;

import java.util.concurrent.TimeUnit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-jms.xml"});
        Producer producer = context.getBean("producer", Producer.class);
        for (int i = 1; i < 10; i++) {
            producer.sendMsg("hello world");
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
