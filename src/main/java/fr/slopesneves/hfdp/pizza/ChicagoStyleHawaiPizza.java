package fr.slopesneves.hfdp.pizza;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChicagoStyleHawaiPizza extends Pizza {
    private static final String name = "Chicago Style Hawai Pizza";
    private static final String dough = "Big Pillowed dough";
    private static final String sauce = "Sweet Spicy Tomato Sauce";
    private static final List<String> toppings = Arrays.asList("Pineapple", "Honey", "Sweet Pepper");

    public ChicagoStyleHawaiPizza() {
        super(name, dough, sauce, toppings);
    }
}
