package homework_week_7;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme_10DoOperationWithSymbol {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x = sc.nextInt();
        System.out.println("Enter the second number : ");
        int y = sc.nextInt();
        System.out.println("Please select the calculation symbol +, -, *, / : ");
        char symbol = sc.next().charAt(0);
        doOpeartionBySelectingSymbol(x,y, symbol);
        //Closing the scanner object
        sc.close();
    }
    //Calculating operation based on symbol
    public static void doOpeartionBySelectingSymbol(int x, int y, char symbol){
        if (symbol == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please enter correct symbol +,-,*,/");
        }
    }

}
