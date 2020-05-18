package fr.slopesneves.hfdp.pizza;

import java.util.Arrays;
import java.util.List;

public class NYStyleSweetyPizza extends Pizza {
    private static final String name = "New York Style Crumbled Pizza";
    private static final String dough = "Grilled pastry";
    private static final String sauce = "Applesauce";
    private static final List<String> toppings = Arrays.asList("Apple slice", "Sweet whip cream", "Caramel");

    public NYStyleSweetyPizza() {
        super(name, dough, sauce, toppings);
    }
}
