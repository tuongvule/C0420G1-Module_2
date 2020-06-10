package c_array_and_method.Excercise;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang_FindMinValueElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int size;
        do {
            System.out.println("Input size of array");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20, please input size of array again");
            }
        } while (size > 20);

        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Input element arr[" + i + "] of array");
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Min Value Element of Array is: " + min);
    }
}
