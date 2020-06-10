package c_array_and_method.Excercise;

import java.util.Scanner;

public class DemSoLanXuatHienCuaKyTuTrongChuoi_CountingTheNumberOfOccurrencesOfACharacterInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String str = scanner.nextLine();
        System.out.println("Enter character: ");
        char input = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i<str.length();i++){
            if(input == str.charAt(i)){
                count ++;
            }
        }
        System.out.println(count);

    }
}
