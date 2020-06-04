package Array_And_Method_3.Excercise;

import java.util.Scanner;

public class GopMang_MergeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array1;
        int size1;
        do{
            System.out.println("Input size of Array1");
            size1 = scanner.nextInt();
            if(size1>20){
                System.out.println("Size1 of Array1 does not exceed 20");
            }
        }while (size1>20);
        array1 = new  int[size1];
        for(int i=0;i<size1;i++){
            System.out.println("Input elements of Array1");
            array1[i] = scanner.nextInt();
        }

        int [] array2;
        int size2;
        do{
            System.out.println("Input size of Array2");
            size2 = scanner.nextInt();
            if(size2>20){
                System.out.println("Size1 of Array2 does not exceed 20");
            }
        }while (size2>20);
        array2 = new  int[size2];
        for(int i=0;i<size2;i++){
            System.out.println("Input elements of Array2");
            array2[i] = scanner.nextInt();
        }

        int [] array3;
        int size3 = size1 + size2;
        array3 = new int[size3];
            System.out.println("Array3 after merging array1 and array2 is: ");
            for(int j=0;j<size1;j++){
                System.out.print(array1[j] + "; ");
            }
            for(int j=0;j<size2;j++){
                System.out.print(array2[j] + "; ");
        }
    }
}
