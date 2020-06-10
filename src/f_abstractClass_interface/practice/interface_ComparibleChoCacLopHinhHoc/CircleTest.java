package f_abstractClass_interface.practice.interface_ComparibleChoCacLopHinhHoc;

import f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);
    }
}
