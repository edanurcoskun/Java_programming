package week_06;
//Java classwork#5
import java.util.Scanner;

public class RepeatAddition {

    public static void main(String[] args) {
        boolean i = true;
        System.out.println("Write the answer of question...");            
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        while (i) {
            System.out.println(num1 + " + " + num2 + " = ??");
            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();
            if (answer != (num1 + num2)) {
                System.out.println("Wrong answer!!\nTry again...");
            } else {
                System.out.println("The answer is true. " 
                        + num1 + " + " + num2 + " = " + answer);
                i = false;
            }
        }
    }
}
