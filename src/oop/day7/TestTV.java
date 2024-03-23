package oop.day7;

public class TestTV {
    public static void main(String[] args) {

        TV myTv= new TV();
        System.out.println(myTv
                .turnOn()
                .setVolumeLevel(15)
                .setChannel(200)
                .volumeDown()
                .setChannel(20)
                .turnOff()
                .getInfo());


    }
}
