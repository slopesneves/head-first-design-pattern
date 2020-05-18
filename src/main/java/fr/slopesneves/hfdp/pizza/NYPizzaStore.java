package fr.slopesneves.hfdp.pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new NYStyleCheesePizza();
    }
}
