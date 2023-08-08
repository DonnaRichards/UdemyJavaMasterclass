import java.util.Scanner;

public class ReadingUserInput {

    /*
    read 5 volid numbers from console entered by user and print sum of those numbers

    check numbers are valid integers.  If not print "Invalid number" to console, but keep
    looping to get 5 valid numbers

    prompt user with message "Enter number #x: " where x = number count


     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 1;
        final int REQUIREDCOUNT = 5;
        while (count <= REQUIREDCOUNT) {
            try {
                System.out.printf("Enter number #%d: ", count);
                double number = Double.parseDouble(scanner.nextLine());
                sum += number;
                count++;
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        }
        System.out.printf("Sum of all numbers = %f\n", sum);
    }
}
