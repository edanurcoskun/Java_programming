package personal;

public class Nested {
    public static void main(String[] args) {
        for(int i = 65; i < 70; i++){
            System.out.print("@");
            for(int j = 65; j <= i; j++ ){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}
