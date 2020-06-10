package e_access_modifier.Excercise;

public class Circle {
    private double radius;
    private String color;
    public Circle(){

    }
    public Circle( double r, String color){
        radius = r;
        this.color = color;
    }
    public double getRadius (){
        return this.radius;
    }
    public double getArea (){
        return Math.PI*this.radius*this.radius;
    }
}
