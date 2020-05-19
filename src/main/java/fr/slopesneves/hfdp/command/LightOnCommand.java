package fr.slopesneves.hfdp.command;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
