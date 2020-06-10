package f_abstractClass_interface.practice.interface_ComparibleChoCacLopHinhHoc;

import f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(8);
        System.out.println(square);

        square = new Square("purple", false, 9);
        System.out.println(square);
    }
}
