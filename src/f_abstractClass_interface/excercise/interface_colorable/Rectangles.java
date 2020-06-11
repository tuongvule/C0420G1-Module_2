package f_abstractClass_interface.excercise.interface_colorable;

import f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Shape;

public class Rectangles extends Shappe implements Colorable {
    private double width=1.0;
    private double length=1.0;
    public Rectangles(){}
    public Rectangles(String color, int i, String aNull, boolean b){
    }

    public Rectangles(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangles(String color, boolean filled, double width, double length) {
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
    public void howToColor() {

    }
}
