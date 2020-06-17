package i_stack_queue.practice.trien_khai_stack_su_dung_linked_list;

public class GenericStackCilent {
    private static void stackOfString(){
        MyGenericStack<String>stack = new MyGenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");
        System.out.println("1.1 Size of stack after pushing operations: " + stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("1.3 Size of stack after popping operations: "+ stack.size());
    }
    public static void stackOfInteger(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Size of Stack after pushing is: " + stack.size());
        while (!stack.isEmpty()){
            System.out.println("Pop elements is: " + stack.pop());
        }
        System.out.println("Size of stack after popping is: " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of String is: ");
        stackOfString();
        System.out.println("Stack of Integer is: ");
        stackOfInteger();
    }
//    private static void stackOfIStrings() {
//        MyGenericStack<String> stack = new MyGenericStack();
//        stack.push("Five");
//        stack.push("Four");
//        stack.push("Three");
//        stack.push("Two");
//        stack.push("One");
//        System.out.println("1.1 Size of stack after push operations: " + stack.size());
//        System.out.printf("1.2. Pop elements from stack : ");
//        while (!stack.isEmpty()) {
//            System.out.printf(" %s", stack.pop());
//        }
//        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
//    }
//    private static void stackOfIntegers() {
//        MyGenericStack<Integer> stack = new MyGenericStack();
//        stack.push(5);
//        stack.push(4);
//        stack.push(3);
//        stack.push(2);
//        stack.push(1);
//        System.out.println("2.1. Size of stack after push operations: " + stack.size());
//        System.out.printf("2.2. Pop elements from stack : ");
//        while (!stack.isEmpty()) {
//            System.out.printf(" %d", stack.pop());
//        }
//        System.out.println("\n3.3 Size of stack after pop operations : " + stack.size());
//    }
//    public static void main(String[] args) {
//        System.out.println("1. Stack of integers");
//        stackOfIntegers();
//        System.out.println("\n2. Stack of Strings");
//        stackOfIStrings();
//    }
}
