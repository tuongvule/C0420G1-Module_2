package l_thuat_toan_tim_kiem.practice.cai_dat_thuat_toan_tim_kiem_nhi_phan_khong_dung_de_quy;

public class BinarySearch {
   static int[]     number = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };
   static int binarySearch(int []number, int key){
       int low=0;
       int hight = number.length - 1;
       while (hight>=low){
           int mid = (hight+low)/2;
           if(key == mid){
               return mid;
           }
           if(key>mid){
               low = mid +1;
           }else {
               hight = mid-1;
           }
       }
       return -1;
   }
    public static void main(String[] args) {
        System.out.println(binarySearch(number, 2));  /* 0 */
        System.out.println(binarySearch(number, 11)); /* 4 */
        System.out.println(binarySearch(number, 79)); /*12 */
        System.out.println(binarySearch(number, 1));  /*-1 */
        System.out.println(binarySearch(number, 5));  /*-1 */
        System.out.println(binarySearch(number, 80)); /*-1 */
    }

}
