package fr.slopesneves.hfdp.pizza;

import fr.slopesneves.hfdp.pizza.chicago.ChicagoPizzaStore;
import fr.slopesneves.hfdp.pizza.ny.NYPizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza ethanPizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + ethanPizza.getName());

        Pizza joePizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joe ordered a " + joePizza.getName());
    }
}
