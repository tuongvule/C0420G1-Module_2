package c_array_and_method.Practice;

import java.util.Scanner;

public class DemSoLuongSinhVienThiDo_CountTheNumberOfStudentsPassing {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Input the number of students: ");
            size = scanner.nextInt();
            if(size>30){
                System.out.println("Size should not exceed 30, please input again.");
            }
        }while(size>30);

        int [] markStudents;
        markStudents = new int[size];
        int count =0;
        for(int i=0;i<size;i++){
            System.out.print("Input mark of the student "+(i+1)+" : ");
            markStudents[i]=scanner.nextInt();
            if (markStudents[i]>5 && markStudents[i]<=10){
                count ++;
            }
        }
        System.out.println("The number of students passing is: "+ count);
    }

}
