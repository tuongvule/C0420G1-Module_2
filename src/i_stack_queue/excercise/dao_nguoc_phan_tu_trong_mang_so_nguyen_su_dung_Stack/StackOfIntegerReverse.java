package i_stack_queue.excercise.dao_nguoc_phan_tu_trong_mang_so_nguyen_su_dung_Stack;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.Arrays;
import java.util.Stack;

public class StackOfIntegerReverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("Before reverse: ");
        printStack(stack);
        System.out.println("After reverse");
        Stack<Integer> reverseStack2 = reverseStack(stack);
        printStack(reverseStack2);
    }
    private static void printStack(Stack <Integer>stack){
        for(int i=0;i<stack.size();i++){
            System.out.println(stack.elementAt(i));
        }
    }
    private static  Stack<Integer> reverseStack (Stack<Integer>stack){
        Stack<Integer>stackReverse = new Stack<>();
        int stackSize = stack.size();
        for (int i=0;i<stackSize;i++){
            stackReverse.push(stack.pop());
        }
        return stackReverse;
    }
}
