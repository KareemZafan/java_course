package oop.day8;

public class TestInterfaces {
    public static void main(String[] args) {
        SmartTV lgTv = new SmartTV();
        lgTv.connectToInternet();
        lgTv.soundPlayer();
        lgTv.playVideo();
        lgTv.raiseVideoQuality();

        SamsungSmartTV smUR7 = new SamsungSmartTV();
        smUR7.printInfo();
    }
}
