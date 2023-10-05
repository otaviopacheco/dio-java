package edu.otavio.methods;

public class SmartTv {
    int channel = 1;
    int volume = 0;
    boolean enabled = false;
    public void turnOn() {
        enabled = true;
    }
    public void turnOff() {
        enabled = false;
    }
    public void volumeUp() {
        volume++;
    }
    public void  volumeDown() {
        volume--;
    }
    public void channelUp() {
        channel++;
    }
    public void channelDown() {
        channel--;
    }
    public void newChannel(int newChannel) {
        channel = newChannel;
    }
}


