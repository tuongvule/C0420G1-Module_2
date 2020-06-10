package e_inheritance.practice;

import f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Square;

public class SquareTest {
    public static void main(String[] args) {
        f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Square square = new f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Square();
        System.out.println(square);

        square = new f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Square(8);
        System.out.println(square);

        square = new Square("purple", false, 9);
        System.out.println(square);
    }
}
