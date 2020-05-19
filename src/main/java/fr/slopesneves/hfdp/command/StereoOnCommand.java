package fr.slopesneves.hfdp.command;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCd();
        this.stereo.setVolume(11);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
