package c_array_and_method.Excercise;

import java.util.Scanner;

public class XoaPhanTuKhoiMang_DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array;
        int size;
        do{
            System.out.println("Input size of array: ");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Size does not exceed 20, please size again.");
            }
        }while (size>20);
        array = new int[size];
        System.out.println("Input elements of array");
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        int X;
        System.out.println("Input element X you want to delete");
        X = scanner.nextInt();

        int index_del=0;
        boolean check =false;
        for(int j=0;j<size;j++){
            if (X == array[j]) {
                index_del=j;
                check =true;
                break;
            }
        }
        if(check){
            System.out.println("Element X = "+ X +", position at index = " + index_del) ;
            for(int i=index_del;i<array.length-1;i++){
                array[i] = array[i+1];
            }
        }else {
            System.out.println("Element X = "+X+ " does not exist in array.") ;
        }


        System.out.println("The array after deleting element X = " + X + " is: " );
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i] + "\t");
        }


    }
}
