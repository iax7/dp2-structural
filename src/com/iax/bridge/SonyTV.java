package com.iax.bridge;

public class SonyTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Sony: Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turn Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony: Set Channel to" + number);
    }
}
