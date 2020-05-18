package fr.slopesneves.hfdp.pizza;

import java.util.Arrays;
import java.util.List;

public class NYStyleHawaiPizza extends Pizza {
    private static final String name = "New York Style Hawai Pizza";
    private static final String dough = "Coconut Calzone dough";
    private static final String sauce = "Fresh Cream";
    private static final List<String> toppings = Arrays.asList("Piece of Coconut", "Honey");

    public NYStyleHawaiPizza() {
        super(name, dough, sauce, toppings);
    }
}
