package fr.slopesneves.hfdp.command;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
