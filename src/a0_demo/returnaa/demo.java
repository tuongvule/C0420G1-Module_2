package a0_demo.returnaa;

public class demo {
    public int displayN(int n){
        if(n==0){
            return 0;
        } else {
            System.out.print(n + " ");
            return displayN(n-1);
        }
//        if(n==0){
//            System.out.print(0);
//        } else {
//            System.out.print(n + " ");
//            displayN(n-1);
//        }
    }

    public static void main(String[] args) {
        demo test = new demo();
        test.displayN(9);
    }
}
