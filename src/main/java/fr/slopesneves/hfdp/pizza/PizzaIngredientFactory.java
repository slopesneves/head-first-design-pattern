package fr.slopesneves.hfdp.pizza;

import java.util.List;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    List<Veggies> createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
