package ss10_dsa_danh_sach.BaiTap.LinkedList;

import ss10_dsa_danh_sach.BaiTap.TrienKhaiMethodArrayList.Main;

public class main {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;
            public Student(){};
            public Student(int id,String name){
                this.id=id;
                this.name=name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Trí");
        Student student2 = new Student(1,"Đẹp");
        Student student3 = new Student(1,"Trai");
        Student student4 = new Student(1,"To");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);
        myLinkedList.addFirst(student4);
        myLinkedList.add(3,student4);
        myLinkedList.remove(1);
        for (int i = 0; i <myLinkedList.size() ; i++) {
            Student student=(Student)myLinkedList.get(i) ;
            System.out.println(((Student) myLinkedList.get(i)).getName());

        }
    }


}
