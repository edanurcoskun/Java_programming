package week_12;
//java homework#7

import java.util.Scanner;

public class TestingTriangleClass {

    public static void main(String[] args) {
        double side1, side2, side3;
        String myColor;
        Boolean filledOrNot;
        Scanner input = new Scanner(System.in);

        //for taking the sides values from user
        System.out.println("Enter the first side of triangle: ");
        side1 = input.nextDouble();
        System.out.println("Enter the second side of triangle: ");
        side2 = input.nextDouble();
        System.out.println("Enter the third side of triangle: ");
        side3 = input.nextDouble();

        //for creating an object with sides values that user entered
        Triangle myTriangle = new Triangle(side1, side2, side3);

        //for taking a value from user for 'myColor' variable and assign to 'color' variable 
        System.out.println("Enter the color of triangle: ");
        myColor = input.next();
        myTriangle.setColor(myColor);

        //for taking a boolean value from user for 'filledOrNot' variable and assign to 'filled' variable
        System.out.println("Enter as true or false that whether triangle is filled: ");
        filledOrNot = input.nextBoolean();
        myTriangle.setFilled(filledOrNot);

        //for printing the information about 'myTriangle'
        System.out.println("A triangle " + myTriangle.toString());
        System.out.println("The area of triangle is => " + myTriangle.getArea());
        System.out.println("The perimeter of triangle is => " + myTriangle.getPerimeter());
        System.out.println("The color of triangle is => " + myTriangle.getColor());
        System.out.println("The triangle is filled or not? => " + myTriangle.isFilled());
    }

}

class Triangle extends GeometricObject {

    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s, area;
        s = (side1 + side2 + side3) / 2;
        area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        return area;
    }

    public double getPerimeter() {
        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return super.toString() + "\nSide1 is (" + side1 + "), Side2 is ("
                + side2 + "), Side3 is (" + side3 + ")";
    }
}

class GeometricObject {

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Created on: " + dateCreated + "\ncolor: " + color
                + " and filled: " + filled;
    }
}

