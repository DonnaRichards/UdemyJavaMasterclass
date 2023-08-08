/*
Write a method called printNumberInWord. The method has one parameter number which is the whole number.
The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number
is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else
statement or switch statement whatever is easier for you.

NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.

NOTE: Do not add main method to solution code.
 */

import java.util.HashMap;

public class NumberInWord_Switch {

    public static void main(String[] args) {
        printNumberInWord_hashmap(0);
        printNumberInWord_hashmap(1);
        printNumberInWord_hashmap(2);
        printNumberInWord_hashmap(3);
        printNumberInWord_hashmap(4);
        printNumberInWord_hashmap(5);
        printNumberInWord_hashmap(6);
        printNumberInWord_hashmap(7);
        printNumberInWord_hashmap(8);
        printNumberInWord_hashmap(9);
        printNumberInWord_hashmap(10);
        printNumberInWord_hashmap(-1);
    }

    public static void printNumberInWord_switch(int number) {
        switch (number) {
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        };
    }
    
    public static void printNumberInWord_hashmap(int number) {
        HashMap<Integer, String> numbers = new HashMap<Integer, String>();
        numbers.put(0, "ZERO");
        numbers.put(1, "ONR");
        numbers.put(2, "TWO");
        numbers.put(3, "THREE");
        numbers.put(4, "FOUR");
        numbers.put(5, "FIVE");
        numbers.put(6, "SIX");
        numbers.put(7, "SEVEN");
        numbers.put(8, "EIGHT");
        numbers.put(9, "NINE");
        if (numbers.get(number) == null) {
            System.out.println("OTHER");
        } else {
            System.out.println(numbers.get(number));
        }
    }
}
