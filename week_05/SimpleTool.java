package week_05;
//Java classwork#4

import java.util.Scanner;

public class SimpleTool {

    public static void main(String[] args) {
        int nmbr1 = (int) (Math.random() * 10);
        int nmbr2 = (int) (Math.random() * 10);
        if (nmbr1 < nmbr2) {
            int temp;
            temp = nmbr1;
            nmbr1 = nmbr2;
            nmbr2 = temp;
        }
        System.out.println("Number1 is " + nmbr1 + " and Number2 is " + nmbr2);
        System.out.println("What is the result of Number1 - Number2?");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if (guess == (nmbr1 - nmbr2)) {
            System.out.println("True...");
        } else {
            System.out.println("Answer is false and the result is "
                    + nmbr1 + " - " + nmbr2 + " = " + (nmbr1 - nmbr2));
        }
    }

}
