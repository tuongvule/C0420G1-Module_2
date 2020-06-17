package i_stack_queue.excercise.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_Stack;

import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

public class StackOfStringReverse {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String");
        String string = scanner.nextLine();
        pushString(stack, string);
        System.out.println("String before reversing is: ");
        printStack(stack);
//        reverseStack(stack);
        System.out.println("\n String after reversing is: ");
        Stack<String> stackReverse = reverseStack(stack);
        printStack(stackReverse);



    }
    private static Stack<String> reverseStack (Stack<String>stack){
        Stack<String>stackReverse = new Stack<>();
        int stackSize = stack.size();
        for(int i=0;i<stackSize;i++){
            stackReverse.push(stack.pop());
        }
        return stackReverse;
    }

    private static void printStack(Stack<String>stack){
        for(int i=0;i<stack.size();i++){
            System.out.print(stack.elementAt(i));
        }
    }
    private static void pushString(Stack<String>stack, String string){
        for(int i=0;i<string.length();i++){
            String character = string.substring(i,i+1);
            stack.push(character);
        }

    }
}
