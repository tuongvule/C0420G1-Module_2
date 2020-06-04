package Array_And_Method_3.Practice;

import java.util.Scanner;

public class ChuyenDoiNhietDo_TemperatureConvertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double fahrenheit;
        double celsius;
        do{
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Input your choice");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Input Fahrenheit");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Celsius is: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Input Celsius");
                    celsius = scanner.nextDouble();
                    System.out.println("Fahrenheit is: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);

    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
