package m_thuat_toan_sap_xep_sort_algorithm.excericise.minh_hoa_thuat_toan_chen;

public class InsertionSortByStep {
    static int [] array = {2, 6, 7, 1, 3, 9, 5, 23, 12};

    public static void insertionSortByStep(int [] array){
        for (int i=0;i<array.length;i++){
            int current = array[i];
            int j;
            for( j=i-1;j>=0 && array[j]>current;j--){
                    array[j+1]=array[j];
            }
            array[j+1]=current;
        }
    }

    public static void main(String[] args) {
        insertionSortByStep(array);
        System.out.println("The array after sorting is: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}
