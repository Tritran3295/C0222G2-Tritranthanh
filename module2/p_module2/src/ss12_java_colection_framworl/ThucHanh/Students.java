package ss12_java_colection_framworl.ThucHanh;

import java.util.*;

public class Students implements Comparable<Students> {
    private String name;
    private  Integer age;
    private String address;
    public Students(){};

    public Students(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Students students) {
        return this.getName().compareTo(students.getName());
    }

}
class AgeComparator implements Comparator<Students>{

    @Override
    public int compare(Students o1, Students o2) {
        if(o1.getAge() > o2.getAge()){
            return 1;
        }else if(o1.getAge()== o2.getAge()){
            return 0;
        }else {
            return  -1;
        }
    }

    public static void main(String[] args) {
        Students students = new Students("Tri",30,"QT");
        Students students1 = new Students("Tran",29,"QN");
        Students students2 = new Students("Thanh",31,"QB");
        Students students3 = new Students("Jacky",32,"QN");
        List<Students> list = new ArrayList<Students>();
        list.add(students);
        list.add(students1);
        list.add(students2);
        list.add(students3);
        Collections.sort(list);
        for (Students st:list) {
            System.out.println(st.toString());
        }
        AgeComparator ageComparator  = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sánh theo tuổi : ");
        for (Students st:list) {
            System.out.println(st.toString());

        }

    }
}
