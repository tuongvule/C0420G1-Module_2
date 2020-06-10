package b_loop.Excercise;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int N=2;
        int i;
        String text="";
        while (N<100){
        for(i=2;i<N;i++){
            if(N%i==0){
                break;
            }
        }
        if(i==N){
            text +=  N + "; ";
        }
        N++;
        }
        System.out.println("Prime Numbers less than 100 are: " + text);
    }
}
