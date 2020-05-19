package fr.slopesneves.hfdp.pizza.ny;

import fr.slopesneves.hfdp.pizza.CheesePizza;
import fr.slopesneves.hfdp.pizza.Pizza;
import fr.slopesneves.hfdp.pizza.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new CheesePizza("New York Style Cheese Pizza", new NYPizzaIngredientFactory());
    }
}
