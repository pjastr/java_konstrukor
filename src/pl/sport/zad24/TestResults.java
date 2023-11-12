package pl.sport.zad24;

class TestResults {

    public static void main(String[] args) {
        Results results = new Results("Jan", "Kowalski", 5);
        results.addResult(0, 5);
        results.addResult(1, 4);
        results.addResult(2, 3);
        results.addResult(3, 2);
        results.addResult(4, 1);
        System.out.println(results.averageResult());
        results.addResult(0, 0);
        System.out.println(results.averageResult());
        results.setFirstName("Adam");
        results.setLastName("Nowak");
        System.out.println(results.getFirstName());
        System.out.println(results.getLastName());
    }
}
