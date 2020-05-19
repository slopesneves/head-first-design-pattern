package fr.slopesneves.hfdp.command;

import java.util.Arrays;

import static fr.slopesneves.hfdp.command.RemoteControl.RemoteControlButtonIndex.*;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();

        Stereo stereo = new Stereo();
        remote.setCommand(ONE, light::on, light::off);
        remote.setCommand(TWO, stereo::on, stereo::off);

        remote.onButtonPushed(ONE);
        remote.offButtonPushed(ONE);
        remote.onButtonPushed(TWO);
        remote.offButtonPushed(TWO);

        CeilingFan fan = new CeilingFan();
        remote.setCommand(THREE, fan::high, fan::off);
        remote.setCommand(FOUR, fan::medium, fan::off);
        remote.setCommand(FIVE, fan::low, fan::off);

        remote.onButtonPushed(THREE);
        remote.onButtonPushed(FOUR);
        remote.onButtonPushed(FIVE);
        remote.onButtonPushed(THREE);


        System.out.println("========= READY TO PARTY MODE ? ============");
        Command partyOnCommand = () -> {light.on(); stereo.on(); fan.high();};
        Command partyOffCommand = () -> {light.off(); stereo.off(); fan.off();};
        remote.setCommand(SIX, partyOnCommand, partyOffCommand);
        remote.onButtonPushed(SIX);
        remote.offButtonPushed(SIX);

        System.out.println(remote);
    }
}
