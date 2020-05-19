package fr.slopesneves.hfdp.command;

public class Stereo {
    public void on() {
        System.out.println("stereo is on");
    }

    public void setCd() {
        System.out.println("stereo cd mode enabled");
    }

    public void setVolume(int level) {
        System.out.println("stereo volume set to " + level);
    }

    public void off() {
        System.out.println("stereo is off");
    }
}
