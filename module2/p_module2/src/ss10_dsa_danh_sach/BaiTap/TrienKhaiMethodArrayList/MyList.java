package ss10_dsa_danh_sach.BaiTap.TrienKhaiMethodArrayList;

import ss10_dsa_danh_sach.ThucHanh.LinkedList.MyLinkedList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(){
        if(size >element.length){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
          }
    }
    public MyList(int capacity){
        element=new Object[capacity];
    }
    public   int size(){
        return size;
    }

    public void add(Object x) {
        size ++;
        ensureCapacity();
        element[size -1]=x;
    }
    public boolean remove(int index){
        if(index >=0 && index < size){
            for (int i = index; i <size ; i++) {
                element[i]=element[i+1];
            }size --;
            return  true;

        }
        return false;
    }

    public void clear(){
        size =0;
        for (int i = 0; i <element.length ; i++) {
            element[i]=null;
        }
    }
    public boolean add(Object x,int index){
        if(index >=0 && index <size){
            size +=1;
            ensureCapacity();
            for (int i = size -2; i >= index ; i--) {
                element[i+1]=element[i];
            }
            element[index]=x;
            return true;
        }return false;
    }public boolean contains(Object object){
        for(Object x : element){
            if(element.equals(x)){
                return true;
            }
        }return false;
    }
    public int indexOf(Object x){
        for (int i = 0; i < size; i++) {
            if(element[i].equals(x)){
                return i;
            }
        }return -1;
    }
    public Object[]getElement(){
        return this.element;
    }
    public Object get(int index){
        if(index>=0 && index<size){
            return (Object)element[index];
        }return null;
    }public MyList<E> clone() {
        MyList<E> xx = new MyList<>(element.length);
        for (Object x: element) {
            xx.add(x);
        }
        return xx;
    }

}
