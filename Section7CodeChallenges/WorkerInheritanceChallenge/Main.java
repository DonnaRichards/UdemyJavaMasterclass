public class Main {

    public static void main(String[] args) {

        SalariedEmployee donna = new SalariedEmployee("Donna", "1968-11-12", 120000);
        donna.retire();
        workerChecks(donna);
        HourlyEmployee ziggy = new HourlyEmployee("The Zig", "2016-12-01", 50);
        ziggy.getDoublePay();
        workerChecks(ziggy);
    }

    private static void workerChecks(Worker worker) {
        System.out.println("Collect pay: " + worker.collectPay());
        System.out.println("Get age: " + worker.getAge());
        System.out.println(worker);
    }


}
