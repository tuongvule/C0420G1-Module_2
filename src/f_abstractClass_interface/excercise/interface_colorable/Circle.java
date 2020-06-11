package f_abstractClass_interface.excercise.interface_colorable;

public class Circle extends Shappe {
    private double radius = 1.0;
    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle( double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                super.toString()+
                '}';
    }
}
