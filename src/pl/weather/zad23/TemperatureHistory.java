package pl.weather.zad23;

import java.util.ArrayList;

class TemperatureHistory {

        private ArrayList<Double> temperatures;

        {
            temperatures = new ArrayList<>();
        }

        public TemperatureHistory() {
        }

        public void setTemperatures(ArrayList<Double> temperatures) {
            this.temperatures = new ArrayList<>(temperatures);
        }

        public ArrayList<Double> getTemperatures() {
            return new ArrayList<>(temperatures);
        }

        public void addTemperature(double temperature) {
            temperatures.add(temperature);
        }

        public void removeTemperature(int index) {
            if (index >= 0 && index < temperatures.size())
                temperatures.remove(index);
        }

        public double averageTemperature() {
            if (temperatures.isEmpty())
                return 0;
            double sum = 0;
            for (double temperature : temperatures) {
                sum += temperature;
            }
            return sum / temperatures.size();
        }
}
