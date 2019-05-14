package com.application.model;

public class Commmunication {

    private Message message;

    public void setMessage(Message message) {
        this.message = message;
    }

    public void communicate(){
        message.sendMessage();
    }
}
