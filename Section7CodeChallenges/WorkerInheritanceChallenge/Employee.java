import java.time.LocalDate;

public class Employee extends Worker {

    private long employeeId;
    private LocalDate hireDate;
    private static int employeeIdCounter = 1;

    public Employee(String name, String birthDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeIdCounter++;;
        this.hireDate = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate=" + hireDate +
                '}' + super.toString();
    }
}
