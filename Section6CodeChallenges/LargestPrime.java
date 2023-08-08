public class LargestPrime {

    /*
    Write a method named getLargestPrime with one parameter of type int named number. 
    
    If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
    
    
    The method should calculate the largest prime factor of a given number and return it.
    
    
    EXAMPLE INPUT/OUTPUT:
    
    * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
    
    * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
    
    * getLargestPrime (0); should return -1 since 0 does not have any prime numbers
    
    * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
    
    * getLargestPrime (-1); should return -1 since the parameter is negative
    
    
    HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
    
    NOTE: The method getLargestPrime should be defined as public static like we have been doing so far in the course.
    
    NOTE: Do not add a main method to the solution code.
     */

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));  // should return 7 since 7 is the largest prime (3 7 = 21)

        System.out.println(getLargestPrime(217));  // should return 31 since 31 is the largest prime (7 31 = 217)

        System.out.println(getLargestPrime(0));  // should return -1 since 0 does not have any prime numbers

        System.out.println(getLargestPrime(45));  // should return 5 since 5 is the largest prime (3 3 5 = 45)

        System.out.println(getLargestPrime(-1));  // should return -1 since the parameter is negative

    }

    public static int getLargestPrime2(int n) {
        for (int i = n; i >= 2; i--) {
            if (n % i == 0) {
                boolean prime = true;
                for (int j=2; j <= (long) Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        prime = false;
                    }
                }
                if (prime) {
                    return i;
                }
            }
        }
        return -1;
    }

    private static boolean isPrime (int wholeNumber) {
        if (wholeNumber <= 1) {
            return false;
        }
        else if (wholeNumber == 2) {
            return true;
        }
        else {
            for (int divisor = 2; divisor <= (wholeNumber / divisor); divisor++) {
                if (wholeNumber % divisor == 0)
                    return false;
            }
            return true;
        }
    }

    public static int getLargestPrime(int number) {

        int largestPrime = -1;
        for (int divisor = 2; divisor <= (number / divisor); divisor++) {
            if (isPrime(divisor) && divisor > largestPrime) {
                largestPrime = divisor;
            }
        }
        return largestPrime;
    }
}
