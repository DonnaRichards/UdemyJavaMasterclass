public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phone;

    public BankAccount(int accountNumber, double accountBalance, String customerName, String email, String phone) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public void depositFunds(double deposit) {
        if (deposit > 0) {
            this.accountBalance += deposit;
        }
        else {
            System.out.println("Deposit amount must be more than zero");
        }
        System.out.println("Account balance: $" + getAccountBalance());
    }

    public void withdrawFunds(double withdrawal) {
        if (withdrawal > 0) {
            if (this.accountBalance - withdrawal >= 0) {
                this.accountBalance += withdrawal;
            }
            else {
                System.out.println("Insufficient funds");
            }
        }
        else {
            System.out.println("Deposit amount must be more than zero");
        }
        System.out.println("Account balance: $" + getAccountBalance());
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
