package fr.slopesneves.hfdp.pizza.ny;

import fr.slopesneves.hfdp.pizza.Veggies;

public class Garlic implements Veggies {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
