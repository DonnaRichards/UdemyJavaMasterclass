public class Customer {

    private String name;
    private int creditLimit;
    private String emailAddress;

    private final static int DEFAULT_CREDIT_LIMIT = 1000;

    public Customer() {
        this("Default name", "Default email");
    }

    public Customer(String name, String emailAddress) {
        this(name, DEFAULT_CREDIT_LIMIT, emailAddress);
    }

    public Customer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + getName() + '\'' +
                ", creditLimit=" + getCreditLimit() +
                ", emailAddress='" + getEmailAddress() + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
