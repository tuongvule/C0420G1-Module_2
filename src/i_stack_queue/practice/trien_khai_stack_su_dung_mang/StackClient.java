package i_stack_queue.practice.trien_khai_stack_su_dung_mang;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Size of stack after pushing is: "+ stack.size());
        while (!stack.isEmpty()){
            System.out.println("Pop elements from stack is: "+stack.pop());
        }
        System.out.println("Size of stack after popping is: "+stack.size());
    }
}
