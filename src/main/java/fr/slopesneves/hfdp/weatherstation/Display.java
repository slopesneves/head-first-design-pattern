package fr.slopesneves.hfdp.weatherstation;

import java.util.Observable;
import java.util.Observer;

public interface Display extends Observer {
    @Override
    default void update(Observable o, Object arg) {
        update();
    }
    void update();
    void display();
}
