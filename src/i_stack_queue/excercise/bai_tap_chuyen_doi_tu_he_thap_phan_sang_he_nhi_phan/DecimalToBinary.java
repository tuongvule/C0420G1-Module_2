package i_stack_queue.excercise.bai_tap_chuyen_doi_tu_he_thap_phan_sang_he_nhi_phan;
import java.util.Scanner;
import java.util.Stack;
public class DecimalToBinary {
    public void convertBinary(int num){
        Stack<Integer> stack = new Stack<>();
        while (num!=0){
            int d = num%2;
            stack.push(d);
            num /=2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:" +
                "\n" +
                "1. Decimal To Binary: " +
                "\n"  +
                "2. Binary To Decimal: ");
        System.out.println("Enter your choice" + "\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.println("Input a decimal below");
                int decimalNumber = Integer.parseInt(scanner.nextLine());
                System.out.print("Binary of Decimal "+decimalNumber +" is: ");
                decimalToBinary.convertBinary(decimalNumber);
                break;
            case 2:
//                System.out.println("Input a Binary below");
//                int binaryNumber = Integer.parseInt(scanner.nextLine());
                break;
        }
    }
//    public void convertBinary(int num) {
//        Stack<Integer> stack = new Stack<Integer>();
//        while (num != 0) {
//            int d = num % 2;
//            stack.push(d);
//            num /= 2;
//        }
//        while (!(stack.isEmpty())) {
//            System.out.print(stack.pop());
//        }
//        System.out.println("");
//    }
//    public static void main(String[] args) {
//        DecimalToBinary decimalToBinary = new DecimalToBinary();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Menu"+
//                "\n1.Hệ thập phân sang nhị phân"+
//                "\n2.Hệ nhị phân sang thập phân");
//        System.out.print("Emter your choice: ");
//        int choice=Integer.parseInt(scanner.nextLine()) ;
//        switch (choice){
//            case 1:
//                System.out.print("Nhập số thập phân: ");
//                int decimalNumber = Integer.parseInt( scanner.nextLine());
//                System.out.print("Hệ nhị phân của " + decimalNumber + " là :");
//                decimalToBinary.convertBinary(decimalNumber);
//                break;
//            case 2:
//                String str;
//                System.out.print("Vui long nhap chuoi nhi phan: ");
//                str=scanner.nextLine();
//                Stack<Character> list=new Stack<>();
//                for(int i=0;i<str.length();i++){
//                    list.push(str.charAt(i));
//                }
////        System.out.println("Stack: "+list);
//                int tong=0;
//                int a;
//                int index=1;
//                char c=list.pop();
//                if(c=='0'){
//                    tong=0;
//                }else if(c=='1'){
//                    tong=1;
//                }
//                while(!list.isEmpty()){
//                    a=2*Integer.parseInt(String.valueOf(list.pop()));
////            System.out.println(Math.pow(a,index));
//                    tong+=Math.pow(a,index);
//                    index++;
//                }
//                System.out.println("Hệ thập phân: "+tong);
//                break;
//        }
//    }

}
