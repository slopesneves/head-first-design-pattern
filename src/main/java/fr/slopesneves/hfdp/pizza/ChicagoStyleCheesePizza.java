package fr.slopesneves.hfdp.pizza;

import java.util.Collections;
import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza {
    private static final String name = "Chicago Style Deep Dish Cheese Pizza";
    private static final String dough = "Extra Thick Crust Dough";
    private static final String sauce = "Plum Tomato Sauce";
    private static final List<String> toppings = Collections.singletonList("Shredded Mozzarella Cheese");

    public ChicagoStyleCheesePizza() {
        super(name, dough, sauce, toppings);
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
