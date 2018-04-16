package com.nackademin.systemintegration.websocketchatdemo.model;


public class Device {
    
    boolean state;
    
    public boolean getState(){
        return state;
    }
    
    public void setState(boolean state){
        this.state = state;
    }
    
    public void setState(String state){
        if (state.equals("ON")){
            this.state = true;
        }
        else{
            this.state = false;
        }
    }
    
    public String getStateString(){
        if (state) {
            return "ON";
        }
        return "OFF";
    }
    
    
    public void toggle(){
        if (state) {
            state = false; 
        }
        else{
            state = true;
        }
    }

}
