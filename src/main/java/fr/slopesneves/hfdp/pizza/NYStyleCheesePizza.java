package fr.slopesneves.hfdp.pizza;

import java.util.Collections;
import java.util.List;

public class NYStyleCheesePizza extends Pizza {
    private static final String name = "NY Style Sauce and Cheese Pizza";
    private static final String dough = "Thin Crust Dough";
    private static final String sauce = "Marinara Sauce";
    private static final List<String> toppings = Collections.singletonList("Grated Reggiano Cheese");

    public NYStyleCheesePizza() {
        super(name, dough, sauce, toppings);
    }
}
