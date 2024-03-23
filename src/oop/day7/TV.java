package oop.day7;

public class TV {
    private boolean on;
    private int channel;
    private int volumeLevel;

    public TV() {
    }

    public int getChannel() {
        return channel;
    }

    public TV setChannel(int channel) {
        this.channel = channel;
        return this;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public TV setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
        return this;
    }

    public TV turnOn() {
        this.on = true;
        return this;
    }

    public TV turnOff() {
        this.on = false;
        return this;
    }

    public boolean isOn() {
        return this.on;
    }

    public TV channelUp() {
        ++this.channel;
        return this;
    }

    public TV channelDown() {
        --this.channel;
        return this;
    }

    public TV volumeUp() {
        ++this.volumeLevel;
        return this;
    }

    public TV volumeDown() {
        --this.volumeLevel;
        return this;
    }

    public String getInfo(){

        return String.format("Volume Level: %d \t channel: %d",getVolumeLevel(),getChannel());
    }


}
