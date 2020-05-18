package fr.slopesneves.hfdp.pizza;

public class CheesePizza extends Pizza {
    public CheesePizza(String name, PizzaIngredientFactory factory) {
        super(name, factory.createDough(), factory.createSauce(), factory.createVeggies());
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
    }
}
