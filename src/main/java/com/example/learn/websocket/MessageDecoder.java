package com.example.learn.websocket;



import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;

import com.example.learn.websocket.model.Message;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageDecoder implements Decoder.Text<Message> {

    private Logger logger = LoggerFactory.getLogger(MessageDecoder.class);

    private static Gson gson = new Gson();

    @Override
    public Message decode(String s) throws DecodeException {
        Message message = gson.fromJson(s, Message.class);
        return message;
    }

    @Override
    public boolean willDecode(String s) {
        return (s != null);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
        logger.debug("init-MessageDecoder");
    }

    @Override
    public void destroy() {
        // Close resources
        logger.debug("destroy-MessageDecoder");
    }
}
