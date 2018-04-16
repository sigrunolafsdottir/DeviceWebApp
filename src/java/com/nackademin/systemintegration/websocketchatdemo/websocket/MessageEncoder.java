package com.nackademin.systemintegration.websocketchatdemo.websocket;


import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

import com.nackademin.systemintegration.websocketchatdemo.model.Message;
import com.google.gson.Gson;

public class MessageEncoder implements Encoder.Text<Message> {
    @Override
    public String encode(Message message) throws EncodeException {
        Gson gson = new Gson();
        String json = gson.toJson(message);
        return json;
    }

    @Override
    public void init(EndpointConfig endpointConfig) {
        // Custom initialization logic
    }

    @Override
    public void destroy() {
        // Close resources
    }
}
