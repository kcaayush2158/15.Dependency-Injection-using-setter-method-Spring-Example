package com.application.main;

import com.application.model.ActiveMqMessage;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ActiveMqMessage activeMqMessage = context.getBean("message", ActiveMqMessage.class);
        activeMqMessage.sendMessage();
        context.close();
    }
}
