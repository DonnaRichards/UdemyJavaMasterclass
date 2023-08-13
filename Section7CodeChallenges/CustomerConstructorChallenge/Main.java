public class Main {

    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer("Super Model", "supermodel@cat.com");
        Customer c3 = new Customer("Bumblebee", 5000, "bumble@cat.com");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
