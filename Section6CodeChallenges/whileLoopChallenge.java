public class whileLoopChallenge {

    /*
    Step 1
    - create method isEvenNumber that takes an int param and return true if even, false if not
    - while loop to test a range of numbers from 5 up to including 20
    print out only even numbers, determined by call to isEvenNumber
    Step 2
    - break out of while loop after 5 even numbers found - intention of exercise for you to add an if
    statement in the loop with a break, but I think it is nicer to include the condition in the while
    - display total number of odd and even numbers found
     */

    public static void main(String[] args) {
        int testNumber = 5;
        int totalOdd = 0, totalEven = 0;
        while (totalEven < 5 && testNumber <= 20) {
            if (isEvenNumber(testNumber)) {
                System.out.println(testNumber);
                totalEven++;
            } else {
                totalOdd++;
            }
            testNumber++;
        }
        System.out.println("Total odd numbers = " + totalOdd);
        System.out.println("Total even numbers = " + totalEven);
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
