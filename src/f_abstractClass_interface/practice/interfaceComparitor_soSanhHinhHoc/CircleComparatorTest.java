package f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc;
import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0]= new Circle(3.6);
        circles[1]=new Circle("indigo", false, 3.5);
        System.out.println("Pre-sorted");
        for (Circle circle: circles){
            System.out.println(circle);
        }

        System.out.println(("After-sorted"));
        for (Circle circle: circles){
            System.out.println(circle);
        }

    }
}
