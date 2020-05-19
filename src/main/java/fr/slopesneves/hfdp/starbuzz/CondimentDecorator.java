package fr.slopesneves.hfdp.starbuzz;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    @Override
    public void setSize(Size size) {
        super.setSize(size);
        beverage.setSize(size);
    }

    @Override
    public abstract String getDescription();
}
