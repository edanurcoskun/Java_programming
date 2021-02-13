package week_05;
//Java homework#2

public class RandomMonth {

    public static void main(String[] args) {
        int num = 1 + (int) (Math.random() * 12);
        switch (num) {
            case 1:
                System.out.println(" The random value is '1' \n The month is JANUARY");
                break;
            case 2:
                System.out.println(" The random value is '2' \n The month is FEBRUARY");
                break;
            case 3:
                System.out.println(" The random value is '3' \n The month is MARCH");
                break;
            case 4:
                System.out.println(" The random value is '4' \n The month is APRIL");
                break;
            case 5:
                System.out.println(" The random value is '5' \n The month is MAY");
                break;
            case 6:
                System.out.println(" The random value is '6' \n The month is JUNE");
                break;
            case 7:
                System.out.println(" The random value is '7' \n The month is JULY");
                break;
            case 8:
                System.out.println(" The random value is '8' \n The month is AUGUST");
                break;
            case 9:
                System.out.println(" The random value is '9' \n The month is SEPTEMBER");
                break;
            case 10:
                System.out.println(" The random value is '10' \n The month is OCTOBER");
                break;
            case 11:
                System.out.println(" The random value is '11' \n The month is NOVEMBER");
                break;
            case 12:
                System.out.println(" The random value is '12' \n The month is DECEMBER");
                break;
        }
    }
}
