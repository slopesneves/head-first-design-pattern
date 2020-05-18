package fr.slopesneves.hfdp.pizza.chicago;

import fr.slopesneves.hfdp.pizza.Veggies;

public class Spinach implements Veggies {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
