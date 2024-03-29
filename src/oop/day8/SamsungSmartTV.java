package oop.day8;

public class SamsungSmartTV extends  SmartTV{

    public void printInfo(){
        this.connectToInternet();
        this.raiseVideoQuality();
        this.soundPlayer();
        super.playVideo();
    }

    @Override
    public void playVideo() {
        System.out.println("This implementation designed for Samsung");
    }
}
