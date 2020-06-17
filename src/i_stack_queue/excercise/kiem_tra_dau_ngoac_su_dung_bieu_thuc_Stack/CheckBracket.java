package i_stack_queue.excercise.kiem_tra_dau_ngoac_su_dung_bieu_thuc_Stack;
import javax.lang.model.element.NestingKind;
import java.util.Scanner;
import java.util.Stack;
public class CheckBracket {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a expression");
//        String expression = scanner.nextLine();
//        Stack<Character> bStack = new Stack<>();
//
//        for(int i=0;i<expression.length();i++){
//            bStack.add(expression.charAt(i));
//        }
//        int count=0;
//        String check;
//        while (!bStack.isEmpty()){
//            check=bStack.lastElement().toString();
//            if(check.equals("(")){
//                count++;
//            }else if(check.equals(")")){
//                count--;
//            }
//            bStack.pop();
//        }
//        System.out.println("your expression is "+ (count==0));
//    }
        //----------------
        System.out.print("Nhập biểu thức cần kiểm tra :");
        Scanner scn = new Scanner(System.in);
        String scn1 = scn.nextLine();
        Stack<String> stack = new Stack<>();
        Stack<String> stack1 = new Stack<>();
        for (int i = 0; i < scn1.length(); i++) {
            String character = scn1.substring(i, i + 1);
            if (character.equals("(")) {
                stack.push(character);
            } else if (character.equals(")")) {
                stack1.push(character);
            }
        }
        if (stack.size() == stack1.size()) {
            System.out.println("Biểu thức đúng");
        } else {
            System.out.println("Biểu thức sai");
        }
    }
}

//        System.out.print("Input Expression:");
//        Scanner scn = new Scanner(System.in);
//        String inputExpression = scn.nextLine();
////        ---------------------------------
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < inputExpression.length(); i++) {
//            stack.add(inputExpression.charAt(i));
//        }
//        int count = 0;
//        String check;
//        while (!stack.isEmpty()) {
//            check = stack.lastElement().toString();
//            if (check.equals("(")) {
//                count++;
//            } else if (check.equals(")")) {
//                count--;
//            }
//            stack.pop();
//        }
//        System.out.println("Your Expression is "+(count==0));
//    }
//}