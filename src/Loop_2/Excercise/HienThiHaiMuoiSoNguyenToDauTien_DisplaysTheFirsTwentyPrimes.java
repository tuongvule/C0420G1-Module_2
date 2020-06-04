package Loop_2.Excercise;

public class HienThiHaiMuoiSoNguyenToDauTien_DisplaysTheFirsTwentyPrimes {
    public static void main(String[] args) {
        int count = 0;
        int i=2;
        int N=2;
        String text="";
        while (count<=20){
            for(i=2;i<N;i++){
                if(N%i==0){
                    break;
                }
            }
            if (i==N){
                text += N + "; ";
                count ++;
            }
            N++;
        }
        System.out.println("The first twenty primes are: " + text);
    }
}
