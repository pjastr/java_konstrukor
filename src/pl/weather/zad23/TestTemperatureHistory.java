package pl.weather.zad23;

class TestTemperatureHistory {

    public static void main(String[] args) {
        TemperatureHistory temperatureHistory = new TemperatureHistory();
        temperatureHistory.addTemperature(5);
        temperatureHistory.addTemperature(4);
        temperatureHistory.addTemperature(3);
        temperatureHistory.addTemperature(2);
        temperatureHistory.addTemperature(1);
        System.out.println(temperatureHistory.averageTemperature());
        temperatureHistory.removeTemperature(0);
        System.out.println(temperatureHistory.averageTemperature());
    }
}
