package c_array_and_method.Practice;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] array;
        do{
        System.out.println("Input size of array");
        size = scanner.nextInt();
        if(size>20){
            System.out.println("size does not exceed 20");
        }
        }while (size>20);
        array = new int[size];

        for (int i=0; i<size;i++){
            System.out.println("Input a element of array");
            array[i]= scanner.nextInt();
        }

        System.out.println("Array is: " );
        for(int i=0;i<size;i++){
            System.out.print((array[i]) + "\t");
        }

        int max = array[0];
        int index;
        int i;
        for(i=0;i<size;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max Element in array is: " + max + " position at index "+ (i+1));
    }
}
