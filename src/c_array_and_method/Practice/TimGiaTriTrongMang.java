package c_array_and_method.Practice;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a student's name: ");
        String input_name = scanner.nextLine();

        boolean isExit = false;
        for(int i=0;i<students.length;i++){
            if(students[i].equals(input_name)){
                System.out.println("Position of Students in the list is:" + input_name + " at " + (i+1) );
                isExit = true;
                break;
            }
            }
            if(!isExit){
                System.out.println("not found " + input_name + "in list of Stunden.");
            }
        }
    }

