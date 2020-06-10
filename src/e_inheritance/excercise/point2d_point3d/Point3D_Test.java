package e_inheritance.excercise.point2d_point3d;

public class Point3D_Test {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(4.0f);
        System.out.println(point3D);

        point3D = new Point3D(4.0f,5.5f,9.8f);
        System.out.println(point3D);
        
    }
}
