package e_inheritance.excercise.thietKeVaTrienKhaiLopTriangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        Scanner input = new Scanner(System.in);
        System.out.println("Input side 1:");
        double side1 = Double.parseDouble(input.nextLine());
        System.out.println("Input side 2:");
        double side2 = Double.parseDouble(input.nextLine());
        System.out.println("Input side 3:");
        double side3 = Double.parseDouble(input.nextLine());
        System.out.println("Input color:");
        String color = input.nextLine();
        System.out.println("Input filled:");
        boolean filled = Boolean.parseBoolean(input.nextLine());
        System.out.println(triangle);

    }

}
