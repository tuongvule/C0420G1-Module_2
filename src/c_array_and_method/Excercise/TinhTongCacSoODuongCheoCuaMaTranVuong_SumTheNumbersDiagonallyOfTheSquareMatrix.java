package c_array_and_method.Excercise;

import java.util.Scanner;

public class TinhTongCacSoODuongCheoCuaMaTranVuong_SumTheNumbersDiagonallyOfTheSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr;
        int size;
        do{
            System.out.println("Input sizei of array");
            size = scanner.nextInt();
            if(size>20){
                System.out.println("sizei should be less than 20");
            }
        }while(size > 20);


        arr = new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("Input array["+i+"]["+j+"] of array: " );
                arr[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Array after inputting is: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(arr[i][j] + ";  ");
            }
            System.out.print("\n");
        }
        int sum1 =0;
        for(int i=0;i<size;i++){
            for(int j=i;j<=i;j++){
               sum1 += arr[i][j];
            }
        }
        System.out.println("Sum the numbers in the first diagonal: " + sum1);
        int sum2 =0;
        for(int i=size-1;i>=0;i--){
            for(int j=size-1-i;j<=i;j++){
                sum2 += arr[i][j];
            }
        }
        System.out.println("Sum the numbers in the first diagonal: " + sum2);

    }
}
