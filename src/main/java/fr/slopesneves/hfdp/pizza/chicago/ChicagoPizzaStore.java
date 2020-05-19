package fr.slopesneves.hfdp.pizza.chicago;

import fr.slopesneves.hfdp.pizza.CheesePizza;
import fr.slopesneves.hfdp.pizza.Pizza;
import fr.slopesneves.hfdp.pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new CheesePizza("Chicago Style Pizza", new ChicagoPizzaIngredientFactory());
    }
}
