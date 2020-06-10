package d_class_and_object_in_java.Practice;

public class MethodOverriding_extend_super {
    public class Circle {
        private int radius;

        public Circle (int radius){
            this.radius = radius;
        }

        public double getArea(){
            return Math.PI*this.radius*this.radius;
        }
        public double getPerimeter(){
            return 2*Math.PI*this.radius;
        }
    }
    public class Cylinder extends Circle{
        private  int height;

        public Cylinder(int radius, int height){
            super(radius);
            this.height = height;
        }

        @Override
        public double getArea() {
            return super.getArea()*2+super.getPerimeter()*height;
        }
        public double getVolume(){
            return super.getArea()*height;
        }
    }
}

