package A02_Loop.Practice;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay_LoanCalculatorApplication {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Input investment amout");
        money = input.nextDouble();//số tiền gửi

        System.out.println("Input number of month");
        month = input.nextInt();// số tháng

        System.out.println("Input annual interest rate in percentage");
        interset_rate = input.nextDouble();

        double total_interest = 0;
        total_interest = money * (interset_rate/12) *month;

        System.out.println("Total of interest: " + total_interest);


    }
}
