package oop.day8;

public class SmartTV implements MediaPlayer, InternetConnectable {

    @Override
    public void playVideo() {
        System.out.println("Playing Video@@");
    }
    @Override
    public void soundPlayer() {
        System.out.println("Playing sound ###");
    }

    @Override
    public void connectToInternet() {
        System.out.println("Connecting to internet using WIFI,Ethernet and USB");
    }

}
