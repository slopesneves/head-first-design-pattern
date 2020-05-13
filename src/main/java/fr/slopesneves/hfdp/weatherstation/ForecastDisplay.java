package fr.slopesneves.hfdp.weatherstation;

public class ForecastDisplay implements Display {
    private final WeatherData weather;
    private final Pressure pressure = new Pressure();

    public ForecastDisplay(WeatherData weather) {
        this.weather = weather;
        this.weather.register(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (pressure.current > pressure.last) {
            System.out.println("Improving weather on the way!");
        } else if (pressure.current == pressure.last) {
            System.out.println("More of the same");
        } else if (pressure.current < pressure.last) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update() {
        pressure.last = pressure.current;
        pressure.current = weather.getPressure();
        display();
    }

    private static class Pressure {
        private float current;
        private float last;
    }
}
