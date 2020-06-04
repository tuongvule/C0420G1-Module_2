package A03_Array_And_Method.Excercise;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu_FindMaxValueElementIn2_DimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] array;
        int size1;
        do{
            System.out.println("Input size1 of 2-dimensional array");
            size1 = scanner.nextInt();
            if(size1>20){
                System.out.println("Size1 does not exist 30, please input size again");
            }
        }while (size1>20);

        int size2;
        do{
            System.out.println("Input size2 of 2-dimensional array");
            size2 = scanner.nextInt();
            if(size2>20){
                System.out.println("Size2 does not exist 30, please input size again");
            }
        }while (size2>20);
        array = new int[size1][size2];
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                System.out.println("Input element array["+i+"]["+j+"] of array: ");
                array[i][j]= scanner.nextInt();
            }
        }

        System.out.print("Array after inputting is: " + "\n");
        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                System.out.print(array[i][j] + "; ");
            }
            System.out.print("\n");
        }

        int max=array[0][0];
        for (int i=0;i<size1;i++){
            for (int j=0;j<size2;j++){
                if (array[i][j]>max){
                    max = array[i][j];
                }
            }
        }

        System.out.println("Max Value Element of array is: " + max);


    }
}
