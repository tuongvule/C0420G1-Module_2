package A03_Array_And_Method.Excercise;

import java.util.Scanner;

public class ThemPhanTuVaoMang_AddElementIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array;
        int size;
        do{
            System.out.println("Input size of array below");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("Size does not exceed 20, please input size again");
            }

        }while (size>20);

        array = new int[size+10];
        for(int i=0;i<size;i++){
            System.out.println("Input " + size +  " elements of array");
            array[i]= scanner.nextInt();
        }
        int X;
        System.out.println("Input element X that you want to add into the array");
        X = scanner.nextInt();

        int index_add;
        System.out.println("Input index of element X that you want to add in to the array");
        index_add = scanner.nextInt();
        if(index_add <= 1 && index_add >= array.length){
            System.out.println("Do not add X into the array");
        }else {
            for(int i=index_add;i<array.length-1;i++){
                array[i+1]=array[i];
            }
            array[index_add]=X;
        }
        System.out.println("Array after adding element X is: ");
        for(int i=0;i<size+1;i++){
            System.out.println(array[i] + "\t");
        }
    }
}
