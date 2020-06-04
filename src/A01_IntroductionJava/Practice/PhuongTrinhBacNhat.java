package A01_IntroductionJava.Practice;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x + b = 0', please enter constants");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if(a!=0){
            double solution = -b/a;
            System.out.println("The solution is: " + solution);
        }

        if(a != 0){
            double answer = -b/a;
            System.out.printf("The solution is: %f!\n", answer);

        }else {
            if (b==0){
                System.out.printf("The solution is all x!");
            }else {
                System.out.printf("No solution!");
            }
        }
    }
}
