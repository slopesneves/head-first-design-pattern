package fr.slopesneves.hfdp.command;

public class CeilingFanLowCommand implements Command {
    private final CeilingFan fan;
    private int previousSpeed = 0;

    public CeilingFanLowCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        previousSpeed = fan.getSpeed();
        fan.low();
    }

    @Override
    public void undo() {
        switch (previousSpeed) {
            case CeilingFan.HIGH: fan.high(); break;
            case CeilingFan.MEDIUM: fan.medium(); break;
            case CeilingFan.LOW: fan.low(); break;
            default: fan.off();
        }
    }
}
