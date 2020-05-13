package fr.slopesneves.hfdp.starbuzz;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }

    Size size = Size.TALL;

    String description = "Unknown beverage";

    public String getDescription() {
        return getSize() + " " + description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
