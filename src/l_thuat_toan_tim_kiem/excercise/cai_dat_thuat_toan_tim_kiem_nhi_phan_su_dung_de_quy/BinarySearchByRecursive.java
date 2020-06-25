package l_thuat_toan_tim_kiem.excercise.cai_dat_thuat_toan_tim_kiem_nhi_phan_su_dung_de_quy;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BinarySearchByRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size");
        int size = scanner.nextInt();
        int [] listNumbers = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Input phần tử thứ "+(i+1));
            listNumbers[i]=scanner.nextInt();
        }

        System.out.println("Nhập vị trí nhỏ nhất trong mảng bạn muốn tìm kiếm:");
        int low = scanner.nextInt();

        System.out.println("Nhập giá trị bạn muốn tìm kiếm");
        int key = scanner.nextInt();
        System.out.println(binarySearchByRecursive(listNumbers,low, listNumbers.length-1,key));
    }



    static int binarySearchByRecursive(int[]listNumbers, int low, int hight, int key){
        int mid = low + (hight-low)/2;
        if(hight>=low){
            if(key==listNumbers[mid]){
                return mid;
            }
            if(key>=listNumbers[mid]){
                return binarySearchByRecursive(listNumbers, mid+1,hight, key);
            }
            return binarySearchByRecursive(listNumbers,low, mid-1, key);
        }
        return -1;
    }

}
