package n_debug_xu_ly_ngoai_le.practice.su_dung_lop_number_format_exception;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập x");
        int x1 = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập y");
        int y1 = Integer.parseInt(scanner.nextLine());
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x1,y1);
    }
    private void calculate(int x, int y){
        try {
            int a = x+y;
            int b= x-y;
            int c= x*y;
            int d = x/y;
            System.out.println("Tổng là "+ a);
            System.out.println("hiệu là "+ b);
            System.out.println("tích là "+ c);
            System.out.println("thương là "+ d);
        }catch (Exception e){
            System.err.println("Xảy ra ngoại lệ" + e.getMessage());
        }


    }
}
