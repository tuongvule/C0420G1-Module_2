package m_thuat_toan_sap_xep_sort_algorithm.practice.cai_dat_thuat_toan_sap_xep_noi_bot;

public class BubbleSort {
    static int[] listNumbers = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] listNumbers){
        boolean needNextPass = true;

        for(int i=1 ; i<listNumbers.length;i++){
            needNextPass = false;
            for(int j=0;j<listNumbers.length-i;j++){
                if(listNumbers[j]>listNumbers[j+1]){
                    int temp = listNumbers[j+1];
                    listNumbers[j+1] = listNumbers[j];
                    listNumbers[j] = temp;
                    needNextPass = true;
                }
            }
        }
        System.out.println("Array after sorting is: ");
        for (int i=0;i<listNumbers.length;i++){
            System.out.print(listNumbers[i] +" ");
        }
    }

    public static void main(String[] args) {
        bubbleSort(listNumbers);
    }
}
