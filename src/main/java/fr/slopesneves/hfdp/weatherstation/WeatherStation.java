package fr.slopesneves.hfdp.weatherstation;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weather = new WeatherData();

        new CurrentConditionDisplay(weather);
        new StatisticsDisplay(weather);
        new ForecastDisplay(weather);

        weather.setMeasurements(80, 65, 30.4f);
        weather.setMeasurements(82, 70, 29.2f);
        weather.setMeasurements(78, 90, 29.2f);
    }
}
