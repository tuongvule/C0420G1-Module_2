package a_introduction_java.Excercise;

import java.util.Scanner;

public class UngDungDocSoThanhChu_ApplicationReadNumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Input a number to read into words: ");
        number = scanner.nextInt();

        if(number<10 && number>=0){
            switch (number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Out of ability");

            }
        }else if(number <=20){
            switch (number){
                case 11:
                    System.out.println("Elenven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirty");
                    break;
                case 14:
                    System.out.println("Fourteen");
                    break;
                case 15:
                    System.out.println("Fifteen");
                    break;
                case 16:
                    System.out.println("Sixteen");
                    break;
                case 17:
                    System.out.println("Seventeen");
                    break;
                case 18:
                    System.out.println("Eightteen");
                    break;
                case 19:
                    System.out.println("Nineteen");
                    break;
                default:
                    System.out.println("Out of ability");
            }

        }else {
            int tram, chuc, donvi;
            donvi = number%10;
            chuc = number/10%10;
            tram = number%100;
            String tram1="", chuc1="", donvi1="";
            switch (donvi){
                case 1:
                    donvi1 = "one";
                    break;
                case 2:
                    donvi1 = "two";
                    break;
                case 3:
                    donvi1 = "three";
                    break;
                case 4:
                    donvi1 = "four";
                    break;
                case 5:
                    donvi1 = "five";
                    break;
                case 6:
                    donvi1 = "six";
                    break;
                case 7:
                    donvi1 = "severn";
                    break;
                case 8:
                    donvi1 = "eight";
                    break;
                case 9:
                    donvi1 = "nine";
                    break;
                case 0:
                    donvi1 = "";

            }
            switch (chuc){
                case 1:
                    chuc1 ="";
            }
        }

    }
}
