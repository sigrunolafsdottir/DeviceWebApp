package com.nackademin.systemintegration.websocketchatdemo.model;

public class Message {
    
    private String deviceState;

    @Override
    public String toString() {
        return super.toString();
    }

    public String getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }
}