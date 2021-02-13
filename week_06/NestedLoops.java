package week_06;
//Java homework#3

import java.util.Scanner;

public class NestedLoops {

    public static void main(String[] args) {
        System.out.println("Enter a value");
        Scanner input = new Scanner(System.in);
        int i, j, value = input.nextInt();
        //divisibility for each number
        for (i = 1; i < value + 1; i++) {
            for (j = 1; j < value + 1; j++) {
                if ((i % j == 0) || (j % i == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" " + i);
        }
    }
}
