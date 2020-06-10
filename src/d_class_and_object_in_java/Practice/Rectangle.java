package d_class_and_object_in_java.Practice;

import java.util.Scanner;

public class Rectangle {

    double width, height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String displayRectangle() {
        return "Rectangle{width: " + width + " + height: " + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width: ");
        double width = scanner.nextDouble();
        System.out.println("Input height: ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle:  " + rectangle.displayRectangle());
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
    }

}
