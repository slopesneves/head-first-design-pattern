package fr.slopesneves.hfdp.pizza;

import java.util.Arrays;
import java.util.List;

public class ChicagoStyleSweetyPizza extends Pizza {
    private static final String name = "Chicago Style Banana Pizza";
    private static final String dough = "Crusty fine";
    private static final String sauce = "Nutella";
    private static final List<String> toppings = Arrays.asList("Banana", "Sweet whip cream");

    public ChicagoStyleSweetyPizza() {
        super(name, dough, sauce, toppings);
    }
}
