/*
create a for loop containing numbers 1 to 1000 inclusive
sum all numbers that can be divided by 3 and 5
My implementation is single check if numbers can be divided by 15 as = 5 x 3
print out the numbers that meet this condition
exit loop once 5 of these numbers found
after end of loop print sum of these numbers
 */

public class Sum3and5Challenge {
    public static void main(String[] args) {
        int counter = 0;
        final int DIVISOR = 15;
        int sum = 0;
        for (int i = 1; counter < 5 && i <= 1000; i++) {
            if (i % DIVISOR == 0) {
                counter++;
                sum += i;
                System.out.println(i + " is divisible by both 3 and 5");
            }
        }
        System.out.println("Sum of all numbers divisible by 3 and 5 is " + sum);
    }
}
