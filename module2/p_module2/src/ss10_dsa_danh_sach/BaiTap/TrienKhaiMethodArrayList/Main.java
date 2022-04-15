package ss10_dsa_danh_sach.BaiTap.TrienKhaiMethodArrayList;

public class Main {
    public static class Student{
        private int id;
        private  String name;
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

    public static void main(String[] args) {
        Student a = new Student(1,"Trí");
        Student b = new Student(2,"Đẹp");
        Student c = new Student(3,"Trai");
        MyList<Student> studentMyArrayList = new MyList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        for (int i = 0; i < studentMyArrayList.size() ; i++) {
            Student student=(Student)studentMyArrayList.get(i);
            System.out.println((student.getId()));
            System.out.println((student.getName()));


        }

    }
}
