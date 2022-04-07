package ss5_access_modifier_static_method_static_property.ThucHanh;

public class Student {
    private int rollNo;
    private String name;
    private  static  String college = "BBDIT";
    Student(int r,String n){
        rollNo =r;
        name =n;
    }static  void change(){
        college ="CODEGYM";
    }void display(){
        System.out.println(rollNo + " " + name + " " +college);
    }
}
