import java.util.Scanner;

public class MinAndMaxChallenge {

    /*
    use endless loop
    prompt user to enter any number, or a character to quit
    validate if data entered is numeric
    if not, quit loop
    keep track of min and max value of numbers entered
    at end display max/min numbers if user entered any valid numbers
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double minValue = Double.POSITIVE_INFINITY;
        double maxValue = Double.NEGATIVE_INFINITY;
        boolean validNumberEntered = false;
        while (true) {
            System.out.println("Enter a number, or alphabetic character to quit");
            try {
                double number = Double.parseDouble(scanner.nextLine());
                validNumberEntered = true;
                minValue = number < minValue ? number : minValue;
                maxValue = number > maxValue ? number : maxValue;
            }
            catch (NumberFormatException e) {
                // exit while loop
                break;
            }
        }
        if (validNumberEntered) {
            System.out.printf("Minimum value entered: %f\n", minValue);
            System.out.printf("Maximum value entered: %f\n", maxValue);
        }
        else {
            System.out.println("No valid numbers were entered");
        }
    }
}
