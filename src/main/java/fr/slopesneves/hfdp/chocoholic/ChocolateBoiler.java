package fr.slopesneves.hfdp.chocoholic;

public class ChocolateBoiler {
    private static ChocolateBoiler instance = null;
    private boolean empty = true;
    private boolean boiled = false;
    private ChocolateBoiler() {}

    public static ChocolateBoiler getInstance() {
        if (instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }
}
