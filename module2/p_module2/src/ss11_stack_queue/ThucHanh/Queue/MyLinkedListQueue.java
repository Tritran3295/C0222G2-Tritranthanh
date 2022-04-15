package ss11_stack_queue.ThucHanh.Queue;

import ss10_dsa_danh_sach.BaiTap.LinkedList.MyLinkedList;
import ss10_dsa_danh_sach.BaiTap.TrienKhaiMethodArrayList.MyList;

public class MyLinkedListQueue {
    private Node head;
    public Node tail;

    public MyLinkedListQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enQueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node deQueue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }

}

class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}
