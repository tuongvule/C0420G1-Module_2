package e_inheritance.interface_resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle[]circles=new Circle[2];
        circles[0]= new Circle(3.6);
        circles[1 ]= new Circle(3.6);
        System.out.println("Before resize");
        for (Circle circle:circles){
            System.out.println(circle);
        }

        circles[1].resize(50);
        System.out.println("After resize");
        for(Circle circle:circles){
            System.out.println(circle);
        }

        System.out.println(circles[0].getArea());
        System.out.println( circles[0].getPerimeter());
        System.out.println( circles[1].getArea());
        System.out.println(circles[1].getPerimeter());

        Rectangle[]rectangles=new Rectangle[2];
        rectangles[0]=new Rectangle(4,6);
        rectangles[1]=new Rectangle(4,7);
        System.out.println("Before resize");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }

        rectangles[1].resize(50);
        System.out.println("After resize");
        for (Rectangle rectangle:rectangles){
            System.out.println(rectangle);
        }

        System.out.println(rectangles[0].getArea());
        System.out.println(rectangles[0].getPerimeter());
        System.out.println(rectangles[1].getArea());
        System.out.println(rectangles[1].getPerimeter());

        double percent = Math.round(Math.random()*100);
        System.out.println("percent: "+percent);

        Square[]squares=new Square[2];
        squares[0]=new Square(5);
        squares[1]=new Square(5);
        System.out.println("Before resize");
        for (Square square:squares){
            System.out.println(square);
        }

        squares[1].resize(50);
        System.out.println("After resize");
        for (Square square:squares){
            System.out.println(square);
        }
        System.out.println(squares[0].getArea());
        System.out.println(squares[1].getPerimeter());

    }
}
