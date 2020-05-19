package fr.slopesneves.hfdp.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("any command configured");
    }

    @Override
    public void undo() {
        execute();
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
