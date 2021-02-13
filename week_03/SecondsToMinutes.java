package week_03;
//Java classwork#3

import java.util.Scanner;

public class SecondsToMinutes {

    public static void main(String[] args) {
        int minutes;

        System.out.println("Enter a seconds value to calculate in minutes");
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();

        System.out.print("The result of calculation for " + seconds + " seconds is ");

        minutes = seconds / 60;
        seconds = seconds - (minutes * 60);

        System.out.println(minutes + " min and " + seconds + " sec ");

    }
}
