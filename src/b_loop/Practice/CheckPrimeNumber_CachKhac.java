package b_loop.Practice;

import java.util.Scanner;

public class CheckPrimeNumber_CachKhac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input Number: \n");
        number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " is NOT a prime.");
        } else if(number==2 || number ==3){
            System.out.println(number + " is a prime");
        }else if(number>3){
            int i=4;
            for (i=4;i<number;){
                if(number%i==0){
                    System.out.println(number + " is NOT a prime");
                    break;
                }
                i++;
            }
            if(i==number){
                System.out.println(number + " is a prime");
            }
        }

    }
}
