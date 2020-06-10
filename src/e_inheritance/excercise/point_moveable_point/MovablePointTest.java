package e_inheritance.excercise.point_moveable_point;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2.0f,3.0f,4.0f,5.0f);
        System.out.println("Before moving");
        System.out.println(movablePoint);


        movablePoint.move();
        System.out.println("After moving");
        System.out.println(movablePoint);
    }


}
