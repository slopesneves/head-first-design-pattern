package fr.slopesneves.hfdp.starbuzz;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy Milk";
    }

    @Override
    public double cost() {
        final double cost;
        if (Size.TALL.equals(getSize())) {
            cost = 0.10;
        }else if (Size.GRANDE.equals(getSize())) {
            cost = 0.15;
        }else {
            cost = 0.20;
        }
        return beverage.cost() + cost;
    }
}
