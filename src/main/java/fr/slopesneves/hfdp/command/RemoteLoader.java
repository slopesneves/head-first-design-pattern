package fr.slopesneves.hfdp.command;

import static fr.slopesneves.hfdp.command.RemoteControl.RemoteControlButtonIndex.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        remote.setCommand(ONE, lightOnCommand, lightOffCommand);
        remote.setCommand(TWO, stereoOnCommand, stereoOffCommand);

        remote.onButtonPushed(ONE);
        remote.offButtonPushed(ONE);
        remote.onButtonPushed(TWO);
        remote.offButtonPushed(TWO);
        remote.undo();

        CeilingFan fan = new CeilingFan();
        CeilingFanOffCommand fanOffCommand = new CeilingFanOffCommand(fan);
        remote.setCommand(THREE, new CeilingFanHighCommand(fan), fanOffCommand);
        remote.setCommand(FOUR, new CeilingFanMediumCommand(fan), fanOffCommand);
        remote.setCommand(FIVE, new CeilingFanLowCommand(fan), fanOffCommand);

        remote.onButtonPushed(THREE);
        remote.onButtonPushed(FOUR);
        remote.undo();
        remote.onButtonPushed(FIVE);
        remote.undo();
        remote.onButtonPushed(FIVE);
        remote.onButtonPushed(THREE);
        remote.undo();

        System.out.println(remote);
    }
}
