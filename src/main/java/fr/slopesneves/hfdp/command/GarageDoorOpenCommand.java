package fr.slopesneves.hfdp.command;

public class GarageDoorOpenCommand implements Command {
    private final GarageDoor door;

    GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }
}
