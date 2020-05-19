package fr.slopesneves.hfdp.pizza.ny;

import fr.slopesneves.hfdp.pizza.*;

import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Emmental();
    }

    @Override
    public List<Veggies> createVeggies() {
        return Arrays.asList(new Onion(), new Garlic(), new RedPepper(), new Mushroom());
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
