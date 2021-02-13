package week_03;
//Java classwork#2

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        double area;

        System.out.println("Enter a radius value to calculate the area of circle: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();

        area = radius * radius * 3.14159;

        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
