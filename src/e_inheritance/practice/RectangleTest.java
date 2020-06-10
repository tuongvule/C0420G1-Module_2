package e_inheritance.practice;

import f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Rectangle rectangle = new f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Rectangle();
        System.out.println(rectangle);

        rectangle= new f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Rectangle(7,8);
        System.out.println(rectangle);

        rectangle = new Rectangle("yellow", false, 7, 8);
        System.out.println(rectangle);
    }



}
