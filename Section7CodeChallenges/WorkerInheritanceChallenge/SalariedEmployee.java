public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, double annualSalary) {
        super(name, birthDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire() {
        isRetired = true;
    }

    @Override
    public double collectPay() {
        return this.annualSalary / 12;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}' + super.toString();
    }
}
