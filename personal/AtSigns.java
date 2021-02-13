package personal;

/* 
   _ _ _ _ @
   _ _ _ @ @
   _ _ @ @ @
   _ @ @ @ @
   @ @ @ @ @  
                */
import java.util.Scanner;

public class AtSigns {
    public static void main(String[] args) {
        System.out.println("enter a value ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for(int i = 0; i < number; i++){
            for(int j = i; j < number - 1; j++){
                System.out.print("  ");
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print("@ ");
            }
            System.out.println("");
        }
    }
}



