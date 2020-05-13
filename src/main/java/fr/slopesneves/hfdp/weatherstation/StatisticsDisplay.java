package fr.slopesneves.hfdp.weatherstation;

public class StatisticsDisplay implements Display {
    private final WeatherData weather;
    private final Temperature temperature = new Temperature();

    public StatisticsDisplay(WeatherData weather) {
        this.weather = weather;
        weather.register(this);
    }

    @Override
    public void display() {
        System.out.println(
                "AVG/Max/Min temperature : " +
                        temperature.getAverage() + " / " + temperature.getMax() + " / " + temperature.getMin()
        );
    }

    @Override
    public void update() {
        this.temperature.update(weather.getTemperature());
        display();
    }

    private static final class Temperature {
        private float min = 200;

        private float max = 0;
        private float sum = 0;
        private float count = 0;
        void update(float temperature) {
            this.min = Math.min(this.min, temperature);
            this.max = Math.max(this.max, temperature);
            this.count++;
            this.sum += temperature;
        }

        public float getMin() {
            return min;
        }

        public float getMax() {
            return max;
        }

        public float getAverage() {
            return this.sum / this.count;
        }
    }
}
