public class Main {

    public static void main(String[] args) {
        BankAccount zigAccount = new BankAccount(1, 10, "Ziggy", "email", "phone");
        zigAccount.depositFunds(-1);
        zigAccount.withdrawFunds(20);
        zigAccount.withdrawFunds(5);
        zigAccount.depositFunds(0);
        zigAccount.depositFunds(-1);
        zigAccount.depositFunds(20);
    }
}
