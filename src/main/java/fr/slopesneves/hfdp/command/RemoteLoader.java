package fr.slopesneves.hfdp.command;

import static fr.slopesneves.hfdp.command.RemoteControl.RemoteControlButtonIndex.ONE;
import static fr.slopesneves.hfdp.command.RemoteControl.RemoteControlButtonIndex.TWO;

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
        System.out.println(remote);

        remote.onButtonPushed(ONE);
        remote.offButtonPushed(ONE);
        remote.onButtonPushed(TWO);
        remote.offButtonPushed(TWO);
    }
}
