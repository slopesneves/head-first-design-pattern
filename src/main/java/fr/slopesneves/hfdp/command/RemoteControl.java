package fr.slopesneves.hfdp.command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoteControl {
    private static final int NUMBER_OF_BUTTONS = RemoteControlButtonIndex.values().length;
    private final List<Command> onButtons = new ArrayList<>(NUMBER_OF_BUTTONS);
    private final List<Command> offButtons = new ArrayList<>(NUMBER_OF_BUTTONS);
    private Command lastCommand = new NoCommand();

    public RemoteControl() {
        initializeEachButtonsWithoutCommand();
    }

    private void initializeEachButtonsWithoutCommand() {
        Arrays.stream(RemoteControlButtonIndex.values()).forEach(index -> onButtons.add(index.value - 1, new NoCommand()));
        Arrays.stream(RemoteControlButtonIndex.values()).forEach(index -> offButtons.add(index.value - 1, new NoCommand()));
    }

    public void setCommand(RemoteControlButtonIndex index, Command onCommand, Command offCommand) {
        onButtons.set(index.value - 1, onCommand);
        offButtons.set(index.value - 1, offCommand);
    }

    public void onButtonPushed(RemoteControlButtonIndex index) {
        Command command = this.onButtons.get(index.value - 1);
        command.execute();
        this.lastCommand = command;
    }

    public void offButtonPushed(RemoteControlButtonIndex index) {
        Command command = this.offButtons.get(index.value - 1);
        command.execute();
        this.lastCommand = command;
    }

    public void undo() {
        lastCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("======== REMOTE CONTROL ========");
        sb.append(System.lineSeparator());
        Arrays.stream(RemoteControlButtonIndex.values()).forEach(index -> {
            int indexValue = index.value - 1;
            sb.append(indexValue).append(". on : ").append(onButtons.get(indexValue)).append(" ; ");
            sb.append("off : ").append(offButtons.get(indexValue));
            sb.append(System.lineSeparator());
        });
        sb.append("=============================");
        return sb.toString();
    }

    public enum RemoteControlButtonIndex {
        ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7);
        private final short value;


        RemoteControlButtonIndex(Number value) {
            this.value = value.shortValue();
        }
    }
}
