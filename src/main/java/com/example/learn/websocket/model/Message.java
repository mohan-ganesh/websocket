package com.example.learn.websocket.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Message {
    private String from;
    private String to;
    private String content;
    private Logger logger = LoggerFactory.getLogger(Message.class);

    @Override
    public String toString() {
        logger.debug(super.toString());
        return super.toString();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}