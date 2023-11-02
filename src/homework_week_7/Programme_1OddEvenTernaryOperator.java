package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Programme_1OddEvenTernaryOperator {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = sc.nextInt();
        isItOddEvenNumber(number);
        //closing the scanner object
        sc.close();
    }
    //Checking the number is even or odd
    public static void isItOddEvenNumber(int number){
        //Ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number ");
    }
}
