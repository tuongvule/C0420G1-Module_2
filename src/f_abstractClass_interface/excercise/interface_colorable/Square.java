package f_abstractClass_interface.excercise.interface_colorable;

import f_abstractClass_interface.practice.interfaceComparitor_soSanhHinhHoc.Rectangle;

public class Square extends Rectangles implements Colorable {
    double side = 1.0;
    public Square(){

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setLength(side);
        setWidth(side);
    }
    @Override
    public void setWidth(double width){
        setSide(width);
    }
    @Override
    public void setLength(double length){
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString()+
                '}';
    }

    @Override
    public void howToColor() {
            System.out.println("Color all four sides");
        }
    }

