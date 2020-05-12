package fr.slopesneves.hfdp.duck;

import fr.slopesneves.hfdp.duck.behavior.fly.FlyBehavior;
import fr.slopesneves.hfdp.duck.behavior.quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck () {}

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

    public void setFlyBehavior(FlyBehavior behavior) {
        this.flyBehavior = behavior;
    }

    public void setQuackBehavior(QuackBehavior behavior) {
        this.quackBehavior = behavior;
    }
}