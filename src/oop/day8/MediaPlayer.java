package oop.day8;

public interface MediaPlayer {
    void playVideo();

    void soundPlayer();

    default void raiseVideoQuality() {
        System.out.println("Raising up Video Quality");
    }
}
