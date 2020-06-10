package a_introduction_java.Excercise;

import java.util.Scanner;

public class ChuyenDoiTienTe_CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dollarMoney, vietnamMoney;

        System.out.println("Input your money(USD):");
        dollarMoney = scanner.nextInt();
        vietnamMoney = dollarMoney*23000;
        System.out.printf("Your money after converting is: %d VND", vietnamMoney);
    }
}
