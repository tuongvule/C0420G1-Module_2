package f_abstractClass_interface.excercise.interface_colorable;


public class ColoralbeTest {
    public static void main(String[] args) {
        Shappe[] shapes = new Shappe[3];

        shapes[0] = new Circle(3.5, "blue", true);

        Circle a = (Circle) shapes[0];

        System.out.print("Di?n thích hình tròn :");

        System.out.println(a.getArea());



        shapes[1] = new Rectangles("5", 10, "null", false);

        Rectangles b = (Rectangles) shapes[1];

        System.out.print("Diện thích hình ch? nh?t :");

        System.out.println(b.getArea());



       shapes[2] = new Square("yellow",false, '6');
       Square c =(Square) shapes[2];

        System.out.print("Diện thích hình vuông :");

        System.out.println(c.getArea());

        if(c.getColor()!= null){

            c.howToColor();

        }else {

            System.out.println("C không có màu");

        }

    }
}
