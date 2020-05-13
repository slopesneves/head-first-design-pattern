package fr.slopesneves.hfdp.weatherstation;

public interface Publisher {
    void register(Observer observer);
    void remove(Observer observer);
    void publish();
}
