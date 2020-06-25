package m_thuat_toan_sap_xep_sort_algorithm.practice.minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size of array");
        int size = scanner.nextInt();
        int [] numberList = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Input element at index "+i+ " into number list: ");
            numberList[i]=scanner.nextInt();
        }
        System.out.print("The array after inputting: ");
        for (int i=0;i<size;i++){
            System.out.print(numberList[i]+" ");
        }
       // gọi hàm
        bubbleSortByStep(numberList);
    }
    public static void bubbleSortByStep(int [] numberList){
        boolean needNextPass = true;
        for(int i=1;i<numberList.length && (needNextPass);i++){
            needNextPass = false;
            for (int j=0;j<numberList.length-i;j++){
                if(numberList[j]>numberList[j+1]){
                    int temp = numberList[j+1];
                    numberList[j+1] = numberList[j];
                    numberList[j]= temp;
                    needNextPass = true;
                }
            }
        }

        System.out.println("\n"+"The array after sorting");
        for(int i=0;i<numberList.length;i++){
            System.out.print(numberList[i]+ " ");

        }
    }
}
