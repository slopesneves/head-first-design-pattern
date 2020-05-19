package fr.slopesneves.hfdp.command;

public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        this.stereo.off();
    }

    @Override
    public void undo() {
        new StereoOnCommand(stereo).execute();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
