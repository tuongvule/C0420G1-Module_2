package c_array_and_method.Excercise;

import java.util.Scanner;

public class TinhTongCacSoOMotCotNhatDinh_FindTheSumOfNumbesInSpecifiedColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] arr;
        int sizei;
        int sizej;
        do{
            System.out.println("Input sizei of array");
            sizei = scanner.nextInt();
            if(sizei>20){
                System.out.println("sizei should be less than 20");
            }
        }while(sizei > 20);

        do{
            System.out.println("Input sizej of array");
            sizej = scanner.nextInt();
            if(sizej>20){
                System.out.println("sizej should be less than 20");
            }
        }while(sizej > 20);

        arr = new int[sizei][sizej];
        for(int i=0;i<sizei;i++){
            for(int j=0;j<sizej;j++){
                System.out.print("Input array["+i+"]["+j+"] of array: " );
                arr[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Array after inputting is: ");
        for(int i=0;i<sizei;i++){
            for(int j=0;j<sizej;j++){
                System.out.print(arr[i][j] + "; ");
            }
            System.out.print("\n");
        }

        System.out.println("Input the column of the array to sum");
        int indexColumn = scanner.nextInt();
        int sum =0;
        for (int i=0;i<sizei;i++){
            sum += arr[i][indexColumn];
        }

        System.out.println("The sum of column at index = " + indexColumn + " is: " + sum);
    }
}
