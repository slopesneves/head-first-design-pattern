package fr.slopesneves.hfdp.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("Duck says :");
        duck.quack();
        System.out.println("Turkey says :");
        turkey.gobble();
        System.out.println("Turkey Adapter says :");
        turkeyAdapter.quack();
        System.out.println("Duck Adapter says :");
        duckAdapter.gobble();
    }
}
