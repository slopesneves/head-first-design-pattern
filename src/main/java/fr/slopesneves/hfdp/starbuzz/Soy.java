package fr.slopesneves.hfdp.starbuzz;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
