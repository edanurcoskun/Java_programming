package personal;

import java.util.Scanner;

public class Middle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a string: ");
        String str = in.nextLine();
        System.out.println("The middle char in the string: '" + middle(str) + "'\n");
    }

    public static char middle(String word) {
        char middleValue;
        int lengthOfString = word.length();
        int mid = (lengthOfString / 2);
        middleValue = word.charAt(mid);

        return middleValue;
    }
}
