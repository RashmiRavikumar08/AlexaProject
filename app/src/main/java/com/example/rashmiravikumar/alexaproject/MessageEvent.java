package com.example.rashmiravikumar.alexaproject;

public class MessageEvent {

    public int event;
    public String message;

    public MessageEvent(int event,String Message) {
        this.event = event;
        this.message = Message;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
