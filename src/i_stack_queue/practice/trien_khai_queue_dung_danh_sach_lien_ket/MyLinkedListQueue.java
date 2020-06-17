package i_stack_queue.practice.trien_khai_queue_dung_danh_sach_lien_ket;

public class MyLinkedListQueue {

    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
    }

    public MyLinkedListQueue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;

    }
    // PHƯƠNG THỨC ENQUE ĐỂ THÊM VÀO MỘT PHẦN TỬ Ở CUỐI
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail==null){//nếu Queue List rỗng.
            this.head=this.tail=temp;
            return;
        }
        this.tail.next=temp;
        this.tail=temp;
    }

    //PHƯƠNG THỨC DEQUE ĐỂ LẤY RA MỘT PHẦN TỬ Ở ĐẦU
    public Node dequeue(){
        if(this.head==null){//nếu QueueList rỗng
            return null;
        }
        Node temp = this.head;
        this.head=this.head.next;
        if(this.head==null){//Queue List chỉ có một phần tử và đã lấy một phần tử nên Queue rỗng
            this.tail=null;
        }
        return temp;//trả về phần tử lấy ra
    }


    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println("Deque element in the list is: " + queue.dequeue().key);


    }

    class Node {
        private int key;
        private Node next;

        public Node(int key) {
            this.key = key;
        }
    }
}
