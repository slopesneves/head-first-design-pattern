package fr.slopesneves.hfdp.starbuzz;

public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
