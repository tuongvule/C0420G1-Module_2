package A01_IntroductionJava.Practice;

import java.util.Scanner;

public class ChiSoCanNangCoThe_BodyMassIndex_BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Your weight (in kilogram):");
        weight = scanner.nextDouble();

        System.out.println("Your height (in meter");
        height = scanner.nextDouble();

        bmi = weight/Math.pow(height, 2);
        //Lưu ý: Sử dụng hàm Math.pow(x,2) để bình phương của một số.
        if(bmi<18.5){
            System.out.println("underweight");
        }else if(bmi<25){
            System.out.println("Normal");

        }else if(bmi <30){
            System.out.println("Overweight");
        }else if(bmi>=30){
            System.out.println("Obese");
        }

    }
}
