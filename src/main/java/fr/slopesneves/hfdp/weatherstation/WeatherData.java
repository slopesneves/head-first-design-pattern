package fr.slopesneves.hfdp.weatherstation;

import java.util.LinkedHashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

public class WeatherData extends Observable {
    private final Set<Observer> observers = new LinkedHashSet<>();
    private float temperature;
    private float humidity;
    private float pressure;

    public void register(Observer observer) {
        this.addObserver(observer);
    }

    public void remove(Observer observer) {
        this.deleteObserver(observer);
    }

    public void publish() {
        this.setChanged();
        this.notifyObservers();
    }

    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.publish();
    }
}
