package com.iax.bridge;

public class SamsungTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung: Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: Turn Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung: Set Channel to" + number);
    }
}
