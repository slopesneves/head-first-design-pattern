package fr.slopesneves.hfdp.chocoholic;

public class ChocolateBoiler {
    public final static ChocolateBoiler instance = new ChocolateBoiler();
    private boolean empty = true;
    private boolean boiled = false;
    private ChocolateBoiler() {}
}
