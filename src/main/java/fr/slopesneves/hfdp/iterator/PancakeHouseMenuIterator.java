package fr.slopesneves.hfdp.iterator;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {

    private final List<MenuItem> menu;
    private int current = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menu) {
        this.menu = menu;
    }

    @Override
    public MenuItem next() {
        return menu.get(current++);
    }

    @Override
    public boolean hasNext() {
        return menu.size() < current;
    }
}
