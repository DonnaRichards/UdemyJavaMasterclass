public class PrimeNumberChallenge {

    public static void main(String[] args) {
        int primeCounter = 0;
        for (int i = 500; primeCounter < 3 && i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is a prime number");
                primeCounter++;
            }
        }
        System.out.println(primeCounter + " prime numbers found");
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
}
