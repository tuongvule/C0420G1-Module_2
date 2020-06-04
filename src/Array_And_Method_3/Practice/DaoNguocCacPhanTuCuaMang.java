package Array_And_Method_3.Practice;

import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input a size of array");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Size does not exceed 20");
            }
        }while (size>20);
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.println("Input element " + (i+1) +":");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in Array","");
        for(int j=0;j<array.length;j++){
            System.out.println(array[j] + "\t");
        }
        for(int j=0;j< array.length/2;j++){
            int temp;
            temp = array[j];
            array[j]=array[size-1-j];
            array[size-1-j]=temp;
        }
        System.out.printf("%-20s%s", "Reverse Array: ","");
        for (int j=0; j<array.length;j++){
            System.out.println(array[j] + "\t");
        }

    }

}

