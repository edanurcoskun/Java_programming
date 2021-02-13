package week_09;
//java homework#4

public class MultipleChoiceTest {

    public static void main(String[] args) {
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        char[][] options = new char[8][10];
        int[] students = new int[8];
        int score = 0;

        //generate random values between 'A' and 'E'
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                options[i][j] = (char) (65 + (int) (Math.random() * 5));
            }
        }

        //write the answer key of test
        System.out.println("Key to the questions is: ");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(key[i] + " ");
        }

        System.out.println("\n--------------------");

        //calculate the score of each students
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                if (options[i][j] == key[j]) {
                    score++;
                }
            }
            students[i] = score * 10;
            score = 0;
        }

        System.out.println("Answer and scores of students: \n------------------------------");

        //write answer and score of all students
        for (int i = 0; i < 8; i++) {
            System.out.print("Student " + (i + 1) + " |  ");
            for (int j = 0; j < 10; j++) {
                System.out.print(options[i][j] + " ");
            }
            System.out.println(" |  Score is: " + students[i]);
        }
    }
}
