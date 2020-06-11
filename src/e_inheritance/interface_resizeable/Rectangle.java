package e_inheritance.interface_resizeable;

import f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Shape;

public class Rectangle extends Shape implements Resizeable {
    private double width=1.0;
    private double length=1.0;
    public Rectangle(){
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return 2*(this.width+this.length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                super.toString()+
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width = this.width*(1+percent/100);
        this.length = this.length*(1+percent/100);
    }
}
