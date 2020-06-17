package i_stack_queue.excercise.kiem_tra_chuoi_Palindrome_su_dung_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheck_useQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Text: ");
        String inputText = scanner.nextLine();
        inputText = inputText.toLowerCase();
        Queue<Character> queue = new LinkedList<>();
        for (int i=0;i<inputText.length();i++){
            queue.add(inputText.charAt(i));
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<inputText.length();i++){
            stack.add(inputText.charAt(i));
        }
        boolean check = true;
//        for(int i=0; i<inputText.length();i++){
//            if(stack.pop()!=(queue.remove())){
//                check = false;
//                break;
//            }
//        }
        while (!stack.isEmpty()){
            if(stack.pop()!=(queue.remove())){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Text is a Palindrome");
        }else {
            System.out.println("Text is not a Palindrome");
        }

    }
    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Input Text:");
//        String inputText = sc.nextLine();
//        inputText = inputText.toLowerCase();
//        Queue<Character> queue = new LinkedList<>();
//        for (int i = 0; i < inputText.length(); i++) {
//            queue.add(inputText.charAt(i));
//        }
//        String str = "";
//        while(!queue.isEmpty()) {
//            str = queue.remove()+str;
//        }
//        if (str.equals(inputText)) {
//            System.out.println("This is a Palindrome");
//        } else {
//            System.out.println("This is not a Palindrome");
//        }
//    }

