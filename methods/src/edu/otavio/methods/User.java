package edu.otavio.methods;
public class User {
    public static void main(String[] args) {
     SmartTv smartTv  = new SmartTv();   
    smartTv.turnOn();
    System.out.println("TV ligada? " + smartTv.enabled);
    smartTv.volumeUp();
    System.out.println("Volume atual: " +  smartTv.volume);
    smartTv.newChannel(14);
    System.out.println("Canal atual? "+  smartTv.channel);

    }
}
