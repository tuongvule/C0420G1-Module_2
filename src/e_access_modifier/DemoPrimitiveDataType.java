package e_access_modifier;

public class DemoPrimitiveDataType {
    public static void swap (int first, int second){
        int temp = first;
        first = second;
        second =temp;
    }

    public static void main(String[] args) {
        int a =5;
        int b =10;
        swap(a,b);
        System.out.println("a="+a);
        System.out.println("b = "+b);
    }
}
