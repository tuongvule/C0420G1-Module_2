package e_inheritance.excercise.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(8);
        System.out.println(cylinder);
        cylinder = new Cylinder(7, "green", 9);
        System.out.println(cylinder);
    }
}
