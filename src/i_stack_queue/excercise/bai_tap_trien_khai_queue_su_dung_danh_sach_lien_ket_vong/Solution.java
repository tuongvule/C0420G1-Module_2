package i_stack_queue.excercise.bai_tap_trien_khai_queue_su_dung_danh_sach_lien_ket_vong;

public class Solution {
    public static class Queue {
        public static class Node {
            private int data;
            private Node link;

            public Node(int data) {
                this.data = data;
            }

            public Node() {
            }

            public int getData() {
                return data;
            }

            public void setData(int data) {
                this.data = data;
            }

            public Node getLink() {
                return link;
            }

            public void setLink(Node link) {
                this.link = link;
            }
        }

        private Node front;
        private Node rear;

        public Queue(Node front, Node rear) {
            this.front = front;
            this.rear = rear;
        }

        public Queue() {
        }

        public Node getFront() {
            return front;
        }

        public void setFront(Node front) {
            this.front = front;
        }

        public Node getRear() {
            return rear;
        }

        public void setRear(Node rear) {
            this.rear = rear;
        }
    }

    public static void enQueue(Queue queue, int value) {
        Queue.Node temp = new Queue.Node();
        temp.data = value;
        if (queue.front == null) {
            queue.front = temp;
        } else {
            queue.rear.link = temp;
        }
        queue.rear = temp;
        queue.rear.link = queue.front;
    }

    public static void deQueue(Queue queue) {                               /*  deQueue không trả về phần tử vừa xóa void      */
        if (queue.front == null) {
            System.out.println("Queue is null");
        } else if (queue.front == queue.rear) {
            queue.front = null;
            queue.rear = null;
        } else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
    }

    public static int deQueue2(Queue queue) {                               /*  deQueue trả về phần tử vừa xóa      */
        if (queue.front == null) {
            throw new NullPointerException("Queue is null");
        }

        int value = queue.front.data;
        ;
        if (queue.front == queue.rear) {
            queue.front = null;
            queue.rear = null;
        } else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
        return value;
    }

    public static void displayQueue(Queue queue) {
        if (queue.front == null) {
            System.out.println("Queue is null");
            return;
        }
        if (queue.front == queue.rear) {
            System.out.println(queue.front.data);
            return;
        }
        Queue.Node temp = queue.front;
        System.out.println(temp.data);
        do {
            temp = temp.link;
            System.out.println(temp.data);
        } while (temp.link != queue.front);
    }

    public static void main(String[] args) {
        Solution.Queue queue = new Solution.Queue();
        enQueue(queue, 1);
        enQueue(queue, 2);
        enQueue(queue, 3);
        enQueue(queue, 4);
        enQueue(queue, 5);
        enQueue(queue, 6);
        System.out.println("Before:");
        displayQueue(queue);
        System.out.println("After:");
        deQueue(queue);
        deQueue(queue);
        deQueue(queue);
        deQueue(queue);
        displayQueue(queue);
        System.out.println("Last element:");
        deQueue(queue);
        displayQueue(queue);
        System.out.println("Queue is null:");
        deQueue(queue);
        displayQueue(queue);
    }
}
