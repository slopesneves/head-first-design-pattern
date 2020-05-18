package fr.slopesneves.hfdp.pizza;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Pizza {
    private final String name;
    private final String dough;
    private final String sauce;
    private final List<String> toppings;

    public String getName() {
        return name;
    }

    protected Pizza(String name, String dough, String sauce, List<String> toppings) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing " + dough + " dough");
        System.out.println("Adding " + sauce + " sauce");
        System.out.println("Adding " + toppings.size() + " topping(s) : " + toppingsSeparateByComma());
    }

    private String toppingsSeparateByComma() {
        return String.join(",", toppings);
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }


}
