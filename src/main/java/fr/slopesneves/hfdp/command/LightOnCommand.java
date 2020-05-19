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
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
