package personal;

public class Ragged {

    public static void main(String[] args) {
        int[][] arrr = {{0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}};
        for (int i = 0; i < arrr.length; ++i) {
            System.out.print("{");
            for (int j = 0; j < arrr[i].length; ++j) {
                System.out.print(arrr[i][j] = arrr[3 - j][3 - i]);
            }
            System.out.print("}, ");
        }
    }
}
