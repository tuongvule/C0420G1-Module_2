package c_array_and_method.Practice;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang_FindMinValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] arr;

        do {
            System.out.println("Input size");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Input size again (Because size does not exceed 20");
            }
            arr = new int[size];
        }while(size>20);

        for(int i=0; i<size; i++){
            System.out.println("Input element of array");
            arr[i]= scanner.nextInt();
        }
        System.out.println("Min in Array is: " + minValue(arr));
    }
    public static int minValue( int[] array){
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
