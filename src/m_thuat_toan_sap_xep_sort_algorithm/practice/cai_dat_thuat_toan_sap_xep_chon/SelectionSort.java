package m_thuat_toan_sap_xep_sort_algorithm.practice.cai_dat_thuat_toan_sap_xep_chon;

public class SelectionSort {
    static double []list = {1, 9, 4.5, 6.6, 5.7, -4.5};

    public static void selectionSort(double [] list){
        /** Find the minimum in the list[i..list.length-1] */
        for(int i=0;i<list.length-1;i++){
            double currentMin = list[i];
            int currentMinIndex = i;
            for(int j=i+1;j<list.length;j++){
                if(list[j]<currentMin){
                    currentMin = list[j];
                    currentMinIndex=j;
                }
            }
            /** Swap list[i] with list[currentMinIndex] if necessary */
            if(currentMinIndex!=i){
                list[currentMinIndex]=list[i];
                list[i]= currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        System.out.println("The array after sorting is: ");
        for(int i=0;i<list.length;i++){
            System.out.println(list[i]+ " ");

        }
    }
}
