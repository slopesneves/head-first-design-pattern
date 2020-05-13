package fr.slopesneves.hfdp.weatherstation;

public class CurrentConditionDisplay implements Display {
    private final WeatherData weather;

    public CurrentConditionDisplay(WeatherData weather) {
        this.weather = weather;
        this.weather.register(this);
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println(
                "Current conditions " + weather.getTemperature() + "F degrees and " +
                        weather.getHumidity() + "% humidity"
        );
    }
}
