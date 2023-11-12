package pl.sport.zad24;

//Stwórz klasę Results (wyniki testu) z prywatnymi polami: firstName, lastName oraz results (jako tablica typu int).
// Dodaj konstruktor, który przyjmuje firstName, lastName oraz rozmiar tablicy jako argumenty. Dodaj metody dostępowe
// (gettery i settery) oraz metodę addResult(int index, int result), która dodaje wynik testu na podanym indeksie.
// Dodaj również metodę averageResult() do obliczania i zwracania średniego wyniku.
class Results {

        private String firstName;
        private String lastName;
        private int[] results;

        public Results(String firstName, String lastName, int size) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.results = new int[size];
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return this.firstName;

        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return this.lastName;

        }

        public void setResults(int[] results) {
            this.results = new int[results.length];
            for (int i = 0; i < results.length; i++) {
                this.results[i] = results[i];
            }
        }

        public int[] getResults() {
            return this.results.clone();
        }

        public void addResult(int index, int result) {
            if (index >= 0 && index < results.length) {
                results[index] = result;
            }
        }

        public double averageResult() {
            if (results.length == 0) {
                return 0;
            }
            double sum = 0;
            for (int result : results) {
                sum += result;
            }
            return sum / results.length;
        }
}
