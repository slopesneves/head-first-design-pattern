package fr.slopesneves.hfdp.pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return new ChicagoStyleCheesePizza();
    }
}
