package fr.slopesneves.hfdp.weatherstation;

import java.util.LinkedHashSet;
import java.util.Set;

public class WeatherData implements Publisher {
    private final Set<Observer> observers = new LinkedHashSet<>();
    private float temperature;
    private float humidity;
    private float pressure;
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void publish() {
        observers.forEach(Observer::update);
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
