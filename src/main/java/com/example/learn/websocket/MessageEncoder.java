package com.example.learn.websocket;



import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.example.learn.websocket.model.Message;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageEncoder implements Encoder.Text<Message> {

    private Logger logger = LoggerFactory.getLogger(MessageEncoder.class);
    private static Gson gson = new Gson();

    @Override
    public String encode(Message message) throws EncodeException {
        String json = gson.toJson(message);
        return json;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
        logger.debug("init-MessageEncoder");
    }

    @Override
    public void destroy() {
        // Close resources
        logger.debug("destroy-MessageEncoder");
    }
}