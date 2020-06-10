package d_class_and_object_in_java;

public class demo_override_tostring {
    public static class Circle{
        private int radius;

        public Circle(int radius){
            this.radius=radius;
        }
        @Override
        public String toString(){
            return "I am a Circle, my radius is "+this.radius;
        }

    }
    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        System.out.println(circle1.toString());
    }
}


