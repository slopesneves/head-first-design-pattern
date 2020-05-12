package fr.slopesneves.hfdp.duck;

import fr.slopesneves.hfdp.duck.behavior.fly.FlyWithWings;
import fr.slopesneves.hfdp.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
