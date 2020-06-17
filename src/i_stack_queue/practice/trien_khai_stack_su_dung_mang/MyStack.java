package i_stack_queue.practice.trien_khai_stack_su_dung_mang;

public class MyStack {
    private int []arr;
    private int size;
    private int index=0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }
    public boolean isFull(){
        if(index==size){
            return true;
        }
        return false;
    }
    public boolean isEmpty(){
        if(index==0){
            return true;
        }
        return false;
    }
    public int size(){
        return index;
    }
    public void push(int element) throws Exception{
        if(isFull()){
            throw new Exception("Stack is full");
        }
        arr[index]=element;
        index++;
    }
    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
}
