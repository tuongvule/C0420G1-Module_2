package d_class_and_object_in_java.Excercise;

import java.util.Scanner;

public class PhuongTrinhBacHai_QuadraticEquation {
    public static class QuadraticEquation{
        double a, b, c;
        public  QuadraticEquation(double a, double b, double c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getA(){
            return this.a;
        }
        public double getB(){
            return this.b;
        }
        public double getC(){
            return this.c;
        }
        public double getDiscriminant(){
            return this.b * this.b - 4*this.a*this.c;
        }
        public double nghiem1(){
            double x1;
           x1=(-this.b-Math.sqrt(getDiscriminant()))/(2*this.a);
           return x1;
        }
        public double nghiem2(){
            double x2;
            x2=(-this.b-Math.sqrt(getDiscriminant()))/(2*this.a);
            return x2;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        double a  = scanner.nextDouble();
        System.out.println("Input b");
        double b = scanner.nextDouble();
        System.out.println("Input c");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("pt co hai no:");
            System.out.println("nghiem 1 la:" + quadraticEquation.nghiem1()+
                    "\n nghiem 2 la "+quadraticEquation.nghiem2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("pt co 1 no: " + quadraticEquation.nghiem2());
        }else {
            System.out.println("pt vo no");
        }


    }
}
