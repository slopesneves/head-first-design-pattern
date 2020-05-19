package fr.slopesneves.hfdp.command;

import java.util.Arrays;

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
        CeilingFanHighCommand fanHighCommand = new CeilingFanHighCommand(fan);
        remote.setCommand(THREE, fanHighCommand, fanOffCommand);
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


        System.out.println("========= READY TO PARTY MODE ? ============");
        MacroCommand partyOnCommand = new MacroCommand(Arrays.asList(lightOnCommand, stereoOnCommand, fanHighCommand));
        MacroCommand partyOffCommand = new MacroCommand(Arrays.asList(lightOffCommand, stereoOffCommand, fanOffCommand));
        remote.setCommand(SIX, partyOnCommand, partyOffCommand);
        remote.onButtonPushed(SIX);
        remote.undo();
        remote.offButtonPushed(SIX);

        System.out.println(remote);
    }
}
