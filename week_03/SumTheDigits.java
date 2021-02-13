package week_03;
//Java homework#1

import java.util.Scanner;

public class SumTheDigits {

    public static void main(String[] args) {
        System.out.println("Enter a value that is between 0 and 1000...");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int ones = number % 10; //932 % 10 = 2

        int tens = (number % 100) / 10; //932 % 100 = 32, 32 / 10 = 3

        int hundreds = number / 100; //932 / 100 = 9

        System.out.println("The sum of digits that you entered is "
                + hundreds + " + " + tens + " + " + ones + " = "
                + (hundreds + tens + ones));
    }
}
