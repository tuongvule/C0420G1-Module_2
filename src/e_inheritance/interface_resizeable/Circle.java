package e_inheritance.interface_resizeable;

import f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Shape;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;
    public Circle(){
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
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

    @Override
    public void resize(double percent) {
        this.radius = Math.sqrt(this.radius*(1+percent/100));
    }
}
