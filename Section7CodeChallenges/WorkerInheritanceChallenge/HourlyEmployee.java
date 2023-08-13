public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, double hourlyPayRate) {
        super(name, birthDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay() {
        return this.hourlyPayRate * 2;
    }

    @Override
    public double collectPay() {
        return this.hourlyPayRate * 37.5 * 52 / 12;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                '}' + super.toString();
    }
}
