package fr.slopesneves.hfdp.duck;

import fr.slopesneves.hfdp.duck.behavior.fly.FlyNoWay;
import fr.slopesneves.hfdp.duck.behavior.quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
