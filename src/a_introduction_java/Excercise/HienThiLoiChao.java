package a_introduction_java.Excercise;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String greeting = scanner.nextLine();
        System.out.println("Hello: " + greeting);
    }
}
