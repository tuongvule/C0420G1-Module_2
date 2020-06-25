package n_debug_xu_ly_ngoai_le.practice.array_index_out_of_bounds_exception;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom(){
        Random rd = new Random(100);
        Integer [] arr = new Integer[100];
        for(int i=0;i<100;i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException();
        Integer arr1[] = arrayIndexOutOfBoundsException.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+"Nhập vào chỉ số của một số bất kì");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử: "+ x + " là " + arr1[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Chỉ số vượt quá giới hạn của mảng");//err để in ra chữ đó

        }
    }
}
