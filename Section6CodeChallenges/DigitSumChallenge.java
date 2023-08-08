public class DigitSumChallenge {

    /*
    write a method called sumDigits single param int, return int
    only accept a +ve number, return -1 if -ve number passed
    parse each digit and add them up
    single digit number just return number itself
    e.g. sumDigits(125) // 1 + 2 + 5 = 8
    sumDigits(1000) // 1 + 0 + 0 + 0 = 1
     */

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(-9));
        System.out.println(sumDigits(0));
        System.out.println(sumDigits(1));
    }

    private static int sumDigits(int number) {
        int sum = 0;
        if (number < 0) return -1;
        int workingNumber = number;
        while (workingNumber >= 10) {
            sum += workingNumber % 10;
            workingNumber /= 10;
        }
        sum += workingNumber;
        return sum;
    }
}
