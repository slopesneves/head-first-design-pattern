package fr.slopesneves.hfdp.command;

public class CeilingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;


    private int speed = OFF;
    public void high() {
        speed = HIGH;
        System.out.println("maximum power fan ventilation");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("fan fresh up the place");
    }

    public void low() {
        speed = LOW;
        System.out.println("minimum fan power");
    }

    public void off() {
        speed = OFF;
        System.out.println("fan turned off");
    }

    public int getSpeed() {
        return speed;
    }
}
