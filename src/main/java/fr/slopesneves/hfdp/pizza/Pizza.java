package fr.slopesneves.hfdp.pizza;

import java.util.List;

public abstract class Pizza {
    private final String name;
    private final Dough dough;
    private final Sauce sauce;
    private final List<Veggies> veggies;

    public String getName() {
        return name;
    }

    protected Pizza(String name, Dough dough, Sauce sauce, List<Veggies> veggies) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.veggies = veggies;
    }

    public abstract void prepare();

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
