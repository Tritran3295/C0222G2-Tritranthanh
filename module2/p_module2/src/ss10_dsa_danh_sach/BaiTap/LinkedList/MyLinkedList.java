package ss10_dsa_danh_sach.BaiTap.LinkedList;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object element) {
            this.data = element;
        }

        private Object getData() {
            return this.data;
        }

    }public void MyLinkedList(){};
    public void addFirst(E element){
        Node temp = head;
        head = new Node(element);
        head.next=temp;
        numNodes++;
    }
    public void addLast(E element){
        Node temp = head;
        while (temp.next != null){
            temp=temp.next;
        }
        temp.next= new Node(element);
        numNodes++;
    }
    public void add(int index,E element){
        Node temp = head;
        Node holder;

        for(int i=0; i < index-1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++ ;
    }public Object get(int index){
        Node temp=head;
        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }return temp.data;
    }public int size(){
        return numNodes;
    }public MyLinkedList<E> clone(){
        if(numNodes==0){
            throw new NullPointerException("LinkedList is null");
        }MyLinkedList<E>myCloneLinkedList = new MyLinkedList<>();
        Node temp=head;
        myCloneLinkedList.addFirst((E)temp.data);
        temp=temp.next;
        while ((temp != null)){
            myCloneLinkedList.addLast((E)temp.data);
            temp=temp.next;
        }return  myCloneLinkedList;
    }public boolean contains(E element){
        Node temp = head;
        while (temp.next != null){
            if(temp.data.equals(element)){
                return true;
            }
            temp=temp.next;
        }return false;
    }public int indexOf(E element){
        Node temp= head;
        for (int i = 0; i <numNodes; i++) {
            if(temp.getData().equals(element)){
                return i;
            }
        }return -1;
    }public void clear(){
        Node temp = head;
        while (temp.next != null){
            temp.data=null;
            temp=temp.next;
        }numNodes = 0;
    }public E getFirst(){
        Node temp= head;
        return (E)temp.data;
    }public E getLast(){
        Node temp =head;
        while (temp.next !=null){
            temp=temp.next;
        }return (E)temp.data;
    }public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Index: " + index);
        }
        Node temp = head;

        Object data;

        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNodes--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return (E) data;
    }
    public boolean remove(E element){
        if(head.data.equals(element)){
            remove(0);
            return true;
        }else {
            Node temp = head;
            while (temp.next != null){
                if(temp.next.data.equals(element)){
                    temp.next=temp.next.next;
                    numNodes --;
                    return true;
                }temp=temp.next;
            }
        }return false;
    }

}
