package f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle= new Rectangle(7,8);
        System.out.println(rectangle);

        rectangle = new Rectangle("yellow", false, 7, 8);
        System.out.println(rectangle);
    }



}
