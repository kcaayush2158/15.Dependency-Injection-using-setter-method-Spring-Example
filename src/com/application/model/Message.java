package com.application.model;

public class Message implements ActiveMqMessage {
    @Override
    public void sendMessage(){
        System.out.println("Message from active mq message");
    }
}
